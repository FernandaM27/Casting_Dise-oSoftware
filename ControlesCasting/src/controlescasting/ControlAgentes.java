
package controlescasting;

import daocastings.IDatos;
import daocastings.fabrica;
import java.util.List;
import objetosnegocio.Agente;

/**
 *
 * @author Alfonso Sempoalt
 */
 class ControlAgentes {

    public IDatos datos= fabrica.fabricaD();
    
    public Agente buscarAgente(Long identidad){
        return this.datos.buscarAgente(identidad);
    }
    
    public boolean guardarAgente(Agente agente){
        return this.datos.guardarAgente(agente);
    }
    
    public List<Agente> buscarAgenteNombre(String nombre){
        return this.datos.buscarAgenteNombre(nombre);
    }

    public boolean verificarAgente(Agente agente){
        return this.datos.verificarAgente(agente);
    } 
    
    public List<Agente> regresarTodos(){
        return this.datos.buscarAgentes();
    }
     
    
}
