package T01_0716;

import java.io.BufferedReader; 
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List;

public class OrderReaderByBuffer {  
	public static void main(String[] args) throws Exception {  
		// get the path for "src" folder in the Eclipse project  
		String path = new File("src").getAbsolutePath();  
		String fileName = "C:\\test\\order";  
		// use List to store many orders  
		List<orderClass> orderList = new ArrayList<>();  
		/*  
		 * Read File data   
		 * and store each field seperately using the Order Class  
		 */  
		FileReader fileReader = null;  
		BufferedReader bufferReader = null;  
		
		try {
			fileReader = new FileReader(fileName);  
			bufferReader = new BufferedReader(fileReader);  
			String str = null;  
			while ((str = bufferReader.readLine()) != null) {  
				// read a line from file  
				if(str.length()!=1) {  
					orderClass order = new orderClass();  
					String[] strArr = str.split(",");  
					order.setTableNumber(Integer.parseInt(strArr[0]));  
					order.setOrderedMenu(strArr[1].trim());  
					order.setMenuPrice(Integer.parseInt(strArr[2].trim()));  
					order.setOrderedNumber(Integer.parseInt(strArr[3].trim()));  
					// add Order instance to List  
					orderList.add(order);  
				}  
			}  
			bufferReader.close();  
			fileReader.close();  
		} catch (FileNotFoundException e) {  
			// TODO Auto-generated catch block  
			System.out.print("Open file Error!!!" + e);  
			e.printStackTrace();  
		} catch (IOException e) {  
			// TODO Auto-generated catch block  
			System.out.print("Read file Error!!!" + e);  
			e.printStackTrace();  
		}	  		
		// show the data collected from file  
		for(orderClass order: orderList) {  
			//			System.out.println(order.getTableNumber());  
			//			System.out.println(order.getOrderedMenu());  
			//			System.out.println(order.getMenuPrice());  
			//			System.out.println(order.getOrderedNumber());  
			System.out.println(order.toString());  
		}  
	}  
}  
