package com.productdock.simplecleanapplication.controller;


import com.productdock.simplecleanapplication.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyWeb {
    private String id;
    private String name;

    public Company toCompany() {
        return Company.builder()
                .id(id)
                .name(name)
                .build();
    }

    public static CompanyWeb toCompanyWeb(final Company company) {
        CompanyWeb companyWeb = new CompanyWeb();
        companyWeb.setId(company.getId());
        companyWeb.setName(company.getName());
        return companyWeb;
    }
}
