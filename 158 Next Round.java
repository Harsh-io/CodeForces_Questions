//MY APPROACH

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //Input
        int n = sc.nextInt();
        int k = sc.nextInt();
        float[] arr = new float [n] ;
        int count = 0;
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i] >= arr[k-1] && arr[i] > 0)
                    count++;
        }
        
        
        // Main function
        for(int i=0; i<n; i++)
        {
                if (arr[i] >= arr[k-1] && arr[i] > 0)
                    count++;
        }
        
        System.out.println(count);
        sc.close();
    }
}

// OPTIMISED

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int benchmark = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();

            if (i < k - 1) {
                // before k-th position: only positive scores definitely advance
                if (score > 0)
                    count++;
            } else if (i == k - 1) {
                // k-th position: set benchmark and count it only if positive
                benchmark = score;
                if (score > 0)
                    count++;
            } else {
                // after k-th: must be >= benchmark AND > 0
                if (score >= benchmark && score > 0)
                    count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
