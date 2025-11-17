import java.util.Scanner;

public class mobil {
    public static class infoMobil {
        String merk;
        int tahun;
        int kecepatan;

        public int tambahKecepatan(int kecepatanAwal, int kecepatanTambah) {
            return kecepatanAwal + kecepatanTambah;
        }

        public int kurangiKecepatan(int kecepatanAwal, int kecepatanKurang) {
            return kecepatanAwal - kecepatanKurang;
        }

        public void tampilMobil() {
            System.out.println("Merk Mobil: " + merk);
            System.out.println("Tahun Mobil: " + tahun);
            System.out.println("Kecepatan Mobil: " + kecepatan + " km/h");
        }
    }

    public static class pengemudi {
        String namaPengemudi;

        public void setPengemudi(String namaPengemudi) {
            this.namaPengemudi = namaPengemudi;
        }

        public void tampilPengemudi() {
            System.out.println("Nama Pengemudi: " + namaPengemudi);
        }

        public void mengemudi() {
            System.out.println(namaPengemudi + " sedang mengemudi.");
        }
    }

    public static void main(String[] args) {
        infoMobil mobil1 = new infoMobil();
        mobil1.merk = "Toyota";
        mobil1.tahun = 2020;
        mobil1.kecepatan = 60;

        pengemudi driver = new pengemudi();
        driver.setPengemudi("Adit");
        driver.tampilPengemudi();
        mobil1.tampilMobil();
        driver.mengemudi();

        Scanner scanner = new Scanner(System.in);
        int inputKecepatan;

        while (true) {
            System.out.print("\nMasukkan perubahan kecepatan (+ untuk tambah, - untuk kurangi, 0 untuk matikan): ");
            inputKecepatan = scanner.nextInt();
            if (inputKecepatan == 0) {
                System.out.println("Mobil dimatikan.");
                break;
            }

            if (inputKecepatan > 0) {
                mobil1.kecepatan = mobil1.tambahKecepatan(mobil1.kecepatan, inputKecepatan);
                System.out.println("Kecepatan Mobil setelah ditambah: " + mobil1.kecepatan + " km/h");
            } else{
                mobil1.kecepatan = mobil1.kurangiKecepatan(mobil1.kecepatan, Math.abs(inputKecepatan));
                System.out.println("Kecepatan Mobil setelah dikurangi: " + mobil1.kecepatan + " km/h");
            } 
        }
        scanner.close();
    }
}
