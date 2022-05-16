/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidades.Agente;
import factory.DAOSFactory;
import interfaces.IAgentesDAO;
import interfaces.IAgentesService;
import java.util.List;
import persistencia.AgentesDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AgentesService implements IAgentesService{

    IAgentesDAO agentesDAO = DAOSFactory.crearAgentesDAO();
    
    @Override
    public boolean registrarAgente(Agente agente) {
       if(validar(agente.getNumEmpleado())){
            agentesDAO.registrarAgente(agente);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Agente> buscarAgentes() { 
        return agentesDAO.buscarAgentes();
    }

    @Override
    public boolean eliminarAgente(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarAgente(Agente agente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validar(int codigo) {
        Agente agente = agentesDAO.buscarAgentePorCodigo(codigo);
        
        return agente == null;

    }

}
