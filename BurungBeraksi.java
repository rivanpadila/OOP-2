public class BurungBeraksi {

    public static void main(String[] args){
        Burung burungnuri = new Burung();
        burungnuri.nama = "Nuri";
        burungnuri.warna = "Merah";
        System.out.println("Burung "+burungnuri.nama+" warnanya "+burungnuri.warna);
       
        burungnuri.terbang();
        System.out.println("Sayapnya "+burungnuri.sayap);
        burungnuri.tidur();
        System.out.println("Sayapnya "+burungnuri.sayap);
        System.out.println("");

        Burung burungmerpati = new Burung();
        burungmerpati.nama = "Merpati";
        burungmerpati.warna = "Putih";
        System.out.println("Burung "+burungmerpati.nama+" warnanya "+burungmerpati.warna);
        
        burungmerpati.terbang();
        System.out.println("Sayapnya "+burungmerpati.sayap);
        burungmerpati.tidur();
        System.out.println("Sayapnya "+burungmerpati.sayap);
    }

}
