/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidades.Cliente;
import interfaces.IClientesService;
import interfaces.IPersistencia;
import java.util.List;
import persistencia.Persistencia;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClientesService implements IClientesService{

    IPersistencia persistencia = Persistencia.getInstance();
    
    @Override
    public boolean registrarCliente(Cliente cliente) {
        if(validar(cliente.getCodigo())){
            persistencia.registrarCliente(cliente);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Cliente> buscarClientes() {
        return persistencia.buscarClientes();
    }

    @Override
    public Cliente buscarClientePorCodigo(String codigo) {
        return persistencia.buscarClientePorCodigo(codigo);
    }

    @Override
    public boolean validar(String codigo) {
        Cliente cliente = persistencia.buscarClientePorCodigo(codigo);
        
        return cliente == null;
    }

   
}
