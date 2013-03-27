/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import DAO.UserDAO;
import java.io.File;

/**
 *
 * @author tim
 */
public class Foto {
 
    private int id;
    private File foto;
    private User auteur;
    private UserDAO udao = UserDAO.getInstance();

    public Foto(int i, File file, int a) {
        setId(i);
        setFoto(file);
        setAuteur(udao.getUser(a));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public User getAuteur() {
        return auteur;
    }

    public void setAuteur(User auteur) {
        this.auteur = auteur;
    }
    
    
}
