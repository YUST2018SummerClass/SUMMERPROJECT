package T01_0716;

public class orderClass{
		int tableNumber;  
		String orderedMenu; 
		int menuPrice;
		int orderedNumber;  
	
		public int getTableNumber() {  
			return tableNumber;  
		}  
		
		public void setTableNumber(int tableNumber) throws Exception {  
			this.tableNumber = tableNumber; 
		}

		public String getOrderedMenu() {  
			return orderedMenu;  
		}

		public void setOrderedMenu(String orderedMenu) throws Exception {  
			this.orderedMenu = orderedMenu;  
		}
		
		public int getMenuPrice() {  
			return menuPrice;  
		}
		
		public void setMenuPrice(int menuPrice) throws Exception {  
			this.menuPrice = menuPrice;  
		}  
		
		public int getOrderedNumber() {  
			return orderedNumber;  
		}

		public void setOrderedNumber(int orderedNumber) throws Exception {  
			this.orderedNumber = orderedNumber;  
		}
		public void printOrder() throws Exception{  
			System.out.printf("Table: %d\t Menu: %s\t Number: %d\t Price:%d\t Pay:%d\n", tableNumber, orderedMenu, orderedNumber, menuPrice,  menuPrice*orderedNumber);  
		}
	}
