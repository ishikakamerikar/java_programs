public class pattern1 {
    public static void main(String[] args) {
        int i, j, k,n=5;
        for ( i = 1; i  <= n; i++) {
            //print left half of the row
            for ( j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for ( j = 1; j  <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print right half of the row
            for ( j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
    }
}

