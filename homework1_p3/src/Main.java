//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       int  pointsa=0, pointsb=0;
       int i=1;
       while (pointsa<5 && pointsb<5)
       {
           Scanner scanner = new Scanner(System.in);
           System.out.printf("Please input 2 numbers between 1 and 100: \na=");
           int a= scanner.nextInt();
           System.out.printf("\nb=");
           int b= scanner.nextInt();
           int H, S;
           if (a>=1 && a<=100 && b>=1 && b<=100) {
               if (a>=b)
               {
                   H=a;
                   S=b;
               }
               else
               {
                   H=b;
                   S=a;
               }
               if (H%S==0 && S>=10) {
                   System.out.printf("The winner of this round is player ");
                   if (a==S) {
                       System.out.println("a.");
                       pointsa++;
                   }
                   else {
                       System.out.println("b.");
                       pointsb++;
                   }
                   System.out.printf("The current scores are: \na:");
                   System.out.println(pointsa);
                   System.out.printf(" and \nb:");
                   System.out.println(pointsb);
               }
               else if (H==S)
               {
                   System.out.printf("There is a tie. Each player gets 2 points.");
                   pointsa=pointsa+2;
                   pointsb=pointsb+2;
                   System.out.printf("The current scores are: \na:");
                   System.out.println(pointsa);
                   System.out.printf(" and \nb:");
                   System.out.println(pointsb);
               }
               else
               {
                   System.out.printf("The winner of this round is player ");
                   if (a==H) {
                       System.out.println("a.");
                       pointsa++;
                   }
                   else{
                       System.out.println("b.");
                       pointsb++;
                   }
                   System.out.printf("The current scores are: \na:");
                   System.out.println(pointsa);
                   System.out.printf(" and \nb:");
                   System.out.println(pointsb);
               }


           }

           else {
               System.out.printf("Invalid input. Try again.");
           }

       }
        if (pointsa >=5 && pointsb<5) {
            System.out.println("Congratulations! Player a wins the game.");
        }
        else if (pointsb >=5 && pointsa<5) {
            System.out.println("Congratulations! Player b wins the game.");
        }
        else if (pointsa==pointsb)
            System.out.println("Congratulations! Both players win the game.");
        else if (pointsa>=5 && pointsb>=5) {
            if (pointsa > pointsb)
                System.out.println("Congratulations! Player a wins the game.");
            else
                System.out.println("Congratulations! Player b wins the game.");
        }

        System.out.printf("CONCLUSION: There is no number that will always win, since the highest number\n is 100 and it has many divisors that can beat it. (10, 20, 25, 50)\nStill, there are some numbers that are more likely to win. (100, 99, 81, etc)");
    }
}