package com.productdock.simplecleanapplication.service;

import com.productdock.simplecleanapplication.entity.Company;
import com.productdock.simplecleanapplication.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company createCompany(Company company) {

        // validations

        return companyRepository.save(company);
    }
}
