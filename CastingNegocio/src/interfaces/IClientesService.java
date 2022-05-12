/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IClientesService {
    
    public boolean registrarCliente(Cliente cliente);
    public List<Cliente> buscarClientes();
    public boolean eliminarCliente(String codigo);
    public boolean actualizarCliente(Cliente cliente);
    public boolean validar();
    
}
