import java.util.Scanner;

public class SegitigaAngka27 {
    
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan nilai N minimal 3: ");
        int N = sc27.nextInt();

        if (N < 3) {
            System.out.println("Nilai minimal N harus 3 atau lebih.");
        }else{
            for(int i = 1; i <= N; i++){
                for (int j = N; j > i; j--){
                    System.out.print(" ");
                }
                for (int a = 1; a <= i; a++) {
                    System.out.print(a);
                }
                System.out.println();
            }
        }
    }
}
