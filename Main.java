public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to CS 112!");

        double num = 4.5;
        System.out.println(squareNumber(num));

        sayHello();

        Book b1 = new Book("Lord of the Rings");
        Book b2 = new Book(b1);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("Are they the same? " + b1.equals(b2));
    }

    public static double squareNumber(double num) {
        double squared = num * num;
        return squared;
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

}