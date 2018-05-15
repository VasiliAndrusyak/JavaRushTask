package com.javarush.task.task16.task1631;
import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes types) {

        if (types != null){
            switch (types){
                case BMP: return new BmpReader();
                case PNG: return new PngReader();
                case JPG: return new JpgReader();

                }
            }
        throw (new IllegalArgumentException("Unknown image type"));
    }
}
