package com.muratagin.di.resource.controller;

import com.muratagin.di.resource.service.ExpenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("expense")
public class ExpenseController {

    @Resource(name = "expenseServiceAlternativeImpl")
    private ExpenseService expenseService;

    @GetMapping
    public String getExpense() {
        return expenseService.getExpense();
    }
}
