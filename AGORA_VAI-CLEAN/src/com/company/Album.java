package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.ArrayList;

public class Album extends JFrame {
    private List<Image> images = new ArrayList<>();

    public void createImage(int x, int y, String name){
        Immutable immutable = ImageFactory.getImmutable(name);
        Image image = new Image(x, y, immutable);
        images.add(image);
    }

    @Override
    public void paint(Graphics graphics){
        for (Image image : images) {
            image.draw(graphics);
        }
    }
}
