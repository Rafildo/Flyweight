package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Immutable {
    private BufferedImage img;

    public Immutable (BufferedImage img) {
        this.img = img;
    }

    public void draw (Graphics graphics, int x, int y) {
        graphics.drawImage(this.img, x, y, null);
    }
}
