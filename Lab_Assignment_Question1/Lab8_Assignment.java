
package Lab_Assignment_Question1;

import java.util.Scanner;
public class Lab8_Assignment {
  public static void main(String[] args) {
      //Taking input from user
        Scanner input= new Scanner(System.in);
        System.out.println("enter the title of book");
        String title=input.nextLine();
        System.out.println("enter the price of book");
        int price= input.nextInt();
        System.out.println("enter the pages of book");
        int pageCount = input.nextInt();
      
        
        Book b1 = new Book(pageCount,title,price);
        
        Tape T1 = new Tape(120,"oop",3000);
        b1.Display();
        
        T1.Display();
}
}