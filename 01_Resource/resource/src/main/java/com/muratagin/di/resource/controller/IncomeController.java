package com.muratagin.di.resource.controller;

import com.muratagin.di.resource.service.IncomeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("income")
public class IncomeController {

    @Resource
    @Qualifier("incomeServiceAlternativeImpl")
    private IncomeService incomeService;

    @GetMapping
    public String getIncome() {
        return incomeService.getIncome();
    }
}
