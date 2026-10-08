import java.util.Scanner;

public class StudiKasus202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.println("Nama mahasiswa: ");
        namaMahasiswa = input.nextLine();

        System.out.println("Jenis Kegiatan: (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = input.nextLine();

        String statusDana = "Tidak Menerima Dana Penghargaan";
        String alasan = "";

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

                System.out.println("Peringkat juara (1/2/3, 0 jika bukan juara): ");
                peringkatJuara = input.nextInt();

                if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {

                    System.out.println("Jumlah dokumen yang diupload (0-4): ");
                    jumlahDokumen = input.nextInt();

                    if (jumlahDokumen == 4) {
                        statusDana = "Menerima dana";
                        alasan = "Meraih Juara" + peringkatJuara + " dan dokumen lengkap";
                    } else {
                        int kurang = 4 - jumlahDokumen;
                        statusDana = "Tidak Menerima Dana Penghargaan";
                        alasan = "Kurang " + kurang + " dokumen";
                    }
                } else {
                    alasan = "Hanya meraih juara harapan atau peserta";

                }
            }

        System.out.println("Nama Mahasiswa     : " + namaMahasiswa);
        System.out.println("Jenis Kegiatan     : " + jenisKegiatan.toUpperCase());
        System.out.println("Status Penghargaan : " + statusDana);
        System.out.println("Alasan/Keterangan  : " + alasan);







        
        input.close();

    }
}