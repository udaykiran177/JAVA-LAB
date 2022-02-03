import java.util.*;

import java.lang.String.*;

class locchar{
	public void locate(String s,char c){
		int ch=0;
		for (int i=0;i<s.length();i++){

			if(s.charAt(i)==c){
				ch=1;
				System.out.print("element found at the location :"+i+" in the string");
				break;
			}
		}
		
		if (ch!=1){

		System.out.println("element not found");

		}
	}

	public boolean locsub(String s1,String s2){

		/*String s="";
		int k,m=1;
		//System.out.print(s);
		for (int i=0;i<s1.length();i++){
			if (s1.charAt(i)==s2.charAt(0))
			{
				k=i;
				int c=0;
				for (int j=1;j<s2.length();j++){

					if (s1.charAt(k)==s2.charAt(j)){

						c=c+1;
						k=k+1;	
					}
					else{break;}
					
				}
				if (c==s2.length()-1){
					m=0;
					System.out.println("substring at the location"+k);
					break;
				}
			}
		}
		if (m==1){
			System.out.println("String not found");
		}*/

		int l1=s1.length();
		int l2=s2.length();

		for (int i=0;i<=l1-l2;i++){
			if (s1.substring(i,i+l2).equals(s2)){
				return true;

			}
		}
		return false;
	}

}


class string_3{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		/*System.out.print("enter the String:");

		String s = sc.nextLine();

		System.out.print("enter the character:");

		char c=sc.next().charAt(0);*/

		locchar loc=new locchar();

		//loc.locate(s,c);
 
		System.out.print("enter the string-1:");
		String s1=sc.nextLine();
		System.out.print("enter the string-2:");
		String s2=sc.nextLine();
		if (loc.locsub(s1,s2)){System.out.println("present in the string");}
		else{System.out.println("not present in the string");}
	}

}