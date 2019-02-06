// Generated by Dagger (https://google.github.io/dagger).
package com.mcarthorlee.dagger2demofromscratch;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class Thermosiphon_MembersInjector implements MembersInjector<Thermosiphon> {
  private final Provider<ElectricHeater> heaterProvider;

  public Thermosiphon_MembersInjector(Provider<ElectricHeater> heaterProvider) {
    this.heaterProvider = heaterProvider;
  }

  public static MembersInjector<Thermosiphon> create(Provider<ElectricHeater> heaterProvider) {
    return new Thermosiphon_MembersInjector(heaterProvider);
  }

  @Override
  public void injectMembers(Thermosiphon instance) {
    injectHeater(instance, heaterProvider.get());
  }

  public static void injectHeater(Object instance, Object heater) {
    ((Thermosiphon) instance).heater = (ElectricHeater) heater;
  }
}
