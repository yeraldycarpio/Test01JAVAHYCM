package org.esfe.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class ClienteHYCM {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotBlank(message = "El nombre es requerido")
    private String NombreHYCM;

    @NotBlank(message = "La direccion es requerida")
    private String DireccionHYCM;

    @NotBlank(message = "La fecha de nacimiento es requerida")
    private Date FechaNacimientoHYCM;

    @NotBlank(message = "El sueldo es requerido")
    private Double SueldoHYCM;

    @NotBlank(message = "El estatus es requerido")
    private Byte EstatusHYCM;

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

    public @NotBlank(message = "La direccion es requerida") String getDireccionHYCM() {
        return DireccionHYCM;
    }

    public void setDireccionHYCM(@NotBlank(message = "La direccion es requerida") String direccionHYCM) {
        DireccionHYCM = direccionHYCM;
    }

    public @NotBlank(message = "La fecha de nacimiento es requerida") Date getFechaNacimientoHYCM() {
        return FechaNacimientoHYCM;
    }

    public void setFechaNacimientoHYCM(@NotBlank(message = "La fecha de nacimiento es requerida") Date fechaNacimientoHYCM) {
        FechaNacimientoHYCM = fechaNacimientoHYCM;
    }

    public @NotBlank(message = "El sueldo es requerido") Double getSueldoHYCM() {
        return SueldoHYCM;
    }

    public void setSueldoHYCM(@NotBlank(message = "El sueldo es requerido") Double sueldoHYCM) {
        SueldoHYCM = sueldoHYCM;
    }

    public @NotBlank(message = "El estatus es requerido") Byte getEstatusHYCM() {
        return EstatusHYCM;
    }

    public void setEstatusHYCM(@NotBlank(message = "El estatus es requerido") Byte estatusHYCM) {
        EstatusHYCM = estatusHYCM;
    }
}
