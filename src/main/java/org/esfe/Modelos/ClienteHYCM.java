package org.esfe.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ClienteHYCM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String NombreHYCM;
    private String DireccioHYCM;
    private LocalDate FechaNacimientoHYCM;
    private double SueldoHYCM;
    private byte EstatusHYCM;

    public ClienteHYCM(Long id, String NombreHYCM, String DireccionHYCM, LocalDate FechaNacimientoHYCM,
                       double SueldoHYCM, byte EstatusHYCM) {
        this.id = id;
        this.NombreHYCM = NombreHYCM;
        this.DireccioHYCM = DireccionHYCM;
        this.FechaNacimientoHYCM = FechaNacimientoHYCM;
        this.SueldoHYCM = SueldoHYCM;
        this.EstatusHYCM = EstatusHYCM;
    }

    public ClienteHYCM() {

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

    public String getDireccioHYCM() {
        return DireccioHYCM;
    }

    public void setDireccioHYCM(String direccioHYCM) {
        this.DireccioHYCM = direccioHYCM;
    }

    public LocalDate getFechaNacimientoHYCM() {
        return FechaNacimientoHYCM;
    }

    public void setFechaNacimientoHYCM(LocalDate fechaNacimientoHYCM) {
        this.FechaNacimientoHYCM = fechaNacimientoHYCM;
    }

    public double getSueldoHYCM() {
        return SueldoHYCM;
    }

    public void setSueldoHYCM(double sueldoHYCM) {
        this.SueldoHYCM = sueldoHYCM;
    }

    public byte getEstatusHYCM() {
        return EstatusHYCM;
    }

    public void setEstatusHYCM(byte estatusHYCM) {
        this.EstatusHYCM = estatusHYCM;
    }
}
