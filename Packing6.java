package mergeWithGUI;

import java.awt.Insets;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Packing6 extends JFrame{
	public static void main(String[] args) {
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

}
