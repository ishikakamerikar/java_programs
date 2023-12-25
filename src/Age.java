import java.util.*;
public class Age {
    public static void main(String args[]){
        int age;
        System.out.print("Enter Your Age : ");
        Scanner sc =new Scanner(System.in);
        age = sc.nextInt();
        if(age>=18) //condition
        {
            System.out.println("ADULT");
        }
        else
        {
            System.out.println("NOT ADULT");
        }
    }
}
