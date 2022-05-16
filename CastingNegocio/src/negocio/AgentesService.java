/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidades.Agente;
import interfaces.IAgentesService;
import interfaces.IPersistencia;
import java.util.List;
import persistencia.Persistencia;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AgentesService implements IAgentesService{

    IPersistencia persistencia = Persistencia.getInstance();
    
    @Override
    public boolean registrarAgente(Agente agente) {
       if(validar(agente.getNumEmpleado())){
            persistencia.registrarAgente(agente);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Agente> buscarAgentes() { 
        return persistencia.buscarAgentes();
    }
    
    @Override
    public Agente buscarAgentePorCodigo(int codigo) {
        return persistencia.buscarAgentePorCodigo(codigo);
    }

    @Override
    public boolean validar(int codigo) {
        Agente agente = persistencia.buscarAgentePorCodigo(codigo);
        
        return agente == null;

    }

    

}
