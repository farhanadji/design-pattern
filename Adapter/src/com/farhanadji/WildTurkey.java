package com.farhanadji;

public class WildTurkey implements Turkey {

    @Override
    public void goble() {
        System.out.println("gobblee gobbleee");
    }

    @Override
    public void fly() {
        System.out.println("flying short distance");
    }
}
