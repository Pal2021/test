import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temp123 {
   // number - int
    //name - String
    //price - double
    public static class  Vehicle{
        public int number;
        public String name;
        public double price;

       public Vehicle(int number,String name,double price) {
           this.number = number;
           this.name=name;
           this.price=price;
       }

       @Override
       public String toString() {
           return "number-" + number +  "\n"+"name-" + name +"\n"+"price-" + price + "\n";
       }
   }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       List<Vehicle> list2=new ArrayList<>();
       while(t>0){
           int number=sc.nextInt();
           sc.nextLine();
           String name=sc.nextLine();
           double price=sc.nextDouble();
           sc.nextLine();
           Vehicle vl=new Vehicle(number,name,price);
           list2.add(vl);
           t--;
       }
       String target=sc.nextLine();
       rec(list2,target);
   }

    private static void rec(List<Vehicle> list2,String target) {
        Vehicle ans=null;
        double price=1e10;
        for(Vehicle it:list2){
            if(it.price<price){
                ans=it;
                price=it.price;
            }
        }
        System.out.print(ans);
         ans=null;
        for(Vehicle it:list2){
            if(it.name.equalsIgnoreCase(target)){
                ans=it;
            }
        }
        if(ans==null){
            System.out.println("No Vehicle found with mentioned attribute");
        }else{
            System.out.println(ans);
        }
    }
}
