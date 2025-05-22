package pm.contactos.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import pm.contactos.modelo.Contacto;
import pm.contactos.repositorio.ContactoRepositorio;

import java.util.List;

public class ContactoServicio implements IContactoServicio{

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    @Override
    public List<Contacto> listarContactos() {
        return contactoRepositorio.findAll();
    }

    @Override
    public Contacto buscarContactoPorId(Integer idContacto) {
        return contactoRepositorio.findById(idContacto).orElse(null);
    }

    @Override
    public void guardarContacto(Contacto contacto) {
        this.contactoRepositorio.save(contacto);

    }

    @Override
    public void eliminarContacto(Contacto contacto) {
        this.contactoRepositorio.delete(contacto);

    }
}
