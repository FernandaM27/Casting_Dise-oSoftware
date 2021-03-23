/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosnegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alfonso Sempoalt
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Casting")
@DiscriminatorColumn(name = "tipo")
public class Casting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCasting",length = 11)
    protected Long id;
    @Column(name="nombre",length = 60)
    protected String nombre;
    @Column(name="descripcion",length = 60)
    protected String descripcion;
    @Temporal(TemporalType.DATE)
    @Column(name="fechaContratacion")
    protected Date fechaContratacion;   
    @JoinColumn(name = "idcliente")
    @ManyToOne(optional = false)
    protected Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "casting")
    protected List<Fase> fases;
    @Column(name = "coste", length = 20)
    protected Float coste;

    public Casting() {
        this.fases=new ArrayList<>();
    }

    public Casting( String nombre, String descripcion, Date fechaContratacion, Cliente cliente, List<Fase> fases) {
        this();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaContratacion = fechaContratacion;
        this.cliente = cliente;
        this.fases = fases;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void setFases(List<Fase> fases) {
        this.fases = fases;
    }

    public void agregarFase(Fase fase){
        this.fases.add(fase);
    }
      
    public void eliminarFase(Fase fase){
        this.fases.remove(fase);
    }
    
    public boolean verificarCantidadFases(){
        if(this.fases.size()>1){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarFase(Date fecha){
        for (Fase fase1 : fases) {
            if(fase1.getFechaInicio().equals(fecha)){
                return true;
            }
        }
        return false;
    }

    public Float getCoste() {
        return coste;
    }

    public void setCoste(Float coste) {
        this.coste = coste;
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
        if (!(object instanceof Casting)) {
            return false;
        }
        Casting other = (Casting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "negocio.Casting[ id=" + id + " ]";
    }
    
    public Object[] toArray() {
        return new Object[]{
            this.nombre,
            this.descripcion,
            this.fechaContratacion,
            this.cliente.getNombre()
        };
    }
}
