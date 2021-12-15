import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class basket extends JFrame implements ActionListener{

	private JLabel label = new JLabel("Types of items available");
	private JComboBox<String> giftItems = new JComboBox<String>();
	//private JLabel vatPrices = new JLabel();
	private JButton button = new JButton("Submit"); 
	private JLabel amount = new JLabel("Enter amount of items purchased");
	private JTextField amountTextfield = new JTextField(5);
	//private JButton button2 = new JButton("Show Vat Prices");
	//private JTextArea vat = new JTextArea();
	private JPanel panel = new JPanel();
	//private JButton demo = new JButton("Show selected");
	private JTextField show_combobox_selected_item = new JTextField();
	//private JTextField cal_combobox_selected_item = new JTextField(10);
	private JButton calculate = new JButton("Caluclate");
	private JTextArea vat = new JTextArea();
	private JTextArea calculations = new JTextArea();
	private JTextArea display = new JTextArea();
	
	
	
	
	public basket(String title) {
		super(title);
		this.setLayout(new MigLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(label);
		this.add(giftItems, "wrap");
		giftItems.addItem("Gift €20 ");
		giftItems.addItem("Essential €30");
		giftItems.addItem("Luxury €50");
		giftItems.setSelectedItem(null);
		giftItems.setBounds(90, 85, 245, 31);
		this.add(panel);
		
		//this.add(demo, "wrap 4");
		this.add(show_combobox_selected_item, "wrap 4");
		show_combobox_selected_item.setBounds(110, 188, 213, 23);
		show_combobox_selected_item.setColumns(10);
		this.add(vat);
		giftItems.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String value = (String) giftItems.getSelectedItem();
				show_combobox_selected_item.setText(value);
				vat.setText("Vat Prices = " +
						" \nLuxury @ 20%" +
						" \nEssential @ 10%" +
						" \nGift @ 5%");
			}
			
		});
			

		this.add(amount);
		this.add(amountTextfield);
		this.add(button);
		button.getText();
		//this.add(cal_combobox_selected_item);
		this.add(calculate);
		calculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calculateButton();
				
				
			}
			
		});
		this.add(display);
		
	}
	public void calculateButton() {
		float quantity, price;
		double totalWithNoVat;
		double vat;
		double totalPrice;
		double total;
		String itemValue = (String) giftItems.getSelectedItem();
		//cal_combobox_selected_item.setText(itemValue);
		int quantityValue = Integer.parseInt((String)amountTextfield.getSelectedText());
		
		if(itemValue.equalsIgnoreCase("Luxury €50")) {
			totalPrice = (50 * quantityValue);
			double vatPrice = 0.20;
			total = totalPrice - vatPrice;
			calculations.setText("Total value with VAT " + total);
		}
			
		else if (itemValue.equalsIgnoreCase("Gift €20")){
				totalPrice = (20 * quantityValue);
				double vatPrice1 = 0.50;
				total = totalPrice - vatPrice1;
				calculations.setText("Total value with VAT " + total);
				
			}
		else if  (itemValue.equalsIgnoreCase("Essential €30")) {
				totalPrice = (30 * quantityValue);
				double vatPrice1 = 0.10;
				total = totalPrice - vatPrice1;
				calculations.setText("Total value with VAT " + total);
				
			
		}
			
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {   
		String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(systemLookAndFeelClassName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		basket window = new basket("Shopping Cart And Caluclations"); 
		window.setSize(600, 300);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
}

}
