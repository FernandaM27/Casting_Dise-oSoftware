
package controlescasting;

import java.util.List;
import objetosnegocio.Agente;
import objetosnegocio.Casting;
import objetosnegocio.Cliente;

/**
 *
 * @author Alfonso Sempoalt
 */
public interface INegocio {
    //buscartodos
    public List<Casting> buscarCastings(Casting casting);

    public List<Agente> buscarAgentes();

    public List<Cliente> buscarClientes();
    //nombrebuscar
    public List<Casting> buscarCastingNombre(String nombre);
    public List<Cliente> buscarClienteNombre(String nombre);
    public List<Agente> buscarAgenteNombre(String nombre);
    //guardar
    public boolean guardarCasting(Casting casting);
    public boolean guardarCliente(Cliente cliente);
    public boolean guardarAgente(Agente agente);
    //existencia
    public boolean verificarCliente(Cliente cliente);
    public boolean verificarAgente(Agente agente);
    public boolean verificarCasting(Casting casting);
    //buscar entidad 
    public Agente buscarAgente(Long id);
    public Cliente buscarCliente(Long id);
    public Casting buscarCasting(Long id);
}
