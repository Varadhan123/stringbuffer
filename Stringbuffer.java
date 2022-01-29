class Stringbuffer
{
public static void main(String[] args)
{
StringBuffer s = new StringBuffer("Maharaj"); //New object created for S
StringBuffer y = new StringBuffer("raja");   // New object created for Y

	int p = s.length(); //length of the string
	System.out.println("length of the string is  " + p );
	
	int q = s.capacity(); //Capacity of the string
	System.out.println("capacity of the string  " + q);
	
	s.append(" Rajarajacholan");   // add text at the end of existing text
	System.out.println("Append of string is  " + s);
	
	s.insert(4,"king");     // Insert a text in a specified index position 
	System.out.println(s);
	          
	y.reverse();   // Reverse of the string
	System.out.println("Reverse of raja is " + y);
	
	s.delete(0,4); // Delete characters from o to 4 in "S"
	System.out.println("After deleted the characters from 0 to 4 " + s);
	
	s.replace(4,7,"  means"); //replace means from 4 to 7
	System.out.println("Replace means from index position 4 to 7 " + s);
	
	
}   
}