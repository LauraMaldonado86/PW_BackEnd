
package com.portfolioweb.lauramaldonado.Repository;

import com.portfolioweb.lauramaldonado.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
