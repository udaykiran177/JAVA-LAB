import java.util.*;
import java.lang.String.*;

class string_1{
	public static void main(String args[]){
		String a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the first string:");
		a=sc.nextLine();
		System.out.println("ente the second string:");
		b=sc.nextLine();
		/*if (a==b){
			System.out.println("both are equal");
		}
		else{
			System.out.println("not equal");
		}*/
		int  i,c=0;
                for (i=0;i<a.length();i++)
		{
			if (a.charAt(i)!=b.charAt(i)){
				c+=1;
			}
		}
		
		if(c!=0){
			System.out.println("both are not same");
		}
		else{
			System.out.println("both are same");
		}
	}
}