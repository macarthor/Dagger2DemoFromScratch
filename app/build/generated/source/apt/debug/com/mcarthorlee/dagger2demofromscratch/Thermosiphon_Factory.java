// Generated by Dagger (https://google.github.io/dagger).
package com.mcarthorlee.dagger2demofromscratch;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class Thermosiphon_Factory implements Factory<Thermosiphon> {
  private final Provider<ElectricHeater> heaterProvider;

  public Thermosiphon_Factory(Provider<ElectricHeater> heaterProvider) {
    this.heaterProvider = heaterProvider;
  }

  @Override
  public Thermosiphon get() {
    Thermosiphon instance = new Thermosiphon();
    Thermosiphon_MembersInjector.injectHeater(instance, heaterProvider.get());
    return instance;
  }

  public static Thermosiphon_Factory create(Provider<ElectricHeater> heaterProvider) {
    return new Thermosiphon_Factory(heaterProvider);
  }

  public static Thermosiphon newThermosiphon() {
    return new Thermosiphon();
  }
}
