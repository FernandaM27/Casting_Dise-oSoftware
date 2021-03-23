/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlescasting;

import daocastings.FDatos;
import daocastings.IDatos;
import daocastings.fabrica;
import java.util.List;
import objetosnegocio.Cliente;

/**
 *
 * @author Alfonso Sempoalt
 */
 class ControlClientes {
   private IDatos datos= fabrica.fabricaD();
   
   public Cliente buscarCliente(Long idcliente){
       return datos.buscarCliente(idcliente);
   }
   
   public boolean guardarCliente(Cliente cliente){
       return datos.guardarCliente(cliente);
   }
   
   public List<Cliente> regresarTodos(){
       return datos.buscarClientes();
   }
   
   public List<Cliente> buscarClienteNombre(String nombre){
       return datos.buscarClienteNombre(nombre);
   }
   
   public boolean verificarEntidad(Cliente cliente){
       return datos.verificarCliente(cliente);
   }
  
}
