package org.esfe.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "categoria")
public abstract class CategoriaHYCM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotBlank(message = "El nombre es requerido")
    private String NombreHYCM;

    @NotBlank(message = "La descripcion es requerida")
    private String DescripcionHYCM;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public @NotBlank(message = "El nombre es requerido") String getNombreHYCM() {
        return NombreHYCM;
    }

    public void setNombreHYCM(@NotBlank(message = "El nombre es requerido") String nombreHYCM) {
       this.NombreHYCM = nombreHYCM;
    }

    public @NotBlank(message = "La descripcion es requerida") String getDescripcionHYCM() {
        return DescripcionHYCM;
    }

    public void setDescripcionHYCM(@NotBlank(message = "La descripcion es requerida") String descripcionHYCM) {
       this.DescripcionHYCM  = descripcionHYCM;
    }

    public abstract Page<CategoriaHYCM> buscarTodosPaginados(Pageable pageable);

    public abstract List<CategoriaHYCM> obtenerTodos();

    public abstract Optional<CategoriaHYCM> buscarPorId(Integer id);

    public abstract CategoriaHYCM crearOEditar(CategoriaHYCM categoriaHYCM);

    public abstract void eliminarPorId(Integer id);
}
