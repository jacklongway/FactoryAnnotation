package com.example;

/**
 * Created by longway on 17/1/4. Email:longway1991117@sina.com
 */

public class IdAlreadyUsedException extends RuntimeException {
    private FactoryAnnotatedClass factoryAnnotatedClass;

    public IdAlreadyUsedException(String msg) {
        super(msg);
    }

    public IdAlreadyUsedException(FactoryAnnotatedClass factoryAnnotatedClass) {
        super();
        this.factoryAnnotatedClass = factoryAnnotatedClass;
    }

    public FactoryAnnotatedClass getFactoryAnnotatedClass() {
        return factoryAnnotatedClass;
    }
}
