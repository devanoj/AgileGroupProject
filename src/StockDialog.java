

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import net.miginfocom.swing.MigLayout;

public class StockDialog extends JDialog  {

	private JLabel heading = new JLabel("Stock Registration");
	private JLabel nameLabel = new JLabel("Name");
	private JTextField textName = new JTextField(20);
	private JLabel email = new JLabel("Email");
	private JTextField textEmail = new JTextField(20);
	private JLabel amount = new JLabel("Amount");
	private JTextField textAmount= new JTextField(20);
	private JLabel exp = new JLabel("EXP");
	private JTextField day = new JTextField(2);
	private JTextField month = new JTextField(2);
	private JTextField year = new JTextField(4);
	private JLabel types = new JLabel("Item Type");
	private JRadioButton r1= new JRadioButton("Luxury");
	private JRadioButton r2= new JRadioButton("Essential");
	private JRadioButton r3 = new JRadioButton("Gift");
	
	
	private ButtonGroup type = new ButtonGroup();
//	private JCheckBox term = new JCheckBox("I accept terms and conditions");
	private JButton okButton  = new JButton("OK");
	private JButton cancelButton  = new JButton("Cancel");
	private StockSystem parent;
	
	public StockDialog(Frame owner,String title, boolean modal) {
		super(owner, title, modal);
		this.setLayout(new MigLayout());
		parent = (StockSystem)this.getParent();
		this.setLocationRelativeTo(parent);
		this.add(nameLabel);
		this.add(textName, "wrap");
		this.add(amount);
		this.add(textAmount,"wrap");
		this.add(exp);
		this.add(day,"span 1, split 3");
		this.add(month);
		this.add(year, "wrap");
		r1.setActionCommand("Luxury");
		r2.setActionCommand("Essential");
		r3.setActionCommand("gift");
		this.add(r1,"");
		this.add(r2,"wrap");
		this.add(r3, "");
		type.add(r1);
		type.add(r2);
		type.add(r3);
		this.add(okButton, "tag ok, skip 1, split 2");
		this.add(cancelButton,"tag cancel");
		this.pack();
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StockDialog.this.setVisible(false);
				
			}
		});
		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String name = textName.getText();
				String amountAsString = textAmount.getText();
				int amount= Integer.parseInt(amountAsString);
				String dayAsString = day.getText();
				int day = Integer.parseInt(dayAsString);
				String monthAsString = month.getText();
				int month = Integer.parseInt(monthAsString);
				String yearAsString = year.getText();
				int year = Integer.parseInt(yearAsString);
				ButtonModel model = type.getSelection();
				String type = model.getActionCommand();
				Stock newStock= new Stock(name,amount,day,month,year,type);
				parent.addStock(newStock);
				StockDialog.this.setVisible(false);
				
				
				
				
				}
			});
		
		
		
		
		}

}
