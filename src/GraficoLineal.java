import java.util.List;

public class GraficoLineal extends GeneradorGrafico{
    public GraficoLineal(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        validarDatos();
        System.out.println("=== [Gráfico Lineal de Tendencia] ===");
        System.out.print("Evolución: ");
        for (int i = 0; i < Datos.size(); i++) {
            System.out.print(Datos.get(i));
            if (i < Datos.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\n-------------------------------------\n");
    }
}
