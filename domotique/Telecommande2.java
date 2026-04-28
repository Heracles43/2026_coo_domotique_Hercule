import java.util.*;


public class Telecommande {

    private List<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil a) {
        this.appareils.add(a);
    }

    public void ajouterLampe(Lampe lampe) {
        this.appareils.add(lampe);
    }

    public void activerAppareil(int indice) {
        if (indice >= 0 && indice < this.appareils.size())
            this.appareils.get(indice).allumer();
    }

 
    public void activerLampe(int indice) { activerAppareil(indice); }

    public void desactiverAppareil(int indice) {
        if (indice >= 0 && indice < this.appareils.size())
            this.appareils.get(indice).eteindre();
    }

  
    public void desactiverLampe(int indice) { desactiverAppareil(indice); }

    public void activerTout() {
        for (int i = 0; i < this.appareils.size(); i++)
            this.activerAppareil(i);
    }

   
    public int getNombre() {
        return this.appareils.size();
    }

    public Appareil getAppareil(int indice) {
        if (indice >= 0 && indice < this.appareils.size())
            return this.appareils.get(indice);
        return null;
    }

    public Lampe getLampe(int indice) {
        Appareil a = getAppareil(indice);
        if (a instanceof Lampe) return (Lampe) a;
        return null;
    }

    public String toString() {
        String descriptif = "";
        for (int i = 0; i < this.appareils.size(); i++) {
            descriptif += i + "-" + this.appareils.get(i) + "\n";
        }
        return descriptif;
    }
}
