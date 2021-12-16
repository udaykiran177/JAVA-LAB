import java.util.*;
class employee
{ 
     String name,desig;
     int id;
     void reademp(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the name,id and designation:");
     this.name=sc.nextLine();
     this.id=sc.nextInt();
     this.desig=sc.nextLine();
     }
}

class salary extends employee
{
      
      Scanner sc=new Scanner(System.in);
      void readsalary(){
      System.out.println("enter the bp,hra,da and pf:");
      float bp=sc.nextFloat();
      float hra=sc.nextFloat();
      float da=sc.nextFloat();
      float pf=sc.nextFloat();
      this.calculate(bp,hra,da,pf);
      }
      
      public void calculate(float bp,float hra,float da,float pf)
      {
          float np=bp+hra+da-pf;
          this.display(np);
      }
      
      public void display(float np)
      {
          
          System.out.println("NAME:"+name);
          System.out.println("ID:"+this.id);
          System.out.println("DESIGNATION:"+this.desig);
          System.out.println("salary:"+np);
      }
}

class week_4_1
{
      public static void main(String args[])
      {
            salary em=new salary();
            employee emp=new employee();
            emp.reademp();
            em.readsalary();
      }
}