/**
 * Created by USER on 7/7/2015.
 */
    public class Main {

        public static void main(String[] args) {

            //Liga
            Liga hewan = new Liga("hewan");
            Liga tumbuhan = new Liga("tumbuhan");

            //Divisi
            Divisi herbivora = new Divisi("herbivora",hewan);
            Divisi karnivora = new Divisi("karnivora",hewan);
            Divisi pohon = new Divisi("pohon",tumbuhan);

            //Klub
            Klub Sapi = new Klub("Sapi",herbivora,hewan);
            Klub Kambing = new Klub("Kambing",herbivora,hewan);
            Klub Buaya = new Klub("Buaya",karnivora,hewan);
            Klub Singa = new Klub("Singa",karnivora,hewan);
            Klub mangga = new Klub("PohonMangga",pohon,tumbuhan);
            Klub jeruk = new Klub("PohonJeruk",pohon,tumbuhan);


            hewan.setDaftarDivisi(herbivora);
            hewan.setDaftarDivisi(karnivora);
            tumbuhan.setDaftarDivisi(pohon);


            herbivora.setDaftarKlub(Sapi);
            herbivora.setDaftarKlub(Kambing);
            karnivora.setDaftarKlub(Buaya);
            karnivora.setDaftarKlub(Singa);
            pohon.setDaftarKlub(mangga);
            pohon.setDaftarKlub(jeruk);


            //1. Get daftar divisi by nama liga

            System.out.println("Nomor 1 Daftar Divisi by nama Liga:");
            System.out.println("Divisi Liga hewan : ");
            hewan.getDaftarDivisi("hewan");
            System.out.println();

            //2. Get Daftar Klub by nama liga

            System.out.println("Nomor 2 Daftar Klub by nama Liga:");
            System.out.println("Liga Hewan : ");
            herbivora.getDaftarKlubLiga("hewan");
            System.out.println("Liga Tumbuhan : ");
            pohon.getDaftarKlubLiga("tumbuhan");
            System.out.println();

            //3. Get Daftar Klub by nama Divisi

            System.out.println("Nomor 3 daftar klub by nama divisi :");
            System.out.println("Herbivora : ");
            herbivora.getDaftarKlubDivisi("herbivora");

            System.out.println();

            //4. Get Klub ini berada di divisi mana by nama Klub

            System.out.println("Nomor 4 Klub ini berada di divisi mana by nama klub :");
            Sapi.getDivisi("Sapi");
            System.out.println();

            //5. Get Klub ini berada di liga apa by nama Klub

            System.out.println("Nomor 5 Klub ini berada di Liga apa by nama klub :");
            Kambing.getLiga("Kambing");
        }
    }
