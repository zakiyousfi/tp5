import java.util.Date;

public class Produit {
    int id;
    public String libelle;
    public String marque;
    public double prix;
    public Date Date_ex;

    public Produit (int id , String libelle , String marque , double prix , Date date)
    {
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
        this.Date_ex=date;
    }

    public Produit(int id, String libelle, String marque) {
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
    }
    public Produit(){

    }

    public void afficher()
    {
        System.out.println("Ce produit a un idenfiant : "+id+" , un libellé : "+libelle+" ,de la marque : "+marque+" et d'un prix : "+prix);
        System.out.println(Date_ex);
    }

    public void SetPrix (double prix)
    {
        this.prix=prix;
    }
    public void SetId (int id)
    {
        this.id=id;
    }
    public void SetLibelle (String libelle)
    {
        this.libelle=libelle;
    }
    public void SetMarque (String marque)
    {
        this.marque=marque;
    }
    public String toString()
    {
        return "l'identifiant est : "+this.id+" ,la libelle est : "+this.libelle+" ,la marque est : "+this.marque+" et la prix est : "+this.prix;
    }
    public void SetDate_ex(Date d1)
    {
        this.Date_ex=new Date();
    }
}