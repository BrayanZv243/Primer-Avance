package utils;


import entidades.Agente;
import entidades.Cliente;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class Conversiones {

    static Conversiones conversiones;
    
    /**
     * Genera un objeto de tipo DefaultComboBoxModel a partir de una lista de
     * clientes.
     *
     * @param listaClientes Lista de los clientes.
     * @return Lista de clientes en una combo box model.
     */
    public DefaultComboBoxModel<Cliente> clientesComboBoxModel(List<Cliente> listaClientes) {
        DefaultComboBoxModel<Cliente> defaultComboBoxModel = new DefaultComboBoxModel<>();
        if (listaClientes != null) {
            // Para cada elemento de la Lista 
            for (int i = 0; i < listaClientes.size(); i++) {
                // Agregalo a la instancia de la clase DefaultComboBoxModel 
                defaultComboBoxModel.addElement(listaClientes.get(i));
            }
            return defaultComboBoxModel;
        }
        return null;
    }

    /**
     * Genera un objeto de tipo DefaultComboBoxModel a partir de una lista de
     * agentes.
     *
     * @param listaAgentes Lista de los agentes.
     * @return Lista de agentes en una combo box model.
     */
    public DefaultComboBoxModel<Agente> agentesComboBoxModel(List<Agente> listaAgentes) {
        DefaultComboBoxModel<Agente> defaultComboBoxModel = new DefaultComboBoxModel<>();
        if (listaAgentes != null) {
            // Para cada elemento de la Lista 
            for (int i = 0; i < listaAgentes.size(); i++) {
                // Agregalo a la instancia de la clase DefaultComboBoxModel 
                defaultComboBoxModel.addElement(listaAgentes.get(i));
            }
            return defaultComboBoxModel;
        }
        return null;
    }
    
    public static Conversiones getInstance(){
        if(conversiones == null) return new Conversiones();
        return conversiones;
    }
}
