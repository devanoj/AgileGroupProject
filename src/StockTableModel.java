
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class StockTableModel extends AbstractTableModel {
	
	private List<Stock> stocks;
	private String[] columnNames= {"Name", "amount","DOB:day","DOB:month","DOB:year"};
	
	
	public StockTableModel(List<Stock> stocks) {
		
		this.stocks= stocks;
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}
	@Override
	public int getRowCount() {
		return stocks.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Stock stock = stocks.get(rowIndex);
		String result = null;
		switch(columnIndex) {
		case 0:
			result = stock.getName();
			break;
		case 1:
			result = Integer.toString(stock.getAmount());
			break;
	
		case 2:
			result = Integer.toString(stock.getday());
			break;
		case 3:
			result = Integer.toString(stock.getMonth());
			break;
		case 4:
			result = Integer.toString(stock.getYear());
			break;
		case 5:
			result = stock.getType();
			break;
		
		
		}
		return result;
	}

}
