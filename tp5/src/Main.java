import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Produit p0 = new Produit();
        System.out.println("donner l'identifiant du produit");
        Scanner n=new Scanner(System.in);
        p0.id=n.nextInt();
        System.out.println("donner la libellé du produit");
        p0.libelle=n.next();
        System.out.println("donner la marque du produit");
        p0.marque=n.next();
        System.out.println("donner le prix du produit");
        p0.prix=n.nextDouble();

        Date d1 = new Date("30/3/2023");
        Date d2 = new Date(2020,20,2);
        Date d3=new Date();

        Produit p1 = new Produit(1021, " Lait ", " Delice ",0,d3);
        Produit p2 = new Produit(2510, " Yaourt ", " Vitalait ",0,d2);
        Produit p3 = new Produit(3250, " Tomate ", " Sicam ", 1.200,d2);
        p0.afficher();
        p1.afficher();
        p2.afficher();
        p3.afficher();

        p1.SetPrix(0.700);
        p1.afficher();

        p2.SetPrix(0.450);

        p0.afficher();
        p2.afficher();

        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p2.SetDate_ex(d1);
        p2.afficher();

        p0.SetDate_ex(d2);
        p0.afficher();

        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);

        System.out.println(new Date());
        System.out.println(new Date(2023-8-7));
        System.out.println(new Date(2023/8/7));
        System.out.println(new Date(7/8/2023));
        System.out.println(new Date("7/8/2023"));
        System.out.println(new Date("2023/8/7"));
        LocalDate Date = LocalDate.of(2023, 11, 10);
        System.out.println("la date donner est: " + Date);
    }
}