package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
    
	/**
	 * Complete con su implementación
	 */
        
    String text;
    int likes;
    boolean feat;

    
    
    public WallPostImpl() {
        this.text = "Undefined post";
        this.likes = 0;
        this.feat = false;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLikes() {
        return likes;
    }
    
    public void like(){
        this.likes++;
    }
    
    public void dislike(){
        if (this.likes > 0) {
        	this.likes--;
        }
    }

    public boolean isFeatured() {
        return feat;
    }

    public void toggleFeatured() {
        this.feat = !this.feat;
    }
    
    
         
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
