package com.mcarthorlee.dagger2demofromscratch;

import dagger.Component;

@Component
interface CoffeeComponent {

    void injectToSomeInformationActivity(SomeInformationActivity someInformationActivity);
}
