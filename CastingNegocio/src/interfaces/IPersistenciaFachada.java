/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Agente;
import entidades.Casting;
import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IPersistenciaFachada {
    
    public boolean registrarCliente(Cliente cliente);
    public List<Cliente> buscarClientes();
    
    
    public boolean registrarAgente(Agente agente);
    public List<Agente> buscarAgentes();
    
    
    public boolean registrarCasting(Casting casting);
    public boolean buscarCastingPorCodigo(String codigo);
    public List<Casting> buscarCastings();
    public boolean actualizarCasting(Casting casting);
    
}
