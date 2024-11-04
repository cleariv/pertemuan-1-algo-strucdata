package Lat;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        Scanner jj = new Scanner(System.in);

        System.out.print("nama mahasiswa: ");
        String mahasiswa_name = jj.nextLine();
        
        System.out.print("semesternya: ");
        int smester = jj.nextInt();

        ArrayList<String> list_mata_kuliah = new ArrayList<String>();
        
        System.out.print("jumlah mata kuliah: ");
        int jumlahMataKuliah = jj.nextInt();
        jj.nextLine();

        for (int a = 0; a<jumlahMataKuliah; a++){
            System.out.print("mata kuliah: "); //+ (a + 1) + ":");
            String namaMataKuliah = jj.nextLine();
            System.out.print("SKS: ");
            int SKS = jj.nextInt();
            System.out.print("nilai: ");
            float nilai = jj.nextFloat();
            jj.nextLine();

            list_mata_kuliah.add(namaMataKuliah + " | SKS: " + SKS + " | nilai: " + nilai);
        }
        System.out.println("------------------------------------");

        System.out.println("nama mahasiswa/i: " + mahasiswa_name);
        System.out.println("smester: " + smester);
        System.out.println("mata kuliah: ");
            for (String namaMataKuliah : list_mata_kuliah){
                System.out.println(">" + namaMataKuliah);
            }
    }
}
