import java.util.*;

class employee{
     String name;
     int id;
     int salary;
     employee(){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the name of employee:");
          name=sc.nextLine();
          System.out.println("enter the id of employee:");
          id=sc.nextInt();
          System.out.println("enter the salary of employee:");
          salary=sc.nextInt();
      }
}

class temp_employee extends employee{
        temp_employee()
        {
              System.out.println("NAME:"+name);
              System.out.print("EMPLOYEE TYPE: TEMPORARY");
              System.out.println("ID:"+id+"\nsalary:"+(salary+(salary*0.035)));
        }
}


class per_employee extends employee{
      per_employee()
      {
            System.out.println("NAME:"+name);
            System.out.println("EMPLOYEE TYPE: PERMENENT");
            System.out.println("ID:"+id+"\nsalary:"+(salary+(salary*0.05)));
      }
}



class week_4_3{
     public static void main(String args[]){
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the no of employees:");
          n=sc.nextInt();
          int t;
          for (int i=0;i<n;i++)
          {
                 System.out.println("enter the emplooyeee type:\n1.permenent\n2.temporary\n");
                 t=sc.nextInt();
                 switch (t){
                      case 1:
                           per_employee p=new per_employee();
                           break;
                      case 2:
                           temp_employee tem=new temp_employee();
                           break;
                      default:System.out.println("enter correct emplooyee type");
                  }
           }
    }
}