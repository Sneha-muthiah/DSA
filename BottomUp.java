import java.util.*;
class Main {
    public static int btUp(int[] c, int amt) {
        int[] result = new int[amt + 1];
        for (int i = 1; i <= amt; i++) {
            int mC = amt + 1;
            for (int coins : c) {
                int rem = i - coins;
                if (rem < 0) {
                    continue;
                }
                mC = Math.min(mC, result[rem] + 1);
            }
            result[i] = mC;
        }
        return result[amt] == amt + 1 ? -1 : result[amt];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Amount");
        int sum=sc.nextInt();
        System.out.println(btUp(arr,sum));
    }
}