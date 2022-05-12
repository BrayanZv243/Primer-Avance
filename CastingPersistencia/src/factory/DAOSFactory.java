/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import interfaces.IAgentesDAO;
import interfaces.ICastingsDAO;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import persistencia.AgentesDAO;
import persistencia.CastingsDAO;
import persistencia.ClientesDAO;
import persistencia.ConexionBD;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOSFactory {
    
    private static final IConexionBD conexionBD = new ConexionBD();
    
    public static IClientesDAO crearClientesDAO(){
        return new ClientesDAO(conexionBD);
    }
    
    public static IAgentesDAO crearAgentesDAO(){
        return new AgentesDAO(conexionBD);
    }
    
    public static ICastingsDAO crearCastingsDAO(){
        return new CastingsDAO(conexionBD);
    }
    
}
