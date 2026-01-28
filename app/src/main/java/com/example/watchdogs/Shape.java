package com.example.watchdogs;

public abstract class Shape {

    public  int x;
    public int y;

    String color = "blue";
}

public class Triangle implements Shape {

    public int base;
    public int height;

    public Triangle (int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }


}
