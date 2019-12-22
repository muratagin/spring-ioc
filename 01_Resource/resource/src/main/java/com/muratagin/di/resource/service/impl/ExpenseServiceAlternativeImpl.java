package com.muratagin.di.resource.service.impl;

import com.muratagin.di.resource.service.ExpenseService;

public class ExpenseServiceAlternativeImpl implements ExpenseService {

    @Override
    public String getExpense() {
        return "expense service alternative impl is called";
    }
}
