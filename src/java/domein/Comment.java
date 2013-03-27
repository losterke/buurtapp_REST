/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import DAO.UserDAO;

/**
 *
 * @author tim
 */
public class Comment {
    
    private int id;
    private String inhoud;
    private User auteur;
    private UserDAO udao = UserDAO.getInstance();
    
    public Comment(int i, String in, int a) {
        setId(i);
        setInhoud(in);
        setAuteur(udao.getUser(a));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInhoud() {
        return inhoud;
    }

    public void setInhoud(String inhoud) {
        this.inhoud = inhoud;
    }

    public User getAuteur() {
        return auteur;
    }

    public void setAuteur(User auteur) {
        this.auteur = auteur;
    }
    
}
