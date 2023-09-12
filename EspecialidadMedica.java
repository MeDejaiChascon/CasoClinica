import java.util.ArrayList;
import java.util.List;

class EspecialidadMedica {
    private String nombre;
    private String ubicacionGeografica;
    private List<Medico> medicosAsociados;
    private List<Administrativo> administrativosAsociados;

    public EspecialidadMedica(String nombre, String ubicacionGeografica) {
        this.nombre = nombre;
        this.ubicacionGeografica = ubicacionGeografica;
        this.medicosAsociados = new ArrayList<>();
        this.administrativosAsociados = new ArrayList<>();
    }

    // Métodos para agregar médicos y administrativos a la especialidad
    public void agregarMedico(Medico medico) {
        medicosAsociados.add(medico);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        administrativosAsociados.add(administrativo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public List<Medico> getMedicosAsociados() {
        return medicosAsociados;
    }

    public List<Administrativo> getAdministrativosAsociados() {
        return administrativosAsociados;
    }
}