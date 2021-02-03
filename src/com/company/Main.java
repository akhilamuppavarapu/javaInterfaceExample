package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Circle circle = new Circle(2.5);
        System.out.println("Perimeter of Circle:  " + circle.getPerimeter());
        System.out.println("Area of Circle:  " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println("Radius of new circle resized by 50% :  " + resizableCircle.resize(50));

    }
}
