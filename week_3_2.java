import java.util.*;
class time{
     int h,m,s;
      void Time(int s){
           int h=s/3600;
           s=s%3600;
           int m=s/60;
           s=s%60;
           System.out.println(h+":"+m+":"+s);
     }

     time(int s)
     {
         this.Time(s);
     }
      
     time(int m,int s)
     {
        m=m*60+s;
        this.Time(m);
     }
     time(int h,int m,int s)
     {
         h=h*3600+m*60+s;
         this.Time(h);
     }
}
 
class week_3_2{
    public static void main(String args[]){
        time ob=new time(67);
        time ob1=new time(67,89);
        time ob2=new time(12,67,89);
    }
}    
    