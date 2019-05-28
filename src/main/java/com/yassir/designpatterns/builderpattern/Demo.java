package com.yassir.designpatterns.builderpattern;

import com.yassir.designpatterns.builderpattern.models.Person;

/**
 * Type:
 *      Creational pattern.
 * What it does:
 *      Separate the construction of a complex object from its representing
 *      so that the same construction process can create different representations.
 */
public class Demo {

    public static void main(String[] args) {
        Person.Builder personBuilder = new Person.Builder();
        Person
                yassir =
                personBuilder.setName("Yassir")
                        .setEmail("khaldi.yass@gmail.com")
                        .setAge(24)
                        .setHeight(173)
                        .setWeight(65)
                        .build();

        System.out.println(yassir.toString());
    }
}
