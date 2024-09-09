import java.util.*;
public class IPA34{
    static class MobileDetails {
        int mobileId, price;
        String brand;
        boolean isFlagShip;
        public MobileDetails(int mobileId, int price, String brand, boolean isFlagShip) {
            this.mobileId = mobileId;
            this.price = price;
            this.brand = brand;
            this.isFlagShip = isFlagShip;
        }
    }

//    MobileId – int
//    Price - int
//    Brand – String
//    isFlagShip – boolean
    public static void main(String[] args) {
        int t=5;
        Scanner sc=new Scanner(System.in);
        List<MobileDetails>list=new ArrayList<>();
        while(t>0){
            int mid=sc.nextInt();
            sc.nextLine();
            int price=sc.nextInt();
            sc.nextLine();
            String brand=sc.nextLine();
            boolean isflagship=sc.nextBoolean();
            sc.nextLine();
            list.add(new MobileDetails(mid,price,brand,isflagship));
            t--;
        }
        String brand=sc.nextLine();
        solve(list,brand);
    }

    private static void solve(List<MobileDetails> list,String brand) {
        int ans=0;
        for(MobileDetails it:list){
            if(it.brand.equalsIgnoreCase(brand)){
                ans+=it.price;
            }
        }
        System.out.println(ans);
    }
}