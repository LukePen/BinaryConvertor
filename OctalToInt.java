package binaryConverter;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//This is the class which handles the Octal to integer conversion
public class OctalToInt {
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
	//This is the constructor for this converter, taking in the octal code via a input dialog
	    public OctalToInt() {	
	    s=JOptionPane.showInputDialog(null, "Input Octal code");
	    tohex(s);
	    JOptionPane.showMessageDialog(null, s +"\n" + tohex(s) +  "\n" + rem);
		Cone c = new Cone();

	    }
	    
	   //This method takes in the input via an octal string parameter and converts it to an integer
	    public String tohex(String a) {
	        String num = a;
	        ArrayList<Integer> cars = new ArrayList<Integer>();	        // For storing remainder
	        rem = 0;
	        String str2 = "";
	        for(int i = 0; i < a.length(); i++) {
	            int po = Character.getNumericValue(num.charAt(i));
	        		rem += (int)(Integer.valueOf(po)*Math.pow(8, num.length()-i-1));
	        		if(i!=a.length()-1) {
	        		str2 += (int)(Integer.valueOf(po)*Math.pow(8, num.length()-i-1)) +" + ";
	        		System.out.println(Integer.valueOf(po)*Math.pow(8, num.length()-i-1));
	        		System.out.println(po + "a");
	        		}
	        		else {
		        		str2 += (int)(Integer.valueOf(po)*Math.pow(8, num.length()-i-1));


	        	}
	        }
	        return str2;
	    }

	    
//	    

}
