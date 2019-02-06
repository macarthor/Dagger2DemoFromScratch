package com.mcarthorlee.dagger2demofromscratch;

import javax.inject.Inject;

final class OtherInformation {

    private String mInformation;

    @Inject
    OtherInformation() {
        mInformation = "other_information";
    }

    String getInformation() {
        return mInformation;
    }
}
