package ex3;

public class Animal {
	private String nom;
    private String type;
    private String comportement;
    
    public Animal(String nom, String type, String comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}
    
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComportement() {
		return comportement;
	}

	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", comportement=" + comportement + "]";
	}

	
    
}
