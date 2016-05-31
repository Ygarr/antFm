import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FileManagerServlet extends HttpServlet
{
    String msg = "";

    public void init(ServletConfig config)
    {
        msg = "Hello from FileManager!";
    }

    public void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>");
        out.println("FileManager Servlet Home");
        out.println("</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<H3>FileManager Servlet Home</H3><HR>");
        out.println(msg);
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
