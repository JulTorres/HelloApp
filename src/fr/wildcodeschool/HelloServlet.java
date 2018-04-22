package fr.wildcodeschool;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/hello-form")
public class HelloServlet extends HttpServlet {

    // récupération de la config
    private ServletConfig cfg;

    public void init(ServletConfig config) throws ServletException {
        cfg = config;
    }

    public ServletConfig getServletConfig() {
        return cfg;
    }


    // méthodes DO*
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("NOM");
        String prenom = request.getParameter("PRENOM");
        String heure = request.getParameter("HEURE");
        String message = "";

/*
        request.setAttribute("HEURE", heure);
*/
        request.setAttribute("message", message);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/hello-form.jsp" ).forward( request, response );

    }
}