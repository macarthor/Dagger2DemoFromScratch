package com.mcarthorlee.dagger2demofromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public final class SomeInformationActivity extends AppCompatActivity {

    @Inject
    SomeInformation mSomeInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerSomeInformationActivityComponent.builder().build()
                .injectToSomeInformationActivity(this);
        Log.d(this.getClass().getCanonicalName(),
                "got information = " + mSomeInformation.getInformation());

    }
}
