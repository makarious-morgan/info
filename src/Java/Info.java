package Java;
import  java.util.Scanner ;

public class Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Your Age : ");
        int age =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Your Fav Programming Language : ");
        String language = scanner.nextLine();
        int months = age*12;
        System.out.println("Hellow! my name Is  " + name +"\n"+ "I'm " + age +"years old"+",which is "+months+" months");
        System.out.println("My Fav Programming language IS  " + language +"\n"+ "Next Year I'll Be  "+ (++age));

    }
}
