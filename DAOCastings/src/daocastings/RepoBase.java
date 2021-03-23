/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocastings;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alfonso Sempoalt
 * @param <T>
 */
public abstract class RepoBase <T>{
    
    protected abstract T buscarEntidad(Long identidad);
    protected abstract boolean guardarEntidad(T entidad);
    protected abstract List<T> buscarEntidadNombre(String name);
    protected abstract boolean verificarEntidad(T entidad);  
    protected abstract List<T> regresarTodos();
    
      public EntityManager createEntityManager(){
          EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("Proyecto_CastingsPU");
          EntityManager em= emFactory.createEntityManager();
          return em;
     }
}
