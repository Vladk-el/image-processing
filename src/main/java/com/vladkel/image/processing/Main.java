package com.vladkel.image.processing;

import com.vladkel.image.processing.io.loader.Loader;
import com.vladkel.image.processing.io.writer.Writer;
import com.vladkel.image.processing.method.connected.component.labeling.CCLabeling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

  public static void main(String[] args) throws Exception {

    String fileName = "mandala";
    String modified = ".modified";
    String extension = ".png";

    Path path = Paths.get(Main.class.getResource(fileName + extension).toURI());

    Loader loader = new Loader(path);

    CCLabeling ccl = new CCLabeling(loader);

    Writer writer = new Writer(fileName + modified + extension);
    writer.write(loader.getHeight(), loader.getWidth(), ccl.compute());

  }

}
