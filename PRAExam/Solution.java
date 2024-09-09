package PRAExam;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    static class College {
        public int id, contactNo, pincode;
        public String name, address;

        public College(int id, String name, int contactNo, String address, int pincode) {
            this.id = id;
            this.name = name;
            this.contactNo = contactNo;
            this.address = address;
            this.pincode = pincode;
        }

        @Override

        public String toString() {
            return "id-" + id + "\n" +
                    "name-" + name + "\n" +
                    "contactNo-" + contactNo + "\n" +
                    "address-" + address + "\n" +
                    "pincode-" + pincode;
        }

    }

    public static College findCollegeWithMaximumPincode(ArrayList<College> colleges) {
        return colleges.stream().max((c1, c2) -> Integer.compare(c1.pincode, c2.pincode)).orElse(null);
    }

    public static College searchCollegeByAddress(ArrayList<College> colleges, String address) {
        return colleges.stream().filter(c -> c.address.equalsIgnoreCase(address)).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<College> colleges = new ArrayList<>();

        int n = scanner.nextInt(); scanner.nextLine(); // Number of colleges
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt(); scanner.nextLine();
            String name = scanner.nextLine();
            int contactNo = scanner.nextInt(); scanner.nextLine();
            String address = scanner.nextLine();
            int pincode = scanner.nextInt(); scanner.nextLine();

            colleges.add(new College(id, name, contactNo, address, pincode));
        }

        String searchAddress = scanner.nextLine(); // Address to search

        // Find and print college with maximum pincode
        System.out.println(findCollegeWithMaximumPincode(colleges));

        // Search and print college by address
        System.out.println(searchCollegeByAddress(colleges, searchAddress));

        scanner.close();
    }
}
