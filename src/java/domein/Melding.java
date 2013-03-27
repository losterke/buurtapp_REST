/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author tim
 */
public class Melding {
    
    private int id;
    private String type;
    private Double latitude;
    private Double longitude;
    private String beschrijving;
    
    public Melding(int id,String type,Double la, Double lo, String beschrijving){
        setId(id);
        setType(type);
        setLatitude(la);
        setLongitude(lo);
        setBeschrijving(beschrijving);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Id moet > 0");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.trim().equals("")) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Het type van deze melding kan niet leeg zijn.");
        }
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        if (beschrijving != null && !beschrijving.trim().equals("")) {
            this.beschrijving = beschrijving;
        } else {
            throw new IllegalArgumentException("De beschrijving van u melding mag niet leeg zijn.");
        }
    }
    
}
