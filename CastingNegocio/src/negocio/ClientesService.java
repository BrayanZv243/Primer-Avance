/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import persistencia.ClientesDAO;
import entidades.Cliente;
import factory.DAOSFactory;
import interfaces.IClientesDAO;
import interfaces.IClientesService;
import java.util.List;
import persistencia.ConexionBD;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClientesService implements IClientesService{

    IClientesDAO clientesDAO = DAOSFactory.crearClientesDAO();
    
    @Override
    public boolean registrarCliente(Cliente cliente) {
        if(validar()){
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
    public boolean eliminarCliente(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validar() {
        return true;
    }

}
