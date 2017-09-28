package com.vladkel.image.processing.io.writer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Writer {

  public String outputName;


  public Writer(String outputName) {
    this.outputName = outputName;
  }

  public void write(int height, int width, int[][] array) throws IOException {
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        img.setRGB(x, y, array[x][y]); // RGB pixel code
      }
    }

    File result = new File(outputName);
    ImageIO.write(img, "gif", result);
    System.out.println("img printed in " + result.getAbsolutePath());

  }

}
