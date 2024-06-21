import java.time.LocalDateTime;

public class Paciente {
    private String nombre;
    private String idPaciente;
    private int dni;
    private LocalDateTime fechaNacimiento;
    private int edad;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private String sexo;
    private boolean tieneSeguro;

    //Constructor

    public Paciente(String nombre, String idPaciente, int dni, LocalDateTime fechaNacimiento, int edad, String telefono,
                    String correoElectronico, String direccion, String sexo, boolean tieneSeguro) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.sexo = sexo;
        this.tieneSeguro = tieneSeguro;
        this.idPaciente = generarIdPaciente(nombre, dni);
    }

    // Método estático para generar el ID del paciente
    private static String generarIdPaciente(String nombre, int dni) {
        String primeraLetraNombre = nombre.substring(0, 1).toUpperCase();
        String ultimosTresDigitosDNI = String.format("%03d", dni % 1000);
        return primeraLetraNombre + ultimosTresDigitosDNI;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public int getDni() {
        return dni;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean isTieneSeguro() {
        return tieneSeguro;
    }
    @Override
    public String toString(){
        return "Paciente: \n" +
                "Nombre: " + nombre +
                "DNI: " + dni +
                "Fecha de naciento: " + fechaNacimiento +
                "Edad: " + edad +
                "Telefono: " + telefono +
                "Correo Electronico: " + correoElectronico +
                "Direccion: " + direccion +
                "Sexo: " + sexo +
                "Tiene seguro medico: " + tieneSeguro +
                "ID de Paciente: " + idPaciente ;
    }

}
