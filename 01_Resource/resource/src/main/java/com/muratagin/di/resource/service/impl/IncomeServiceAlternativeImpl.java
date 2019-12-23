package com.muratagin.di.resource.service.impl;

import com.muratagin.di.resource.service.IncomeService;

public class IncomeServiceAlternativeImpl implements IncomeService {

    @Override
    public String getIncome() {
        return "income service alternative impl is called";
    }
}
