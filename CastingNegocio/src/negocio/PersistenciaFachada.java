/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Agente;
import entidades.Casting;
import entidades.Cliente;
import interfaces.IClientesService;
import interfaces.IPersistenciaFachada;
import java.util.List;
import BOSFactory.BOSFactory;
import entidades.Usuario;
import interfaces.IAgentesService;
import interfaces.ICastingsService;
import interfaces.IUsuarioService;
import java.util.Date;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PersistenciaFachada implements IPersistenciaFachada {

    IClientesService clientesBO;
    IAgentesService agentesBO;
    ICastingsService castingsBO;
    IUsuarioService usuariosBO;
    private static PersistenciaFachada persistencia;

    public PersistenciaFachada() {
        clientesBO = BOSFactory.crearClientesService();
        agentesBO = BOSFactory.crearAgentesService();
        castingsBO = BOSFactory.crearCastingsService();
        usuariosBO = BOSFactory.crearUsuariosService();
    }

    public static PersistenciaFachada getInstance() {
        if (persistencia == null) {
            return new PersistenciaFachada();
        }
        return persistencia;
    }

    @Override
    public boolean registrarCliente(Cliente cliente) {
        return clientesBO.registrarCliente(cliente);
    }

    @Override
    public List<Cliente> buscarClientes() {
        return clientesBO.buscarClientes();
    }

    public Cliente buscarClientePorCodigo(String codigo) {
        return clientesBO.buscarClientePorCodigo(codigo);
    }

    @Override
    public boolean registrarAgente(Agente agente) {
        return agentesBO.registrarAgente(agente);
    }

    @Override
    public List<Agente> buscarAgentes() {
        return agentesBO.buscarAgentes();
    }

    @Override
    public boolean registrarCasting(Casting casting) {
        return castingsBO.registrarCasting(casting);
    }

    @Override
    public Casting buscarCastingPorCodigo(String codigo) {
        return castingsBO.buscarCastingPorCodigo(codigo);
    }
    
    @Override
    public Casting buscarCastingPorNombre(String nombre) {
        return castingsBO.buscarCastingPorNombre(nombre);
    }
    
    @Override
    public List<Casting> buscarCastingPorFecha(Date fecha){
        return castingsBO.buscarCastingPorFecha(fecha);
    }

    @Override
    public boolean actualizarCasting(Casting casting) {
        return castingsBO.actualizarCasting(casting);
    }

    @Override
    public List<Casting> buscarCastings() {
        return castingsBO.buscarCastings();
    }

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        return usuariosBO.registrarUsuario(usuario);
    }

    @Override
    public List<Usuario> buscarUsuarios() {
        return usuariosBO.buscarUsuarios();
    }
}
