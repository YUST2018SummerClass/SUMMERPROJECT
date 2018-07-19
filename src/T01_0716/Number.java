package T01_0716;

public class Number {
	int Number;  
	String Name;
	
	public int getNumber() {  
		return Number;  
	}  
	
	public void setNumber(int Number) {  
		this.Number = Number; 
	}
	
	public String getName() {  
		return Name;  
	}

	public void setName(String Name) {  
		this.Name= Name;  
	}
	
	public void printOut(){  
		System.out.printf("Num: %d\t Name: %s\t\n", Number, Name);  
	}
}