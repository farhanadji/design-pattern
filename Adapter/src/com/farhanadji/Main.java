package com.farhanadji;

public class Main {

    //CASE : ADAPT TURKEY TO A DUCK
    //TURKEY HAS A GOBLE AND DUCK HAS A QUACK. SO IT IS INCOMPATIBLE

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
