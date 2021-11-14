import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class EinkaufsListApp {

    public static void main(String[] args) {

    Einkauf spareinKauf = new Einkauf("Äpfel", 2.5);
    Einkauf spareinKauf1 = new Einkauf("Kartoffeln", 24.5);
    Einkauf spareinKauf2 = new Einkauf("Wurst", 5.2);
    Einkauf spareinKauf3 = new Einkauf("Eis", 7.9);
    Einkauf spareinKauf4 = new Einkauf("Käse", 3.1);
    ArrayList <Einkauf> einkaufliste = new ArrayList<Einkauf>();
    einkaufliste.add(spareinKauf);
    einkaufliste.add(spareinKauf1);
    einkaufliste.add(spareinKauf2);
    einkaufliste.add(spareinKauf3);
    einkaufliste.add(spareinKauf4);

         String a=  einkaufliste.toString();

        System.out.println(a);

        System.out.println(sum(einkaufliste));


    }
    public static double sum(ArrayList<Einkauf> einkaufliste){

         double summeDerEinkäufe = 0.0;
        for (Einkauf einkauf : einkaufliste) {
        summeDerEinkäufe = summeDerEinkäufe + einkauf.getPreis();


        }

    return summeDerEinkäufe;


    }

    public static double sum(HashSet<Einkauf> einkaufsliste){
        double gesamtsumme= 0;
        for (Einkauf einkauf : einkaufsliste) {
            gesamtsumme = gesamtsumme + einkauf.getPreis();}

            return gesamtsumme;



        }


    public static HashSet<Einkauf> unique(ArrayList<Einkauf> einkaufliste){

        HashSet<Einkauf> unique = new HashSet<>();
        for  (Einkauf einkauf : einkaufliste){
            unique.add(einkauf);



        }

        return unique;





    }




    }




