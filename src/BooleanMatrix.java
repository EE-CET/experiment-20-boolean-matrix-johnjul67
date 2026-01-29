import java.util.Scanner;

public class BooleanMatrix 
{
    public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int n = sc.nextInt();
                int arr[][] = new int[m][n];
                for (int i=0;i<m;i++)
                        for (int j=0;j<n;j++)
                                arr[i][j] = sc.nextInt();
                for (int i=0;i<m;i++)
                {
                        boolean flag=false;
                        for (int j=0;j<n;j++)
                        {
                                if (arr[i][j] == 1)
                                {
                                        flag = true;
                                        break;
                                }
                        }
                        if(flag)
                        {
                                for (int j=0;j<n;j++)
                                        arr[i][j]=1;
                        }
                }
                for (int i=0;i<n;i++)
                {
                        for (int j=0;j<n;j++)
                                System.out.print(arr[i][j]+" ");
                        System.out.println();
                }
        }
}
