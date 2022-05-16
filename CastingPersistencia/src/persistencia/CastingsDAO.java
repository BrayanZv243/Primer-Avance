package persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import interfaces.ICastingsDAO;
import interfaces.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Casting;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.Document;

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

    private MongoCollection<Casting> getColeccion() {
        return baseDatos.getCollection("castings", Casting.class);
    }

    @Override
    public boolean registrarCasting(Casting casting) {
        this.getColeccion().insertOne(casting);
        return true;
    }

    @Override
    public boolean actualizarCasting(Casting casting) {

        try {
            if (casting.getCastingPresencial() != null) {
                Document filtro = new Document("codigo", casting.getCodigo());
                Document cambios = new Document()
                        .append("agente", casting.getAgente())
                        .append("aprobado", casting.isAprobado())
                        .append("castingPresencial", casting.getCastingPresencial())
                        .append("cliente", casting.getCliente())
                        .append("codigo", casting.getCodigo())
                        .append("costo", casting.getCosto())
                        .append("descripcion", casting.getDescripcion())
                        .append("fase", casting.getFase())
                        .append("fechaContrato", casting.getFechaContrato())
                        .append("fechaHoraInicio", casting.getFechaHoraInicio())
                        .append("fechaHoraFin", casting.getFechaHoraFin())
                        .append("nombre", casting.getNombre())
                        .append("perfiles", casting.getPerfiles());

                this.getColeccion().updateOne(filtro, new Document("$set", cambios));

                return true;
            } else {
                Document filtro = new Document("codigo", casting.getCodigo());
                Document cambios = new Document()
                        .append("agente", casting.getAgente())
                        .append("aprobado", casting.isAprobado())
                        .append("castingOnline", casting.getCastingOnline())
                        .append("cliente", casting.getCliente())
                        .append("codigo", casting.getCodigo())
                        .append("costo", casting.getCosto())
                        .append("descripcion", casting.getDescripcion())
                        .append("fase", casting.getFase())
                        .append("fechaContrato", casting.getFechaContrato())
                        .append("fechaHoraInicio", casting.getFechaHoraInicio())
                        .append("fechaHoraFin", casting.getFechaHoraFin())
                        .append("nombre", casting.getNombre())
                        .append("perfiles", casting.getPerfiles());

                this.getColeccion().updateOne(filtro, new Document("$set", cambios));

                return true;
            }
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public List<Casting> buscarCastings() {
        List<Casting> castings = baseDatos.getCollection("castings", Casting.class).find().into(new ArrayList());

        if (castings.isEmpty()) {
            return null;
        }
        return castings;
    }

    @Override
    public Casting buscarCastingPorCodigo(String codigo) {

        List<Casting> casting = baseDatos.getCollection("castings", Casting.class).find(new Document()
                .append("codigo", codigo)).into(new ArrayList());

        if (casting.isEmpty()) {
            return null;
        }
        return casting.get(0);
    }
    
    @Override
    public Casting buscarCastingPorNombre(String nombre) {

        List<Casting> casting = baseDatos.getCollection("castings", Casting.class).find(new Document()
                .append("nombre", nombre)).into(new ArrayList());

        if (casting.isEmpty()) {
            return null;
        }
        return casting.get(0);
    }
    
    @Override
    public List<Casting> buscarCastingPorFecha(Date fecha) {

        List<Casting> casting = baseDatos.getCollection("castings", Casting.class).find(new Document()
                .append("fechaContrato", fecha)).into(new ArrayList());

        if (casting.isEmpty()) {
            return null;
        }
        return casting;
    }

}
