package com.codegym.cms.repository;

import com.codegym.cms.model.Blogs;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blogs> findAll(){
        TypedQuery<Blogs> query = em.createQuery(
                "select c from Blogs c", Blogs.class);

        return query.getResultList();
    }

    @Override
    public Blogs findById(Long id) {
        TypedQuery<Blogs> query = em. createQuery(
                "select c from Blogs c where  c.id=:id", Blogs.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e){
            return  null;
        }
    }

    @Override
    public void save(Blogs model) {
//        if(model.getId() != null){
//            em.merge(model);
//        } else {
            em.persist(model);
        }
//    }

    @Override
    public void remove (Long id){
        Blogs blogs = findById(id);
        if (blogs != null){
            em.remove(blogs);
        }
    }
}
