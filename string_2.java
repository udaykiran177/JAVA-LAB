import java.util.*;

import java.lang.String.*;

class string_2{

	public void compare(String s,char c){

		if (s.charAt(0)==c){

			System.out.println("the character is present");

		}
		
		else{

			System.out.println("not present in the string");

		}
	}

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);

		String s=sc.nextLine();
		
		char c=sc.next().charAt(0);

		string_2 ob=new string_2();

		ob.compare(s,c);
	}
}