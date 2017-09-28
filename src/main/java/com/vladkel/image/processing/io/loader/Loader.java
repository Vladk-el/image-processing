package com.vladkel.image.processing.io.loader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

public class Loader {

  private int h;
  private int w;
  private int[][] array;


  public Loader(Path path) throws IOException {
    load(path);
  }

  private void load(Path path) throws IOException {

    BufferedImage img = ImageIO.read(path.toFile());

    h = img.getHeight();
    w = img.getWidth();

    System.out.println("height : " + h);
    System.out.println("width : " + w);

    array = new int[w][h];

    for (int y = 0; y < h; y++) {
      for (int x = 0; x < w; x++) {
        int rgb = img.getRGB(x, y); // RGB pixel code
        int value = (rgb >> 8) & 0xFF; // take green value
        array[x][y] = value;
      }
    }
  }

  public int getHeight() {
    return h;
  }

  public int getWidth() {
    return w;
  }

  public int[][] getArray() {
    return array;
  }

}