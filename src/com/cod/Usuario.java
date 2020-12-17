package com.cod;

/**
 * @author Patricia Maceiras
 */

public class Usuario {
    private String email = "pepe@danielcastelao.org";
    private String direccionIp = "127.0.0.2";
    private static Usuario instance;

    /**
     * Método constructor Usuario bloqueado con private
     */

    private Usuario() {
    }

    /**
     * Método que crea una instancia si no está ya creada
     * @return instance
     */

    public static Usuario getInstance() {
        if (instance == null)
            instance = new Usuario();
        return instance;
    }

    /**
     * Método de acceso a el atributo privado email de la clase Usuario
     * @return
     */

    public String getEmail() {
        return email;
    }

    /**
     * Método que le da un valor al atributo email de la clase Usuario
     * @param  email
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *  Método de acceso a el atributo privado direccion de la clase Usuario
     * @return direccionIp
     */

    public String getDireccionIp() {
        return direccionIp;
    }

    /**
     * Método que le da un valor al atributo direccionIp de la clase Usuario
     * @param direccionIp
     */

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    /**
     * Método que compara direcciones de correos electronicos
     * @return
     */

    public boolean conexion() {
        return !email.equals("anonymous@danielcastelao.org");
    }


}

