/**
 * Adapter permettant d'utiliser une Cheminee comme un Appareil.
 * La classe Cheminee n'est jamais modifiée.
 */
public class ChemineeAdapter implements Appareil {

    /** la cheminée réelle que l'on adapte */
    private Cheminee cheminee;

    /**
     * Construit un adapter autour d'une cheminée existante.
     * @param cheminee la cheminée à adapter
     */
    public ChemineeAdapter(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    /**
     * Allumer = augmenter l'intensité de 10
     */
    @Override
    public void allumer() {
        this.cheminee.changerIntensite(this.cheminee.getLumiere() + 10);
    }

    /**
     * Eteindre = remettre l'intensité à 0
     */
    @Override
    public void eteindre() {
        this.cheminee.changerIntensite(0);
    }

    @Override
    public String toString() {
        return this.cheminee.toString();
    }
}