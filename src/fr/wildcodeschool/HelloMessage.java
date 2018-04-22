package fr.wildcodeschool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloMessage")
public class HelloMessage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("NOM");
        String prenom = request.getParameter("PRENOM");
        String heure = request.getParameter("HEURE");

        String message = "";


        if (heure.startsWith("08")  || heure.startsWith("09") || heure.startsWith("10") || heure.startsWith("11")) {
            message = "Good morning " + prenom + " " + nom + "!!";
        } else if (heure.startsWith("12")  || heure.startsWith("13") || heure.startsWith("14") || heure.startsWith("15")
                || heure.startsWith("16")  || heure.startsWith("17") || heure.startsWith("18") || heure.startsWith("19")){
            message = "Good afternoon " + prenom + " " + nom + "!!";
        } else if (heure.startsWith("20")  || heure.startsWith("21") || heure.startsWith("22") || heure.startsWith("23")
                || heure.startsWith("00")  || heure.startsWith("01") || heure.startsWith("02") || heure.startsWith("03")
                || heure.startsWith("04")  || heure.startsWith("05") || heure.startsWith("06") || heure.startsWith("07")){

            message = "Good night " + prenom + " " + nom + "!!";
        }

        request.setAttribute("message", message);

        this.getServletContext().getRequestDispatcher( "/WEB-INF/hello-message.jsp" ).forward( request, response );

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/hello-form.jsp" ).forward( request, response );
    }
}