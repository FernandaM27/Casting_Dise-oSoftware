/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlescasting;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetosnegocio.Agente;
import objetosnegocio.Casting;
import objetosnegocio.Cliente;

/**
 *
 * @author Alfonso Sempoalt
 */
public class FNegocios implements INegocio {

    private ControlAgentes controlAgentes;
    private ControlCastings controlCastings;
    private ControlClientes controlClientes;

    FNegocios() {
    }

    private ControlAgentes getControlAgentes() {
        if (this.controlAgentes != null) {
            return controlAgentes;
        } else {
            this.controlAgentes = new ControlAgentes();
            return this.controlAgentes;
        }
    }

    private ControlClientes getControlClientes() {
        if (this.controlClientes != null) {
            return controlClientes;
        } else {
            this.controlClientes = new ControlClientes();
            return this.controlClientes;
        }
    }

    private ControlCastings getControlCastings() {
        if (this.controlCastings != null) {
            return controlCastings;
        } else {
            this.controlCastings = new ControlCastings();
            return this.controlCastings;
        }
    }

    @Override
    public List<Casting> buscarCastings(Casting c) {
        return this.getControlCastings().buscarCastings(c);
    }

    @Override
    public List<Agente> buscarAgentes() {
        return this.getControlAgentes().regresarTodos();
    }

    @Override
    public List<Cliente> buscarClientes() {
        return this.getControlClientes().regresarTodos();
    }

    @Override
    public List<Casting> buscarCastingNombre(String nombre) {
        return this.getControlCastings().buscarCastingNombre(nombre);
    }

    @Override
    public List<Cliente> buscarClienteNombre(String nombre) {
        return this.getControlClientes().buscarClienteNombre(nombre);
    }

    @Override
    public List<Agente> buscarAgenteNombre(String nombre) {
        return this.getControlAgentes().buscarAgenteNombre(nombre);
    }

    @Override
    public boolean guardarCasting(Casting casting) {
        try {
            return this.getControlCastings().guardarCasting(casting);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean guardarCliente(Cliente cliente) {
        return this.getControlClientes().guardarCliente(cliente);
    }

    @Override
    public boolean guardarAgente(Agente agente) {
        return this.getControlAgentes().guardarAgente(agente);
    }

    @Override
    public boolean verificarCliente(Cliente cliente) {
        return this.getControlClientes().verificarEntidad(cliente);
    }

    @Override
    public boolean verificarAgente(Agente agente) {
        return this.getControlAgentes().guardarAgente(agente);
    }

    @Override
    public boolean verificarCasting(Casting casting) {
        return this.getControlCastings().verificarCasting(casting);
    }

    @Override
    public Agente buscarAgente(Long id) {
        return this.getControlAgentes().buscarAgente(id);
    }

    @Override
    public Cliente buscarCliente(Long id) {
        return this.getControlClientes().buscarCliente(id);
    }

    @Override
    public Casting buscarCasting(Long id) {
        return this.getControlCastings().buscarCasting(id);
    }


}
