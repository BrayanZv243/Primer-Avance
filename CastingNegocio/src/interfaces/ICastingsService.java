/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Casting;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface ICastingsService {
    
    public boolean registrarCasting(Casting casting);
    public boolean buscarCasting(String codigo);
    public boolean eliminarCasting(String codigo);
    public boolean actualizarCasting(Casting casting);
    public boolean validar();
    
}
