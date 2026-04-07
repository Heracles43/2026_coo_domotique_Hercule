

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * classe qui permet de tester telecommande
 */
public class TestTelecommande {

	/**
	 * verifie qu'on peut ajouter une lampe
	 */
	@Test
	public void testAjouter() {
		Telecommande telecommande=new Telecommande();
		Lampe nouvelleLampe = new Lampe("test");
		telecommande.ajouterLampe(nouvelleLampe);
		assertEquals("il devrait y avoir une lampe",telecommande.getLampe(0),nouvelleLampe);
	}
	
	/**
	 * verifie qu'on peut ajouter une lampe
	 */
	@Test
	public void testVide() {
		Telecommande telecommande=new Telecommande();
		assertEquals("il ne devrait y avoir rien",telecommande.getLampe(0),null);
	}
	
	/**
	 * verifie qu'on peut allumer une lampe
	 */
	@Test
	public void testAllumer() {
		Telecommande telecommande=new Telecommande();
		telecommande.ajouterLampe(new Lampe("test"));
		telecommande.activerLampe(0);
		boolean lampeAllumee = telecommande.getLampe(0).isAllume();
		assertTrue("la lampe devrait etre allumee",lampeAllumee);
	}
	
	/**
	 * verifie qu'on peut allumer une lampe hors du tableau
	 */
	@Test
	public void testAllumerHorsTableau() {
		Telecommande telecommande=new Telecommande();
		telecommande.ajouterLampe(new Lampe("test"));
		telecommande.activerLampe(1);
		boolean lampeAllumee = telecommande.getLampe(0).isAllume();
		assertTrue("la lampe devrait rester eteinte",!lampeAllumee);
	}
	public void testAllumerCheminee() {
    Telecommande telecommande = new Telecommande();
    Cheminee c = new Cheminee();
    telecommande.ajouterAppareil(new ChemineeAdapter(c));
    telecommande.activerAppareil(0);
    assertEquals("la cheminee devrait avoir une intensite de 10", 10, c.getLumiere());
    }
	public void testEteindreCheminee() {
    Telecommande telecommande = new Telecommande();
    Cheminee c = new Cheminee();
    telecommande.ajouterAppareil(new ChemineeAdapter(c));
    telecommande.activerAppareil(0); 
    telecommande.desactiverAppareil(0);
    assertEquals("la cheminee devrait etre eteinte", 0, c.getLumiere());
    }


}
