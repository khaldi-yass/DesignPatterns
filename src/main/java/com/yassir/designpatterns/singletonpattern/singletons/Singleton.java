package com.yassir.designpatterns.singletonpattern.singletons;

import java.io.Serializable;

/**
 * This is a modest attempt to make a perfectly safe singleton class
 * But it still lacks anti cloning
 *
 * We make it reflection safe by throwing an exception if the constructor is called (evern if set to private).
 * We make thread safe by double checking the null and synchronizing the instantiation.
 * We make serializing/deserializing safe by implementing the readResolve method.
 */
public class Singleton implements Serializable {

    private static volatile Singleton INSTANCE;

    private Singleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        System.out.println("This line should be called only once in the application scope");
    }

    protected Singleton readResolve() {
        return getInstance();
    }

    //============ These are the actual methods that we need to call

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }

    public void foo() {
    }

    public String bar(String bar) {
        return bar;
    }
}
