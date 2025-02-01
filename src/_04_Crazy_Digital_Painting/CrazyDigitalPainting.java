package _04_Crazy_Digital_Painting;

import java.awt.Color;
import java.util.Random;

public class CrazyDigitalPainting {
	// 1. Create two final static integers for the width and height of the display.
	final static int WIDTH = 750;
	final static int HEIGHT = 500;
	// 2. Create a 2D array of Color objects. You will need to import
	//    java.awt.Color. Initialize the size of the array using the 
	//    integers created in step 1.
	Color cOlOrS[][] = new Color[HEIGHT][WIDTH];
	Random l = new Random();

	public CrazyDigitalPainting() {
		// 3. Open the crazy_digital_painting.png file and look at the image.
		//ok I did
		// 4. Iterate through the 2D array and initialize each Color object
		//    to a new color. The sample image was created using the following 
		//    pattern:
		//    colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
		int r = l.nextInt(256);
		int g = l.nextInt(256);
		int b = l.nextInt(256);
		for(int t = 0; t<WIDTH; t++) {
			g += t;
			g%=256;
			r-=t;
			r = Math.abs(r);
			r%=256;
			for(int a = 0; a<HEIGHT; a++) {
				b+= t-(a*3);
				b%=256;
				b = Math.abs(b);
				cOlOrS[a][t] = new Color(r, g, b);
			}
		}


		// 5. Come up with your own pattern to make a cool crazy image.

		// 6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
		//    to show off your picture.
	}

	public static void main(String[] args) {
		CrazyDigitalPainting cdp = new CrazyDigitalPainting();
		ColorArrayDisplayer.displayColorsAsImage(cdp.cOlOrS);
	}
}
