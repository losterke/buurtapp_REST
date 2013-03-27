/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author tim
 */
public class User {
    
    private int id;
    private String naam;
    private String voornaam;
    private String adres;
    private byte[] foto;
    private int punten;

    public User(int i, String n, String vn, String a, byte[] f, int ptn) {
        setId(i);
        setNaam(n);
        setVoornaam(vn);
        setAdres(a);
        setFoto(f);
        setPunten(ptn);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }
        
}
