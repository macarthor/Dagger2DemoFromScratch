package com.mcarthorlee.dagger2demofromscratch;

import javax.inject.Inject;

final class SomeInformation {

    private String mInformation;

    @Inject
    SomeInformation() {
        mInformation = "some_information";
    }

    String getInformation() {
        return mInformation;
    }
}
