package PresentationLayer;

import DataAccesLayer.ActorDA;
import DataAccesLayer.IDAL;
import DataAccesLayer.TMPmocks.ArtistGenerator;
import DataAccesLayer.TMPmocks.IGenerator;
import Models.Artist;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class ArtistServlet extends javax.servlet.http.HttpServlet implements Filter{


   private IDAL actorDA = new ActorDA();

    public void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String test = "annemieke is een lekkerding";
        request.setAttribute("bla", test);
        try {
             request.getRequestDispatcher("index.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
