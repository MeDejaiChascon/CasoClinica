import java.util.List;

class Medico extends Trabajador {
    private String especializacion;
    private String horarioAtencion;
    private List<Paciente> pacientesAsignados;
    private EspecialidadMedica especialidadMedica;

    public Medico(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo,
                  String especializacion, String horarioAtencion, List<Paciente> pacientesAsignados, EspecialidadMedica especialidadMedica) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
        this.especializacion = especializacion;
        this.horarioAtencion = horarioAtencion;
        this.pacientesAsignados = pacientesAsignados;
        this.especialidadMedica = especialidadMedica;
    }

    public String getTipo() {
        return "Médico";
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public List<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void setPacientesAsignados(List<Paciente> pacientesAsignados) {
        this.pacientesAsignados = pacientesAsignados;
    }

    public EspecialidadMedica getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(EspecialidadMedica especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }
}
