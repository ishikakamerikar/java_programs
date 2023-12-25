import java.util.*;
public class MiniPR {
    public static void main(String[] args)
    {
        System.out.println("IF YOU ENTER A NEGATIVE VALUE OR A NUMBER GREATER THAN 100 GAME WILL TAKE IT AS INVALID INPUT");
        int random=(int)(Math.random()*100);
        int number;
        do {
            System.out.print("Enter a number (1-100) :  ");
            Scanner sc = new Scanner(System.in);
            number =sc.nextInt();
            if(number==random && number<=100)
            {
                System.out.println("Wooohooo Correct Number !!");
                break;
            }
            else if(number>=0 && number<random && number<=100){
                System.out.println("Your Number is too small");
            }
            else if (number>=0 && number>random && number <=100 ){
                System.out.println("Your Number is too Big");
            }
            else {
                System.out.println("INVALID INPUT GAME OVER");
            }
        }
        while(number>=0 && number<=100 );
    }
}
