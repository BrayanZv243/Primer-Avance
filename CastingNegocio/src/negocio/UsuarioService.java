/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Usuario;
import factory.DAOSFactory;
import interfaces.IClientesDAO;
import interfaces.IUsuarioService;
import interfaces.IUsuariosDAO;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class UsuarioService implements IUsuarioService{

    IUsuariosDAO usuariosDAO = DAOSFactory.crearUsuariosDAO();
    
    @Override
    public boolean registrarUsuario(Usuario usuario) {
          if(validar()){
            usuariosDAO.registrarUsuario(usuario);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public List<Usuario> buscarUsuarios() {

         return usuariosDAO.buscarTodos();


    }
    
    public boolean validar(){
        return true;
    }
    
}
