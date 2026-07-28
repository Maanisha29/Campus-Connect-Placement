//Kaden algorithm min product subarray

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int minProduct = arr[0];
        int maxProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] < 0) {
                int temp = minProduct;
                minProduct = maxProduct;
                maxProduct = temp;
            }

            maxProduct = Math.min(arr[i], minProduct * arr[i]);
            minProduct = Math.max(arr[i], maxProduct * arr[i]);

            result = Math.max(result, maxProduct);
        }

        System.out.println(result);
    }
}