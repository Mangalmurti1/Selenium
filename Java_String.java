
public class Java_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Strings in java is object which represent sequence of characters
		// there are two ways that we declare the string 1.Literal 2.using new memory allocation operator.
		
		// 1. Literal. here we can see below object s and s1 are different but values are same inside it.
		// so, if you call s1 object still it point to object 's', system is not creating new object for same values inside it.
		String s= "Mahesh Rajkumar Rokade";
		String s1 ="Mahesh Rajkumar Rokade";
		System.out.println("Value of the variable s1 is =\n" +s1);
		
		//2. Using new memory allocation operator
		//here though the values are same in two different objects, system creates space for both the objects.
		String s3 = new String("Mahesh");
		String s4= new String("Mahesh");
		
		String names[]= s.split("Rajkumar"); //here i have splitted the entire 's1' string using space as an delimeter.
		
		System.out.println("Value at the first index in splitted string is = "+names[0]);
		System.out.println("Value at the first index in splitted string is = "+names[1]);
		//System.out.println("Value at the first index in splitted string is = "+names[2]);
		System.out.println(names[0].trim());
		System.out.println(names[1].trim());
		
		// print string 's' character by character. Here we can use object.chatAt() i.e. s.charAt().
		for(int i=0;i<s.length();i++)
		{
		  System.out.println(s.charAt(i));	
		}
		
		//Here we have to print the characters by reverse order
		
		System.out.println("****************************************");
		
		for (int j=s.length()-1;j>=0;j--)
		{
		  System.out.println(s.charAt(j));	
			
		}
		}
		
	}


