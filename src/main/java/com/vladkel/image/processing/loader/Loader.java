package com.vladkel.image.processing.loader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

import javax.imageio.ImageIO;

public class Loader {

	
	public Loader() {
		
	}
	
	public int[][] load(Path path) throws IOException {
		
		BufferedImage img = ImageIO.read(path.toFile());
		
		System.out.println("height : " + img.getHeight());
		System.out.println("width : " + img.getWidth());
		
		int [][] array = new int[img.getHeight()][img.getWidth()];
		
		for(int i = 0; i < img.getHeight(); i++) {
//			System.out.println("i : " + i);
			for(int j = 0; j < img.getWidth()-1; j++) {
//				System.out.println("j : " + j);
				int rgb = img.getRGB(j, i);
				if(rgb != -16777216) {
					System.out.println("rgb : " + rgb);
				}
				array[i][j] = rgb;
			}
		}
				
		return array;
	}
}
