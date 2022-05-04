import somePackage.Cart;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();



//        Cart cart = (Cart) session.getAttribute("cart");
//        String name = req.getParameter("name");
//        int quantity = Integer.parseInt(req.getParameter("quantity"));
//        if (cart == null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);

//        Integer count = (Integer) session.getAttribute("count");
//
//        if (count == null) {
//            session.setAttribute("count", 1);
//            count = 1;
//        } else
//            session.setAttribute("count", count + 1);

//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//        PrintWriter pw = resp.getWriter();
//        pw.println("<html>");
//        pw.println("<h1> Your count is: " + count + " <h1>");
        //        pw.println("<h1> Hello, " + name + " " + surname + " </h1>");
//        pw.println("</html>");

//        resp.sendRedirect("/testJsp.jsp");

//        RequestDispatcher dispatcher = req.getRequestDispatcher("/testJsp.jsp");
//        dispatcher.forward(req, resp);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);
    }
}
