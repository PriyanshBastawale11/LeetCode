// Que 5 (Arrays) : Input multiple numbers from users and tell if its present in Array or Not

  import java.util.Arrays;
//import java.util.Scanner;
//public class main {
//
//   static void printArray(int[]arr){
//       int n = arr.length;
//       for (int i = 0; i < n; i++) {
//           System.out.println(arr[i]+ " ");
//       }
//       System.out.println();
//   }
//   static void swap (int[] arr , int i, int j){
//       int temp = arr[i];
//       arr[i]= arr[j];
//       arr[j]= temp;
//   }
//
//    public static void main(String[] args) {
//      Scanner Sc= new Scanner(System.in);
//        System.out.println("print array size");
//        int n = Sc.nextInt();
//        int[]arr = new int[n];
//
//        System.out.println("Enter the"+ n + "elements");
//        for (int i=0;i<n;i++){
//            arr[i]=Sc.nextInt();
//        }
//        System.out.println("Original Array:");
//        printArray(arr);
//    }
//}

import java.util.Arrays;
//import java.util.Scanner;
//public class main {
//
//    static int[] frequencyarray(int[]arr){
//        int n = arr.length;
//        int[]freq = new int[100005];
//
//        for(int i = 0;i<arr.length;i++){
//            freq[arr[i]]++;
//        }
//        return freq;
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc= new Scanner(System.in);
//        System.out.println("print array size");
//        int n = Sc.nextInt();
//        int[]arr = new int[n];
//
//        System.out.println("Enter the"+ n + "elements");
//        for (int i=0;i<n;i++){
//            arr[i]=Sc.nextInt();
//        }
//
//        int[]freq = frequencyarray(arr);
//        System.out.println("enter the number of queries: ");
//        int k = Sc.nextInt();
//
//        while (k > 0){
//            System.out.println("enter the number to be searched");
//            int x = Sc.nextInt();
//            if (freq[x]>0){
//                System.out.println("YES Its present");
//            }
//            else {
//                System.out.println("NOT present");
//            } k --;
//        }
//    }
//}

//  import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Take input from user
//        System.out.print("Enter the number of terms for Fibonacci series: ");
//        int n = scanner.nextInt();
//
//        int first = 0, second = 1;
//
//        System.out.println("Fibonacci Series up to " + n + " terms:");
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(first + " ");
//
//            // Calculate next term
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//
//        scanner.close();
//    }
//}

//
//  import java.util.Scanner;
//
//public class main {
//
//    // Recursive function to return the nth Fibonacci number
//    static int fibonacci(int n) {
//        if (n == 0)
//            return 0;
//        else if (n == 1)
//            return 1;
//        else
//            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursion
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Take number of terms from user
//        System.out.print("Enter the number of terms for Fibonacci series: ");
//        int n = scanner.nextInt();+
//
//        System.out.println("Fibonacci Series up to " + n + " terms:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//
//        scanner.close();
//    }
//}

// SpiralMatrix.java
public class main {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            // Top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            // Right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            // Bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            // Left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}