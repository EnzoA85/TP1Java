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

    public boolean peutTransporterPassagers(int nbPassagers,int volumeAVGpassager){
        if (this.nombrePassagers >= nbPassagers && this.getVolumeStockage() >= volumeAVGpassager) {
            return true;
        } else {
            return false;
        }
    }

    public void afficherAutocar(){
        super.afficherCamion();
        System.out.println("Nombre de place :" + this.nombrePassagers);
        System.out.println("Peut Transporter :" + this.peutTransporterPassagers(70,125));
    }
}
