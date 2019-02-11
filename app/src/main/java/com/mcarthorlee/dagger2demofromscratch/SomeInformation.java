package com.mcarthorlee.dagger2demofromscratch;

import javax.inject.Inject;

final class SomeInformation {

    @Inject
    String mInformation;

    @Inject
    SomeInformation() {}

    String getInformation() {
        return mInformation;
    }
}
