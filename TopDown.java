import java.util.*;
class Main {
    public static int td(int[] c, int amnt) {
       int[] arr = new int[amnt+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0] = 0;
        for (int i = 1; i <= amnt; i++) {
           for (int coins: c) {
              if (coins <= i && arr[i - coins] != Integer.MAX_VALUE) {
                  arr[i] = Math.min(arr[i], 1 +  arr[i - coins]); 
              }
           } 
        } 
        return (arr[amnt] == Integer.MAX_VALUE) ? -1 : arr[amnt]; 
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        int sp[]=new int[n];
        System.out.print("Enter the Array Elements");
        for(int i=0;i<sp.length;i++){
            sp[i]=sc.nextInt();
        }
        System.out.println("Enter the Amount");
        int sum=sc.nextInt();
        System.out.println(td(sp,sum));
    }
}