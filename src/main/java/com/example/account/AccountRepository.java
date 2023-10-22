package com.example.account;

import java.lang.annotation.Annotation;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository implements Repository {

    @Override
    public Class<? extends Annotation> annotationType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'annotationType'");
    }

    @Override
    public String value() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'value'");
    }
    
}
