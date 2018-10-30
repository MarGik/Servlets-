package fr.univlyon1.m1if.m1if03;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Init extends HttpServlet {
    public Messages msgs = new Messages();
    public void doGet(HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {


       /* String data = request.getParameter("Info");
        request.setAttribute("xx", data);
      //  request.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
        String msg = "Send data :.... OK!\n";
        request.setAttribute("test",msg + data);


        DateTime nt = new DateTime();
        int date = nt.getDayOfMonth();
        Message firstBean = new Message("Gigi","Salutare!!! sent:"+ date);
        request.setAttribute("firstBean",firstBean);
*/


        msgs.add(new Message("Gigi",(String)request.getParameter("message")));


        request.setAttribute("messages",msgs);

        request.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
