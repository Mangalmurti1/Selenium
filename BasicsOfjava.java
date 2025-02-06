import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicsOfjava {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
  int a=10;
  char letter = 'A';
  String phrase="Mahesh Rajkumar Rokade";
  double dec =76.78;
  boolean var=true;
  
  System.out.println("Value of the integer type variable is = "+a);
  System.out.println("Vale of the character type variable is = "+letter);
  System.out.println("Value of string type variable is = "+phrase);
  System.out.println("Value of the double type varibale is = "+dec);
  System.out.println("Value of the boolena type variable is ="+var);
  
  int []arr= {10,27,31,40,51,89};
 
  
 System.out.println("Value of first array element is = "+arr[4]);
 
 //System.out.println("Below are the values of array");
 System.out.println("Length of the aray is ="+arr.length);
 
 System.out.println("Beow is the output of the enhanced for loop");
 for(int s:arr)
 {
	System.out.println("Values are = "+s); 
 }
 
 System.out.println("Normal foor loop with logic inside");
 for (int i=0;i<arr.length;i++)
 {
     if(arr[i]%2==0)
     {
	 System.out.println("The below number is even number= "+arr[i]); 
	 }
     else
     {
       System.out.println("The below number is odd= "+arr[i]);	 
     }
 }

	
	/*ARRAYLLIST- Its an class. If you want to access the methods of that class then you have
	to create object of that class and access the methods by using object_name.method().
    */
 
    ArrayList<String> str = new ArrayList<>();
    str.add("Mahesh");
    str.add("Rokade");
    str.add("Rohit");
    
    System.out.println("Value of the first index in the ArrayList is = "+str.get(1));
    
    System.out.println("Values in araylist are :");
    
    for (int i=0;i<str.size();i++)
    {
    	System.out.println("ArrayList index is = " + i + " & value associated with that index is = "+ str.get(i));
    }
    
    System.out.println("Printing values from an enhanced for loop");
    
    for(String val:str)
    {
    	System.out.println(val);
    	
    }
    
    System.out.println("To check wether perticular element present in the arrayist");
    System.out.println(str.contains("swarup"));
    System.out.println(str.contains("Rokade"));
    
    /* Convert normal array to arraylist.
      Normal array is 'arr'
      
      we have to convert normal array to Arraylist
    */
    
    String str1[]= {"mahesh","Dinesh"};
    for(int j=0;j<str1.length;j++)
    {
    	System.out.println("Values in string arrays are = "+str1[j]);
    	
    }
         
    /*  BELOW METHOD IS ALSO USEFULL TO CONVERT THE NORMAL STRING ARRAY TO ARRAYLIST BUT WE ARE UNABLE TO ADD NEW 
        ELEMENT IN CONVERTED ARRALIST
        List<String> newarraylist= Arrays.asList(str1);
        System.out.println(newarraylist.contains("Dinesh"));   
        System.out.println(newarraylist);
        newarraylist.add("Rutuja");*/
   
       // BELOW METHOD IS USEFULL FOR BOTH CONVERTED NORMAL STRING TYPE ARRAY TO ARRAYLIST AS WELL AS ADDING NEW ELEMENT
    ArrayList <String> hemant = new ArrayList<>(Arrays.asList(str1));
    System.out.println(hemant.contains("MAHESH"));
    System.out.println(hemant.add("Rutuja"));
    System.out.println(hemant);
    hemant.add("Rajkumar");
    System.out.println(hemant);
    hemant.remove(0);
    System.out.println(hemant);
 } 
}

