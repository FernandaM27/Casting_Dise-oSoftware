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
import objetosnegocio.Cliente;

/**
 *
 * @author Alfonso Sempoalt
 */
class RepositoryCliente extends RepoBase<Cliente> {

    @Override
    protected Cliente buscarEntidad(Long identidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cTemp = entityManager.find(Cliente.class, identidad);
        entityManager.getTransaction().commit();
        entityManager.close();
        return cTemp;
    }

    @Override
    protected boolean guardarEntidad(Cliente entidad) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    protected List<Cliente> buscarEntidadNombre(String name) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Cliente> criteriaQuery = builder.createQuery(Cliente.class);
        Root<Cliente> root = criteriaQuery.from(Cliente.class);
        criteriaQuery = criteriaQuery.select(root).where(builder.like(root.get("nombre"), "%" + name + "%"));
        TypedQuery<Cliente> query = entityManager.createQuery(criteriaQuery);
        ArrayList<Cliente> clientes = new ArrayList<>(query.getResultList());
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;
    }

    @Override
    protected boolean verificarEntidad(Cliente entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cTemp = entityManager.find(Cliente.class, entidad.getId());
        entityManager.getTransaction().commit();
        entityManager.close();
        return cTemp != null;
    }

    protected boolean asignarCodigo(Cliente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Cliente> regresarTodos() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cliente.class));
        Query query = em.createQuery(cq);
        ArrayList<Cliente> clientes = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return clientes;
    }

}
