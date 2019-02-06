package com.mcarthorlee.dagger2demofromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public final class SomeInformationActivity extends AppCompatActivity {

    @Inject
    CoffeeMaker mCoffeeMaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerCoffeeComponent.builder().build().
                injectToSomeInformationActivity(this);
        mCoffeeMaker.brew();
    }
}
