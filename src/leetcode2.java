import java.util.*;
/*import java.util.stream.IntStream;

class leetcode2 {
    public static void missing_elements(int[] arr, int toCheckValue)
    {
        boolean test = IntStream.of(arr).anyMatch(x -> x == toCheckValue);
        if (test==false)
        {
            System.out.println(toCheckValue);
        }

    }
    public static void main(String[] args)
    {
        int []nums= {1,2,4,5,6};
        int j=1;
        for(int k =0;k<nums.length+1;k++)
        {
            missing_elements(nums, j);
            j++;
        }
    }
}*/
import java.util.stream.IntStream;
class leetcode2 {
    /*public static void missing_elements(int[] nums, int toCheckValue)
    /*{
        boolean test = IntStream.of(nums).anyMatch(x -> x == toCheckValue);
        if (test==false)
        {
            System.out.println(toCheckValue);
        }

    }*/
    public static void main(String[] args) {
        int[] nums={1,2};
        int r = 0;
        var ref = new Object() {
            int j = 1;
        };
        for (int k = 0; k < nums.length + 1; k++) {

            int finalJ = ref.j;
            boolean test = IntStream.of(nums).anyMatch(x -> x == ref.j);
            if (test == false) {
                System.out.println();
            }
            ref.j++;
        }
    }
}
