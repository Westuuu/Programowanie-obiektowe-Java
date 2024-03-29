import java.util.*;

public class Kraje {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> ListaPanstw = new ArrayList<ArrayList<String>>();

        ListaPanstw.add(new ArrayList<>(Arrays.asList("Niemcy", "Berlin")));
        ListaPanstw.add(new ArrayList<>(Arrays.asList("Polska", "Warszawa")));
        ListaPanstw.add(new ArrayList<>(Arrays.asList("Włochy", "Rzym")));
        ListaPanstw.add(new ArrayList<>(Arrays.asList("Francja", "Paryż")));
        ListaPanstw.add(new ArrayList<>(Arrays.asList("Polska", "Warszawa")));
        ListaPanstw.add(new ArrayList<>(Arrays.asList("Austria", "Wiedeń")));
        ListaPanstw.add(new ArrayList<>(Arrays.asList("Hiszpania", "Madryt")));


        System.out.println("1. Unikatowe państwa: ");
        unikatowePanstwa(ListaPanstw);
        System.out.println("\n2. Miasta w kolejnosci dodania: ");
        wyswietlMiasta(ListaPanstw);
        System.out.println("\n3. Czy element znajduje się na liście?");
        czyWLiscie(ListaPanstw, "Polska");
        czyWLiscie(ListaPanstw, "Wiedeń");
        czyWLiscie(ListaPanstw, "Sztokholm");
        System.out.println("\n4. Wypisanie całej tablicy: ");
        printArray(ListaPanstw);
    }
    public static void wyswietlMiasta(ArrayList<ArrayList<String>> ListaMiast){
        for (ArrayList miasta : ListaMiast){
            System.out.println(miasta.get(1));
        }
    }
    public static void unikatowePanstwa(ArrayList<ArrayList<String>> ListaPanstw){
        HashMap<String, String> MapaPanstw = new HashMap<>();
        for (ArrayList InnerArray : ListaPanstw){
            MapaPanstw.put(InnerArray.get(0).toString(), InnerArray.get(1).toString());
        }
        for (Map.Entry<String, String> panstwa : MapaPanstw.entrySet()){
            System.out.println(panstwa.getKey());
        }
    }
    public static void czyWLiscie(ArrayList<ArrayList<String>> ListaPanstw, String element){
        HashSet<ArrayList> krajeSet = new HashSet<>();
        for (ArrayList kraj : ListaPanstw){
            krajeSet.addAll(kraj);
        }
        if (krajeSet.contains(element)){
            System.out.println(element + " znajduje się na liście");
        }else {
            System.out.println(element + " nie znajduje sie na liscie");
        }
    }
    public static void printArray(ArrayList<ArrayList<String>> ListaPanstw){
        for (ArrayList kraj : ListaPanstw){
            System.out.println(kraj);
        }
    }
}