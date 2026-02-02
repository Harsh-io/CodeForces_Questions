import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (str.length() > 10) {
               
                System.out.print(str.charAt(0));
                System.out.print(str.length() - 2);
                System.out.println(str.charAt(str.length() - 1));
                
            } else {
                System.out.println(str);
            }
        }
        sc.close();

    }
}