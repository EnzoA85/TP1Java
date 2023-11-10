class camion extends vehicule{

    private double volumeStockage;

    public camion(float prix, String modele, int dateAchat, String numImmat, String permis, double volumeStockage) {
        super(prix, modele, dateAchat, numImmat, permis);
        this.volumeStockage = volumeStockage;
    }

    public double getVolumeStockage() {
        return volumeStockage;
    }

    public void setVolumeStockage(double volumeStockage) {
        this.volumeStockage = volumeStockage;
    }

    public boolean peutTransporterVolume(double volume){
        if (this.volumeStockage >= volume) {
            return true;
        } else {
            return false;
        }
    }

    public void afficherCamion(){
        super.afficherVehicule();
        System.out.println("Volume :" + this.volumeStockage);
        System.out.println("Peut Transporter :" + this.peutTransporterVolume(100));
    }
}