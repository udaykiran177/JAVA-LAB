import java.util.*;
public class static_poly
{
	public void rec(int x,int y)
	{
		System.out.println("area is:"+x*y);
	}
	
	public void squ(int x)
	{
		System.out.println("area is:"+x*x);
	}
	
	public static void main(String args[]){
		static_poly r=new static_poly();
		r.rec(2,3);
		r.squ(4);
	}
}