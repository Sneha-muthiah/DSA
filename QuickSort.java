import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       sort(arr,0,n-1);
       for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
       
        public static void sort(int arr[],int l,int h){
            int Random = (l)+(int)(Math.random()*(h-l+1));
            if(l<h){
                int p=part(arr,l,h);
                sort(arr,l,p);
                sort(arr,p+1,h);
            }
        }
        public static int part(int arr[],int l, int h){
            int mid=(l+h)/2;
            int piv=arr[mid];
            swap(arr,mid,h);
            int i=l-1;
            for(int j=l;j<h;j++){
                if(arr[j]<piv){
                    i++;
                    swap(arr,i,j);
                }
            }
            swap(arr,i+1,h);
            return i+1;
        }
        public static void swap(int arr[],int mid,int h){
            int t=arr[mid];
            arr[mid]=arr[h];
            arr[h]=t;
        }
    }

