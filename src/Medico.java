public class Medico {
    private String nombre;
    private String especialidad;

    public Medico(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return "Medico: \n" +
                "Nombre: " + nombre +
                "Especialidad: " + especialidad;
    }
}
