public class BebekBeraksi {

    public static void main (String[] args){
        Bebek bebekku = new Bebek(); 
        bebekku.nama = "bekbek";
        bebekku.warna = "merah";
        System.out.println("Bebek ini bernama "+bebekku.nama+" dan warnanya "+bebekku.warna);
        bebekku.tidur(); 
        bebekku.kaki ="berselaput";
        bebekku.berenang();
    }

}
