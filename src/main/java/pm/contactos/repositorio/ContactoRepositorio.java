package pm.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pm.contactos.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {
}
