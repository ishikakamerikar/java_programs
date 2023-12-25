import java.util.*;
public class percentage {
    public static void main(String[] args) {
        int Algebra, Geometry,Science,English,SocialSt,i,marks=0,total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter marks of 5 subjects");
        for(i=0;i<5;i++)
        {
            marks=sc.nextInt();
            total=total+marks;
        }
        System.out.println(total);
        float percentage = ((((float) total /500)*100));
        System.out.println(percentage);
    }
}
