package com.example.arnoldo.singleton;

/**
 * Created by arnoldo on 15/05/18.
 */

public class Logger {
    private static Logger log;//se crea esta variable estatica para que no este cambiando
    //osea siempre sera la misma una ves ya creada
    private String mensaje;//creo la variable para guardar el mensaeje que le envio de la main


    private Logger() {//constructor privado para que solo esta clase pueda hacer uso de el

    }

    public static Logger getInstance() {// metodo cr6eado para obtener la instancia
        if (log == null) {//si la instancia de la bariable esta bacia que realize esta accion
            log = new Logger();
        }
        return log;
    }
    public void setMensaje(String mensajedelaMain){//metodo que nos permitira enviar el mnsaje
        this.mensaje=mensajedelaMain;
    }
    //creo otro metodo para obtenerlo y poder hacer uso de el
    public String getMensaje(){
        return mensaje;
    }
}

