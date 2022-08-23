import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        greedy(n,arr,sum);
    }
        public static void greedy(int n,int arr[],int sum){
            Arrays.sort(arr);
            int count=0;
            for(int i=n-1;i>=0;i--){
                while(sum>=arr[i]){
                    sum=sum-arr[i];
                    count++;
                }
                if(sum==0)
                break;
                }
               
                System.out.print(count);
            
        
    }
}
