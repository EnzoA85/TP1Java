class autocars extends camion{
    
    private int nombrePassagers;

    public autocars(float prix, String modele, int dateAchat, String numImmat, String permis, int volumeStockage,
            int nombrePassagers) {
        super(prix, modele, dateAchat, numImmat, permis, volumeStockage);
        this.nombrePassagers = nombrePassagers;
    }

    public int getNombrePassagers() {
        return nombrePassagers;
    }

    public void setNombrePassagers(int nombrePassagers) {
        this.nombrePassagers = nombrePassagers;
    }

}
