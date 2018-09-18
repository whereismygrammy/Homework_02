import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@WebServlet(name = "Servlet15", urlPatterns = "/Servlet15")
public class Servlet15 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0 ; i < 10 ; i++){
            int temp = rd.nextInt(100)+1;
            integerArrayList.add(temp);
            response.getWriter().println(temp);
        }

        response.getWriter().println("\n --- Sort --- \n");


        Collections.sort(integerArrayList);

        for (int i : integerArrayList){
            response.getWriter().println(i);
        }


    }
}
