import java.util.*;
class employee{
	int salary,h,id;
	String name;
	Scanner sc=new Scanner(System.in);
	public void getinfo(){
		System.out.println("enter the name:");
		name=sc.nextLine();
		System.out.println("enter the id:");
		id=sc.nextInt();
		System.out.println("enter the salary:");
		salary=sc.nextInt();
		System.out.println("enter the working hours:");
		h=sc.nextInt();
	}
		public void addsal(){
			if (salary<500){
				salary=salary+18;
			}
			
		}
		
		public void add_work(){
            if (h>6){
                	salary=salary+10;
            }
        }
}
class me{
	public static void main(String[] args){
		employee obj=new employee();
		obj.getinfo();
		obj.addsal();
		obj.add_work();
		System.out.println("name:"+obj.name);
		System.out.println("ID:"+obj.id);
		System.out.println("salary:"+obj.salary);
		System.out.println("hours:"+obj.h);
	}
}