import java.io.*;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


class �Ĵ�{
//	private int tablenum;
//	private String orderedmenu;
//	private int price;
//	private int orderednum;
//	
//	public int getTablenum() {
//		return tablenum;
//	}
//	public void setTablenum(int tablenum) throws IOException {
//		FileReader fr = new FileReader("c:/test/order.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String line = null;
//		String[] menu = null;
//		
//		this.tablenum = tablenum;
//		if((line = br.readLine()) != null) {
//			menu = line.split(",");			
//			System.out.println(menu[tablenum]);			
//		}
//	}
//	public String getOrderedmenu() {
//		return orderedmenu;
//	}
//	public void setOrderedmenu(String orderedmenu) throws IOException {
//		FileReader fr = new FileReader("c:/test/test.xlsx");
//		BufferedReader br = new BufferedReader(fr);
//		String[] menu = null;
//		String line = null;
//		
//		this.orderedmenu = orderedmenu;
//		
//		if((line = br.readLine()) != null) {
//			menu = line.split(",");			
//			System.out.println(menu[0]);			
//		}
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public int getOrderednum() {
//		return orderednum;
//	}
//	public void setOrderednum(int orderednum) {
//		this.orderednum = orderednum;
//	}	
	void ���(int pc) throws IOException {
		FileReader fr = new FileReader("c:/test/order.txt");
		BufferedReader br = new BufferedReader(fr);
		String[] menu = null;
		String line = null;
		
		while((line = br.readLine()) != null) {
			menu = line.split(",");			
			System.out.println(menu[pc -1]);
		}
	}
	
	XSSFWorkbook workbook = new XSSFWorkbook();
}
public class order {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pc; 
		�Ĵ� om = new �Ĵ�();
//		�Ĵ� om1 = new �Ĵ�();
//		�Ĵ� om2 = new �Ĵ�();
//		�Ĵ� om3 = new �Ĵ�();
//		�Ĵ� om4 = new �Ĵ�();
//		�Ĵ� om5 = new �Ĵ�();
//		
//		om1.setTablenum(0);
//		om1.setOrderedmenu();
//		om2.setTablenum(0);
//		om3.setTablenum(0);
//		om4.setTablenum(0);
//		om5.setTablenum(0);
		System.out.println("��� ���� 1. ���̺�, 2. �����̸� 3. ����, 4. ����");
		pc = sc.nextInt();
		om.���(pc);
	}
}
