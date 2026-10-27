public class Main {
    public static void main(String[] args) {
        
        Auto auto1 = new Auto();
        

        auto1.merkki = "Volvo";
        auto1.malli = "S40";
        auto1.bensanMaara = 10;

        Auto auto2 = new Auto();
        
        auto2.merkki = "Nissan";
        auto2.malli = "Juke";
        auto2.bensanMaara = 15;

        auto1.naytaTiedeot();

        auto1.kiihdyta();

        auto1.naytaTiedeot();

        auto2.naytaTiedeot();

        auto2.kiihdyta();

        auto2.naytaTiedeot();

        auto1.tankkaa(20);
        auto1.naytaTiedeot();

        
    }
    
}
