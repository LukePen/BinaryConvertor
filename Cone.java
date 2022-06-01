package binaryConverter;

import javax.swing.JOptionPane;

public class Cone {
	public String binary;
	public int gian;
	public static String s="";
	public String binaryAddition = "";
	public static int rc = 0;
	public static int rs = 0;
	public static float h= 0;
	public static float ss= 0;
	public static float l= 0;
	public static float a= 0;
	public static int[] p;
	
	/*
	 * This is the main class for the program, holding the starting GUI and methods
	 */
	    public static void main(String[] args) {
	    	Cone c = new Cone();
	    }
	    
	    //This constructor begins the program, asking the user for which conversion they would like and constructing objects thereafter
	    	public Cone(){
	    	p = new int[3];

	    	rc=0;
	    	rs=0;	
		    String[] buttons = { "Binary to Decimal", "Decimal to Binary", "Decimal to Hex", "Hex to Decimal", "RGB to HSV", "Next" , "Exit"};
		    String[] buttons2 = { "Octal to Decimal", "Decimal to Octal" , "Back", "Exit"};

		    rc = JOptionPane.showOptionDialog(null, "Choose which conversion you'd like", "Conversions", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[6]);
		    if(rc==0) {
		    	BinaryConv o = new BinaryConv();

		    }
		    if(rc==1) {
		    	InttoBinary b = new InttoBinary();
		    }
		    if(rc==2) {
		    	intToHex h = new intToHex();
		    }
		    if(rc==3) {
		    	HexToInt p = new HexToInt();
		    }
		    if(rc==4){
		    	double h = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert red value (Double between 0 and 255)"));
		    	System.out.println(h);
		    	double ss = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert blue value (Double between 0 and 255)"));
		    	double l = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert green value (Double between 0 and 255)"));
		    	HGBTORGB.rgb_to_hsv(h, ss, l);
		    }
		    if(rc==5) {
			    rs = JOptionPane.showOptionDialog(null, "Choose which conversion you'd like", "Conversions", JOptionPane.WARNING_MESSAGE, 0, null, buttons2, buttons2[3]);
			    if(rs==0) {
			    	OctalToInt n = new OctalToInt();

			    }
			    if(rs==1) {
			    	IntToOctonal j = new IntToOctonal();
			    }
			    if(rs==2) {
			    	Cone v = new Cone();
			    }
			    if(rs==3) {
			    	System.exit(0);
			    }
		    }
		    if(rc==6) {
		    	System.exit(0);
		    }

	    }
	    
}