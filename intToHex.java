package binaryConverter;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class intToHex {
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
    
	private static String str ="";
	static String midstep = "";
	
	/*This is the constructor for the IntToBinary object- it begins by retrieving an input String via a dialog box. It also checks if the value is
	 * greater than 255, and warns the user that the binary will be greater than 8 digits.
	 */
	    public intToHex() {
	    s=JOptionPane.showInputDialog(null, "Input integer in decimal form");
	    tohex(Integer.valueOf(s));
	    JOptionPane.showMessageDialog(null, s +  "\n" + st2 + "\n" + AYO + "\n" + tohex(Integer.valueOf(s)));
		Cone c = new Cone();

	    }
	    
	    public String tohex(int a) {
	        int num = a;
	        ArrayList<Integer> cars = new ArrayList<Integer>();	        // For storing remainder
	        int rem;
	           
	        // For storing result
	        String str2=""; 
	        int cnt = 0;
	        // Digits in hexadecimal number system
	        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	    
	        while(num>0)
	        {
	        	midstep = num + midstep;
	        	AYO = num%16 + " " + AYO;
		        cars.add(0, num%16);

	        	cnt++;
	          rem=num%16; 
	          str2=hex[rem]+str2; 
	          
	          num=num/16;

	        }
	        for(int i = 0; i< cars.size(); i++) {
	        	if(i!= cars.size()-1) {
	        	st2 += (int)(Math.pow(16, cars.size()-i-1) * cars.get(i)) + " + ";
	        	}
	        	else {
		        	st2 += (int)(Math.pow(16, cars.size()-i-1) * cars.get(i)) + "";

	        	}
	        }
	        
	        return str2;
	    }

	    
//	    

}
