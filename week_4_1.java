import java.util.*;
class employee
{ 
     String name;
     String desig;
     int id;
     void reademp(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the name,id and designation:");
     this.name=sc.nextLine();
     this.desig=sc.nextLine();
     this.id=sc.nextInt();
     
     }
}

class salary extends employee
{
      /*String name;
      String desig;*/
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
          this.display(np,name,id,desig);
      }
      
      public void display(float np,String name,int id,String desig)
      {
          /*this.name=name;
          this.desig=desig;*/
          System.out.println("NAME:"+name);
          System.out.println("ID:"+id);
          System.out.println("DESIGNATION:"+desig);
          System.out.println("salary:"+np);
      }
}

class week_4_1
{
      public static void main(String args[])
      {
            salary em=new salary();
            //employee emp=new employee();
            em.reademp();
            em.readsalary();
      }
}
