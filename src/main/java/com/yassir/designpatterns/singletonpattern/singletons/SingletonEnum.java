package com.yassir.designpatterns.singletonpattern.singletons;

/**
 * This is the best and easiest way to implement a singleton and it is by default thread, serialization and reflection safe.
 */
public enum SingletonEnum {
    INSTANCE;

    public void foo() {
    }

    public String bar(String bar) {
        return bar;
    }
}
