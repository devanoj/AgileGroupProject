import java.awt.Insets;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class agileGroupProject extends JFrame{
	static int totalChangeGiven, oneCent, twoCent, fiveCent, tenCent, twentyCent, fiftyCent, oneEuro, twoEuro, fiveEuro, tenEuro, twentyEuro, fiftyEuro, HEuro, twoHEuro;
	
	public static void main(String[] args) {
		ccMethod();
		Scanner scan = new Scanner(System.in);
		int l,w,h,area,areaB;    
		int boxl,boxw,boxh;
		int j=1, k=1; //just used for numbering no real use
		int sum = 0;
		
		
		String firstNumber = JOptionPane.showInputDialog("Enter number of items you want to add to basket:");
		int num=Integer.parseInt(firstNumber); 
		
		int myItem[] = new int[num];
		int wItem[] = new int[num];
		
		JOptionPane.showMessageDialog(null, "*Measurements are all in cm*");
		
		
		for(int i=0; i < num; i++, j++)
		{
			
		    
		    String numberL = JOptionPane.showInputDialog("Length of item " + j + ":");
			l=Integer.parseInt(numberL); 
		    
			
		   
		    String numberW = JOptionPane.showInputDialog("Width of item " + j + ":");
			w=Integer.parseInt(numberW); 
		    
			
			    
			String numberH = JOptionPane.showInputDialog("Height of item " + j + ":");
			h=Integer.parseInt(numberH);
		    
		    
		    area = l*w*h;
		    myItem[i] = area;
		    
		    
		    String numberWt = JOptionPane.showInputDialog("Weight of item " + j + ":");
		    wItem[i]=Integer.parseInt(numberWt);
		}
		
		
		
		
		int max = Arrays.stream(myItem).max().getAsInt();
		int maxW = Arrays.stream(wItem).max().getAsInt();
		
		
		
		
		for( int temp2 : myItem) {
	          sum = sum + temp2;
	      }
		


		
		String secondNumber = JOptionPane.showInputDialog("Enter number of boxes bought:");
		int num1=Integer.parseInt(secondNumber); 
		
		
		
		int myBox[] = new int[num1];
		int wBox[] = new int[num1];
		
		for(int i=0; i < num1; i++, k++)
		{
		    
		    
			String numberLe = JOptionPane.showInputDialog("Length of box " + k + ":");
			boxl=Integer.parseInt(numberLe);
			
			
			String numberWi = JOptionPane.showInputDialog("Width of box " + k + ":");
			boxw=Integer.parseInt(numberWi);
			
		    
		    String numberHe = JOptionPane.showInputDialog("Height of box " + k + ":");
			boxh=Integer.parseInt(numberHe);
		    
		    areaB = boxl*boxw*boxh;
		    
		    myBox[i] = areaB;
		    
		    
		    String numberWit = JOptionPane.showInputDialog("Weight of box " + k + ":");
		    wBox[i]=Integer.parseInt(numberWit);
		}
		
		
		
		
		int max1 = Arrays.stream(myBox).max().getAsInt();
		int max1W = Arrays.stream(wBox).max().getAsInt();
		
		
		
		int numOfBox = sum/max1;
		if (numOfBox < 1) {
			numOfBox++;}
			
		
	    
		if (max > max1) {
			JOptionPane.showMessageDialog(null, "Error area of items is bigger than the area of the box"
					+ "\n Items won't fit in box!");
		}
		else if (maxW > max1W){
			JOptionPane.showMessageDialog(null, "Error the item is heavier than the box");
		}
		else {
			JOptionPane.showMessageDialog(null, "The weight can hold! Press ok to see the number of boxes needed");
			JOptionPane.showMessageDialog(null, numOfBox);
		}
		

	}
	private static void ccMethod() {
		String firstNumber = JOptionPane.showInputDialog("Enter price of item");
		String secondNumber = JOptionPane.showInputDialog("Enter money given");
		
		
		double priceOfItem = Double.parseDouble(firstNumber);
		double paid = Double.parseDouble(secondNumber);
		  
		
		int priceOfItemInt = (int) (priceOfItem * 100);
		int paidInt = (int) (paid * 100);
		
		
		oneCent=1;
		twoCent=2;
		fiveCent=5;
		tenCent=10;
		twentyCent=20;
		fiftyCent=50;
		oneEuro=100;
		twoEuro=200;
		fiveEuro=500;
		tenEuro=1000;
		twentyEuro=2000;
		fiftyEuro=5000;
		HEuro=10000;
		twoHEuro=20000; //14 variables
		
		
		int[] moneyArray = {oneCent, twoCent, fiveCent, tenCent, twentyCent, fiftyCent, oneEuro, twoEuro, fiveEuro, tenEuro, twentyEuro, fiftyEuro, HEuro, twoHEuro};
		int [] changeArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		
		if(paid > priceOfItem) {totalChangeGiven = paidInt - priceOfItemInt;}
		

	    if(priceOfItem > paid) {
	    		JOptionPane.showMessageDialog( null, "Not enough money.  Try again" );
	    }
	    
	    
	    for(int i = 13; i >= 0; i--) {
	    	int r = totalChangeGiven % moneyArray[i]; 
	    	if(r < totalChangeGiven) { 
	    			changeArray[i] = (totalChangeGiven - r) / moneyArray[i]; 
	    			totalChangeGiven = r; 
	    		}
	}
	    /*
	    JOptionPane.showMessageDialog( null, "Two Hundred(s): " + changeArray[13]);
	    JOptionPane.showMessageDialog( null, "One Hundred(s): " + changeArray[12]);
	    JOptionPane.showMessageDialog( null, "Fifty Euro(s): " + changeArray[11]);
	    JOptionPane.showMessageDialog( null, "Twenty Euro(s): " + changeArray[10]);
	    JOptionPane.showMessageDialog( null, "Ten Euro(s): " + changeArray[9]);
	    JOptionPane.showMessageDialog( null, "Five Euro(s): " + changeArray[8]);
	    JOptionPane.showMessageDialog( null, "Two Euro(s): " + changeArray[7]);
	    JOptionPane.showMessageDialog( null, "One Euros(s): " + changeArray[6]);
	    JOptionPane.showMessageDialog( null, "Fifty Cents(s): " + changeArray[5]);
	    JOptionPane.showMessageDialog( null, "Twenty Cent(s): " + changeArray[4]);
	    JOptionPane.showMessageDialog( null, "Ten Cent(s): " + changeArray[3]);
	    JOptionPane.showMessageDialog( null, "Five Cent(s): " + changeArray[2]);
	    JOptionPane.showMessageDialog( null, "Two Cents(s): " + changeArray[1]);
	    JOptionPane.showMessageDialog( null, "One Cents(s): " + changeArray[0]); */
	    
	    //JFrame display the change
	    //JFrame.setDefaultLookAndFeelDecorated(true);
	    
	    
	    JFrame frame = new JFrame("Display the change");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel panel = new JPanel();
	    
	    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS); //set the boxlayout on the x-axis
	    panel.setLayout(boxlayout);
	    panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
	    
	    JLabel j13 = new JLabel("Two Hundred(s): " + changeArray[13]);
	    JLabel j12 = new JLabel("One Hundred(s): " + changeArray[12]);
	    JLabel j11 = new JLabel("Fifty Euro(s): " + changeArray[11]);
	    JLabel j10 = new JLabel("Twenty Euro(s): " + changeArray[10]);
	    JLabel j9 = new JLabel("Ten Euro(s): " + changeArray[9]);
	    JLabel j8 = new JLabel("Five Euro(s): " + changeArray[8]);
	    JLabel j7 = new JLabel("Two Euro(s): " + changeArray[7]);
	    JLabel j6 = new JLabel("One Euros(s): " + changeArray[6]);
	    JLabel j5 = new JLabel("Fifty Cents(s): " + changeArray[5]);
	    JLabel j4 = new JLabel("Twenty Cent(s): " + changeArray[4]);
	    JLabel j3 = new JLabel("Ten Cent(s): " + changeArray[3]);
	    JLabel j2 = new JLabel("Five Cent(s): " + changeArray[2]);
	    JLabel j1 = new JLabel("Two Cents(s): " + changeArray[1]);
	    JLabel j0 = new JLabel("One Cents(s): " + changeArray[0]);
	    
	    panel.add(j13);
	    panel.add(j12);
	    panel.add(j11);
	    panel.add(j10);
	    panel.add(j9);
	    panel.add(j8);
	    panel.add(j7);
	    panel.add(j6);
	    panel.add(j5);
	    panel.add(j4);
	    panel.add(j3);
	    panel.add(j2);
	    panel.add(j1);
	    panel.add(j0);
	    
	    frame.add(panel);
	    frame.pack();
	    frame.setVisible(true);
		
	}
}




