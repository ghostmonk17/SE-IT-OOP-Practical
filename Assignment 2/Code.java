/* Identify commonalities and differences between Publication, Book and Magazine classes. Title,
Price, Copies are common instance variables and saleCopy is common method. The differences
are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue,
receiveissue().Write a program to find how many copies of the given books are ordered and
display total sale of publication. */


import java.util.Scanner;

class Publication {
    String title;
    int price;
    int copy;

    public Publication() {}

    public Publication(String title, int price, int copy) {
        this.title = title;
        this.price = price;
        this.copy = copy;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of Publication: ");
        this.title = sc.nextLine();
        System.out.print("Enter price of Publication: ");
        this.price = sc.nextInt();
        System.out.print("Enter copies of Publication: ");
        this.copy = sc.nextInt();
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Price: " + this.price);
        System.out.println("Copies: " + this.copy);
    }

    public void saleCopy(int orders) {
        if (orders <= this.copy) {
            this.copy -= orders;
            System.out.println("Total sale of publication " + this.title + ": " + orders);
        } else {
            System.out.println("Insufficient copies for sale.");
        }
    }
}

class Book extends Publication {
    String author;

    public Book() {}

    public Book(String title, int price, int copy, String author) {
        super(title, price, copy);
        this.author = author;
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of Book: ");
        this.title = sc.nextLine();
        System.out.print("Enter name of author: ");
        this.author = sc.nextLine();
        System.out.print("Enter price of Book: ");
        this.price = sc.nextInt();
        System.out.print("Enter copies of Book: ");
        this.copy = sc.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + this.author);
    }

    public void orderCopy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of copies to order: ");
        int order = sc.nextInt();
        if (order <= this.copy) {
            this.copy -= order;
            System.out.println("Total orders of book " + this.title + ": " + order);
        } else {
            System.out.println("Insufficient copies for order.");
        }
    }
}

class Magazine extends Publication {
    public Magazine() {}

    public Magazine(String title, int price, int copy) {
        super(title, price, copy);
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of Magazine: ");
        this.title = sc.nextLine();
        System.out.print("Enter price of Magazine: ");
        this.price = sc.nextInt();
        System.out.print("Enter copies of Magazine: ");
        this.copy = sc.nextInt();
    }

    @Override
    public void display() {
        super.display();
    }

    public void currentIssue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of copies to issue: ");
        int issue = sc.nextInt();
        if (issue <= this.copy) {
            this.copy -= issue;
            System.out.println("Total magazines issued: " + issue);
        } else {
            System.out.println("Insufficient copies to issue.");
        }
    }

    public void receivedIssue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of received copies: ");
        int received = sc.nextInt();
        this.copy += received;
        System.out.println("Total magazines received: " + received);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Publication p = new Publication();
        Book b = new Book();
        Magazine m = new Magazine();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Accept and Display Publication");
            System.out.println("2. Accept and Display Book");
            System.out.println("3. Accept and Display Magazine");
            System.out.println("4. Order and Sale Book");
            System.out.println("5. Current Issue and Received Issue of Magazine");
            System.out.println("6. Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    p.accept();
                    p.display();
                    break;

                case 2:
                    b.accept();
                    b.display();
                    break;

                case 3:
                    m.accept();
                    m.display();
                    break;

                case 4:
                    b.accept();
                    b.display();
                    b.orderCopy();
                    break;

                case 5:
                    m.accept();
                    m.display();
                    m.currentIssue();
                    m.receivedIssue();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
