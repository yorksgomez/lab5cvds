package servlet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.controller.ResponseController;
import servlet.model.Todo;

@WebServlet(urlPatterns = "/apiServlet")

public class ApiServlet extends SampleServlet {
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        ArrayList<Todo> todos = new ArrayList<Todo>();

        try {
            todos.add(Service.getTodo(Integer.valueOf(id)));
            ResponseController.sendSuccessResponse(resp, Service.todosToHTMLTable(todos));    
        } catch (MalformedURLException ex) {
            ResponseController.sendErrorResponse(resp, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "requerimiento inválido");
        } catch (Exception ex) {
            ResponseController.sendErrorResponse(resp, HttpServletResponse.SC_BAD_REQUEST, "requerimiento inválido");    
        }
                
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        ArrayList<Todo> todos = new ArrayList<Todo>();

        try {
            todos.add(Service.getTodo(Integer.valueOf(id)));
            ResponseController.sendSuccessResponse(resp, Service.todosToHTMLTable(todos));    
        } catch (MalformedURLException ex) {
            ResponseController.sendErrorResponse(resp, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "requerimiento inválido");
        } catch (Exception ex) {
            ResponseController.sendErrorResponse(resp, HttpServletResponse.SC_BAD_REQUEST, "requerimiento inválido");    
        }
                
    }

}
