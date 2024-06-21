import java.time.LocalDateTime;

public class CitaMedica {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime fechaHora;

    public CitaMedica(Paciente paciente, Medico medico, LocalDateTime fechaHora){
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Medico getMedico() {
        return medico;
    }

    @Override
    public String toString(){
        return "Cita Medica: \n" +
                "Paciente: " + paciente +
                "Medico:" + medico +
                "Fecha hora: " + fechaHora;
    }
}
