package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class sets {
    public Set<String> construirHashSet() {
        // Constructor for Sets class
        Set<String> palabras = new HashSet<>();

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("celular");

        return palabras;

    }
    public Set<String> construirLinkedHashset() {
        Set<String> palabras = new LinkedHashSet<>();

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("celular");

        return palabras;
    }
    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<>();

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("celular");

        return palabras;
    }
    public Set<String> construirTreeSetConComparador() {
        // Implementacion de comparator, para comparacin especifica
        Comparator<String> comparador = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                // Primero comparamos 
                int result = Integer.compare(s1.length(), s2.length());
                // Si son igual en tamaño,  comparo alfabeticamente
                if (result == 0) {
                    result = s1.compareTo(s2);
                }
                return result;
            }
        };
        Set<String> palabras = new TreeSet<>(comparador);

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("celular");
        palabras.add("celulas");

        return palabras;
    }
    // Un metodo de comparacion usando el treeSetComparador,
    // pero la salida debe ser manzana, celulas, celular, laptop y pera
    // y se va a usar las mismas palabras con el mismo orden que en el metodo anterior(incluyendo las duplicadas)
    public Set<String> construirTreeSetConComparador2() {
        // Implementacion de comparator, para comparacin especifica
        Comparator<String> comparador = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                // Primero comparamos 
                int result = Integer.compare(s2.length(), s1.length());
                // Si son igual en tamaño,  comparo alfabeticamente
                if (result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        };
        Set<String> palabras = new TreeSet<>(comparador);

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("celular");
        palabras.add("celulas");

        return palabras;
    }

      
}
