package interfaces;



import entidades.Casting;
import java.util.List;

public interface ICastingsDAO {
    
    public boolean registrarCasting(Casting casting);
    public boolean buscarCasting(String codigo);
    public List<Casting> buscarCastings();
    public boolean actualizarCasting(Casting casting);
    
}
