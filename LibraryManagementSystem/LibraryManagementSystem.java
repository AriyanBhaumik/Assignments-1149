import java.util.*;
import BookList.*;
import MemberList.*;
import Transaction.*;


public class LibraryManagementSystem {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Member m=new Member();
        Book b=new Book();
        TList t=new TList();
        int ch=0;

        do{
            System.out.println("***LIBRARY MANAGEMENT SYSTEM***");
            System.out.println("1. To add book.\n2. To add member.\n3. Issue Book.\n4. Return book.\n5. Add a particular book.\n6. display all booklist.\n7. display all members.\n8. display a particular book info\n9. display member info.\n10. Exit.");
            System.out.println("Enter your choice= ");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                b.addBook();
                break;

                case 2:
                m.addMember();
                break;

                case 3:
                t.issueBook();
                break;

                case 4:
                t.returnBook();
                break;

                case 5:
                b.addCopies();
                break;

                case 6:
                b.showBookList();
                break;

                case 7:
                m.showMemberList();
                break;

                case 8:
                b.findBook();
                break;

                case 9:
                m.findMember();
                break;

                case 10:
                System.out.println("Thanks for using the application !!!");
                break;
            }
        }while(ch!=10);
        in.close();
    }
}