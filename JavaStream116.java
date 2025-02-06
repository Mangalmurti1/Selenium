import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStream116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 Stream is collection of strings.
		 */
		ArrayList<String> li=new ArrayList<String>();
		li.add("mahesh");
		li.add("Sarang");
		li.add("Rohit");
		li.add("Sh");
		li.add("Om");
//		
//		int count=0;
//		for(int i=0;i<li.size();i++)
//		{
//			String name=li.get(i);
//		    if(name.startsWith("R"))
//		    {
//		    	count++;
//		    }
//		}
//		System.out.println("Count of the name starts with R is="+count+"\n");
//		
//		//Using stream i.e converting Arraylist to stream
//		
//		long count2=li.stream().filter(s->s.startsWith("m")).count();
//		System.out.println("Count of the names starts with M using stream class is = "+count2+"\n");
//		
//		// Creating stream i.e. collection of string (Here we skipped to convert the ArrayList to stream rather created direct stream )
//		long count3=Stream.of("Dinesh","Pratap","Dinkar","Pralhad").filter(s->s.startsWith("P")).count();
//		System.out.println("Count of the names starts with P using stream class is = "+count3+"\n");
//		
//		
//		//To print the ArrayList elements in normal way
//		System.out.println("Below are the elements present in the ArrayList printed using normal way \n");
//		for(int j=0;j<li.size();j++)
//		{
//			System.out.println(li.get(j));
//		}
//		
//		//To print ArrayList i.e. li using stream		
		li.stream().forEach(s->System.out.println("Elements in the Arraylist i.e. li are = "+s));
		
		//Print the names which length less than four 
		Stream.of("Om","nihal","Mahesh","Keshav").filter(s->s.length()<4).forEach(s->System.out.println("\n The names which length less than four = "+s+"\n"));
		
		//Below statement will print first name from the result i.e. names with length less than four
		li.stream().filter(s->s.length()<4).limit(1).forEach(s->System.out.println("First name from the result set i.e. names with length less than four = "+s+"\n"));
		
	    //Print the names which have last letter as 'h'
		Stream.of("Trishula","Dinesh","Mahesh","Rohit").filter(s->s.endsWith("h")).forEach(s->System.out.println("The names which have last letter as 'h' = "+s+"\n"));
	
        //Print the names which ends with letter 'a' with uppercase
		Stream.of("Trishula","Dinesh","Mahesh","Rohit").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println("The names which ends with letter 'a' with uppercase = "+s+"\n"));
		
		//Print the names which ends with 'h' and sorted.
		Stream.of("Trishula","Dinesh","Mahesh","Rohit","Nilesh").filter(s->s.endsWith("h")).sorted().forEach(s->System.out.println("The names which ends with 'h' and sorted = "+s+"\n"));
	
	    //Combine the two different stream and print it
		
		List<String> second= Arrays.asList("Trishula","Dinesh","Bhuvnesh");
		
		Stream<String> Combine= Stream.concat(li.stream(), second.stream());
		Combine.forEach(s->System.out.println("String values in two different streams are = "+s));
		          //OR you can use below one line
		//Stream.concat(li.stream(), second.stream()).forEach(s->System.out.println("String values in two different streams are = "+s));
		
		//Find the perticular name in stream or not
		boolean flag=Stream.concat(li.stream(), second.stream()).anyMatch(s->s.equalsIgnoreCase("Trishula"));
	    System.out.println("\n"+flag+"\n");
	    Assert.assertTrue(true);
	    
	    //Get one stream of elements and find the elements which starts with letter 'B' and make new stream i.e. List or collection
	    
	  List<String> coll=   Stream.of("Chiranjiv","Bhavesh","Vedant","Baba","Bandu").filter(s->s.startsWith("B")).collect(Collectors.toList());
	  System.out.println(coll.get(1)+"\n"); //so here, it first filter the stream which names starts with 'B' i.e. Bhavesh,Baba, Bandu then it print the name present in the second index
	  
	  //Take the integer array, convert it into list of array, find the unique elements and create new stream.
	  
	  List<Integer> values =Arrays.asList(5,7,3,4,5,8,1,2,4);
	  List<Integer> newList=values.stream().distinct().sorted().collect(Collectors.toList());
	  System.out.println("Before apllying sorting,uniqness list of integer look like = "+values+"\n "+"Generated new list of integers is = "+newList);
	}

}
