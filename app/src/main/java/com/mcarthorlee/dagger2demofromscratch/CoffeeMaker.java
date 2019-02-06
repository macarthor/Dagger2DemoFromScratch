package com.mcarthorlee.dagger2demofromscratch;

import javax.inject.Inject;

class ElectricHeater {
    private boolean heating;

    // McArthor Lee:
    // newly added, to indicate that it provides an instance.
    @Inject
    ElectricHeater() {}

    // McArthor Lee:
    // print object hashcode.
    void on() {
        System.out.println(String.format("~ ~ ~ heating ~ ~ ~ 0x%x", hashCode()));
        this.heating = true;
    }

    void off() {
        this.heating = false;
    }

    boolean isHot() {
        return heating;
    }
}

class Thermosiphon {
    // McArthor Lee:
    // make it Dagger2 style.
    @Inject
    ElectricHeater heater;

    // McArthor Lee:
    // remove ctor injection.
    @Inject
    Thermosiphon() {}

    // McArthor Lee:
    // turn on power if it's off.
    void pump() {
        if (!heater.isHot()) {
            heater.on();
        }
        System.out.println("=> => pumping => =>");
    }
}

class CoffeeMaker {
    // McArthor Lee:
    // remove the original Lazy definition, and make them Dagger2 style.
    @Inject
    ElectricHeater heater;
    @Inject
    Thermosiphon pump;

    // McArthor Lee:
    // remove ctor injection.
    @Inject
    CoffeeMaker() {}

    void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
