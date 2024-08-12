package org.esfe.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CategoriaHYCM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String NombreHYCM;
    private String DescripcionHYCM;


    public CategoriaHYCM() {

    }
    public CategoriaHYCM(Long id, String nombreHYCM, String descripcionHYCM) {
        this.id = id;
        this.NombreHYCM = nombreHYCM;
        this.DescripcionHYCM = descripcionHYCM;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreHYCM() {
        return NombreHYCM;
    }
    public void setNombreHYCM(String nombreHYCM) {
        this.NombreHYCM = nombreHYCM;
    }
    public String getDescripcionHYCM() {
        return DescripcionHYCM;
    }
    public void setDescripcionHYCM(String descripcionHYCM) {
        this.DescripcionHYCM = descripcionHYCM;
    }
}