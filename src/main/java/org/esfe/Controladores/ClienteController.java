package org.esfe.Controladores;

import org.esfe.Modelos.ClienteHYCM;
import org.esfe.Services.ICategoriaService;
import org.esfe.Services.IClienteService;
import org.hibernate.annotations.processing.HQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping
    public String ListarCliente (Model model){
        model.addAttribute("cliente", clienteService.listartodos());
        return "cliente/clientelista";
    }

    @GetMapping("/nuevo")
    public String mostrarformNuevoCliente (Model model){
        model.addAttribute("cliente", new ClienteHYCM());
        return "cliente/clienteform";
    }
    @PostMapping
    public String guardarCliente(ClienteHYCM clienteHYCM){
        clienteService.guardar(clienteHYCM);
        return "redirect:/cliente";
    }
    @GetMapping("/editar/{id}")
    public String mostrarformEditarCliente(@PathVariable long id, Model model){
        model.addAttribute("cliente", clienteService.obtenerPorId(id));
        return "cliente/clienteform";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable long id){
        clienteService.eliminar(id);
        return "redirect:/cliente";
    }
}
