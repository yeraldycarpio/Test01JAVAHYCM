package org.esfe.Services;

import jakarta.persistence.Id;
import org.esfe.Modelos.CategoriaHYCM;
import org.esfe.Repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICategoriaService {

    @Autowired
    public ICategoriaRepository categoriaRepository;

    public List<CategoriaHYCM> listartodos(){
        return categoriaRepository.findAll();
    }
    public CategoriaHYCM guardar(CategoriaHYCM categoriaHYCM){
        return categoriaRepository.save(categoriaHYCM);
    }
    public CategoriaHYCM obtenerPorId(Integer id){
        return categoriaRepository.findById(id).orElse(null);
    }
    public void eliminar(Integer id){
        categoriaRepository.deleteById(id);
    }



}