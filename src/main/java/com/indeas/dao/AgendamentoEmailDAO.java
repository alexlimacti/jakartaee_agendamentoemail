package com.indeas.dao;

import com.indeas.entidade.AgendamentoEmail;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class AgendamentoEmailDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<AgendamentoEmail> listar(){
        return entityManager.createQuery("Select ae from AgendamentoEmail ae", AgendamentoEmail.class).getResultList();
    }

}
