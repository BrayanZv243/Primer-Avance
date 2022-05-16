/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Casting;
import interfaces.ICastingsService;
import interfaces.IPersistencia;
import java.util.Date;
import java.util.List;
import persistencia.Persistencia;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CastingService implements ICastingsService {

    IPersistencia persistencia = Persistencia.getInstance();

    @Override
    public boolean registrarCasting(Casting casting) {
        if (validar(casting.getCodigo(), casting.getNombre())) {
            persistencia.registrarCasting(casting);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Casting buscarCastingPorCodigo(String codigo) {
        return persistencia.buscarCastingPorCodigo(codigo);
    }

    @Override
    public Casting buscarCastingPorNombre(String nombre) {
        return persistencia.buscarCastingPorNombre(nombre);
    }

    @Override
    public List<Casting> buscarCastingPorFecha(Date fecha) {
        return persistencia.buscarCastingPorFecha(fecha);
    }

    @Override
    public List<Casting> buscarCastings() {
        return persistencia.buscarCastings();
    }

    @Override
    public boolean actualizarCasting(Casting casting) {
        return persistencia.actualizarCasting(casting);
    }

    @Override
    public boolean validar(String codigo, String nombre) {
        Casting casting = persistencia.buscarCastingPorCodigo(codigo);
        Casting casting2 = persistencia.buscarCastingPorNombre(nombre);
        return !(casting != null || casting2 != null);
    }

}
