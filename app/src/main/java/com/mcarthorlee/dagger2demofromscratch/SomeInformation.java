package com.mcarthorlee.dagger2demofromscratch;

import javax.inject.Inject;

final class SomeInformation {

    String mInformation;

    @Inject
    SomeInformation(String information) {
        mInformation = information;
    }

    String getInformation() {
        return mInformation;
    }
}
