package deqo.agai.simpleStack;

public class Item {
    // Attribut item
    private Object objet;

    // Constructeur
    public Item(Object object) {
        this.objet = object;
    }

    // Accesseurs
    public Object getObjet() {
        return this.objet;
    }

    public void setObjet(Object obj) {
        this.objet = obj;
    }
}
