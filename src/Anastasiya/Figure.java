package Anastasiya;

import java.awt.*;
public class Figure {
    private int x;
    private int y;
    private int length;
    private Color color;


    public Figure(int x, int y, int sideLength, Color color) {
        this.x = x;
        this.y = y;
        this.length = sideLength;
        this.color = color;
    }

    public void changeColor(Color kolor) {
        color = kolor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLength() {
        return length;
    }

    public Color getColor() {
        return color;
    }
}