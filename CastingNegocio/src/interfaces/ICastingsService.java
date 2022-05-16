/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Casting;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface ICastingsService {
    
    public boolean registrarCasting(Casting casting);
    public Casting buscarCastingPorCodigo(String codigo);
    public List<Casting> buscarCastingPorNombre(String nombre);
    public List<Casting> buscarCastingPorFecha(Date fecha);
    public List<Casting> buscarCastings();
    public boolean actualizarCasting(Casting casting);
    public boolean validar(String codigo);
    
}
