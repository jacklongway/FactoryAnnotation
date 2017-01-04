package com.longway.androidcompileannotation;

import com.example.Factory;

/**
 * Created by longway on 17/1/4. Email:longway1991117@sina.com
 */

@Factory(id="orange",type = Root.class)
public class Orange extends Root {
    @Override
    public String name() {
        return "orange";
    }
}
