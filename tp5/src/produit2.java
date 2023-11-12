public class produit2 {

    private String nom;
    private double prix;
    public produit2(String nom,double prix)
    {
        this.nom=nom;
        if (prix >=0)
            this.prix=prix;
        else
            System.out.println("le prix ne peut pas etre négative");
    }
    public String getNom()
    {
        return nom;
    }
    public double getPrix()
    {
        return prix;
    }

}