/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Modelo {
    public ArrayList verModelos(String marca) {
        ArrayList modelos=new ArrayList();
        
        switch (marca)
        {
            case "audi":
                 modelos.add("A4");
                 modelos.add("A5");
                 modelos.add("A8");
                 modelos.add("Q5");
                break;
            case "opel":
                modelos.add("Astra");
                modelos.add("Corsa");
                modelos.add("Mokka");
                modelos.add("Zafira");
                break;
            case "ford":
                modelos.add("Mondeo");
                modelos.add("Focus");
                modelos.add("Cmax");
                modelos.add("Kuga");
                break;
            case "seat":
                modelos.add("Toledo");
                modelos.add("Ibiza");
                modelos.add("Leon");
                modelos.add("Altea");
                break;
            default:
                modelos.add("No Disponible");
        }
        
        return modelos;
    }
}
