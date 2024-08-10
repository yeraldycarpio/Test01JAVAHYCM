package org.esfe.servicios.interfaces;

import org.esfe.modelos.CategoriaHYCM;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

 public interface ICategoriaServices {

    Page<CategoriaHYCM>buscarTodosPaginados(Pageable pageable);
    List<CategoriaHYCM> obtenerTodos();

    Optional<CategoriaHYCM> buscarPorId(Integer id);
    CategoriaHYCM crearOEditar(CategoriaHYCM categoriaHYCM);

    void eliminarPorId(Integer id);


     void guardar(CategoriaHYCM categoriaHYCM);
 }
