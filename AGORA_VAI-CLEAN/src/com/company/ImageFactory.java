package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageFactory {
    static Map<String, Immutable> immutables = new HashMap<>();

    public static Immutable getImmutable(String name) {
        Immutable result = immutables.get(name);

        if(result == null) {

            BufferedImage img = null;

            try {
                img = ImageIO.read(ImageFactory.class.getResource("\\resource\\images\\" + name));
            } catch (IOException e) {
                e.printStackTrace();
            }

            result = new Immutable(img);
            immutables.put(name, result);
        }

        return result;
    }
}
