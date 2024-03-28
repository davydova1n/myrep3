import java.util.Scanner;

public class Main {

    public static int Input() {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.close();
        return x;
    }

    public static void Output(int x) {
        int sum = 0;
        while (x > 0) {
            int a = x % 10;
            sum += a;
            System.out.println(a);
            x /= 10;
        }
        System.out.println(sum);
    }


    public static int OutputRecurs(int x) {
        if (x == 0) {
            return 0;
        }

        int a = x % 10;
        System.out.println(a);
        return (a + OutputRecurs(x / 10));
    }



    public static void main(String[] args) {
        int x = Input();
        //System.out.println(OutputRecurs(x));
        Output(x);
    }
}


//15 Дано положительное число. Реализуйте метод, который выведет все его
//цифры по одной, в обратном порядке, а также их сумму. Реализовать двумя
//способами: с использованием рекурсии и без.