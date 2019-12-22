package com.muratagin.di.resource.controller;

import com.muratagin.di.resource.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("company")
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @GetMapping
    public String getCompany() {
        return companyService.getCompany();
    }
}