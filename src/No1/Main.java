package No1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Buku> inibuku = new ArrayList<>();

        inibuku.add(new Buku("1", "7 in 1 Pemrograman Web Untuk Pemula", "Rohi Abdulloh", "2018", 100.0, 5));
        inibuku.add(new Buku("2", "7 in 1 Pemrograman Web Dasar", "Rohi Abdulloh", "2018", 300.0, 4));

        //Menampilkan Data buku
        System.out.println("Data Buku :  ");
        for (Buku buku:inibuku
             ) {
            System.out.println("ISBN : "+buku.getIsbn());
            System.out.println("Judul Buku : "+buku.getJudulBuku());
            System.out.println("Pengarang : "+buku.getPengarang());
            System.out.println("Tahun Terbit : "+buku.getTahunTerbit());
            System.out.println("Harga : "+buku.getHarga());
            System.out.println("Rating : "+buku.getRating());
            System.out.println("");
        }

        //Ubah Data Buku
        System.out.println("Ubah Data Buku : ");
        String isbn = input.next();
        for (Buku buku:inibuku
             ) {
           if (buku.getIsbn().equals(isbn)){
               buku.setHarga(200.0);
               buku.setRating(4);
               buku.setJudulBuku("7 in 1 Pemrograman Web Untuk Tingkat Lanjut");
               buku.setPengarang("Rohi Abdulloh");
               buku.setTahunTerbit("2019");
               buku.setIsbn("1");
           }
        }

        for (Buku buku:inibuku
        ) {
            System.out.println("ISBN : "+buku.getIsbn());
            System.out.println("Judul Buku : "+buku.getJudulBuku());
            System.out.println("Pengarang : "+buku.getPengarang());
            System.out.println("Tahun Terbit : "+buku.getTahunTerbit());
            System.out.println("Harga : "+buku.getHarga());
            System.out.println("Rating : "+buku.getRating());
            System.out.println("");
        }

        //Hapus Data
        System.out.println("Hapus Data Buku : ");
        isbn = input.next();
        for (Buku buku:inibuku
        ) {
            if (buku.getIsbn().equals(isbn)){
                inibuku.remove(buku);
            }
        }
        if (inibuku.isEmpty()){
            System.out.println("Data Buku  Kosong");
        }
        else {
            for (Buku buku:inibuku
            ) {
                System.out.println("ISBN : "+buku.getIsbn());
                System.out.println("Judul Buku : "+buku.getJudulBuku());
                System.out.println("Pengarang : "+buku.getPengarang());
                System.out.println("Tahun Terbit : "+buku.getTahunTerbit());
                System.out.println("Harga : "+buku.getHarga());
                System.out.println("Rating : "+buku.getRating());
                System.out.println("");
            }
        }
    }
}
