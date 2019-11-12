package com.farhanadji;

public class Person implements Cloneable{
    private String name;
    public City city; //harus di deep copy

    public Person(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        Person cloneObj = (Person) super.clone();
        cloneObj.city = new City(this.city.getCity(), this.city.getProvince());

        return cloneObj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
