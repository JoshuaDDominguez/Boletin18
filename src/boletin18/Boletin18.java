package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {

        Buzon buzon1 = new Buzon();

        ArrayList<Correo> correos = new ArrayList<>();

        Correo correo1 = new Correo("Mensaje del Correo 1");
        correos.add(correo1);
        Correo correo2 = new Correo("Mensaje del Correo 2");
        correos.add(correo2);
        Correo correo3 = new Correo("Mensaje del Correo 3");
        correos.add(correo3);
        Correo correo4 = new Correo("Mensaje del Correo 4");
        correos.add(correo4);
        Correo correo5 = new Correo("Mensaje del Correo 5");
        correos.add(correo5);
        Correo correo6 = new Correo("Mensaje del Correo 6");
        correos.add(correo6);
        Correo correo7 = new Correo("Mensaje del Correo 7");
        correos.add(correo7);

        String cargarCorreos = "No";

        try {

            cargarCorreos = JOptionPane.showInputDialog("Han llegado nuevos correos. ¿Deseas cargarlos? (Si | No)");
        } finally {

            if (cargarCorreos == null) {
                cargarCorreos = "No";
            }
        }

        switch (cargarCorreos) {
            case "Si":
                buzon1.setCorreos(correos);
                break;
            case "No":
                break;
            default:
                buzon1.setCorreos(correos);
                break;
        }

        boolean exit = false;

        do {

            String opcion = "7";

            try {
                opcion = JOptionPane.showInputDialog("Opciones:\n "
                        + "1) Mostrar Nº de Correos\n "
                        + "2) Añadir un nuevo Correo\n"
                        + "3) Mostrar si hay mensajes sin leer\n"
                        + "4) Mostrar primer correo sin leer\n"
                        + "5) Mostrar un Correo\n"
                        + "6) Eliminar un Correo\n"
                        + "7) Salir");
            } finally {

                if (opcion == null) {
                    opcion = "7";
                }
            }

            switch (opcion) {
                case "1":

                    System.out.format("Hay %d correos en el buzon\n", buzon1.getCorreos().size());
                    break;
                case "2":

                    Correo correo8 = new Correo(JOptionPane.showInputDialog("Escribe el mensaje del nuevo correo"));
                    buzon1.engade(correo8);
                    break;
                case "3":

                    if (buzon1.porLeer() == false) {

                        System.out.println("Hay mensajes sin leer.");
                    } else {

                        System.out.println("Todos los mensajes han sido leidos.");
                    }
                    break;
                case "4":

                    System.out.println("Mensaje --> " + buzon1.amosaPrimerNoLeido());
                    break;
                case "5":

                    System.out.println(buzon1.amosa(Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de mensaje que quieras leer."))));
                    break;
                case "6":

                    buzon1.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de mensaje que quieras eliminar.")));
                    break;
                case "7":

                    exit = true;
                    break;
            }

        } while (exit == false);

    }

}
