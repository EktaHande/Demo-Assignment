
import  java.util.*;
public class AssignmentOne
{
    public static void main(String[] args)
    {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Username is: " +s);

        AssignmentOne a1 = new AssignmentOne();
        a1.DetailsAboutUser();

    }
    public  void  DetailsAboutUser( )
    {


        UUID id1 = UUID.randomUUID();
        System.out.println("Your id: "+id1);

        java.util.Date date=new java.util.Date();
        System.out.println("Date & Time: "+date);
    }


}
