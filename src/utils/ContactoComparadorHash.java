package utils;

import java.util.Comparator;

import models.contacto;

public class ContactoComparadorHash implements Comparator<contacto> {

    @Override
    public int compare(contacto o1, contacto o2) {

        int resultadoHashComparacionApellido = o2.getApellido().hashCode() - o1.getApellido().hashCode();
        if (resultadoHashComparacionApellido != 0) {
            return resultadoHashComparacionApellido;
        }
        int resultadoHashComparacionNombre = o1.getNombre().hashCode() - o2.getNombre().hashCode();
        return resultadoHashComparacionNombre;
    }

}