import java.util.*;
class outerzone
{
	int x=10;
	public class inner{
		int y=20;
		public void innermeth(){
			System.out.println("IN INNER ZONE:");
			System.out.println("x is:"+x+"and y is:"+y);
		}
		inner()
		{
			System.out.println("inner constructor");
		}
	}
	public void outermeth()
	{
		System.out.println("outer meth:");
//		System.out.println("x is:"+x+"and y is:"+y);
	}
	
	outerzone()
	{
		System.out.println("outer constructor");
	}
		
}

public class innerclasses{
	public static void main(String args[])
	{
		outerzone O=new outerzone();
		outerzone.inner Io=new outerzone().new inner();
		O.outermeth();
		Io.innermeth();
	}

}