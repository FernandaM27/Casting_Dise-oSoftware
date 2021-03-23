/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosnegocio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Alfonso Sempoalt
 */
@Entity
@DiscriminatorValue(value = "Agente")
public class Agente extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String RFC;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agente")
    private List<Presencial> presenciales;

    public Agente() {
    }

    public Agente( String RFC, String nombre, String direccion, String CURP, String telefono) {
        super(nombre, direccion, CURP, telefono);
         this.RFC = RFC;
    }

   

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agente)) {
            return false;
        }
        Agente other = (Agente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id+","+nombre;
    }

}
