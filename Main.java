
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class Employee {
        private int id;
        private String name;
        private String des;
        private  double salary;
        public int getid(){
            return id;
        }
        public String getname(){
            return name;
        }
        public String getdes(){
            return des;
        }
        public double getSalary(){
            return salary;
        }
        Employee(int id,String name,String des,double salary){
            this.des=des;
            this.id=id;
            this.name=name;
            this.salary=salary;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter company name:");
        String com=sc.nextLine();
        System.out.print("Enter number of employees:");
        int t=sc.nextInt();
        System.out.println("Enter employee details:");
        int k=1;
        int n=t;
        List<Employee> list=new ArrayList<>();
        while(t>0){
            System.out.print("Employee "+k);
            System.out.print("Enter id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name:");
            String name=sc.nextLine();
            System.out.print("Enter designation: ");
            String desc=sc.nextLine();
            System.out.print("Enter salary:");
            int salary=sc.nextInt();
            sc.nextLine();
            Employee emp=new Employee(id,name,desc,salary);
            list.add(emp);
            t--;
            k++;
        }
        double ans=0;
        double maxsalary=0;
        for(Employee emp:list){
            ans+=emp.getSalary();
            maxsalary=Math.max(maxsalary,emp.getSalary());
        }
        System.out.println(ans/n);
        System.out.println(maxsalary);

        System.out.print("Employees with designation:");
        String desc=sc.nextLine();
        for(Employee emp:list){
            if(emp.getdes().equalsIgnoreCase(desc)){
                System.out.print("ID:"+emp.getid());
                System.out.println(",");
                System.out.print(" Name:"+emp.getname());
                System.out.println(",");
                System.out.print("Designation: "+emp.getdes());
                System.out.println(",");
                System.out.print("Salary: "+emp.getSalary());
            }
        }
    }
}
