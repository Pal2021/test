import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
    //Author Class: Contains the author's details, including name, genre, year of birth, number of books published, and a list of Book objects.
   // Book Class: Contains book details, including book ID, title, published year, copies sold, price, and turnover.
    public static class book{
        int id,published_year,copy_sold,price,turnover;
        String title;
        book(int id,String title,int published_year,int copy_sold,int price,int turnover){
            this.id=id;
            this.title=title;
            this.published_year=published_year;
            this.copy_sold=copy_sold;
            this.price=price;
            this.turnover=turnover;
        }
    }
  public static class author{
      int number_of_books;
      String genre, year_of_birth,name;
      List<book> books;
      author(String name,int number_of_books,String genre,String year_of_birth,List<book> books){
          this.name=name;
          this.number_of_books=number_of_books;
          this.genre=genre;
          this.year_of_birth =year_of_birth;
          this.books=books;
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<author> authors=new ArrayList<>();
        while(t>0){
            String name = sc.nextLine();
            String genre = sc.nextLine();
            String year_of_birth = sc.nextLine();
            int number_of_books = sc.nextInt();
            sc.nextLine();
            List<book> books = new ArrayList<>();

            int k=sc.nextInt();
            sc.nextLine();
            while(k>0){
                int id= sc.nextInt();
                sc.nextLine();
                String title=sc.nextLine();
                int published_year=sc.nextInt();
                sc.nextLine();
                int copy_sold=sc.nextInt();
                sc.nextLine();
                int price=sc.nextInt();
                sc.nextLine();
                int turnover= sc.nextInt();
                sc.nextLine();
                books.add(new book(id,title,published_year,copy_sold,price,turnover));
                k--;
            }
            authors.add(new author(name,number_of_books,genre,year_of_birth,books));
            t--;
        }
        solve(authors);
        int inputyear=sc.nextInt();
        solve2(authors,inputyear);
    }

    private static void solve2(List<author> authors,int year) {
        List<book>list=new ArrayList<>();

        for(author it:authors){
            List<book>list1=new ArrayList<>();
            list1=it.books;
            for(book books:list1){
                if(books.published_year==year){
                    System.out.println(it.name);
                    System.out.println(it.genre);
                    System.out.println(it.year_of_birth);
                    System.out.println(it.number_of_books);
                    System.out.println(it.books);
                }
            }
        }
    }

    private static void solve(List<author> authors) {
        for(author author:authors){
            System.out.println(author.name);
            System.out.println(author.genre);
            System.out.println(author.year_of_birth);
            System.out.println(author.number_of_books);
            List<book>ans=new ArrayList<>();
            ans=author.books;
            int maxprice=0;
            for(book book:ans){
                maxprice=Math.max(maxprice,book.price);
            }
            System.out.println("Maximum price of book is :"+maxprice);
            int priceans=0;
            int totelbook=ans.size();
            for(book book:ans){
                priceans=priceans+book.price;
            }
            System.out.println("Totel tournover is :"+priceans*totelbook);
        }
    }
}
