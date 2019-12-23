package com.muratagin.di.resource.configuration;

import com.muratagin.di.resource.service.ExpenseService;
import com.muratagin.di.resource.service.IncomeService;
import com.muratagin.di.resource.service.impl.ExpenseServiceAlternativeImpl;
import com.muratagin.di.resource.service.impl.ExpenseServiceImpl;
import com.muratagin.di.resource.service.impl.IncomeServiceAlternativeImpl;
import com.muratagin.di.resource.service.impl.IncomeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfiguration {

    @Bean(name = "expenseServiceImpl")
    public ExpenseService getExpenseServiceImpl() {
        return new ExpenseServiceImpl();
    }

    @Bean(name = "expenseServiceAlternativeImpl")
    public ExpenseService getExpenseServiceAlternativeImpl() {
        return new ExpenseServiceAlternativeImpl();
    }

    @Bean(name = "incomeServiceImpl")
    public IncomeService getIncomeServiceImpl() {
        return new IncomeServiceImpl();
    }

    @Bean(name = "incomeServiceAlternativeImpl")
    public IncomeService getIncomeServiceAlternativeImpl() {
        return new IncomeServiceAlternativeImpl();
    }
}
