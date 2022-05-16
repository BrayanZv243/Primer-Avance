/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import entidades.Agente;
import entidades.Casting;
import entidades.Cliente;
import entidades.Usuario;
import factory.DAOSFactory;
import interfaces.IAgentesDAO;
import interfaces.ICastingsDAO;
import interfaces.IClientesDAO;
import interfaces.IPersistencia;
import interfaces.IUsuariosDAO;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Persistencia implements IPersistencia{
    
    ICastingsDAO castingsDAO;
    IClientesDAO clientesDAO;
    IAgentesDAO agentesDAO;
    IUsuariosDAO usuariosDAO;
    private static Persistencia persistencia;
    
    public Persistencia(){
        castingsDAO = DAOSFactory.crearCastingsDAO();
        clientesDAO = DAOSFactory.crearClientesDAO();
        agentesDAO = DAOSFactory.crearAgentesDAO();
        usuariosDAO = DAOSFactory.crearUsuariosDAO();
    }
    
    public static Persistencia getInstance(){
        if(persistencia == null) return new Persistencia();
        return persistencia;
    }

    @Override
    public boolean registrarCliente(Cliente cliente) {
        return clientesDAO.registrarCliente(cliente);
         
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
    public boolean registrarAgente(Agente agente) {
        return agentesDAO.registrarAgente(agente);
    }

    @Override
    public List<Agente> buscarAgentes() {
        return agentesDAO.buscarAgentes();
    }
    
    @Override
    public Agente buscarAgentePorCodigo(int codigo){
        return agentesDAO.buscarAgentePorCodigo(codigo);
    }

    @Override
    public boolean registrarCasting(Casting casting) {
        return castingsDAO.registrarCasting(casting);
    }

    @Override
    public Casting buscarCastingPorCodigo(String codigo) {
        return castingsDAO.buscarCastingPorCodigo(codigo);
    }

    @Override
    public Casting buscarCastingPorNombre(String nombre) {
        return castingsDAO.buscarCastingPorNombre(nombre);
    }

    @Override
    public List<Casting> buscarCastingPorFecha(Date fecha) {
        return castingsDAO.buscarCastingPorFecha(fecha);
    }

    @Override
    public List<Casting> buscarCastings() {
         return castingsDAO.buscarCastings();
    }

    @Override
    public boolean actualizarCasting(Casting casting) {
        return castingsDAO.actualizarCasting(casting);
    }

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        return usuariosDAO.registrarUsuario(usuario);
    }

    @Override
    public List<Usuario> buscarUsuarios() {
        return usuariosDAO.buscarTodos();
    }   
}
