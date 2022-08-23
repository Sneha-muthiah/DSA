import java.util.*;
class Main{
    static int CoinChnge(int arr[],int coin,int sum){
        if(sum==0)
        return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<coin;i++){
            if(arr[i]<=sum){
                int sol = CoinChnge(arr,coin,sum-arr[i]);
                if(sol!=Integer.MAX_VALUE && sol+1 <res)
                res=sol+1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int coin=sc.nextInt();
        int arr[]=new int[coin];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        System.out.println(CoinChnge(arr,coin,sum));
    }
}