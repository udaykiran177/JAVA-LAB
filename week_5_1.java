import java.util.*;

class box{
     public void area(){
           System.out.println("the area is 0");
     }
     
     public void area(int l){
           System.out.println("the area of room is:"+(l*l));
     }
    
     public void area(int l,int b){
          System.out.println("the area of room is:"+l*b);
     }
}


class week_5_1{
     public static void main(String args[]){
          box b=new box();
          Scanner sc=new Scanner(System.in);
          System.out.println("passing no parameter:");
          b.area();
          System.out.println("passing one parameter:");
          System.out.println("enter the length");
          int l=sc.nextInt();
          b.area(l);
          System.out.println("passing two parameters:");
          System.out.println("enter the length and width:");
          l=sc.nextInt();
          int w=sc.nextInt();
          b.area(l,w);
     }
}