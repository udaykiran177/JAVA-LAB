import java.util.*;
class outer{
     int n=10;
     class inner{
          void display(){
               System.out.println("the number is:"+n);
          }
     }
     public void test()
     {
          inner ua=new inner();
          ua.display();
          //System.out.println("the number is:"+n);
          ua.display();
     }
}
class innerclassdemo{
      public static void main(String args[])
      {
 
          outer ud=new outer();
          ud.test();
      }
}
     
 