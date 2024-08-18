package pe.upeu;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        int nomVec1[] ={1,2,3,4,5,6,7,8,9,10};

        for (int dato:nomVec1) {
            System.out.println(dato);
        }

        Persona nomVec2[] = {new Persona("Juan", "", 'M'),
                new Persona("Pablito", "", 'M')
        };
        System.out.println("Registro de asistencia");
        Scanner leer = new Scanner(System.in);
        for (Persona p:nomVec2){
            System.out.println("Esta presente " + p.nombre + ": ");
            p.setAsis(leer.nextLine());
            p.setFechaAsistencia(new Date());
        }
        System.out.println("Mostrar registro de asistencia");
        for (Persona p:nomVec2){
            System.out.println(p.getNombre() + " - " + p.getAsis() + " - " + p.getFechaAsistencia());
        }
    }
}