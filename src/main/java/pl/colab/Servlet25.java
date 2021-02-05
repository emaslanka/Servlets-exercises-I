package pl.colab;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@WebServlet(name = "Servlet25", value = "/Servlet25")
public class Servlet25 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Integer> randomNUmbers =new ArrayList<>();
        List<Integer>sortedNUmbers = new ArrayList<>();
        Random randomnumber = new Random();
        Integer rand = 0;

        for (int i = 0; i < 10; i++){
            rand = randomnumber.nextInt(100);
            randomNUmbers.add(rand);
        }
        for (Integer element: randomNUmbers
             ) { response.getWriter().println(element);

        }
        //Sorting

        Collections.sort(randomNUmbers);
        response.getWriter().println("Sorted list  <br/>");
        for (Integer element: randomNUmbers
        ) { response.getWriter().println(element);

        }





    }
}