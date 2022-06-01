package binaryConverter;

import java.util.ArrayList;

import javax.swing.JOptionPane;


//This is the class for converting Hex values into its base ten integer values
public class HexToInt {
	public String binary;
	public int gian;
	public String s="";
	public String exp;
	public String binaryAddition = "";
	public String binAdd2 = "";
	public int[] binaryFin = new int[8];
    static String st2 = "";
    static int binaryin[] = new int[40];
    static String AYO = "";
    static int rem = 0;
	private static String str ="";
	static String midstep = "";
	
	//This was the constructor for the Hex-Int Convertor object, which starts off by asking for the input in Hexcode as a String via a Input Dialog box

	    public HexToInt() {	
	    s=JOptionPane.showInputDialog(null, "Input hexcode");
	    tohex(s);
	    JOptionPane.showMessageDialog(null, s +"\n" + tohex(s) +  "\n" + rem);
		Cone c = new Cone();

	    }
	  /*
	   * This was the method which converts the hex code to an integer, adding their integer values.
	   */
	    public String tohex(String a) {
	        String num = a;
	        ArrayList<Integer> cars = new ArrayList<Integer>();	        // For storing remainder
	        rem = 0;
	        String str2 = "";
	        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	        for(int i = 0; i < a.length(); i++) {
	            Boolean flag = Character.isDigit(num.charAt(i));
	            int po = Character.getNumericValue(num.charAt(i));
	        	if(flag) {
	        		rem += (int)(Integer.valueOf(po)*Math.pow(16, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(Integer.valueOf(po)*Math.pow(16, num.length()-i-1)) +" + ";
	        		System.out.println(Integer.valueOf(po)*Math.pow(16, num.length()-i-1));
	        		System.out.println(po + "a");
	        		}
	        		else {
		        		str2 += (int)(Integer.valueOf(po)*Math.pow(16, num.length()-i-1));

	        		}

	        	}
	        	else if(num.charAt(i) == 'A' ||num.charAt(i) == 'a' ) {
	        		rem += (int)(10*Math.pow(16, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(10*Math.pow(16, num.length()-i-1)) + " + ";
	        		}
	        		else {
	        			str2 += (int)(10*Math.pow(16, num.length()-i-1));
	        		}
	        	}
	        	else if(num.charAt(i) == 'B'||num.charAt(i) == 'b') {
	        		rem += (int)(11*Math.pow(16, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(11*Math.pow(16, num.length()-i-1)) + " + ";
	        		}
	        		else {
	        			str2 += (int)(11*Math.pow(16, num.length()-i-1));
	        		}
	        	}
	        	else if(num.charAt(i) == 'C'||num.charAt(i) == 'c') {
	        		rem += (int)(12*Math.pow(16, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(12*Math.pow(16, num.length()-i-1)) + " + ";
	        		}
	        		else {
	        		str2 += (int)(12*Math.pow(16, num.length()-i-1));
	        		}
	        	}
	        	else if(num.charAt(i) == 'D'||num.charAt(i) == 'd') {
	        		
	        		rem += (int)(13*Math.pow(16, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(13*Math.pow(16, num.length()-i-1)) + " + ";
	        		}
	        		else {
	        			str2 += (int)(13*Math.pow(16, num.length()-i-1));
	        		}
	        	}
	        	else if(num.charAt(i) == 'E'||num.charAt(i) == 'e') {
	        		rem += (int)(14*Math.pow(16, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(14*Math.pow(16, num.length()-i-1)) + " + ";
	        		}
	        		else {
	        			str2 += (int)(14*Math.pow(16, num.length()-i-1));
	        		}
	        	}
	        	else if(num.charAt(i) == 'F'||num.charAt(i) == 'f') {
	        		rem += (int)(15*Math.pow(16, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(15*Math.pow(16, num.length()-i-1)) + " + ";
	        		}
	        		else {
	        			str2 += (int)(15*Math.pow(16, num.length()-i-1));
	        		}

	        	}
	        }
	        return str2;
	    }

	    
//	    

}
