import java.util.*;
class food{
	public void disp(){
		//System.out.println("the protien rich");
	}
}
class food1 extends food{
	public void disp(){
		System.out.println("carrot");
	}
}
class food2 extends food{
	public void disp(){
		System.out.println("citrus");
	}
}

public class dynamic_poly{
	public static void main(String args[])
	{
		food f=new food();
		f.disp();
		food1 f1=new food1();
		f1.disp();
		food2 f2=new food2();
		f2.disp();
	}
}
		