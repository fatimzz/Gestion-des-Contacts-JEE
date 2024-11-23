package ModelContact;

public class Contact {

	private String Nom;
	private String Prenom;
	private String Adresse_Mail;
	
	public Contact(String Nom, String Prenom, String Adresse_Mail) {
		// TODO Auto-generated constructor stub
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.Adresse_Mail = Adresse_Mail;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getAdresse_Mail() {
		return Adresse_Mail;
	}
	public void setAdresse_Mail(String adresse_Mail) {
		Adresse_Mail = adresse_Mail;
	}
	
}
