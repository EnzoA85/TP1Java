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

    public String peutTransporterVolume(int volume){
        if (this.volumeStockage > volume) {
            String result = "Le camion peu transporter";
            return result;
        } else {
            String result = "Le camion ne peu pas transporter";
            return result;
        }
    }
}