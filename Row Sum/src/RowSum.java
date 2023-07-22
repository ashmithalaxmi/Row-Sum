import java.util.Scanner;

public class RowSum {
    public static int[] Rsum(int[][] A, int n, int m){
        int[]  RowSum = new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=A[i][j];
                RowSum[i]=sum;
            }
        }
        return RowSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] A = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]= sc.nextInt();
            }
        }
        int[] result= new int[n];
        result=Rsum(A, n,m);
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}
