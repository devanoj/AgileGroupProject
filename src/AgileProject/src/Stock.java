import javax.swing.JButton;

public class Stock{
	
	private String name;
	private int amount; 
	//expiary date 
	private int day;
	private int month;
	private int year;
	private String type;
	
	
	public Stock(String name, int amount, int day,int month,int year,String type) {
		super();
		this.name = name;
		this.amount= amount;
		//expirary dates
		this.day = day;
		this.setMonth(month);
		this.setYear(year);
		this.type=type;
		
		
	//name
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//email
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount= amount;
	}
	//day
	public int getday() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	//month
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	//year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type= type;
	}
	
	public void add(JButton customer) {
		// TODO Auto-generated method stub
		
	}
		
	
}