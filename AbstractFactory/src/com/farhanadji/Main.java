package com.farhanadji;

public class Main {

    public static void main(String[] args) {
	    AbstractFactory abstractFactory1 = new CircleRedFactory();
	    AbstractFactory abstractFactory2 = new RectangleGreenFactory();
	    AbstractFactory abstractFactory3 = new SquareBlueFactory();

	    Application app1 = new Application(abstractFactory1);
        Application app2 = new Application(abstractFactory1);
        Application app3 = new Application(abstractFactory1);

        app1.print();
        app2.print();
        app3.print();
    }
}
