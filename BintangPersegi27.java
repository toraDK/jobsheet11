import java.util.Scanner;

public class BintangPersegi27 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc27.nextInt();
        
        for(int iouter = 1; iouter <= N; iouter++){
            for(int i=1; i<=N; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}