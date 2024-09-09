import java.util.Scanner;

class Motel {
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill) {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getCabFacility() {
        return cabFacility;
    }
}

class Solution {
    public static int totalNoOfRoomsBooked(Motel[] motels, String cabFacility) {
        int total = 0;
        for (Motel m : motels) {
            if (m.getCabFacility().equalsIgnoreCase(cabFacility) && m.getNoOfRoomsBooked() > 5) {
                total += m.getNoOfRoomsBooked();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motel[] motels = new Motel[4];
        for (int i = 0; i < 4; i++) {
 motels[i] = new Motel(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble());
        }
        String cabFacility = sc.next();
        int result = totalNoOfRoomsBooked(motels, cabFacility);
        System.out.println(result > 0 ? result : "No such rooms booked");
    }
}
