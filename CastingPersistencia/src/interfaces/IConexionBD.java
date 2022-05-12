package interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IConexionBD {
    
    public MongoDatabase crearConexion();
    public MongoDatabase obtenerConexion();
}
