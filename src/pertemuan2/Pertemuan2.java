package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pertemuan2 {

    public static void main(String[] args) {
        String nama = "";
        int nim = 0;
        double ipk = 0.0;

        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input nama mahasiswa: ");
            nama = datain.readLine();

            System.out.print("Input NIM mahasiswa: ");
            nim = Integer.parseInt(datain.readLine());

            System.out.print("Input IPK mahasiswa: ");
            ipk = Double.parseDouble(datain.readLine());

        } catch (IOException e) {
            System.out.println("Error pembacaan data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error format angka: " + e.getMessage());
        }

        System.out.println("Nama saya " + nama);
        System.out.println("NIM saya " + nim);
        System.out.printf("Nama saya %s dengan NIM %d dengan IPK %.2f%n", nama, nim, ipk);

        try {
            datain.close(); // Menutup BufferedReader
        } catch (IOException e) {
            System.out.println("Error saat menutup BufferedReader: " + e.getMessage());
        }
    }
}

