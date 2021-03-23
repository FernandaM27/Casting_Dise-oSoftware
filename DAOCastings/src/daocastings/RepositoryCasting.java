/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocastings;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosnegocio.Casting;

/**
 *
 * @author Alfonso Sempoalt
 */
class RepositoryCasting extends RepoBase<Casting> {

    @Override
    protected Casting buscarEntidad(Long identidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Casting cTemp = entityManager.find(Casting.class, identidad);
        entityManager.getTransaction().commit();
        entityManager.close();
        return cTemp;
    }

    @Override
    protected boolean guardarEntidad(Casting entidad) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    protected List<Casting> buscarEntidadNombre(String name) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Casting> criteriaQuery = builder.createQuery(Casting.class);
        Root<Casting> root = criteriaQuery.from(Casting.class);
        criteriaQuery = criteriaQuery.select(root).where(builder.like(root.get("nombre"), "%" + name + "%"));
        TypedQuery<Casting> query = entityManager.createQuery(criteriaQuery);
        ArrayList<Casting> castings = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return castings;
    }
   
 

    @Override
    protected boolean verificarEntidad(Casting entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Casting> criteriaQuery = builder.createQuery(Casting.class);
        Root<Casting> root = criteriaQuery.from(Casting.class);
        // "%" + + "%"
        criteriaQuery = criteriaQuery.select(root).where(builder.equal(root.get("nombre"),entidad.getNombre()));
        TypedQuery<Casting> query = entityManager.createQuery(criteriaQuery);
        ArrayList<Casting> castings = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return castings.isEmpty();
    }

    @Override
    protected List<Casting> regresarTodos() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Casting.class));
        Query query = em.createQuery(cq);
        ArrayList<Casting> castings = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return castings;
    }

    public List<Casting> buscarCastings(Casting casting) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Query query;
        if(casting.getNombre()==null){
            query = entityManager.createQuery("SELECT c FROM Casting c WHERE c.fechaContratacion= :fechaInicio AND c.id="+casting.getId());
        }else{
            query=  entityManager.createQuery("SELECT c FROM Casting c WHERE c.fechaContratacion= :fechaInicio AND c.nombre LIKE '"+casting.getNombre()+"'");
        }
        
        query.setParameter("fechaInicio", casting.getFechaContratacion());
        List<Casting> p = (List<Casting>)query.getResultList();
        return p;
    }

}
