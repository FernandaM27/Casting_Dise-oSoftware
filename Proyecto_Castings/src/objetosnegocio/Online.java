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
 
/**
 *
 * @author Alfonso Sempoalt
 */
@Entity
@DiscriminatorValue(value="Online")
public class Online extends Casting implements Serializable {

    private static final long serialVersionUID = 1L;

    public Online() {
    }

    public Online( String nombre, String descripcion, Date fechaContratacion, Cliente cliente, List<Fase> fases) {
        super( nombre, descripcion, fechaContratacion, cliente, fases);
    }
  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Online)) {
            return false;
        }
        Online other = (Online) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "negocio.Online[ id=" + id + " ]";
    }
    
}
