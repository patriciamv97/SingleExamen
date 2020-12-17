package com.cod;

public class Main {
    public static void main(String[] args) {
        if (conectarConNombreUsuario("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (conetarConCorreo()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }

    }

    /**
     * Método de tipo boolean que devuelve el estado de la conxion y nos dice con que usuario nos conectamos
     * @param usuario
     * @return devuelve la comparacion de las direcciones de correo
     */

    public static boolean conectarConNombreUsuario(String usuario) {
        Usuario miUnicaInstancia = Usuario.getInstance();
        System.out.println("Conectando a " + miUnicaInstancia.getDireccionIp() + ", con el usuario " + usuario);
        return Usuario.getInstance().conexion();
    }

    /**
     * Método de tipo boolean que devuelve el estado de la conxion y nos dice con que email nos conectamos
     * @return devuelve la comparacion de las direcciones de correo
     */

    public static boolean conetarConCorreo() {
        Usuario miUnicaInstancia = Usuario.getInstance();
        System.out.println("Conectando a " + miUnicaInstancia.getDireccionIp() + ", con el usuario " + Usuario.getInstance().getEmail());
        return Usuario.getInstance().conexion();
    }
}
