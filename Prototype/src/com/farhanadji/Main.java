package com.farhanadji;

public class Main {

    public static void main(String[] args) {
        City jkt = new City("Jakarta", "DKI Jakarta");
	    Person a = new Person("Hehe", jkt);
	    try {
            Person b = (Person) a.clone();
            System.out.println(b.getName());
        }catch (CloneNotSupportedException e){
	        e.printStackTrace();
        }

    }
}
