package controllers;

import java.text.Normalizer;
import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1 - ¿Tiene duplicados?");
        System.out.println(tieneCDuplicados(new int[]{1, 2, 3, 4, 5}));            // false
        System.out.println(tieneCDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45})); // true
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));


        System.out.println("\nEjercicio 3 - Contar palabras únicas en el texto:");
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";

        int cantidad = contarPalabrasUnicas(texto);
        System.out.println("Cantidad de palabras únicas: " + cantidad);
        System.out.println(" ");
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        compararTextos(texto1, texto2);
    }
    public boolean tieneCDuplicados(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int num : numeros) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public boolean esIsograma(String palabra) {
        // si se ingresa mursielago -> true
        // si se ingresa hola -> false
        palabra = palabra.toLowerCase();
        java.util.Set<Character> letras = new java.util.HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (letras.contains(c)) {
                return false;
            }
            letras.add(c);
        }
        return true;
    }

    public int contarPalabrasUnicas(String texto) {
        texto = texto.toLowerCase();
        String[] palabras = texto.split("\\W+");
        Set<String> unicas = new HashSet<>();
        for (String palabra : palabras) {
            if (!palabra.isBlank()) {
                unicas.add(palabra);
            }
        }
        return unicas.size();
    }

    public static void compararTextos(String texto1, String texto2) {
        // Normalizar para eliminar diacríticos y pasar a minúsculas
        texto1 = Normalizer.normalize(texto1, Normalizer.Form.NFC).toLowerCase();
        texto2 = Normalizer.normalize(texto2, Normalizer.Form.NFC).toLowerCase();

        // Tokenizar: dividir sobre cualquier secuencia de NO-letras Unicode
        String[] arr1 = texto1.split("\\P{L}+");
        String[] arr2 = texto2.split("\\P{L}+");

        Set<String> unicas1 = new HashSet<>();
        Set<String> unicas2 = new HashSet<>();

        for (String p : arr1) if (!p.isBlank()) unicas1.add(p);
        for (String p : arr2) if (!p.isBlank()) unicas2.add(p);

        // Conjunto de comunes y exclusivos
        Set<String> comunes   = new HashSet<>(unicas1);
        comunes.retainAll(unicas2);

        Set<String> exclusivas1 = new HashSet<>(unicas1);
        exclusivas1.removeAll(unicas2);

        Set<String> exclusivas2 = new HashSet<>(unicas2);
        exclusivas2.removeAll(unicas1);

        // Cálculo de porcentaje sobre la unión de ambos conjuntos
        int unionSize = unicas1.size() + unicas2.size() - comunes.size();
        double porcentaje = unionSize == 0
            ? 0
            : (comunes.size() * 100.0) / unionSize;

        // Salida
        System.out.println("Ejercicio 4 - Comparar dos textos:");
        System.out.println("Palabras únicas en texto1: " + unicas1.size() + " palabras únicas");
        System.out.println("Palabras únicas en texto2: " + unicas2.size() + " palabras únicas");
        System.out.println("Palabras comunes: " + comunes.size());
        System.out.printf("Coincidencia léxica: %.2f%%%n", porcentaje);
        System.out.println("Solo en texto1: " + exclusivas1);
        System.out.println("Solo en texto2: " + exclusivas2);
    }
}

