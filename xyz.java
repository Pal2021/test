import java.util.Scanner;

public class xyz {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        char ch=sc.next().charAt(0);
        xyzsolve(s,ch);
    }

    private static void xyzsolve(String s, char ch) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                c++;
            }
        }
        System.out.println(c);
    }
}
