package learnjava.basic;
import java.util.Scanner;

public class cbsc_ {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float gained_marks;
        float total_marks;
        float maths;
        System.out.println("Enter the marks of maths -");
        maths=sc.nextFloat();
        float english;
        System.out.println("enter the marks of english -");
        english=sc.nextFloat();
        float hindi;
        System.out.println("Enter the marks of hindi -");
        hindi = sc.nextFloat();
        float marathi;
        System.out.println("Enter the marks of marathi -");
        marathi= sc.nextFloat();

        float sanskruit;
        System.out.println("Enter the marks of sanskruit -");
        sanskruit= sc.nextFloat();

        System.out.println("Enter the total marks - ");
        total_marks=sc.nextFloat();

         gained_marks =maths+english+marathi+sanskruit+hindi;

        System.out.println("Total gained marks are -"+gained_marks);

         float sum= gained_marks/total_marks;

        Float total_pecentage=sum*100;
        System.out.println("the % are "+total_pecentage);










    }
}
