import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
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

    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenue");
        boolean stopCond = false;
        while(!stopCond) {
            var scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("quit".equals(input)) {
                stopCond = true;
            }
            else if ("fibo".equals(input)) {
                System.out.println("Quel itération voulez-vous ??");
                int n=scanner.nextInt();
                System.out.println("fibo :"+fibo(n));
            }
            else if("freq".equals(input)){

                System.out.println("Quel est le path ?");
                String a=scanner.nextLine();
                String b="";
                String c="";
                String d="";
                Path of = Path.of(a);
                var text=java.nio.file.Files.readString(of);
                text=text.replaceAll("[^a-zA-Z]"," ").toLowerCase();
                var ar=text.split(" ");
                for(int i=0;i<ar.length;i++) {
                    System.out.println(ar[i]);
                }
            }
            else if("predict".equals(input)){
                System.out.println("Quel est le path ?");
                String a=scanner.nextLine();
                Path of = Path.of(a);
                var text=java.nio.file.Files.readString(of);
                System.out.println("the internet tend to make a reader will be distracted by the internet tend to make a reader will be\n");
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
