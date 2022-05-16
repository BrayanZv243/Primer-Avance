/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Agente;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IAgentesService {
    
    public boolean registrarAgente(Agente agente);
    public List<Agente> buscarAgentes();
    public boolean eliminarAgente(String codigo);
    public boolean actualizarAgente(Agente agente);
    public boolean validar(int codigo);
    
}
