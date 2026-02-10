
public class adv_pattern {

    static void pattern1(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5_1(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(N - j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void pattern6_1(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {

                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int N) {
        pattern7(N);
        pattern8(N);
    }

    static void pattern10(int N) {
        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = i;
            if (i > N) {
                stars = 2 * N - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int N) {
        int start = 1;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                start = 1; 
            }else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    static void pattern22_1(int n) {
        int size = 2 * n - 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                for (int layer = 0; layer < n; layer++) {
                    int l = layer + 1;
                    int k = layer;

                    if (i == l || j == l || i == size - k || j == size - k) {
                        System.out.print(n - k + " ");
                        break; // Found the correct layer, break out
                    }
                }
            }
            System.out.println();
        }
        //OUTPUT 
        // for(i =0 ; i < n; i++)
        // for(j =0 ; j < n; j++)
        // if (i == 1 || j == 4 || i == 4)
        // print (*)
        // else 
        // print(" ")
    }

    public static void main(String[] args) {
        int N = 5;
        pattern1(N);
        System.out.println("-----------------");
        pattern2(N);
        System.out.println("-----------------");
        pattern3(N);
        System.out.println("-----------------");
        pattern4(N);
        System.out.println("-----------------");
        pattern5(N);
        System.out.println("-----------------");
        pattern5_1(N);
        System.out.println("-----------------");
        pattern6(N);
        System.out.println("-----------------");
        pattern6_1(N);
        System.out.println("-----------------");
        pattern7(N);
        System.out.println("-----------------");
        pattern8(N);
        System.out.println("-----------------");
        pattern9(N);
        System.out.println("-----------------");
        pattern10(N);
        System.out.println("-----------------");
        pattern11(N);
        System.out.println("-----------------");
        pattern21(N);
        System.out.println("-----------------");
        pattern22(N);
        System.out.println("-----------------");
        pattern22_1(N);
        System.out.println("-----------------");
        System.out.println("All patterns printed successfully!");
    }
}
