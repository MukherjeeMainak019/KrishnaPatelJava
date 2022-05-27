package basicJava;

public class Finalkeyword {
	
	
//	Final keyword be used against Variables, Methods and Class
	
//	Final Class - If a class is final we cannot extend the class
	
//	Final Method - If a method is final we cannot override it
	
//	Final Variable - If a variable is final we cannot change the value of the variable

	
	
	final int a = 5;
	int b = 6;
	int sum = 0;
	
	
	final String excelSheetPath = "";
	final String configfilepath = "";
	final String chromedriverpath = "";
	final String javapointimagepath = "";
	
	
	
	
	
	public void sum()
	{
		System.out.println("This is a final method");
		
		b = 9;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Finalkeyword finalkeyword = new Finalkeyword();
		
		finalkeyword.sum();
	}
	
	}
