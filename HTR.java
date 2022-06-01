package binaryConverter;

//This is the class used to convert HSL Values to RGB values
public class HTR {
	
	
	//This was the method which converts the HSL Values (given via a parameter) into an RGB value.
	    public static int[] HSLtoRGB(float h, float s, float l, float alpha) {
	    	

	        if (s < 0.0f || s > 100.0f) {
	            String message = "Saturation parameter outside of range";
	            throw new IllegalArgumentException(message);
	        }

	        if (l < 0.0f || l > 100.0f) {
	            String message = "Luminance parameter outside of range";
	            throw new IllegalArgumentException(message);
	        }

	        if (alpha < 0.0f || alpha > 1.0f) {
	            String message = "Alpha parameter outside of range";
	            throw new IllegalArgumentException(message);
	        }
	        System.out.println(h);
	        //  Formula needs all values between 0 - 1.

	        h = h % 360.0f;
	        h /= 360f;
	        s /= 100f;
	        l /= 100f;
	        System.out.println(h);

	        float q = 0;

	        if (l < 0.5)
	            q = l * (1 + s);
	        else
	            q = (l + s) - (s * l);

	        float p = 2 * l - q;

	        int r = Math.round(Math.max(0, HueToRGB(p, q, h + (1.0f / 3.0f)) * 256));
	        int g = Math.round(Math.max(0, HueToRGB(p, q, h) * 256));
	        int b = Math.round(Math.max(0, HueToRGB(p, q, h - (1.0f / 3.0f)) * 256));

	        int[] array = { r, g, b };
	        System.out.println(r);
	        return array;
	    }

	    private static float HueToRGB(float p, float q, float h) {
	        if (h < 0)
	            h += 1;

	        if (h > 1)
	            h -= 1;

	        if (6 * h < 1) {
	            return p + ((q - p) * 6 * h);
	        }

	        if (2 * h < 1) {
	            return q;
	        }

	        if (3 * h < 2) {
	            return p + ((q - p) * 6 * ((2.0f / 3.0f) - h));
	        }

	        return p;
	    }
	}

