package ContactServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ModelContact.Contact;

/**
 * Servlet implementation class Contact_srvl
 */
@WebServlet("/Contact_srvl")
public class Contact_srvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Contact> ContactList = new ArrayList<>(); //création d'une liste des contacts.
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact_srvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Nom = request.getParameter("Nom");
		String Prenom = request.getParameter("Prenom");
		String Adresse_Mail = request.getParameter("Adresse Mail");
		
		Contact contact = new Contact(Nom,Prenom,Adresse_Mail); 
		ContactList.add(contact); //Ajout du contavt à la liste.
		
		response.sendRedirect("ContactList.jsp");
		/**
		contact.setNom(Nom);
		contact.setPrenom(Prenom);
		contact.setAdresse_Mail(Adresse_Mail);
		**/
		
		
		doGet(request, response);
	}

}
