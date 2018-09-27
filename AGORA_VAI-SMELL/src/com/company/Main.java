package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    static int CANVAS_SIZE = 800;
    static int OBJECTS_NUMBER = 1000;
    static int OBJECTS_TYPES = 4;

    public static void main(String[] args) {
        Album album = new Album();

        for (int i = 0; i < OBJECTS_NUMBER; ++i){
            int x = random(0, CANVAS_SIZE);
            int y = random(0, CANVAS_SIZE);
            int t = random(0, 4);
            BufferedImage img = null;

            try {
                img = ImageIO.read(Main.class.getResource("\\resource\\images\\" + "d" + t + ".png"));
            } catch (IOException e){
                e.printStackTrace();
            }

            album.createImage(x, y, img);
        }

        album.setSize(CANVAS_SIZE, CANVAS_SIZE);
        album.setVisible(true);
    }

    private static int random(int min, int max){
        return min + (int) (Math.random() * ((max-min) + 1));
    }
}
