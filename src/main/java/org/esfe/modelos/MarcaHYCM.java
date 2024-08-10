package org.esfe.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "marca")
public class MarcaHYCM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotBlank(message = "El nombre es requerido")
    private String NombreHYCM;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public @NotBlank(message = "El nombre es requerido") String getNombreHYCM() {
        return NombreHYCM;
    }

    public void setNombreHYCM(@NotBlank(message = "El nombre es requerido") String nombreHYCM) {
        NombreHYCM = nombreHYCM;
    }
}

