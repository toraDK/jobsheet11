import java.util.Arrays;
import java.util.Scanner;
public class porseni {

    public static void main(String [] args) {
        Scanner scan04 = new Scanner(System.in);

            String[][] dataAtletPercabang = {
            {"Badminton", "dsa", "dsasad", "Dvvd", "vdsvs", "vsdsdv"},
            {"Tenis Meja", "svds", "Yvds", "vdssdv", "vdsvds", "dvsv"},
            {"Basket", "vdsvs", "vsdvsd", "gsge", "vdsvs", "vdsvs"},
            {"Bola Voly", "vdsv", "vsdvsd", "sdvdv", "vsddv", "vsdvs"}
        };

        
        for (int i = 0; i < dataAtletPercabang.length; i++) {
            for (int j = 1; j < dataAtletPercabang[i].length - 1; j++) {
                for (int k = j + 1; k < dataAtletPercabang[i].length; k++) {
                    if (dataAtletPercabang[i][j].compareTo(dataAtletPercabang[i][k]) > 0) {
                        String temp = dataAtletPercabang[i][j];
                        dataAtletPercabang[i][j] = dataAtletPercabang[i][k];
                        dataAtletPercabang[i][k] = temp;
                    }
                }
            }

            
            System.out.println("Data Cabang " + dataAtletPercabang[i][0] + " (ascending):");
            for (int j = 1; j < dataAtletPercabang[i].length; j++) {
                System.out.println(dataAtletPercabang[i][j]);
            }
            System.out.println();
        }
    }
}
