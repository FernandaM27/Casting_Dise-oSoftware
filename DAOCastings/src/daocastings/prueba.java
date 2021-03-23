/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocastings;

import java.util.GregorianCalendar;
import objetosnegocio.Casting;

/**
 *
 * @author Dany
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IDatos i= fabrica.fabricaD();
        Casting c= new Casting();
        c.setId(1l);
        c.setFechaContratacion(new GregorianCalendar(2020,4, 2).getTime());
        System.out.println(i.buscarCastings(c));
    }
    
}
