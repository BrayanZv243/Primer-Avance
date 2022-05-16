package interfaces;



import entidades.Casting;
import java.util.Date;
import java.util.List;

public interface ICastingsDAO {
    
    public boolean registrarCasting(Casting casting);
    public Casting buscarCastingPorCodigo(String codigo);
    public Casting buscarCastingPorNombre(String nombre);
    public List<Casting> buscarCastingPorFecha(Date fecha);
    public List<Casting> buscarCastings();
    public boolean actualizarCasting(Casting casting);
    
}
