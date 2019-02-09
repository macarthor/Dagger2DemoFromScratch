// Generated by Dagger (https://google.github.io/dagger).
package com.mcarthorlee.dagger2demofromscratch;

public final class DaggerSomeInformationActivityComponent
    implements SomeInformationActivityComponent {
  private DaggerSomeInformationActivityComponent() {}

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
    SomeInformation_MembersInjector.injectMOtherInformation(instance, new OtherInformation());
    return instance;
  }

  private SomeInformationActivity injectSomeInformationActivity(SomeInformationActivity instance) {
    SomeInformationActivity_MembersInjector.injectMSomeInformation(instance, getSomeInformation());
    return instance;
  }

  public static final class Builder {
    private Builder() {}

    public SomeInformationActivityComponent build() {
      return new DaggerSomeInformationActivityComponent();
    }
  }
}
