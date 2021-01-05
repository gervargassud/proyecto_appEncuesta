
package appEncuesta;


public class Cliente {
   protected String nombre;
   protected String apellido;
   protected Integer nroCliente;
    
    //metodo constructor

    public Cliente(String nombre, String apellido, Integer nroCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCliente = nroCliente;
    }
    
    //setters & getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(Integer nroCliente) {
        this.nroCliente = nroCliente;
    }
    
    
    
}
