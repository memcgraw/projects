package book.ch3;

/*************************************************************************
 *  Compilation:  javac Scale.java
 *  Execution:    java Scale filename w h
 *  Data files:   http://www.cs.princeton.edu/introcs/31datatype/mandrill.jpg
 *
 *  Scales an image to w-by-h and displays both the original
 *  and the scaled version to the screen.
 * 
 *  % java Scale mandrill.jpg 200 300
 *
 *
 *************************************************************************/

import java.awt.Color;

import cse131.ArgsProcessor;

import sedgewick.Picture;

public class Scale {
    public static void main(String[] args) {
    	ArgsProcessor ap = new ArgsProcessor(args);
        String filename = ArgsProcessor.chooseFile("images").toString();
        int w = ap.nextInt("Width?");
        int h = ap.nextInt("Height?");
        Picture source = new Picture(filename);
        Picture target = new Picture(w, h);

        for (int tx = 0; tx < w; tx++) {
            for (int ty = 0; ty < h; ty++) {
                int sx = tx * source.width()  / w;
                int sy = ty * source.height() / h;
                Color color = source.get(sx, sy);
                target.set(tx, ty, color);
            }
        }

        source.show();
        target.show();
    }
}
