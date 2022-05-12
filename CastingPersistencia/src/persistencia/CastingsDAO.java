package persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import interfaces.ICastingsDAO;
import interfaces.IConexionBD;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import entidades.Agente;
import entidades.Casting;

import java.util.Arrays;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CastingsDAO implements ICastingsDAO {

    private IConexionBD conexion;
    private MongoDatabase baseDatos;

    public CastingsDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion();
    }
    
    private MongoCollection<Casting> getColeccion(){
        return baseDatos.getCollection("castings", Casting.class);
    }
    
    @Override
    public boolean registrarCasting(Casting casting) {
        this.getColeccion().insertOne(casting);
        return true;
    }

    @Override
    public boolean buscarCasting(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarCasting(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarCasting(Casting casting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
