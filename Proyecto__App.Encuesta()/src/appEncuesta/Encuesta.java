
package appEncuesta;


public class Encuesta extends Cliente{
    private Integer nivelAtencion;
    private Integer nivelResolucion;
    private Integer nivelRecomendacion;
    private Integer promedioEncuesta;
    
    //metodo constructor

    public Encuesta(Integer nivelAtencion, Integer nivelResolucion, Integer nivelRecomendacion, String nombre, String apellido, Integer nroCliente) {
        super(nombre, apellido, nroCliente);
        this.nivelAtencion = nivelAtencion;
        this.nivelResolucion = nivelResolucion;
        this.nivelRecomendacion = nivelRecomendacion;
        
    }

    
    public Integer getNivelAtencion() {
        return nivelAtencion;
    }

    public void setNivelAtencion(Integer nivelAtencion) {
        this.nivelAtencion = nivelAtencion;
    }

    public Integer getNivelResolucion() {
        return nivelResolucion;
    }

    public void setNivelResolucion(Integer nivelResolucion) {
        this.nivelResolucion = nivelResolucion;
    }

    public Integer getNivelRecomendacion() {
        return nivelRecomendacion;
    }

    public void setNivelRecomendacion(Integer nivelRecomendacion) {
        this.nivelRecomendacion = nivelRecomendacion;
    }

    public Integer getPromedioEncuesta() {
        return promedioEncuesta;
    }

    public void setPromedioEncuesta(Integer promedioEncuesta) {
        this.promedioEncuesta = promedioEncuesta;
    }
  
 
   public Integer Promedio(int nivelAtencion, int nivelResolucion, int nivelRecomendacion){
       Integer promedio;
       promedio = (nivelAtencion + nivelResolucion + nivelRecomendacion)/3; 
       return promedio;
   }
    
    
}
