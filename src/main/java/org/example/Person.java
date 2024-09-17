package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    int weight;
    int height;
    String zodiac;

    public Person(String firstName, String lastName, int age){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
    }

    public Person(String firstName, String lastName, int age, int weight, int height, String zodiac){
        this(firstName,lastName,age);
        this.weight = weight;
        this.height = height;
        this.zodiac = zodiac;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19;
    }

}
