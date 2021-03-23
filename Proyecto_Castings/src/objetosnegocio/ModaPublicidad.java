/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosnegocio;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
 

/**
 *
 * @author Alfonso Sempoalt
 */
@Entity
@DiscriminatorValue(value = "ModaPublicidad")
public class ModaPublicidad extends Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    public ModaPublicidad( String nombre, String direccion, String telefono, String personaContacto) {
        super( nombre, direccion, telefono, personaContacto);
    }

    public ModaPublicidad() {
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
        if (!(object instanceof ModaPublicidad)) {
            return false;
        }
        ModaPublicidad other = (ModaPublicidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id+", "+nombre;
    }
    
}
