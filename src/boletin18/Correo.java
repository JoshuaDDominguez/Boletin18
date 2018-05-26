package boletin18;

public class Correo {

    private String mensaje;
    private boolean leido;

    public Correo(String mensaje) {

        this.mensaje = mensaje;
        this.leido = false;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
}
