package com.indeas.servlet;

import com.indeas.servicos.AgendamentoEmailServico;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("emails")
public class AgendamentoEmailServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Inject
    private AgendamentoEmailServico agendamentoEmailServico;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        agendamentoEmailServico.listar().forEach(resultado -> printWriter.println("Os emails disponíveis são: " + resultado));
    }
}
