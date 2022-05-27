package basicJava;

public class Stringtutorials {

	
	public static void strings()
	{
		String str1[] = {"Credit", "card", "application", "has", "been", "submitted", "successfully", "B12345", "is", "your", "application", "number"};
		
		for(int i=0; i<str1.length; i++)
		{
			String value1 = str1[i];
			
			for(int j=i+1; j<str1.length; j++)
			{
				String value2 = str1[j];
				
				if(value1.equals(value2))
				{
					System.out.println(str1[j] + "is duplicate");
				}
			}
			
		}
		
	}
}


//split(i will specify the split regex)

// whenever we spilt a string we have o store the split values in an array.

// (:) String [0] = Sale Extended
//	String [1]	= Travel wali holi



// Credit card application has been submitted successfully. Please note your application number is B12345
// track application : B12345 - Pre screening app

//trim() - remove leading and trailing spaces










