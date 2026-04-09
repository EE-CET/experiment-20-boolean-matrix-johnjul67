import java.util.*;

public class BooleanMatrix {

    public static void BooleanMatrixProblem(int m, int n, int arr[][]){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        arr[i][k] = 1;
                    }
                    break;
                }
            }
        }
    }

    public static void print(int m, int n, int arr[][]){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        BooleanMatrixProblem(m, n, arr);
        print(m, n, arr);

        sc.close();
    }
}