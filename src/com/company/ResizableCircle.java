package com.company;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percentage) {
//        return 0;
        return radius * percentage / 100;
    }
}
