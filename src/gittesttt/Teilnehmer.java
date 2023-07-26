/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erstes;

import java.io.Serializable;

public class Teilnehmer implements Serializable {

    private String nname;
    private String vname;

    public String getNname() {
        return nname;
    }

    public String getVname() {
        return vname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    @Override
    public String toString() {
        return String.format("Nachname: %s \nVorname: %s", nname, vname);
    }
}
