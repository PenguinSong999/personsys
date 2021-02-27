package com.own.web.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

public class CheckCodeUtil {

    public static void generateCode(String code, OutputStream out) throws IOException {
        BufferedImage img = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.getGraphics();

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 100, 30);

        g.setColor(Color.RED);
        g.setFont(new Font("Courier New", Font.BOLD, 28));
        g.drawString(code, 5 , 25);

        g.setColor(Color.GRAY);
        g.drawRect(0, 0, 99, 29);

        g.dispose();

        ImageIO.write(img, "png", out);

    }
}
