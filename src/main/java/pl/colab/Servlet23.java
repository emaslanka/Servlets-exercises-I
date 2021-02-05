package pl.colab;



import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@WebServlet(name = "Servlet23", value = "/Servlet23")
public class Servlet23 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Path path = Paths.get("/home/eve/CodersLab/Servlets-exercises-I/oop.txt");

        try(Scanner skan = new Scanner(path)){

        while (skan.hasNext()) {
            String language = skan.nextLine();
            response.getWriter().println(language + "br/");
        }

        }
        catch (NoSuchFileException e){}
        response.getWriter().println("FIle not found");

    }


}
