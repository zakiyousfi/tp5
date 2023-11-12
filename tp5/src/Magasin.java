public class Magasin {
    private int identifiant;
    private String adresse;
    private int capaciteMag;
    private produit2[] ensembleProduits;
    private static int nbrProduit = 0;

    public Magasin(int identifiant, String adresse, int capaciteMag) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capaciteMag = capaciteMag;
        this.ensembleProduits = new produit2[50];
    }

    public void ajouteProduit(produit2 nouveauProduit) {
        if (nbrProduit < 50) {
            ensembleProduits[nbrProduit] = nouveauProduit;
            nbrProduit++;
        } else {
            System.out.println("Impossible d'ajouter un autre produit, le magasin est plein !");
        }
    }

    public void afficheCaracteristiqueMag() {
        System.out.println("Le magasin a un identifiant : " + identifiant + ", son adresse est : " + adresse +
                ", sa capacité est : " + capaciteMag + " et ses produits sont : ");
        for (produit2 produit : ensembleProduits) {
            if (produit != null) {
                System.out.println("Ce produit : " + produit.getNom() + ", a un prix : " + produit.getPrix());
            }
        }
    }

    public static int nbrProduit() {
        return nbrProduit;
    }
}
