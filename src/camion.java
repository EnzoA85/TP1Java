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
}