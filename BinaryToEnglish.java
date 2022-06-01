package binaryConverter;

import javax.swing.JOptionPane;

//This was the class I created to convert binary to English lettering.
public class BinaryToEnglish {
	public String binary;
	public int gian;
	public String s="";
	public int exp;
	public String binaryAddition = "";
	public String binAdd2 = "";
	//This was the constructor for the Binary to English Convertor object, which starts off by asking for the input in binary as a String via a Input Dialog box

	    public BinaryToEnglish() {
	    s=JOptionPane.showInputDialog(null, "Input binary (if missing numbers, will be shifted to right- if too many, first numbers will be cut off)");

	    if(s.length()<8) {
	    	s= binaryCheck2(s);
	    }
	    if(!isValid(s)) {
	    	JOptionPane.showMessageDialog(null, "Please only input binary (1's and 0's)");
	    	BinaryConv c = new BinaryConv();
	    }
	    exp = binaryConv(s);

	    
		JOptionPane.showMessageDialog(null,s + "\n"+ binaryAddition + "\n" + binAdd2);
		Cone c = new Cone();

	    }
	    
	    
	    
	    /*This is the method which actually converts the Binary to a decimal value. 
	     * it does this by looping through the values- if it is a zero, it adds two to the power of its 31 minus its position
	     * (Binary is read from right to left, increasing in value- In truth I could have just reversed how the number is read, but that proves more difficult with Strings 
	     */
	    private int binaryConv(String a) {
	    	double b = 0;
	    	int cnt=7;
	    	for(int i=0; i < a.length(); i++) {
		    		if(a.charAt(i) == '1') {
		    			b+= Math.pow(2, cnt);
		    			binaryAddition += (int)Math.pow(2, cnt) + " ";
		    		if(i!= 7) {
		    			int I = (int) Math.pow(2, cnt);
		    			binAdd2 += I + " + ";
		    		}
		    		else {
		    			binAdd2 += (int) Math.pow(2, cnt) + " = ";
	
		    		}
	    		
	    		}
	    			else {
		    		binaryAddition +=  "0 ";

	    		}
	    			
	    		cnt--;
	    	}
	    	binAdd2 += (int)b;
	    	
			return (int)b;
	    }
	    
	    //This method takes in a string parameter (which is the binary) and fills out the String to the total 32 digits by adding zeros, making coding for its conversion much easier.
	    private static String binaryCheck2(String a) {
	    	String so = a;
	    	
	    	for(int i = 0; i < 8-a.length(); i++) {
	    		so = "0" + so;
	    	}
			return so;
	    	
	    }
	    //This method runs through a string parameter to insure all the characters inside it are either 0 or 1, hence, binary, and returns false otherwise.

	    private static boolean isValid(String a) {
	    	
	    	for(int i = 0; i < a.length(); i++) {
	    		if(a.charAt(i) != '0' && a.charAt(i) !='1') {
	    			return false;
	    		}
	    	}
			return true;
	    	
	    }
}
