package org.esfe.Services;

import org.esfe.Modelos.CategoriaHYCM;
import org.esfe.Modelos.ClienteHYCM;
import org.esfe.Repository.ICategoriaRepository;
import org.esfe.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IClienteService {

    @Autowired
    public IClienteRepository clienteRepository;

    public List<ClienteHYCM> listartodos(){
        return clienteRepository.findAll();
    }
    public ClienteHYCM guardar(ClienteHYCM clienteHYCM){
        return clienteRepository.save(clienteHYCM);
    }
    public ClienteHYCM obtenerPorId(long id){
        return clienteRepository.findById(id).orElse(null);
    }
    public void eliminar(Long id){
        clienteRepository.deleteById(id);
    }
}
