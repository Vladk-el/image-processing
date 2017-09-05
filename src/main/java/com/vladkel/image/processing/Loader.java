package com.vladkel.image.processing;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

import javax.imageio.ImageIO;

public class Loader {

	
	public Loader() {
		
	}
	
	public int[][] load(Path path) throws IOException {
		
		BufferedImage bi = ImageIO.read(path.toFile());
				
		return null;
	}
}
