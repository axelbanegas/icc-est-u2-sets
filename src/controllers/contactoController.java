package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.contacto;
import utils.ContactoComparador;
import utils.ContactoComparadorHash;
import utils.ContactoComparadorTelefono;

public class contactoController {

    public contactoController() {
        runTreeContacto();
        runTreeContactoNumeros();
        runTreeContactoHash();
    }

    public void runTreeContacto() {
        ContactoComparador comparador = new ContactoComparador();
        Set<contacto> agenda = new TreeSet<>(comparador);
        agenda.add(new contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new contacto("Luis", "Perez", "111111111"));
        agenda.add(new contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new contacto("Ana", "Perez", "987654321"));
        agenda.add(new contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new contacto("Pablo", "Lopez", "222222222"));

        System.out.println("------------TreeSet con Comparador--------------");
        for (contacto c : agenda) {
            System.out.println(c);
        }
        System.out.println();
    }

    public void runTreeContactoNumeros() {
        ContactoComparadorTelefono comparador = new ContactoComparadorTelefono();
        Set<contacto> agenda = new TreeSet<>(comparador);
        agenda.add(new contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new contacto("Luis", "Perez", "111111111"));
        agenda.add(new contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new contacto("Ana", "Perez", "987654321"));
        agenda.add(new contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new contacto("Pablo", "Lopez", "222222222"));

        System.out.println("------------TreeSet con Comparador de Telefonos------------");
        for (contacto c : agenda) {
            System.out.println(c);
        }
        System.out.println();
    }

    public void runTreeContactoHash() {
        ContactoComparadorHash comparador = new ContactoComparadorHash();
        Set<contacto> agenda = new TreeSet<>(comparador);
        agenda.add(new contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new contacto("Luis", "Perez", "111111111"));
        agenda.add(new contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new contacto("Ana", "Perez", "987654321"));
        agenda.add(new contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new contacto("Pablo", "Lopez", "222222222"));

        System.out.println("---------------TreeSet con Comparador de HashCode-------------");
        for (contacto c : agenda) {
            System.out.println(c);
        }
        System.out.println();
    }
}
