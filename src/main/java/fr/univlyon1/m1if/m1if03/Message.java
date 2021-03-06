package fr.univlyon1.m1if.m1if03;

import org.apache.taglibs.standard.lang.jstl.NullLiteral;

public class Message {
    private final String pseudo;
    private String texte;

    public Message(){
        this.pseudo= null;
        this.texte=null;
    }

    public Message(String pseudo, String texte) {
        this.pseudo = pseudo;
        this.texte = texte;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }


}
