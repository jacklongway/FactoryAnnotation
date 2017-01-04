package com.longway.androidcompileannotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MealFactory mealFactory = new MealFactory();
        float price = mealFactory.create("Calzone").getPrice();

        TextView _price = (TextView) findViewById(R.id.price_tv);
        _price.setText(String.format(Locale.getDefault(), "price: %f", price));

        String name = new FruitFactory().create("orange").name();
        TextView _name = (TextView) findViewById(R.id.name_tv);
        _name.setText(String.format(Locale.getDefault(), "fruit name: %s", name));


    }
}
