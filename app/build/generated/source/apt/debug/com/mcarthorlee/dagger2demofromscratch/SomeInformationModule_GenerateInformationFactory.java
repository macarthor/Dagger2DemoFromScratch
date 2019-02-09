// Generated by Dagger (https://google.github.io/dagger).
package com.mcarthorlee.dagger2demofromscratch;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class SomeInformationModule_GenerateInformationFactory implements Factory<String> {
  private final SomeInformationModule module;

  public SomeInformationModule_GenerateInformationFactory(SomeInformationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return proxyGenerateInformation(module);
  }

  public static SomeInformationModule_GenerateInformationFactory create(
      SomeInformationModule module) {
    return new SomeInformationModule_GenerateInformationFactory(module);
  }

  public static String proxyGenerateInformation(SomeInformationModule instance) {
    return Preconditions.checkNotNull(
        instance.generateInformation(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
