import java.util.Scanner;
public class Launcher {
    public static int fibo(int n){
        int f0 = 0;
        int f1 = 1;
        int fn = -1;
        if (n == 0){
            fn = f0;
        }
        if (n == 1){
            fn = f1;
        }
        for (int k = 2; k <= n; ++k){
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"quit".equals(input)) {
            if("fibo".equals(input)) {
                System.out.println("entre un nombre");
                int n = scanner.nextInt();
                System.out.println("fibonnaci de " + n + " est : " + fibo(n));
            }
        }
    }
}
