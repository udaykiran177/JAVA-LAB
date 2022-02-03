import java.util.*;

import java.lang.*;

class string_5{
	
	public static void main(String args[]){

		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
char c= sc.next().charAt(0);
		String s= sc.nextLine();
		
		String s1="";
		for (int i=0;i<s.length();i++){
			if (i==n){
				s1=s1+c;
				continue;}
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
}}