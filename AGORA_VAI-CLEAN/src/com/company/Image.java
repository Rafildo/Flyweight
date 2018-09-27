package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Image {
    private int x;
    private int y;
    private Immutable immutable;

    public Image(int x, int y, Immutable immutable){
        this.x = x;
        this.y = y;
        this.immutable = immutable;
    }

    public void draw(Graphics graphics){
        immutable.draw(graphics, x, y);
    }
}
