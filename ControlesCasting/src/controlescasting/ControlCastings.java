/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlescasting;

import daocastings.IDatos;
import daocastings.fabrica;
import java.util.List;
import objetosnegocio.Casting;

/**
 *
 * @author Alfonso Sempoalt
 */
class ControlCastings {

    private IDatos datos = fabrica.fabricaD();

    public boolean guardarCasting(Casting casting) throws Exception {
        if (datos.verificarCasting(casting)) {
            datos.guardarCasting(casting);
            return true;
        }else{ 
            throw new Exception("Ese nombre de Casting ya existe");
        }
     }

    public Casting buscarCasting(Long idcasting) {
        return datos.buscarCasting(idcasting);
    }

    public List<Casting> buscarCastingNombre(String nombre) {
        return datos.buscarCastingNombre(nombre);
    }

    public boolean verificarCasting(Casting casting) {
        return datos.verificarCasting(casting);
    }

    public List<Casting> buscarCastings(Casting casting) {
        return datos.buscarCastings(casting);
    }
    
}
