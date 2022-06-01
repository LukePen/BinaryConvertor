package binaryConverter;

import java.awt.Color;

import javax.swing.JOptionPane;

public class HGBTORGB {
	
	
	//This is the static method which converts RGB values to its corresponding HSV values
	static void rgb_to_hsv(double r, double g, double b)
    {
 
        // R, G, B values are divided by 255
        // to change the range from 0..255 to 0..1
        r = r / 255.0;
        g = g / 255.0;
        b = b / 255.0;
 
        // h, s, v = hue, saturation, value
        double cmax = Math.max(r, Math.max(g, b)); // maximum of r, g, b
        double cmin = Math.min(r, Math.min(g, b)); // minimum of r, g, b
        double diff = cmax - cmin; // diff of cmax and cmin.
        double h = -1, s = -1;
         
        // if cmax and cmax are equal then h = 0
        if (cmax == cmin)
            h = 0;
 
        // if cmax equal r then compute h
        else if (cmax == r)
            h = (60 * ((g - b) / diff) + 360) % 360;
 
        // if cmax equal g then compute h
        else if (cmax == g)
            h = (60 * ((b - r) / diff) + 120) % 360;
 
        // if cmax equal b then compute h
        else if (cmax == b)
            h = (60 * ((r - g) / diff) + 240) % 360;
 
        // if cmax equal zero
        if (cmax == 0)
            s = 0;
        else
            s = (diff / cmax) * 100;
 
        // compute v
        double v = cmax * 100;
        System.out.println("(" + h + " " + s + " " + v + ")");
        JOptionPane.showMessageDialog(null, Math.round(h * 100.0) / 100.0 + " H, " + Math.round(s * 100.0) / 100.0+ " S%, " + Math.round(v * 100.0) / 100.0 + "V%");
    }
}
