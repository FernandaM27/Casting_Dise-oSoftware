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
import objetosnegocio.Agente;

/**
 *
 * @author Alfonso Sempoalt
 */
class RepositoryAgente extends RepoBase<Agente> {

    @Override
    protected Agente buscarEntidad(Long identidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Agente cTemp = entityManager.find(Agente.class, identidad);
        entityManager.getTransaction().commit();
        entityManager.close();
        return cTemp;
    }

    @Override
    protected boolean guardarEntidad(Agente entidad) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    protected List<Agente> buscarEntidadNombre(String name) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Agente> criteriaQuery = builder.createQuery(Agente.class);
        Root<Agente> root = criteriaQuery.from(Agente.class);
        criteriaQuery = criteriaQuery.select(root).where(builder.like(root.get("nombre"), "%" + name + "%"));
        TypedQuery<Agente> query = entityManager.createQuery(criteriaQuery);
        ArrayList<Agente> agentes = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return agentes;
    }

    @Override
    protected boolean verificarEntidad(Agente entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Agente cTemp = entityManager.find(Agente.class, entidad.getId());
        entityManager.getTransaction().commit();
        entityManager.close();
        return cTemp != null;
    }

    @Override
    protected List<Agente> regresarTodos() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Agente.class));
        Query query = em.createQuery(cq);
        ArrayList<Agente> agentes = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return agentes;
    }

}
