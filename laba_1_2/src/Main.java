
import java.util.Scanner;

public class Main {


    public static int[] Input() {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        return ToArray(x);
    }

    public static int Input2() {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.close();
        return x;
    }


    public static int[] ToArray(int x) {
        int len = (int) (Math.log10(x) + 1);
        int[] arr = new int[len];


        for (int i = len - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x /= 10;
        }

        return arr;
    }


    public static int[] Umnoj(int[] n1, int m) {
        int n = n1.length;
        int[] res = new int[n];


        for (int i = 0; i < n; i++) {
            int prod = n1[i] * m;
            res[i] = prod;

        }
        return res;
    }

    public static void main(String[] args) {
        int[] n1 = Input();
        int x = Input2();

        int[] res = Umnoj(n1, x);



        for (int a : res) {
            System.out.print(a + " ");
        }
    }
}
