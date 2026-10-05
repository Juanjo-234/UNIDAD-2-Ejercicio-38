import java.util.List;

public abstract class GeneradorGrafico {
List<Double> Datos;

public GeneradorGrafico(List<Double>Datos){
    this.Datos = Datos;
}

    public abstract void renderizarGrafico();
void validarDatos(){
    if(Datos ==  null || Datos.isEmpty()){
        System.out.println("Error: No se puede renderizar el gráfico porque la lista de datos está vacía o es nula.");
    }
}
}
