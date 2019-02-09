package com.mcarthorlee.dagger2demofromscratch;

import dagger.Module;
import dagger.Provides;

@Module
final class SomeInformationModule {

    @Provides
    String generateInformation() {
        return "some_information";
    }
}
