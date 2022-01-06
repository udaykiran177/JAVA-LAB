import java.util.*;

class figure{
      int l;
      int b;
      figure(){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the dimensions");
          l=sc.nextInt();
          b=sc.nextInt();
      }
       
      void area(){
           System.out.println("the area is:"+(l*b));
      }
}


class rectangle extends figure
{
       /*int l,b;
       this.l=l;
       this.b=b;
       void area(){
           System.out.println("the area is:"+(this.l*this.b));
       }*/
}

class triangle extends figure
{
      void area(){
           System.out.println("the area is:"+(0.5*l*b));
      }
}


class week_5_2
{
     public static void main(String args[]){
     rectangle rec=new rectangle();
     triangle tri=new triangle();
     System.out.println("overiding by rectangle class:");
     rec.area();
     System.out.println("overiding by triangle class:");
     tri.area();
     }
}