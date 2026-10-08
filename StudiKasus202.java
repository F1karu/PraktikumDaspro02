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
                    alasan = "Meraih Juara " + peringkatJuara + " dan dokumen lengkap";
                } else if (jumlahDokumen >= 0 && jumlahDokumen < 4) {
                    int kurang = 4 - jumlahDokumen;
                    alasan = "Kurang " + kurang + " dokumen";
                } else { 
                    statusDana = "Kesalahan Input Dokumen";
                    alasan = "Jumlah dokumen yang diupload (" + jumlahDokumen + ") di luar batas valid (0-4)";
                }
            } else if (peringkatJuara == 0) { 
                alasan = "Hanya meraih juara harapan atau peserta";
            } else { 
                statusDana = "Kesalahan Input Juara";
                alasan = "Peringkat juara tidak valid. Harus angka 1, 2, 3, atau 0";
            } 
            
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.println("Status pendanaan PKM (1 = Lolos, 0 = Tidak lolos): ");
            statusPendanaan = input.nextInt();

            if (statusPendanaan == 1){
                
                System.out.println("Jumlah dokumen yang diupload (0-4): ");
                jumlahDokumen = input.nextInt();
                
                if (jumlahDokumen == 4) {
                    statusDana = "Menerima Dana";
                    alasan = "Lolos pendanaan PKM dan dokumen lengkap";
                } else if (jumlahDokumen >= 0 && jumlahDokumen < 4) { 
                    int kurang = 4 - jumlahDokumen;
                    alasan = "Lolos pendanaan PKM, namun dokumen (Kurang " + kurang + " dokumen )";
                } else { 
                    statusDana = "Kesalahan Input Dokumen";
                    alasan = "Jumlah dokumen yang diupload (" + jumlahDokumen + ") di luar batas valid (0-4)";
                }
            } else if (statusPendanaan == 0) { 
                alasan = "Tidak lolos pendanaan PKM";
            } else { 
                statusDana = "Kesalahan Input Pendanaan";
                alasan = "Status pendanaan tidak valid. Masukkan angka 1 (Lolos) atau 0 (Tidak Lolos)";
            }
            
        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            alasan = "Kegiatan di luar ketentuan pemberian dana";
        } else { 
            statusDana = "Kesalahan Jenis Kegiatan";
            alasan = "Jenis kegiatan '" + jenisKegiatan + "' tidak dikenali oleh sistem kemahasiswaan";
        }

        System.out.println("Nama Mahasiswa     : " + namaMahasiswa);
        System.out.println("Jenis Kegiatan     : " + jenisKegiatan.toUpperCase());
        System.out.println("Status Penghargaan : " + statusDana);
        System.out.println("Alasan/Keterangan  : " + alasan);
        
        
        input.close();
    }
}
