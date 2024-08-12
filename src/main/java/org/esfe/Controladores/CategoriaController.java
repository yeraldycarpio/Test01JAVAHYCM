package org.esfe.Controladores;

import org.esfe.Modelos.CategoriaHYCM;
import org.esfe.Services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping
    public String listarCategoria(Model model) {
        model.addAttribute("categorias", categoriaService.listartodos());
        return "categoria/categoriaL";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaCategoria(Model model) {
        model.addAttribute("categoria", new CategoriaHYCM());
        return "categoria/categoriaF";
    }

    @PostMapping
    public String guardarCategoria(CategoriaHYCM categoriaHYCM) {
        categoriaService.guardar(categoriaHYCM);
        return "redirect:/categoria";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCategoria(@PathVariable Integer id, Model model) {
        model.addAttribute("categoria", categoriaService.obtenerPorId(id));
        return "categoria/categoriaF";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCategoria(@PathVariable Integer id) {
        categoriaService.eliminar(id);
        return "redirect:/categoria";
}
}
