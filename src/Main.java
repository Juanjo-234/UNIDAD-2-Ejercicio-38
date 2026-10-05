import java.util.ArrayList;
import java.util.List;
void main() {
    List<Double> dataset = new ArrayList<>();
    dataset.add(5.0);
    dataset.add(12.0);
    dataset.add(8.0);
    dataset.add(15.0);


    List<GeneradorGrafico> generadores = new ArrayList<>();
    generadores.add(new GraficoBarras(dataset));
    generadores.add(new GraficoCircular(dataset));
    generadores.add(new GraficoLineal(dataset));

    System.out.println("=== SIMULACIÓN VISUAL DE GRÁFICOS ===\n");
    for (GeneradorGrafico generador : generadores) {
        try {
            generador.renderizarGrafico();
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
    System.out.println("=== PRUEBA DE VALIDACIÓN (Lista Vacía) ===");
    try {
        GeneradorGrafico graficoInvalido = new GraficoBarras(new ArrayList<>());
        graficoInvalido.renderizarGrafico();
    } catch (IllegalStateException e) {
        System.err.println("[Excepción capturada]: " + e.getMessage());
    }
}

