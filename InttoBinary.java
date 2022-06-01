package binaryConverter;

import javax.swing.JOptionPane;


//This is the class which handles converting Integers to Binary
public class InttoBinary {
	public String binary;
	public int gian;
	public String s="";
	public String exp;
	public String binaryAddition = "";
	public String binAdd2 = "";
	public int[] binaryFin = new int[8];
    static String st2 = "";
    static int binaryin[] = new int[40];

	private static String str ="";
	
	/*This is the constructor for the IntToBinary object- it begins by retrieving an input String via a dialog box. It also checks if the value is
	 * greater than 255, and warns the user that the binary will be greater than 8 digits.
	 */
	
	    public InttoBinary() {
	    s=JOptionPane.showInputDialog(null, "Input integer in decimal form (max being the 32 bit digit)");
	    if(Integer.valueOf(s) > 255) {
	    	JOptionPane.showMessageDialog(null, "WARNING: This number is greater than what can be displayed in 8 bits, and will have to be displayed in more");
	    }

	    toBinary(Integer.valueOf(s));
	JOptionPane.showMessageDialog(null,s + "\n" + binaryConv(str) + "\n" +str);
		Cone c = new Cone();

	    }
	    
	    
	    //This is the method which converts a decimal integer value into a binary string, taking in the decimal via a parameter
	    public static void toBinary(int decimal){    
	        int binary[] = new int[40];    
	        int index = 0;    
	        while(decimal > 0){   
		          binaryin[index] = decimal;
	          binary[index++] = decimal%2;    
	          decimal = decimal/2;    

	        }    
	        for(int i = index-1;i >= 0;i--){    
	        	str += binary[i]; 
	        	st2 += binary[i];
	        }    
	        for(int i = 0;i <= index-1;i++){    
	        	System.out.println();
		          System.out.print(binaryin[i] + " + ");    
		        }    
	   System.out.println();//new line  
	   }  
	    
	  //This method prints the split version of the integer, as the computer would read it in binary
	    private String binaryConv(String a) {
	    	double b = 0;
	    	String o = "";
	    	for(int i = 0; i <a.length(); i++) {
	    		if(a.charAt(i)== '1') {
	    			o += (int)Math.pow(2, a.length()-i-1) +" ";
	    		}
	    		else{
	    			o+= 0 + " ";
	    		}
	    	}
			return o;
	    }


}
