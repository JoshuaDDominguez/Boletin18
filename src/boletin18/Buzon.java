package boletin18;

import java.util.ArrayList;

public class Buzon {

    private ArrayList<Correo> correos = new ArrayList<>();

    public ArrayList<Correo> getCorreos() {

        return correos;
    }

    public void setCorreos(ArrayList<Correo> correos) {

        this.correos = correos;
    }

    public int numCorreos() {

        return correos.size();
    }

    public void engade(Correo c) {

        correos.add(c);
    }

    public boolean porLeer() {

        boolean leidos = true;

        for (Correo objeto : correos) {

            if (objeto.isLeido() == false) {

                leidos = false;
                break;
            }
        }

        return leidos;
    }

    public String amosaPrimerNoLeido() {

        String mensaje = "Todos los Correos han sido leidos.";

        for (Correo correo : correos) {

            if (correo.isLeido() == false) {

                correo.setLeido(true);
                mensaje = correo.getMensaje();
                break;
            }
        }

        return mensaje;
    }

    // Muestro el correo en la posicion X de la lista
    public String amosa(int pos) {

        String mensaje = "No existe el correo que quieres visualizar.";

        if (pos > correos.size()) {

        } else {
            correos.get(pos - 1).setLeido(true);
            mensaje = correos.get(pos - 1).getMensaje();
        }

        return mensaje;
    }

    // Elimino el correo en la posicion X de la lista
    public void eliminar(int pos) {

        if (pos > correos.size()) {

            System.out.println("No existe el mensaje que quieres eliminar");
        } else {
            correos.remove(pos - 1);
        }

    }

}
