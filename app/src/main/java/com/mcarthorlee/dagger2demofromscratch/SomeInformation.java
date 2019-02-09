package com.mcarthorlee.dagger2demofromscratch;

import javax.inject.Inject;

final class SomeInformation {

    @Inject
    OtherInformation mOtherInformation;

    @Inject
    SomeInformation() {}

    String getInformation() {
        return mOtherInformation.getInformation();
    }
}
