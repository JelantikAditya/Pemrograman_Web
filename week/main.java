public class main {

    public static class Pegawai {
        String namaPegawai;
        String NIK;
        int gajiPokok;
        int tunjangan;

        void setPegawai(String namaPegawai, String NIK, int gajiPokok, int tunjangan) {
            this.namaPegawai = namaPegawai;
            this.NIK = NIK;
            this.gajiPokok = gajiPokok;
            this.tunjangan = tunjangan;
        }

        void tampilPegawai() {
            System.out.println("Nama Pegawai: " + namaPegawai);
            System.out.println("NIK: " + NIK);
            System.out.println("Gaji Pokok: " + gajiPokok);
            System.out.println("Tunjangan: " + tunjangan);
        }

        public int hitungGaTot() {
            return tunjangan + gajiPokok;
        }
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setPegawai("Rizky", "12345", 2000000, 500000);
        pegawai1.tampilPegawai();
        System.out.println("Gaji Total: " + pegawai1.hitungGaTot());
    }
}
