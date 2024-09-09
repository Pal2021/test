
public class Employee {
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
