/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidades.Casting;
import factory.DAOSFactory;
import interfaces.ICastingsDAO;
import interfaces.ICastingsService;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CastingService implements ICastingsService{
    
    ICastingsDAO castingDAO = DAOSFactory.crearCastingsDAO();

    @Override
    public boolean registrarCasting(Casting casting) {
        if(validar(casting.getCodigo())){
            castingDAO.registrarCasting(casting);
            return true;
        } else {
            return false;
        }
        
    }

    @Override
    public Casting buscarCastingPorCodigo(String codigo) {
        return castingDAO.buscarCastingPorCodigo(codigo);
    }
    
    @Override
    public List<Casting> buscarCastingPorNombre(String nombre) {
        return castingDAO.buscarCastingPorNombre(nombre);
    }
    
    @Override
    public List<Casting> buscarCastingPorFecha(Date fecha){
        return castingDAO.buscarCastingPorFecha(fecha);
    }

    @Override
    public List<Casting> buscarCastings(){
        return castingDAO.buscarCastings();
    }
    
    @Override
    public boolean actualizarCasting(Casting casting){
        return castingDAO.actualizarCasting(casting);
    }

    @Override
    public boolean validar(String codigo) {
       Casting casting = castingDAO.buscarCastingPorCodigo(codigo);
        
        return casting == null;
    }
    
}
