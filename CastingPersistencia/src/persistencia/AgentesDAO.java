package persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import interfaces.IConexionBD;
import interfaces.IAgentesDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Agente;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AgentesDAO implements IAgentesDAO{

    private IConexionBD conexion;
    private MongoDatabase baseDatos;

    public AgentesDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion();
    }
    
    private MongoCollection<Agente> getColeccion(){
        return baseDatos.getCollection("agentes", Agente.class);
    }
    
    @Override
    public boolean registrarAgente(Agente agente) {
        this.getColeccion().insertOne(agente);
        return true;
    }

    @Override
    public List<Agente> buscarAgentes() {
        List<Agente> agentes = baseDatos.getCollection("agentes", Agente.class).find().into(new ArrayList());
        
        if (agentes.isEmpty()) {
            return null;
        }
        return agentes;
    }

  

    @Override
    public Agente buscarAgentePorCodigo(int codigo) {

         List<Agente> agente = baseDatos.getCollection("agentes", Agente.class).find(new Document()
                .append("numEmpleado", codigo)).into(new ArrayList());
        
        if (agente.isEmpty()) {
            return null;
        }
        return agente.get(0);

    }
    
    

}
