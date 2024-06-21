import java.util.ArrayList;
import java.util.List;

public class RegistroCitas {
    private List<CitaMedica> citas;

    public RegistroCitas(){
        this.citas = new ArrayList<>();
    }

    public void agregarCita(CitaMedica cita){
        citas.add(cita);
    }

    public List<CitaMedica> obtenerCitas(){
        return citas;
    }

    public List<CitaMedica>obternerCitaPorPaciente(String pacienteId){
        List<CitaMedica> citasPaciente = new ArrayList<>();
        for (CitaMedica cita : citas){
            if (cita.getPaciente().getIdPaciente().equals(pacienteId)){
                citasPaciente.add(cita);
            }
        }
        return citasPaciente;
    }
}
