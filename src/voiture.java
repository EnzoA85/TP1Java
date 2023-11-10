class voiture extends vehicule{
    
    private boolean autoradio;

    public voiture(float prix, String modele, int dateAchat, String numImmat, String permis, boolean autoradio) {
        super(prix, modele, dateAchat, numImmat, permis);
        this.autoradio = autoradio;
    }

    public boolean getAutoradio() {
        return autoradio;
    }

    public void setAutoradio(boolean autoradio) {
        this.autoradio = autoradio;
    }

    public void ajouterAutoradio(){
        autoradio = true;
    }

    public void enleverAutoradio(){
        autoradio = false;
    }
}
