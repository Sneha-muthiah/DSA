import java.util.*;
class Main {
    public static ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
    public static void BruteForce(int chose[], int arr[],int ind, int s, int sp, int ps) {
        ArrayList <Integer> list= new ArrayList<>();
        if (ind == s) {
            for (int i = 0; i < s; i++) {
                list.add(arr[chose[i]]);
            }
            x.add(list);
            return;
        }
        for (int i = sp; i <= ps; i++) {
            chose[ind] = i;
            BruteForce(chose, arr, ind + 1,
                    s, i, ps);
        }
        return;
    }

    static void repeat(int arr[], int n, int s) {
        int chose[] = new int[s + 1];
        BruteForce(chose, arr, 0, s, 0, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Amount");
        int amnt = sc.nextInt();
        ArrayList<ArrayList<Integer>>sm=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=amnt;i++){
            repeat(arr, n, i);
        }             
         for(int i=0;i<x.size();i++)
        {
            int sum=0;
            for(int m:x.get(i)) {
                 sum += m;
            }
            if(sum==amnt)
            {
                if(sm.isEmpty())
                  sm.add(x.get(i));
                else{
                    int sn=sm.get(0).size();
                    int ns=x.get(i).size();
                    if(sn>ns)
                    {
                        sm.remove(0);
                        sm.add(x.get(i));
                    }
                }  
                
            }
        }
          System.out.println("Minimum coins: "+sm.get(0).size()); 
        
    }
}