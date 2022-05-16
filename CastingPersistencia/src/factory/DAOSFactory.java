
package factory;

import interfaces.IAgentesDAO;
import interfaces.ICastingsDAO;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import interfaces.IUsuariosDAO;
import persistencia.AgentesDAO;
import persistencia.CastingsDAO;
import persistencia.ClientesDAO;
import persistencia.ConexionBD;
import persistencia.UsuariosDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOSFactory {
    
    private static final IConexionBD conexionBD = ConexionBD.getInstance();
    
    public static IClientesDAO crearClientesDAO(){
        return new ClientesDAO(conexionBD);
    }
    
    public static IAgentesDAO crearAgentesDAO(){
        return new AgentesDAO(conexionBD);
    }
    
    public static ICastingsDAO crearCastingsDAO(){
        return new CastingsDAO(conexionBD);
    }
    
    public static IUsuariosDAO crearUsuariosDAO(){
        return new UsuariosDAO(conexionBD);
    }
}
