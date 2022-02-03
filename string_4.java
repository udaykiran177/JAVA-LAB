import java.util.*;

import java.lang.*;

class string_4{

	public static void main(String args[]){
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String n=sc.nextLine();
		String s="";
		System.out.println("enter the starting index");
		int a=sc.nextInt();
		System.out.println("enter the ending index:");
		int b=sc.nextInt();
		for (int i=a;i<b;i++){
			s=s+n.charAt(i);
		}
		System.out.println("the substring is:"+s);
		}
		catch(StringIndexOutOfBoundsException z){
			System.out.println("you have raised the error:\n"+z);}
	}
}
			