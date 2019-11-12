package com.farhanadji;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.goble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
