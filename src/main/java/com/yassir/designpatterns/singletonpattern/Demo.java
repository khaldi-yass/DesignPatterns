package com.yassir.designpatterns.singletonpattern;

import com.yassir.designpatterns.singletonpattern.singletons.Singleton;
import com.yassir.designpatterns.singletonpattern.singletons.SingletonEnum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Type:
 *      Creational pattern.
 * What it does:
 *      Ensure a class only has one instance and provide a global point of access to it.
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {

        //Create the 1st instance
        Singleton instance1 = Singleton.getInstance();

        //Create 2nd instance using Java Reflection API (exploit in the singleton pattern but we fixed it).
        Singleton instance2 = null;
        try {
            Class<Singleton> clazz = Singleton.class;
            Constructor<Singleton> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            instance2 = cons.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            Thread.sleep(10);
            instance2 = Singleton.getInstance();
        }

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());

        //Todo Add serialization test

        // ==============================
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + singletonEnum.hashCode());
        System.out.println("Instance 2 hash:" + singletonEnum2.hashCode());

    }
}
