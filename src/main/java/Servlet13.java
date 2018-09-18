import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "Servlet13", urlPatterns = "/Servlet13")
public class Servlet13 extends javax.servlet.http.HttpServlet {


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.getWriter().println("Shut this");

        try {
            Path path = Paths.get("/home/tom/workspace/Homework_02/src/main/oop.txt");
            List<String> list = Files.readAllLines(path);

            for (String s : list) {
                response.getWriter().println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
