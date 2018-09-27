package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Image {
    private int x;
    private int y;
    private BufferedImage img;

    public Image(int x, int y, BufferedImage img){
        this.x = x;
        this.y = y;
        this.img = img;
    }

    public void draw(Graphics graphics){
        graphics.drawImage(this.img, this.x, this.y, null);
    }
}
