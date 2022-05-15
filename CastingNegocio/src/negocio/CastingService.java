/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidades.Casting;
import factory.DAOSFactory;
import interfaces.ICastingsDAO;
import persistencia.CastingsDAO;
import interfaces.ICastingsService;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CastingService implements ICastingsService{
    
    ICastingsDAO castingDAO = DAOSFactory.crearCastingsDAO();

    @Override
    public boolean registrarCasting(Casting casting) {
        if(validar()){
            castingDAO.registrarCasting(casting);
            return true;
        } else {
            return false;
        }
        
    }

    @Override
    public boolean buscarCastingPorCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public boolean validar() {
        return true;
    }
    
}
