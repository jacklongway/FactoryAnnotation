package com.longway.androidcompileannotation;

import com.example.Factory;

/**
 * Created by longway on 17/1/4. Email:longway1991117@sina.com
 */

@Factory(id="water",type = Fruit.class)
public class Water implements Fruit {
    @Override
    public String name() {
        return "water";
    }
}
