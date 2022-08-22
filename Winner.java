import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<Character> arrlist=new ArrayList<Character>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arrlist.add(sc.next().charAt(0));
        }
        int count=1,i=0;
        while(arrlist.size()!=1){
            if(arrlist.size()==i)
            i=0;
            if((count%4==0) || (count%10==4)){
                arrlist.remove(i);
                i--;
            }
             count++;
             i++;
        }
       
        System.out.println(arrlist.get(0));
    }
}
