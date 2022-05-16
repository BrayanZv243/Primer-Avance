/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Cliente;
import entidades.Usuario;
import interfaces.IConexionBD;
import interfaces.IUsuariosDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class UsuariosDAO implements IUsuariosDAO{
private IConexionBD conexion;
   private MongoDatabase baseDatos;
    public UsuariosDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion(); 
    }
        private MongoCollection<Usuario> getColeccion(){
        return baseDatos.getCollection("usuarios", Usuario.class);
    }
    @Override
    public void registrarUsuario(Usuario usuario) {
        try {
           this.getColeccion().insertOne(usuario);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    

    @Override
    public List<Usuario> buscarTodos() {
        
         List<Usuario> usuarios = baseDatos.getCollection("usuarios", Usuario.class).find().into(new ArrayList());
        
        if (usuarios.isEmpty()) {
            return null;
        }
        return usuarios;

    }
    
}
