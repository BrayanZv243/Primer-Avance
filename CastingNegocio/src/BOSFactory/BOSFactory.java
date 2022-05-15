/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOSFactory;

import interfaces.IAdministradorService;
import interfaces.IAgentesService;
import interfaces.ICastingsService;
import interfaces.IClientesService;
import negocio.AdministradorService;
import negocio.AgentesService;
import negocio.CastingService;
import negocio.ClientesService;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BOSFactory {

    public static IClientesService crearClientesService() {
        return new ClientesService();
    }

    public static IAgentesService crearAgentesService() {
        return new AgentesService();
    }

    public static ICastingsService crearCastingsService() {
        return new CastingService();
    }

    public static IAdministradorService crearAdministradorService() {
        return new AdministradorService();
    }

}
