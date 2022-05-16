/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidades.Cliente;
import factory.DAOSFactory;
import interfaces.IClientesDAO;
import interfaces.IClientesService;
import java.util.List;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClientesService implements IClientesService{

    IClientesDAO clientesDAO = DAOSFactory.crearClientesDAO();
    
    @Override
    public boolean registrarCliente(Cliente cliente) {
        if(validar(cliente.getCodigo())){
            clientesDAO.registrarCliente(cliente);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Cliente> buscarClientes() {
        return clientesDAO.buscarClientes();
    }

    @Override
    public Cliente buscarClientePorCodigo(String codigo) {
        return clientesDAO.buscarClientePorCodigo(codigo);
    }

    @Override
    public boolean validar(String codigo) {
        Cliente cliente = clientesDAO.buscarClientePorCodigo(codigo);
        
        return cliente == null;
    }

   
}
