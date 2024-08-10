package org.esfe.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "departamentotrabajo")
public class DepartamentoTrabajoHYCM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotBlank(message = "El nombre es requerido")
    private String NombreHYCM;

    @NotBlank(message = "El telefono es requerido")
    private String TelefonoHYCM;

    @NotBlank(message = "El jefe es requerido")
    private String JefeHYCM;

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

    public @NotBlank(message = "El telefono es requerido") String getTelefonoHYCM() {
        return TelefonoHYCM;
    }

    public void setTelefonoHYCM(@NotBlank(message = "El telefono es requerido") String telefonoHYCM) {
        TelefonoHYCM = telefonoHYCM;
    }

    public @NotBlank(message = "El jefe es requerido") String getJefeHYCM() {
        return JefeHYCM;
    }

    public void setJefeHYCM(@NotBlank(message = "El jefe es requerido") String jefeHYCM) {
        JefeHYCM = jefeHYCM;
    }
}
