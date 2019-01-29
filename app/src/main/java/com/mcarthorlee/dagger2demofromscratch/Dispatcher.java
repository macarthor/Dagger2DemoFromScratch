package com.mcarthorlee.dagger2demofromscratch;

import java.util.WeakHashMap;

final class Dispatcher {

    private static Dispatcher mInstance;

    private WeakHashMap<String, Object> mDispatchMap = new WeakHashMap<>();

    static Dispatcher getInstance() {
        if (mInstance == null) {
            mInstance = new Dispatcher();
        }
        return mInstance;
    }

    Dispatcher registerToDispatcher(String key, Object object) {
        mDispatchMap.put(key, object);
        return this;
    }

    void inject(String key) {
        SomeInformationActivity activity = (SomeInformationActivity) mDispatchMap.get(key);
        if (activity != null) {
            activity.mSomeInformation = new SomeInformation();
        }
    }
}
