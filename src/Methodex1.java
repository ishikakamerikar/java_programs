import java.util.*;
public class Methodex1 {
    static void biggest(int a, int b ,int c)
    {
        if(a<b && a<c)
        {
            double a1 = a;
            System.out.println(a1);
        }
        else if(b<c)
        {
            double b1=b;
            System.out.println(b1);
        }
        else {
            double c1 =c;
            System.out.println(c1);
        }
    }
    public static void main(String[] args){
        biggest(25,37,29);

    }
}
