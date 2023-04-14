
package com.portfolioweb.lauramaldonado.Interface;

import com.portfolioweb.lauramaldonado.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto del tipo persona 
    public void savePersona(Persona persona);
    
    //eliminar un usuario buscado por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
