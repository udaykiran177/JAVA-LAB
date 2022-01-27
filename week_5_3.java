import java.util.*;


final class Finalc{
      Finalc(){
      System.out.println("FINAL CLASS EXECUTED");
      }
      public void cert(){
      System.out.println("FINAL METHOD EXECUTED");
      }
}




public class week_5_3{
     public static void main(String args[]){
          final int m=23;
          //final variable
          System.out.println("FINAL VARIABLE:"+m);
          
          //final class declaration
          Finalc f=new Finalc();
          //final method declaration
          f.cert();
          /*m=21;
          System.out.println(m);*/
          
     }
     final void di(){
        System.out.println("FINAL METHOD EXECUTED");
     }
}