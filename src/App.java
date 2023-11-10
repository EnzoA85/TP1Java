public class App {    
    public static void main(String[] args) throws Exception {
        voiture voiture1 = new voiture(10000,"Peugeot", 2010, "AA-123-AA", "B", true);
        voiture voiture2 = new voiture(25000, "Renault", 2015, "BB-123-BB", "B", false);

        autocars autocar1 = new autocars(100000,"Mercedes", 2010, "EE-123-EE", "D", 100, 50);
        autocars autocar2 = new autocars(150000,"Iveco", 2015, "FF-123-FF", "D", 150, 75);

        camion camion1 = new camion(100000,"Volvo", 2010,"GG-123-GG", "C", 100);

        System.out.println("Voiture 1 :");
        voiture1.afficherVoiture();
        System.out.println("Voiture 2 :");
        voiture2.afficherVoiture();
        System.out.println("Voiture 3 :");
        autocar1.afficherVehicule();
        System.out.println("Voiture 4 :");
        autocar2.afficherVehicule();
        System.out.println("Voiture 5 :");
        System.out.println("101Kg "+camion1.peutTransporterVolume(101));
        System.out.println("85Kg "+camion1.peutTransporterVolume(85));
        camion1.afficherVehicule();
    }
}
