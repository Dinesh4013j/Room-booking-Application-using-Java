package room;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public Book userDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=scanner.next();
        System.out.print("Enter your age");
        int age=scanner.nextInt();
        System.out.print("enter your gender");
        String gender=scanner.next();
        System.out.print("Enter no of AC rooms you want to book: ");
        int acrooms=scanner.nextInt();
        System.out.print("Enter no of NON AC rooms you want to book: ");
        int nonacrooms=scanner.nextInt();
        return new Book(name,age,gender,acrooms,nonacrooms);
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rooms rooms=new Rooms();
        Main obj=new Main();

        System.out.println("Welcome to the Room Booking!");
        
        int again=1;
        while (again==1) {
           System.out.println("Ac rooms available "+Rooms.availacrooms);
           System.out.println("Non Ac rooms available"+Rooms.availnonacrooms);
           rooms.display();
           rooms.booking(obj.userDetails());
           System.out.println("Do you want to book room again");
           System.out.println("Press 1  for book again");
           System.out.println("Press others to leave");
           again=scanner.nextInt();

        }
       
    }
}