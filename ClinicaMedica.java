import java.util.ArrayList;
import java.util.List;

class ClinicaMedica {
    private String nombre;
    private List<String> direcciones;
    private String tipo;
    private List<EspecialidadMedica> especialidadesMedicas;

    public ClinicaMedica(String nombre, List<String> direcciones, String tipo) {
        this.nombre = nombre;
        this.direcciones = direcciones;
        this.tipo = tipo;
        this.especialidadesMedicas = new ArrayList<>();
    }

    // Métodos para agregar especialidades médicas a la clínica
    public void agregarEspecialidadMedica(EspecialidadMedica especialidadMedica) {
        especialidadesMedicas.add(especialidadMedica);
    }

    // Métodos para obtener médicos y administrativos de la clínica
    public List<Medico> obtenerMedicos() {
        List<Medico> medicosClinica = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidadesMedicas) {
            medicosClinica.addAll(especialidad.getMedicosAsociados());
        }
        return medicosClinica;
    }

    public List<Administrativo> obtenerAdministrativos() {
        List<Administrativo> administrativosClinica = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidadesMedicas) {
            administrativosClinica.addAll(especialidad.getAdministrativosAsociados());
        }
        return administrativosClinica;
    }

    // Métodos para obtener médicos y administrativos de una especialidad médica específica
    public List<Medico> obtenerMedicosPorEspecialidad(String nombreEspecialidad) {
        List<Medico> medicosEspecialidad = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidadesMedicas) {
            if (especialidad.getNombre().equals(nombreEspecialidad)) {
                medicosEspecialidad.addAll(especialidad.getMedicosAsociados());
            }
        }
        return medicosEspecialidad;
    }

    public Administrativo obtenerAdministrativoPorEspecialidad(String nombreEspecialidad, String nombreAdministrativo, String rutAdministrativo) {
        for (EspecialidadMedica especialidad : especialidadesMedicas) {
            if (especialidad.getNombre().equals(nombreEspecialidad)) {
                for (Administrativo administrativo : especialidad.getAdministrativosAsociados()) {
                    if (administrativo.getNombre().equals(nombreAdministrativo) && administrativo.getRut().equals(rutAdministrativo)) {
                        return administrativo;
                    }
                }
            }
        }
        return null;
    }
}