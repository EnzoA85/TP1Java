public class App {    
    public static void main(String[] args) throws Exception {
        voiture voiture1 = new voiture(10000,"Twingo", 2023, "AB-123-CD", "B", true);

        autocars autocar1 = new autocars(100000,"Mercedes", 2010, "EE-123-EE", "D", 100, 50);

        camion camion1 = new camion(20000,"J9", 2008,"1234-AB-56", "B", 25);

        System.out.println(" ");
        System.out.println("----------------------------Voiture---------------------------------------");
        System.out.println("Voiture 1 :");
        voiture1.afficherVoiture();
        System.out.println("Le cout de la location de la voiture 1 est : "+voiture1.coutLocation());
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("----------------------------Autocars---------------------------------------");
        System.out.println("Autocars 1 :");
        autocar1.afficherAutocar();

        System.out.println(" ");
        System.out.println("----------------------------Camion---------------------------------------");
        System.out.println("Camion :");
        System.out.print(camion1.peutTransporterVolume(7));
        camion1.afficherCamion();
    }
}
