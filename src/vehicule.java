public class vehicule {

    protected float prix;
    protected String modele;
    protected int dateAchat;
    protected String numImmat;
    protected String permis;

    public vehicule(float prix, String modele, int dateAchat, String numImmat, String permis){
        this.prix = prix;
        this.modele = modele;
        this.dateAchat = dateAchat;
        this.numImmat = numImmat;
        this.permis = permis;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(int dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getNumImmat() {
        return numImmat;
    }

    public void setNumImmat(String numImmat) {
        this.numImmat = numImmat;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }
}
