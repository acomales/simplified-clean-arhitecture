package com.productdock.simplecleanapplication.infra;

import com.productdock.simplecleanapplication.controller.CompanyWeb;
import org.springframework.stereotype.Service;

@Service
public class CompanyExternalVerificationService {

    public boolean canCompanyBeCreated(CompanyWeb companyWeb) {
        // call to external api to retrieve results

        return true;
    }
}
