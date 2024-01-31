package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Animal> animaux;
	
	public Zoo(String nom){
		this.nom = nom;
		this.animaux = new ArrayList<>();
		
	}
	
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		Animal nouvelAnimal = new Animal(nomAnimal, typeAnimal, comportement);
		animaux.add(nouvelAnimal);
	}
	
	/** Affiche liste animaux
	 * @return les animaux du zoo
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux) {
			System.out.println(animal.getNom()+ " (" + animal.getType()+ ") - Comportement : " + animal.getComportement());
		}
	}
	
	/** Taille
	 * @return taille zoo 
	 */
	public int taille() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
