
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo d = new MethodDemo();
		String phrase= d.getdata();
		System.out.println(phrase);
		MethodDemo2 d1=new MethodDemo2();
	    d1.getdata2();
	    display();
	}
	public String getdata()
	{
		System.out.println("Hi mahesh");
		return "\n Welcome in Neosoft";
		
	}
	
	public static void display()
	{
		
		System.out.println("I am in Static method display()");
	}
	
	

}
