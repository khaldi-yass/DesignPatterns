package com.yassir.designpatterns.builderpattern.models;

public class Person {

    @Override
    public String toString() {
        return "Person{"
               + "name='"
               + name
               + '\''
               + ", email='"
               + email
               + '\''
               + ", height="
               + height
               + ", weight="
               + weight
               + ", age="
               + age
               + ", address='"
               + address
               + '\''
               + ", socialSecurityNumber='"
               + socialSecurityNumber
               + '\''
               + '}';
    }

    private String name;
    private String email;
    private double height;
    private double weight;
    private int age;
    private String address;
    private String socialSecurityNumber;

    private Person(String name,
                   String email,
                   double height,
                   double weight,
                   int age,
                   String address,
                   String socialSecurityNumber) {
        this.name = name;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public static class Builder {

        private String name = "Jon";
        private String email = "Doe";
        private double height = 180;
        private double weight = 80;
        private int age = 34;
        private String address = "Default Address";
        private String socialSecurityNumber = "1234567890";

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setSocialSecurityNumber(String socialSecurityNumber) {
            this.socialSecurityNumber = socialSecurityNumber;
            return this;
        }

        public Person build() {
            return new Person(name, email, height, weight, age, address, socialSecurityNumber);
        }
    }
}
