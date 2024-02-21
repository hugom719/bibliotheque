package bibliotheque;
import bibliotheque.metier.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import static bibliotheque.metier.TypeOuvrage.*;
import static bibliotheque.metier.TypeLivre.*;

public class Gestion {
    private static List<Auteur> laut = new ArrayList<>();
    private static List<Lecteur> llect = new ArrayList<>();
    private static List<Ouvrage> louv= new ArrayList<>();

    private static List<Rayon> lrayon= new ArrayList<>();
    private static List<Location> lloc = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int menu;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("2.Ajout Ouvrage");
            System.out.println("3.Ajout Lecteur");
            System.out.println("4.Ajout Rayon");
            System.out.println("5.Ajout Exemplaire ");
            System.out.println("6.Louer");
            System.out.println("7.Rendre");
            System.out.println("8.fin");
            System.out.print("Entrer le numero du menu : ");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    String nom;
                    String prenom;
                    String nationalite;
                    System.out.println(" encoder toutes les données");
                    System.out.print(" nom : ");
                    nom = sc.nextInt();
                    System.out.print(" prenom : ");
                    System.out.print(" nationalité : ");
                    Auteur auteur = new Auteur(nom,prenom,);
                    laut.add(auteur);
                    break;
                case 2:
                    System.out.println("choisir un type d'ouvrage (Livre,CD,DVD) encoder toutes les données, choisir un ou plusieurs auteurs");
                    break;
                case 3:
                    System.out.println("encoder toutes les données ");
                    break;
                case 4:
                    System.out.println("encoder toutes les données");
                    break;
                case 5:
                    System.out.println("choisir ouvrage de base, choisir un rayon, encoder  les données de base");
                    break;
                case 6:
                    System.out.println("choisir un exemplaire , choisir un lecteur, créer la location");
                    break;
                case 7:
                    System.out.println(" choisir un exemplaire, enregistrer la restitution de l'exemplaire et éventuellement en changer l'état");
                    break;
                case 8:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Le menu est inexistant");
            }

        }
        while (menu!=8);
    }

    public static void test()
    {
        Auteur a = new Auteur("Verne","Jules","France");
        Livre l = new Livre("Vingt mille lieues sous les mers",10, LocalDate.of(1880,1,1),LIVRE,1.50,"français","aventure","a125",350,ROMAN,"histoire de sous-marin");
        a.getLouvrage().add(l);
        l.getLauteurs().add(a);
        Rayon r = new Rayon("r12","aventure");
        Exemplaire e = new Exemplaire("m12","état neuf",l);
        e.setRayon(r);
        r.getLex().add(e);
        Lecteur lec = new Lecteur("Dupont","Jean",LocalDate.of(2000,1,4),"Mons","jean.dupont@mail.com","0458774411");
        Location loc = new Location(LocalDate.of(2023,2,1),LocalDate.of(2023,3,1),lec,e);
        lec.getLloc().add(loc);
        e.getLloc().add(loc);
        System.out.println(a);
        System.out.println(l);
        System.out.println(r);
        System.out.println(e);
        System.out.println(lec);
        System.out.println(loc);
    }

}