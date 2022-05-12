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
import interfaces.IAgentesService;
import interfaces.ICastingsService;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PersistenciaFachada implements IPersistenciaFachada {

    IClientesService clientesBO;
    IAgentesService agentesBO;
    ICastingsService castingsBO;

    private static PersistenciaFachada persistencia;

    public PersistenciaFachada() {
        clientesBO = BOSFactory.crearClientesService();
        agentesBO = BOSFactory.crearAgentesService();
        castingsBO = BOSFactory.crearCastingsService();
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
    public boolean buscarCasting(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
