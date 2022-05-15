/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Administrador;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IAdministradorService {
    
    public boolean registrarAdministrador(Administrador admin);
    public List<Administrador> buscarAdministradores();
    public Administrador consultarAdmin(String admin);
    
}
