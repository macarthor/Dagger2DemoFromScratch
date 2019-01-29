package com.mcarthorlee.dagger2demofromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public final class SomeInformationActivity extends AppCompatActivity {

    SomeInformation mSomeInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //InformationUtil.setInformation(this);
        String key = getClass().getCanonicalName();
        Dispatcher.getInstance().registerToDispatcher(key, this).inject(key);

        TextView textView = findViewById(R.id.textview);
        textView.setText(mSomeInformation.getInformation());
    }
}
