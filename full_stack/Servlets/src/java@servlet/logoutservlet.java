
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public logout() {
        super();
      
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		
		String stmtStr = "<html><body style='text-align: center; background-color: #f4f4f4; padding: 20px; border: 2px solid #ddd; border-radius: 10px; height:100px; width:80%; margin: 0 auto; margin-top :10px; '>"
				+ "<h2  style=\"color: red; font-weight: bold; \">Logout complete. Your financial information is secure. For any inquiries, reach out to our customer support</h2>"
				+ "<form action='LoginServlet' method='post' style='margin-top: 20px;'>\r\n"
			    + " <input type='submit' value='Login' style='padding: 10px; background-color: #4CAF50; color: white; border: none; border-radius: 5px; cursor: pointer;'>\r\n"
			    + "</form> "
			    + "</body></html>";

		response.getWriter().append(stmtStr);
		
	}

    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}






