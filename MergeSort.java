import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element Size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Msort(arr,0,arr.length-1);
        for(int o:arr)
        {
            System.out.print(o+" ");
        }
    }
    public static void Msort(int[] arr,int i,int j){
        if(i<j){
            int mid = (i+j)/2;
            Msort(arr,i,mid);
            Msort(arr,mid+1,j);
            merge(arr,i,mid,j);
        }
    }
    public static void merge(int[] arr, int l,int mid, int h){
        int i=l;
        int j=mid+1;
        int k=l;
        int b[] = new int[arr.length];
        while(i<=mid && j<=h){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
                k++;
            }else{
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            b[k] = arr[i];
            i++;
            k++;
        }
        while(j<=h){
        b[k] = arr[j];
        j++;
        k++;
    }
    for(i=l;i<=h;i++){
        arr[i] = b[i];
    }
    }
    
}
