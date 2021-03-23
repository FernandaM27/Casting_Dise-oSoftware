/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocastings;

import java.util.List;
import objetosnegocio.Agente;
import objetosnegocio.Casting;
import objetosnegocio.Cliente;
 
/**
 *
 * @author Alfonso Sempoalt
 */
public class FDatos implements IDatos {
    private RepositoryCasting repositoryCasting;
    private RepositoryAgente repositoryAgente;
    private RepositoryCliente repositoryCliente;
     
    private RepositoryCasting getRepositoryCasting() {
        if(this.repositoryCasting!=null){
            return repositoryCasting;
        }else{
            this.repositoryCasting= new RepositoryCasting();
            return this.repositoryCasting;
        }
    }

    private RepositoryAgente getRepositoryAgente() {
        if(this.repositoryAgente!=null){
            return this.repositoryAgente;
        }else{
            this.repositoryAgente = new RepositoryAgente();
            return this.repositoryAgente;
        }
    }

    private RepositoryCliente getRepositoryCliente() {
        if(this.repositoryCliente!=null){
            return repositoryCliente;
        }else{
            this.repositoryCliente= new RepositoryCliente();
            return this.repositoryCliente;
        }
    }

    @Override
    public List<Casting> buscarCastings(Casting casting) {
//        return this.getRepositoryCasting().regresarTodos();
        return this.getRepositoryCasting().buscarCastings(casting);
        
    }

    @Override
    public List<Agente> buscarAgentes() {
       return this.getRepositoryAgente().regresarTodos();
    }

    @Override
    public List<Cliente> buscarClientes() {
      return  this.getRepositoryCliente().regresarTodos();
    }

    @Override
    public List<Casting> buscarCastingNombre(String nombre) {
       return this.getRepositoryCasting().buscarEntidadNombre(nombre);
    }

    @Override
    public List<Cliente> buscarClienteNombre(String nombre) {
        return this.getRepositoryCliente().buscarEntidadNombre(nombre);
    }

    @Override
    public List<Agente> buscarAgenteNombre(String nombre) {
        return this.getRepositoryAgente().buscarEntidadNombre(nombre);
    }
    
    @Override
    public boolean guardarCasting(Casting casting) {
        return this.getRepositoryCasting().guardarEntidad(casting);
    }

    @Override
    public boolean guardarCliente(Cliente cliente) {
        return this.getRepositoryCliente().guardarEntidad(cliente);
    }

    @Override
    public boolean guardarAgente(Agente agente) {
        return this.getRepositoryAgente().guardarEntidad(agente);
    }

    @Override
    public boolean verificarCliente(Cliente cliente) {
        return this.getRepositoryCliente().verificarEntidad(cliente);
    }

    @Override
    public boolean verificarAgente(Agente cliente) {
        return this.getRepositoryAgente().verificarEntidad(cliente);
    }

    @Override
    public boolean verificarCasting(Casting cliente) {
        return this.getRepositoryCasting().verificarEntidad(cliente);
    }

    @Override
    public Agente buscarAgente(Long id) {
        return this.getRepositoryAgente().buscarEntidad(id);
    }

    @Override
    public Cliente buscarCliente(Long id) {
        return this.getRepositoryCliente().buscarEntidad(id);
    }

    @Override
    public Casting buscarCasting(Long id) {
        return this.getRepositoryCasting().buscarEntidad(id);
    }

    


     

}
