package com.productdock.simplecleanapplication.facade;

import com.productdock.simplecleanapplication.controller.CompanyWeb;
import com.productdock.simplecleanapplication.entity.Company;
import com.productdock.simplecleanapplication.infra.CompanyExternalVerificationService;
import com.productdock.simplecleanapplication.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
class CompanyFacade {

    private CompanyService companyService;
    private CompanyExternalVerificationService companyExternalVerificationService;

    public CompanyWeb createWithComplexLogic(CompanyWeb companyWeb) {

        // complex validations

        // calling external api
        if (!companyExternalVerificationService.canCompanyBeCreated(companyWeb)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "company verification failed.");
        }

        Company company = companyService.createCompany(companyWeb.toCompany());
        return CompanyWeb.toCompanyWeb(company);

    }
}
