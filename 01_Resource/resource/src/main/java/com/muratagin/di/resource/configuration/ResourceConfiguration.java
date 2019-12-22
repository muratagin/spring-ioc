package com.muratagin.di.resource.configuration;

import com.muratagin.di.resource.service.ExpenseService;
import com.muratagin.di.resource.service.impl.ExpenseServiceAlternativeImpl;
import com.muratagin.di.resource.service.impl.ExpenseServiceImpl;
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
}
