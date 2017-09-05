package com.vladkel.image.processing;

import com.vladkel.image.processing.loader.Loader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loader loader = new Loader();
		
		try {			
			loader.load(Paths.get(Main.class.getResource("cercles.gif").toURI()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
