import java.util.List;

public class GraficoBarras extends GeneradorGrafico{
    public GraficoBarras(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        validarDatos();
        System.out.println("=== [Gráfico de Barras] ===");
        for (int i = 0; i < Datos.size(); i++) {
            int cantidadBloques = (int) Math.round(Datos.get(i));
            System.out.print("Dato " + (i + 1) + " (" + Datos.get(i) + "): ");
            for (int j = 0; j < cantidadBloques; j++) {
                System.out.print("█");
            }
            System.out.println();
        }
        System.out.println("---------------------------\n");
    }
}
