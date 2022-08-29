
import java.io.Serializable;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class paquete implements Serializable{
private String ip,myip,nick,mensaje;
private HashMap <String,String> personasmapa;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMyip() {
        return myip;
    }

    public void setMyip(String myip) {
        this.myip = myip;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public HashMap<String, String> getPersonasmapa() {
        return personasmapa;
    }

    public void setPersonasmapa(HashMap<String, String> personasmapa) {
        this.personasmapa = personasmapa;
    }



}
