/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Cliente;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import java.util.ArrayList;
import java.util.List;



/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClientesDAO implements IClientesDAO{

    private IConexionBD conexion;
    private MongoDatabase baseDatos;

    public ClientesDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion(); 
    }
    
    private MongoCollection<Cliente> getColeccion(){
        return baseDatos.getCollection("clientes", Cliente.class);
    }
    
    @Override
    public boolean registrarCliente(Cliente cliente) {
        this.getColeccion().insertOne(cliente);
        return true;
    }

    @Override
    public List<Cliente> buscarClientes() {
        List<Cliente> clientes = baseDatos.getCollection("clientes", Cliente.class).find().into(new ArrayList());
        
        if (clientes.isEmpty()) {
            return null;
        }
        return clientes;
    }

    @Override
    public boolean eliminarCliente(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
