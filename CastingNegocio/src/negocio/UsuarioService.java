/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Usuario;
import interfaces.IPersistencia;
import interfaces.IUsuarioService;
import java.util.List;
import persistencia.Persistencia;

/**
 *
 * @author Jonathan
 */
public class UsuarioService implements IUsuarioService {

    IPersistencia persistencia = Persistencia.getInstance();

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        if (validar()) {
            persistencia.registrarUsuario(usuario);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public List<Usuario> buscarUsuarios() {
        return persistencia.buscarUsuarios();
    }

    public boolean validar() {
        return true;
    }

}
