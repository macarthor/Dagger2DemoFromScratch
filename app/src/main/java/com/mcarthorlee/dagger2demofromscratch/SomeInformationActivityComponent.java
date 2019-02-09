package com.mcarthorlee.dagger2demofromscratch;

import dagger.Component;

@Component (modules = {SomeInformationModule.class})
interface SomeInformationActivityComponent {

    void injectToSomeInformationActivity(SomeInformationActivity someInformationActivity);
}
