package com.Readlia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.awt.*;
import java.io.IOException;

public class Properties {
    static int brightness;
    static String nameFont;
    static int sizeFont;
    static Color colorText; // будет реальзовано в андроид
    static Color colorBG; // будет реализовано в андроид
    static String pathBook; // путь до книги

    static void loadProperties() {
        try {
            File file = new File("C:\\Users\\Vlad\\Desktop\\Readlia\\Properties.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            brightness = Integer.parseInt(line);
            line = reader.readLine();
            nameFont = line;
            line = reader.readLine();
            sizeFont = Integer.parseInt(line);
            line = reader.readLine();
            colorText = Color.getColor(line);
            line = reader.readLine();
            colorBG = Color.getColor(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public int getBrightness() {
        return brightness;
    }
    static public void setBrightness(int brightness) {
        Properties.brightness = brightness;
    }
    static public String getNameFont() {
        return nameFont;
    }
    static public void setNameFont(String nameFont) {
        Properties.nameFont = nameFont;
    }
    static public int getSizeFont() {
        return sizeFont;
    }
    static public void setSizeFont(int sizeFont) {
        Properties.sizeFont = sizeFont;
    }
    static public Color getColorText() {
        return colorText;
    }
    static public void setColorText(String colorText) {
        Properties.colorText = Color.getColor(colorText);
    }
    static public Color getColorBG() {
        return colorBG;
    }
    static public void setColorBG(String colorBG) {
        Properties.colorBG = Color.getColor(colorBG);
    }
    static public String getPathBook() {
        return pathBook;
    }
    static public void setPathBook(String pathBook) {
        pathBook = pathBook;
    }

}
