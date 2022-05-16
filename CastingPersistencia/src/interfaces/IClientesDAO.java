package interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IClientesDAO {
    
    public boolean registrarCliente(Cliente cliente);
    public List<Cliente> buscarClientes();
    public Cliente buscarClientePorCodigo(String codigo);
}
