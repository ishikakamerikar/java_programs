public class Patterns {
    public static void main(String[] args) {
        int i, j, n=1;
        for (i = 1; i<=4; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
