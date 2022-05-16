/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import entidades.Agente;
import entidades.Casting;
import entidades.Cliente;
import entidades.Usuario;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IPersistencia {

    // Métodos de cliente.
    public boolean registrarCliente(Cliente cliente);
    public List<Cliente> buscarClientes();
    public Cliente buscarClientePorCodigo(String codigo);
    
    // Métodos de agente
    public boolean registrarAgente(Agente agente);
    public List<Agente> buscarAgentes();
    public Agente buscarAgentePorCodigo(int codigo);
    
    //Métodos de casting
    public boolean registrarCasting(Casting casting);
    public Casting buscarCastingPorCodigo(String codigo);
    public Casting buscarCastingPorNombre(String nombre);
    public List<Casting> buscarCastingPorFecha(Date fecha);
    public List<Casting> buscarCastings();
    public boolean actualizarCasting(Casting casting);
    
    //Métodos de usuario
    public boolean registrarUsuario(Usuario usuario);
    public List<Usuario> buscarUsuarios();
    
}
