/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosnegocio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author Alfonso Sempoalt
 */
@Entity
@DiscriminatorValue(value="Presencial")
public class Presencial extends Casting implements Serializable {

    private static final long serialVersionUID = 1L;
    @JoinColumn(name ="idpersona")
    @ManyToOne(optional = false)
    private Agente agente;
    private int numeroPersonas;
    
    public Presencial(){
        super();
    }

    public Presencial(Agente agente) {
        this.agente = agente;
    }

    public Presencial(Agente agente, String nombre, String descripcion, Date fechaContratacion, Cliente cliente, List<Fase> fases,int numero) {
        super( nombre, descripcion, fechaContratacion, cliente, fases);
        this.agente = agente;
        this.numeroPersonas=numero;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presencial)) {
            return false;
        }
        Presencial other = (Presencial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Presencial{" + "agente=" + agente + '}';
    }

     
}
