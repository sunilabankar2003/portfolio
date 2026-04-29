// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5};
        int q = 5;
        int[] ans = makeFrequency(arr);
        while(q>0){
          int x = sc.nextInt();  
          if(ans[x]>0){
              System.out.println("Yes");
          } else {
              System.out.println("No");
          }
          q--;
        }
    }
    public static int[] makeFrequency(int arr[]){
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]] +=1;
        }
        return freq;
    }
    public static void rotateArray(int[] arr, int k){
        k = k % arr.length;
        int temp = 0;
        for(int i=1; i<=k; i++){
            temp = arr[arr.length-1];
            for(int j=arr.length-1; j>=1; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }
    public static void reverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int i = n-1, j = 0;
        while(i>=0){
                ans[j++] = arr[i--];
        }
        // int i = 0;
        // int j = arr.length-1;
        // while(i<j){
        //     int temp = arr[i];
        //     arr[i++] = arr[j];
        //     arr[j--] = temp;
        // }
        System.out.println(Arrays.toString(ans));
    }
    public static int getLastRepeat(int[] arr){
        int n = arr.length-1;
        for(int i=n; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int getRepeat(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                return arr[i];
                }
            }
        }
        return -1;
    }
    public static void getSecondSmallest(int[] arr){
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==small){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<secondSmall){
                secondSmall = arr[i];
            }
        }
        System.out.println(secondSmall);
    }
    public static void getSubarrays(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                
            }
        }
    }
}