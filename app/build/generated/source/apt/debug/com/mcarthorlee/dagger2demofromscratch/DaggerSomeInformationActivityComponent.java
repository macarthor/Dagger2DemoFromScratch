// Generated by Dagger (https://google.github.io/dagger).
package com.mcarthorlee.dagger2demofromscratch;

import dagger.internal.Preconditions;

public final class DaggerSomeInformationActivityComponent
    implements SomeInformationActivityComponent {
  private final SomeInformationModule someInformationModule;

  private DaggerSomeInformationActivityComponent(SomeInformationModule someInformationModuleParam) {
    this.someInformationModule = someInformationModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SomeInformationActivityComponent create() {
    return new Builder().build();
  }

  private SomeInformation getSomeInformation() {
    return injectSomeInformation(SomeInformation_Factory.newSomeInformation());
  }

  @Override
  public void injectToSomeInformationActivity(SomeInformationActivity someInformationActivity) {
    injectSomeInformationActivity(someInformationActivity);
  }

  private SomeInformation injectSomeInformation(SomeInformation instance) {
    SomeInformation_MembersInjector.injectMInformation(
        instance,
        SomeInformationModule_GenerateInformationFactory.proxyGenerateInformation(
            someInformationModule));
    return instance;
  }

  private SomeInformationActivity injectSomeInformationActivity(SomeInformationActivity instance) {
    SomeInformationActivity_MembersInjector.injectMSomeInformation(instance, getSomeInformation());
    return instance;
  }

  public static final class Builder {
    private SomeInformationModule someInformationModule;

    private Builder() {}

    public Builder someInformationModule(SomeInformationModule someInformationModule) {
      this.someInformationModule = Preconditions.checkNotNull(someInformationModule);
      return this;
    }

    public SomeInformationActivityComponent build() {
      if (someInformationModule == null) {
        this.someInformationModule = new SomeInformationModule();
      }
      return new DaggerSomeInformationActivityComponent(someInformationModule);
    }
  }
}
