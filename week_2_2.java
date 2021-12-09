import java.util.*;
class tem
{
       int a,b;
       //Scanner sc=new Scanner(System.in);
       /*public void read(int l,int b){
               System.out.println("enter the length:");
               this.l=sc.nextInt();
               System.out.println("enter the width:");
               this.b=sc.nextInt();
               this.area();
       }*/
       public void area(int a,int b){
               this.a=a;
               this.b=b;
               int m=this.a*this.b;
               System.out.println("area is:"+m);
       }
}

      
class week_2_2
{
       public static void main(String[] args){
       //int l=0,b=0;
       Scanner sc=new Scanner(System.in);
       //a=sc.nextInt(); 
       int l=sc.nextInt();
       int b=sc.nextInt();
       tem ab=new tem();
       ab.area(l,b);      
}
}