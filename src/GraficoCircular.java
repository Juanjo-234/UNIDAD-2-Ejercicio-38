import java.util.List;

public class GraficoCircular extends GeneradorGrafico{
    public GraficoCircular(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        validarDatos();
        System.out.println("=== [Gráfico Circular / Sectores] ===");
        double sumaTotal = 0;
        for (double valor : Datos) {
            sumaTotal += valor;
        }

        for (int i = 0; i < Datos.size(); i++) {
            double porcentaje = (Datos.get(i) / sumaTotal) * 100;
            System.out.printf("Sector %d: %.1f%% del total (Valor: %.1f)\n", (i + 1), porcentaje, Datos.get(i));
        }
        System.out.println("-------------------------------------\n");
    }
}
