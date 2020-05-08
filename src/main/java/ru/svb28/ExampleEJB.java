package ru.svb28;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ExampleEJB {

    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;


    public String methodOne(){
        return "methodOneText";
    }

    public List<UserEntity> getListUsers(){
        Query query = entityManager.createQuery("select entity from UserEntity entity");
        System.out.println(query.toString());
        List<UserEntity> list;
        list = query.getResultList();
        return list;

    }
}
