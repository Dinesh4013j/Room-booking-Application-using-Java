package room;
import java.util.ArrayList;
public class Rooms {
    static int availacrooms=100;
    static int availnonacrooms=100;
    ArrayList<Book> customers=new ArrayList<>();
//    public int getAvailacrooms() {
//        return availacrooms;
//    }
//    public int getAvailnonacrooms() {
//        return availnonacrooms;
//    }
//    public void setAvailacrooms(int usage) {
//        this.availacrooms=this.availacrooms-usage;
//    }
//    public void setAvailnonacrooms(int usage) {
//        this.availnonacrooms=this.availnonacrooms-usage;
//    }
    public void booking(Book book) {
        if (book.getAcrooms()>availacrooms || book.getNonacrooms()>availnonacrooms) {
            System.out.println("we dont have enough acrooms");
        }
        else{
            availnonacrooms=availnonacrooms-book.getAcrooms();
            availacrooms=availacrooms-book.getNonacrooms();

            customers.add(book);
            System.out.println("booking succesful");
        }
    }
    public void display() {
        for(Book book : customers) {
            System.out.println(book.getName()+" "+book.getAcrooms()+" "+book.getNonacrooms());
        }
    }
}
