package Lat;

import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        Scanner nguli = new Scanner(System.in);

        System.out.print("gaji sebulan: ");
        float gajiSebulan = nguli.nextFloat();

        System.out.print("jam lembur: ");
        int jamLembur = nguli.nextInt();

        int upahLemburPerjam = (int) Math.ceil(gajiSebulan / 173);

        int totalLembur = 0;
        if (jamLembur>4){
            totalLembur = 4 * upahLemburPerjam + 4 * 2 * upahLemburPerjam;
        }
        else{
            totalLembur = jamLembur * upahLemburPerjam;
        }
        int totalGaji = (int) gajiSebulan + totalLembur;
        System.out.println("upah lembur per jam: " + upahLemburPerjam);
        System.out.println("total gaji: " + totalGaji);
    }
}