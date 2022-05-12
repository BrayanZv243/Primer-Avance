package interfaces;



import entidades.Casting;

public interface ICastingsDAO {
    
    public boolean registrarCasting(Casting casting);
    public boolean buscarCasting(String codigo);
    public boolean eliminarCasting(String codigo);
    public boolean actualizarCasting(Casting casting);
    
}
