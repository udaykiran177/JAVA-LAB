import java.util.*;
class week_2_1 
{
      static int a=10;
      static int b;
      static void meth(int x){
           System.out.println("x="+x);
           System.out.println("a="+a);
           System.out.println("b="+b);
      }
      /*void meth2()
      {
          System.out.println(a);
      }*/
      static{
            System.out.println("static is initialized");}
      public static void main(String[] args)
      {
          int z=10;
          System.out.println("a out:"+a+"z out:"+z);
          //meth Meth=new meth();
          meth(42);
          //meth2();
      }
}