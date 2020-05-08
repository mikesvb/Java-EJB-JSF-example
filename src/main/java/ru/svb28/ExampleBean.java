package ru.svb28;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class ExampleBean {

    @EJB
    private ExampleEJB exampleEJB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "namesuper";

    public List<UserEntity> getListUsers(){
        return exampleEJB.getListUsers();
    }
}
