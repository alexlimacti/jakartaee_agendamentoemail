package com.indeas.servicos;

import com.indeas.dao.AgendamentoEmailDAO;
import com.indeas.entidade.AgendamentoEmail;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class AgendamentoEmailServico {

    @Inject
    private AgendamentoEmailDAO agendamentoEmailDAO;

    public List<AgendamentoEmail> listar(){
        return agendamentoEmailDAO.listar();
    }
}
