/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Casting;
import entidades.Cliente;
import entidades.Usuario;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IUsuarioService {

    public boolean registrarUsuario(Usuario usuario);

    public List<Usuario> buscarUsuarios();
}
