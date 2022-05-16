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
import org.bson.Document;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClientesDAO implements IClientesDAO {

    private IConexionBD conexion;
    private MongoDatabase baseDatos;

    public ClientesDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion();
    }

    private MongoCollection<Cliente> getColeccion() {
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
    public Cliente buscarClientePorCodigo(String codigo) {
        List<Cliente> cliente = baseDatos.getCollection("clientes", Cliente.class).find(new Document()
                .append("codigo", codigo)).into(new ArrayList());
        
        if (cliente.isEmpty()) {
            return null;
        }
        return cliente.get(0);
    }

}
