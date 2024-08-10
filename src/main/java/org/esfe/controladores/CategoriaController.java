package org.esfe.controladores;

import org.esfe.modelos.CategoriaHYCM;
import org.esfe.servicios.interfaces.ICategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private ICategoriaServices categoriaServices;

    @GetMapping("/listar")
    public String listarCategorias(Model model,
                                   @RequestParam(defaultValue = "0") int page,
                                   @RequestParam(defaultValue = "10") int size) {
        // Crear el objeto Pageable
        Pageable pageable = PageRequest.of(page, size);

        // Usar el objeto Pageable para obtener los datos paginados
        model.addAttribute("categorias", categoriaServices.buscarTodosPaginados(pageable));
        return "categoria/categoria-lista";
    }


    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaCategoria(Model model) {
        model.addAttribute("categoria", new CategoriaHYCM() {
            @Override
            public Page<CategoriaHYCM> buscarTodosPaginados(Pageable pageable) {
                return null;
            }

            @Override
            public List<CategoriaHYCM> obtenerTodos() {
                return List.of();
            }

            @Override
            public Optional<CategoriaHYCM> buscarPorId(Integer id) {
                return Optional.empty();
            }

            @Override
            public CategoriaHYCM crearOEditar(CategoriaHYCM categoriaHYCM) {
                return null;
            }

            @Override
            public void eliminarPorId(Integer id) {

            }
        });
        return "categoria/categoriaform";
    }

    @PostMapping
    public String guardarCategoria(CategoriaHYCM categoriaHYCM) {
        categoriaServices.guardar(categoriaHYCM);
        return "redirect:/categoria";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCategoria(@PathVariable Integer id, Model model) {
        model.addAttribute("categoria", categoriaServices.buscarPorId(id));
        return "categoria/categoriaform";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCategoria(@PathVariable Integer id) {
        categoriaServices.eliminarPorId(id);
        return "redirect:/categoria";
    }

} 