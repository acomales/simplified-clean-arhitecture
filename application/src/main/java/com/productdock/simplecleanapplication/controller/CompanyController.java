package com.productdock.simplecleanapplication.controller;

import com.productdock.simplecleanapplication.entity.Company;
import com.productdock.simplecleanapplication.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping(value = "/companies")
    public CompanyWeb createCompany(@RequestBody final CompanyWeb companyWeb) {
        Company createdCompany = companyService.createCompany(companyWeb.toCompany());
        return CompanyWeb.toCompanyWeb(createdCompany);
    }

}
