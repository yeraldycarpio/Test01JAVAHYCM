package org.esfe.servicios.implementacion;

import org.esfe.modelos.CategoriaHYCM;
import org.esfe.repositorios.ICategoriaRepository;
import org.esfe.servicios.interfaces.ICategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServices implements ICategoriaServices {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Override
    public Page<CategoriaHYCM> buscarTodosPaginados(Pageable pageable) {
        return categoriaRepository.findAll(pageable);
    }

    @Override
    public List<CategoriaHYCM> obtenerTodos() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<CategoriaHYCM> buscarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public CategoriaHYCM crearOEditar(CategoriaHYCM categoriaHYCM) {
        return categoriaRepository.save(categoriaHYCM);
    }

    @Override
    public void eliminarPorId(Integer id) {
    categoriaRepository.deleteById(id);
    }

    @Override
    public void guardar(CategoriaHYCM categoriaHYCM) {

    }
}
