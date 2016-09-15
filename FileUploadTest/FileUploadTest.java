package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.oreilly.servlet.*;

public class FileUploadTest extends HttpServlet
{
     public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
     {  
                MultipartRequest mrp=new MultipartRequest(req,getServletContext().getRealPath("File"),5*1024*1024);
                res.setContentType("text/html");
                PrintWriter out=res.getWriter();
                out.println("<html><body>");
                out.println("FileUpload");
                out.println("</body></html>");
     }
}