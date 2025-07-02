import controllers.sets;
import java.util.Set;


public class App {
    public static void main(String[] args) throws Exception {
        // Create an instance of the Sets class
        sets s = new sets();
        runHashset(s);
        runLinkedHashset(s);
        runTreeSet(s);
        construirTreeSetConComparador(s);
        construirTreeSetConComparador2(s);
    }

    public static void runHashset(sets s) {
        System.out.println("--------Construyendo HashSet--------");
        Set<String> palabras = s.construirHashSet();
        int n = 0;
        for (String palabra : palabras) {
            n += 1;
            System.out.println("Palabra "+ n+ " "+palabra+ " (HashSet)");
        }
    }
    public static void runLinkedHashset(sets s) {
        System.out.println(" ");
        System.out.println("-------Construyendo LinkedHashSet--------");
        Set<String> palabras = s.construirLinkedHashset();
        int n = 0;
        for (String palabra : palabras) {
            n += 1;
            System.out.println("Palabra "+ n+ " "+palabra+ " (LinkedHashSet)");
        }
    }
    public static void runTreeSet(sets s) {
        System.out.println(" ");
        System.out.println("-------Construyendo TreeSet-------");
        Set<String> palabras = s.construirTreeSet();
        int n = 0;
        for (String palabra : palabras) {
            n += 1;
            System.out.println("Palabra "+ n+ " "+palabra+ " (TreeSet)");
        }
    }
    public static void construirTreeSetConComparador(sets s) {
        System.out.println(" ");
        System.out.println("-------Construyendo TreeSet con Comparador------");
        Set<String> palabras = s.construirTreeSetConComparador();
        int n = 0;
        for (String palabra : palabras) {
            n += 1;
            System.out.println("Palabra "+ n+ " "+palabra+ " (TreeSet con Comparador)");
        }
    }
    public static void construirTreeSetConComparador2(sets s) {
        System.out.println(" ");
        System.out.println("------Construyendo TreeSet con Comparador 2------");
        Set<String> palabras = s.construirTreeSetConComparador2();
        int n = 0;
        for (String palabra : palabras) {
            n += 1;
            System.out.println("Palabra "+ n+ " "+palabra+ " (TreeSet con Comparador 2)");
        }
    }
}

