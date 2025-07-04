package utils;

import java.util.Comparator;

import models.contacto;

public class ContactoComparador implements Comparator<contacto> {

    @Override
    public int compare(contacto o1, contacto o2) {
        // primero comparo por el apellido alfabeticamente
        int resultComparacionApellido = o1.getApellido().compareTo(o2.getApellido());
        if (resultComparacionApellido != 0) {
            return resultComparacionApellido;

        }
        // si son iguales en apellido, comparo por nombre alfabeticamente
        int resultComparacionNombre = o1.getNombre().compareTo(o2.getNombre());
        return resultComparacionNombre;



    }

}