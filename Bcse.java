package Assignment1;
import java.util.*;

class Instructor {
            String name;
            String phone_number;
        
            Scanner sc = new Scanner(System.in);
        
            public void setInstructor() {
                System.out.println("enter the name of instructor");
                name = sc.nextLine();
        
                System.out.println("enter the phone number of instructor");
                phone_number = sc.nextLine();
        
            }
        
            public String getName() {
                return name;
            }
        
            public String getPhoneNumber() {
                return phone_number;
            }
        
            public void displayInstructor() {
                System.out.println("name of instructor : " + name);
                System.out.println("name of instructor : " + phone_number);
            }
        }
        
        class TextBook {
            String title;
            String author;
            String publisher;
        
            Scanner sc = new Scanner(System.in);
        
            public void setBook() {
                System.out.println("enter the title of book= ");
                title = sc.nextLine();
        
                System.out.println("enter the auhter name of book= ");
                author = sc.nextLine();
        
                System.out.println("enter the publisher name of book= ");
                publisher = sc.nextLine();
        
            }
        
            public String getAuthor() {
                return author;
            }
        
            public String getTitle() {
                return title;
            }
        
            public String getPublisher() {
                return publisher;
            }
        
            public void displayBook() {
                System.out.println("name of the book : " + title);
                System.out.println("author of the book : " + author);
                System.out.println("publisher of the book : " + publisher);
            }
        }
        
        class Course {
            String courseName;
            String instructorName;
            String bookName;
        
            Scanner sc = new Scanner(System.in);
        
            public void setCourse() {
                System.out.println("enter the name of course");
                courseName = sc.nextLine();
        
                System.out.println("enter the name of instructor");
                instructorName = sc.nextLine();
        
                System.out.println("enter the name of book");
                bookName = sc.nextLine();
        
            }
        
            public String getCourseName() {
                return courseName;
            }
        
            public String getInstructorName() {
                return instructorName;
            }
        
            public String getBookNamer() {
                return bookName;
            }
        
            public void displayCourse() {
                System.out.println("name of the course : " + courseName);
                System.out.println("allocated instructor : " + instructorName);
                System.out.println("name of the book : " + bookName);
            }
        }
        
        public class Bcse {
            public static void main(String[] args) {
                Instructor ins = new Instructor();
                TextBook book = new TextBook();
                Course cs = new Course();
        
                Scanner sc = new Scanner(System.in);
                int n;
        
                do {
                    System.out.println(
                            "\n\n1.set Instructor\n2.display Instructor\n3.set textbook\n4.display texbook\n5.set course\n6.display course");
                    System.out.println("\nenter your choice\n");
        
                    n = sc.nextInt();
        
                    switch (n) {
                        case 1:
                            ins.setInstructor();
                            break;
        
                        case 2:
                            ins.displayInstructor();
                            break;
        
                        case 3:
                            book.setBook();
                            break;
        
                        case 4:
                            book.displayBook();
                            break;
        
                        case 5:
                            cs.setCourse();
                            break;
        
                        case 6:
                            cs.displayCourse();
                            ;
                            break;
                    }
                } while (true);
            }
        }