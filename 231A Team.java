import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tcount = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = a + b + c;

            if (count >= 2) {
                tcount++;
            }
        }
        System.out.println(tcount);
        sc.close();

    }
}