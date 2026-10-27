public class Auto {
    public String merkki;
    public String malli;
    public int bensanMaara;

    public void naytaTiedeot() {
        System.out.println("Auto: " + merkki + " " + malli);
        System.out.println("Bensaa: " + bensanMaara);
    }

    public void kiihdyta() {
        if (bensanMaara > 0) {
            bensanMaara--;
            System.out.println("Auto kiihtyy.");
        } else {
             System.out.println("Tankkaa ensin.");
        }
       
    }

    public void tankkaa(int maara) {
        if (maara > 0) {

            System.out.println("Tankissa ennen tankkausta: " + bensanMaara);

             bensanMaara += maara;

             System.out.println("Tankkaus: " + maara);
             System.out.println("Tankkauksen jälkeen: " + bensanMaara); 
        } else {
            System.out.println("Tankattavan määrän pitää olla positiivinen");     
        }
       
       
    }

}
