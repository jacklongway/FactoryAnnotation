package com.longway.androidcompileannotation;

import com.example.Factory;

/**
 * Created by longway on 17/1/4. Email:longway1991117@sina.com
 */
@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {

    @Override public float getPrice() {
        return 4.5f;
    }
}
