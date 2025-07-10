
// Que 1 (Arrays) : Swap the elements of the array using a new array
// public class main {
//    static void Print_Array(int[] Arr) {
//        for (int i = 0; i < Arr.length; i++) {
//            System.out.print(Arr[i] + " ");  // Print in the same line
//        }
//        System.out.println(); // Print a new line at the end
//    }
//
//    static int[] Reverse_Array(int[] Arr) {
//        int n = Arr.length;
//        int[] Ans = new int[n];
//        int j = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            Ans[j++] = Arr[i];  // J++ is post-increment operator
//        }                        // Arr[i] has the value of the last index of the array , it decrements by then
//        return Ans;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] ans = Reverse_Array(arr);
//        Print_Array(ans);
//    }
//}



// ---------------------------------------------------------------------------------------------------------------------------------



// Que 2 (Arrays) : Swap the elements of the array without using a new array (IN Place swa
// Q1 : Swap the elements of the Array using a NEW ARRAY
// import java.util.Arrays;
//public class main {
//    static void Print_Array(int[] Arr) {
//        for (int i = 0; i < Arr.length; i++) {
//            System.out.print(Arr[i] + " ");  // Print in the same line
//        }
//        System.out.println(); // Print a new line at the end
//    }
//    static void Swap_Array_Elements(int[]arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j]= temp;
//    }
//    static void Reverse(int[]arr){
//        int i=0 , j= arr.length-1;
//        while(i<j){
//            Swap_Array_Elements(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {4,3,2,1};
//        Reverse(arr);
//        Print_Array(arr);
//    }
//}



// ---------------------------------------------------------------------------------------------------------------------------------



// Que 3 (Arrays) : Swap the elements of the array for ( K TIMES )
// import java.util.Arrays;
//import java.util.Scanner;
//public class main {
//    static void Print_Array(int[] Arr) {
//        for (int i = 0; i < Arr.length; i++) {
//            System.out.print(Arr[i] + " ");  // Print in the same line
//        }
//        System.out.println(); // Print a new line at the end
//    }
//
//    // The first part would be from (n-k to n-1)
//    // The second part would be from (0 to n-k-1)
//    static int[] rotate(int[]arr,int k){
//        int n= arr.length;
//        int[]ans = new int [n];
//        int j =0;
//        for (int i = n-k; i<n ; i++) {
//            ans[j++]= arr[i];
//        }
//        for (int i = 0 ; i < n-k-1 ; i++) {
//            ans[j++]= arr[i];
//        }
//        return ans;
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
//        System.out.println("enter K: ");
//        int k = Sc.nextInt();
//
//        System.out.println("Original Array: ");
//        Print_Array(arr);
//        int[] ans = rotate(arr,k);
//        System.out.println("Array After Rotation: ");
//        Print_Array(ans);
//    }
//
//}

//-------------------------------------------------------------------------------------------------------------------------------

// Que 4 (Arrays) : Swap the elements of the array for ( K TIMES ) without creating a seperate array
import java.util.Arrays;
//import java.util.Scanner;
//public class main {
//    static void Print_Array(int[] Arr) {
//        for (int i = 0; i < Arr.length; i++) {
//            System.out.print(Arr[i] + " ");  // Print in the same line
//        }
//        System.out.println(); // Print a new line at the end
//    }
//    static void Swap_Array_Elements(int[]arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j]= temp;
//    }
//    static void Reverse(int[]arr , int i , int j ){
//        while(i<j){
//            Swap_Array_Elements(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//
//    // The first part would be from (n-k to n-1)
//    // The second part would be from (0 to n-k-1)
//    static void  rotateInPlace (int[]arr, int k)
//    {
//        int n = arr.length;
//        k = k%n;
//        Reverse(arr,0,n-k-1);
//        Reverse(arr,n-k,n-1);
//        Reverse(arr,0,n-1);
//    }
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
//        System.out.println("enter K: ");
//        int k = Sc.nextInt();
//
//        System.out.println("Original Array: ");
//        Print_Array(arr);
//        rotateInPlace(arr,k);
//        System.out.println("Array After Rotation: ");
//        Print_Array(arr);
//    }
//}


// --------------------------------------------------------------------------------------------------------------------------



// Que 5 (Arrays) : Input multiple numbers from users and tell if its present in Array or Not
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
//                System.out.println("YES");
//            }
//            else {
//                System.out.println("NO");
//            } k --;
//        }
//    }
//}