class camion extends vehicule{

    private int volumeStockage;

    public camion(float prix, String modele, int dateAchat, String numImmat, String permis, int volumeStockage) {
        super(prix, modele, dateAchat, numImmat, permis);
        this.volumeStockage = volumeStockage;
    }

    public int getVolumeStockage() {
        return volumeStockage;
    }

    public void setVolumeStockage(int volumeStockage) {
        this.volumeStockage = volumeStockage;
    }

    public boolean peutTransporterVolume(int volume){
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