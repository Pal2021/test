import java.util.*;

class Flowers {
    int flowerId, price, rating;
    String type;

    Flowers(int id, String name, int price, int rating, String type) {
        this.flowerId = id;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }
}

class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flowers[] flowers = new Flowers[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            int rating = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();
            flowers[i] = new Flowers(id, name, price, rating, type);
        }

        String searchType = sc.nextLine();
        Flowers min = null;

        for (Flowers f : flowers) {
            if (f.type.equalsIgnoreCase(searchType) && f.rating > 3) {
                if (min == null || f.price < min.price) {
                    min = f;
                }
            }
        }
        System.out.println(min != null ? min.flowerId : "There is no flower with given type.");
    }
}
