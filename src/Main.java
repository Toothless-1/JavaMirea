import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10;i++){
            float harm = 0;
            for(int j=0; j<=i;j++){ //Пункт6
                harm+=1.0/(j+1);
            }
            System.out.println(""+(i+1)+" член гармонического ряда равен "+harm);
        }

        //arrayWithFor(); //Пункт3
        //arrayWithDoWhileAndWhile(); //Пункт4
        /*for(int i=0; i< args.length;i++){
            System.out.println("Аргумент номер "+(i+1)+": "+args[i]); //Пункт5
        }*/


//        System.out.println("Введите число, факториал которого необходимо вычислить");
//        int n = sc.nextInt();
//        if (factorial(n) <= 0) {
//            System.out.println("Факториал вашего числа слишком большой для вычисления");
//        } else {
//            System.out.println("Факториал вашего числа равен " + factorial(n)); //пункт8
//        }
    }
    private static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            if (ans * i >= 2147483646) {
                return -1;
            } else {
                ans *= i;
            }

        }
        return ans;
    }
   /* private static void arrayWithFor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int sum = 0, n = 0;
        float Am = 0;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введти числа");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Am = (float) sum / n;
        System.out.println("" + sum + " " + Am);
    }

    private static void arrayWithDoWhileAndWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int sum = 0, n = 0, ind = 0;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введти числа");
        do {
            arr[ind] = sc.nextInt();
            sum += arr[ind];
            ind++;
        } while (ind < n);
        int i = 0, j = 0;
        while (i < n) {
            while (j < n) {
                if (arr[j] >= arr[i]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println("минимум: " + arr[0] + " максимум: " + arr[n - 1] + " сумма:" + sum);
    }*/


}