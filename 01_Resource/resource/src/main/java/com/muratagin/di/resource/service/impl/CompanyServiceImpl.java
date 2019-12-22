package com.muratagin.di.resource.service.impl;

import com.muratagin.di.resource.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    public String getCompany() {
        return "get company service implementation is called!";
    }
}
