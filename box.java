import java.util.*;
class box23{
	public double raddi;
	box23(){
		System.out.println("constructor");
	}
	box23(int a,int b){
		System.out.println(a+" "+b);
	}
	public void print(){
		System.out.println("method");
	}
	public double area(double r){
		raddi=r;
		return (this.raddi*this.raddi);
	}
}
public class box{
	public static void main(String args[]){
		box23 e=new box23();
		box23 e1=new box23(1,2);
		e.print();
		double c=e1.area(1.23);
		System.out.println(c);
	}
}