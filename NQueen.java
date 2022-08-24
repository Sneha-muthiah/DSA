import java.util.*;
 public class Main
{
    public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Queens: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
            arr[i][j]=0;
        }
    }
   NQueen ps=new NQueen(n);
   if(ps.bt(arr,0)!=true){
       System.out.print("Doesn't exist");
   }
   else{
       ps.print(arr);
   }
   sc.close();
    }
}
    class NQueen{
        int sp;
        NQueen(int sp){
            this.sp=sp;
        }
    boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
 
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        for (i = row, j = col; j >= 0 && i < sp; i++, j--)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }
     boolean bt(int board[][], int col)
    {
        if (col >= sp)
            return true;
        for (int i = 0; i < sp ;i++) {
            if (isSafe(board, i, col)){
                board[i][col] = 1;
                if (bt(board, col + 1) == true)
                    return true;
 
                board[i][col] = 0; 
            }
        }
 
        return false;
    }
    void print(int board[][]){
        for(int i=0;i<sp;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" " + board[i][j]+ " ");
            }
                System.out.println();
        }
    }
    }