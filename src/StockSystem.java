

import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class StockSystem extends JFrame implements ActionListener{
	
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu itemMenu = new JMenu("Items");
	private JMenuItem createItem = new JMenuItem("Create Item");
	private List<Stock> stocks= new ArrayList<>();
	
	private StockTableModel tableModel = new StockTableModel(stocks);
	private JTable employeeTable = new JTable(tableModel);
	private JScrollPane scrollPane = new JScrollPane(employeeTable);
	
	private ImageIcon image1;
	private JLabel label1;
	

	private static	JButton button;
	private static	JButton create;
	private static	JButton view;


	public static void LoginSystem() {
		
        Scanner scan = new Scanner(System.in);
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setBounds(250,250,250,250);
			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.add(panel);
			frame.setLocationRelativeTo(null);
			panel.setLayout(null);
			
		
			
			button = new JButton("Enter System");
			button.setBounds(30,100,100,50);
			button.setAlignmentX(CENTER_ALIGNMENT);
			button.setLayout(null);
			button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
							StockSystem window = new StockSystem("Supevalu");
							window.pack();
							window.setLocationRelativeTo(null);
							window.setVisible(true);
							frame.setVisible(false);
						}
						
			});
			panel.add(button);
			frame.setVisible(true);		
	}
			
	public StockSystem(String title) {
		super(title);
		this.setLayout(new MigLayout("insets 15 30 30 30"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		stocks.add(new Stock("coffee",34, 12,05,2000,"Gift"));
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		this.setJMenuBar(menuBar);
		menuBar.add(itemMenu); 
		itemMenu.add(createItem);
		
		
		frame.add(panel);
		frame.setBounds(400,200,200,400);
		frame.setVisible(true);

		frame.setLocationRelativeTo(null);
		panel.setLayout(null);
		
	
		
		create = new JButton("end");
		create.setBounds(30,100,100,50);
		create.setAlignmentX(CENTER_ALIGNMENT);
		create.setLayout(null);
		
		
		create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					frame.setVisible(false);
					StockSystem.this.setVisible(false);
					
				}
				
	});
		this.add(create);

		createItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				StockDialog dialog = new StockDialog(StockSystem.this,"New Employee", true);
				dialog.setVisible(true);
		
			}});
		this.add(scrollPane);
	}
	public void addStock(Stock stock) {
	
		stocks.add(stock);
		System.out.println("There are now "+ stocks.size() + " items in stock");
		tableModel.fireTableDataChanged();
	}
	
	

	public static void main(String[] args) {
		String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(systemLookAndFeelClassName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		LoginSystem();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
