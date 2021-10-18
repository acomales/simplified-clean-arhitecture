package com.productdock.simplecleanapplication.infra;

import com.productdock.simplecleanapplication.controller.CompanyWeb;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CompanyExternalVerificationServiceTest {

    @InjectMocks
    private CompanyExternalVerificationService underTest;

    @Test
    void companyIsVerified_returnTrue() {
        CompanyWeb companyWeb = new CompanyWeb("id", "name");
        assertThat(underTest.canCompanyBeCreated(companyWeb)).isTrue();
    }
}
