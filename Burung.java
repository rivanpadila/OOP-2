public class Burung {
    String nama; 
    String jenis; 
    String warna; 
    String sayap; 

    
    public void terbang(){
        this.sayap = "mengepak";
        System.out.println("Burung "+this.nama+" Sedang Terbang");
    }
    
    public void tidur(){
        this.sayap = "diam";
        System.out.println("Burung "+this.nama+" Sedang Tidur");
    }
}
