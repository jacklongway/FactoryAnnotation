package com.longway.androidcompileannotation;

import com.example.Factory;

/**
 * Created by longway on 17/1/4. Email:longway1991117@sina.com
 */

@Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal {

    @Override public float getPrice() {
        return 8.5f;
    }
}
