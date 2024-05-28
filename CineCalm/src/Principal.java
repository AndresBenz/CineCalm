import com.cinemacalm.catalogo.calculos.CalculadoraDeTiempo;
import com.cinemacalm.catalogo.calculos.FiltroRecomendaciones;
import com.cinemacalm.catalogo.modelos.Pelicula;
import com.cinemacalm.catalogo.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(170);

        miPelicula.fichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(9);

        //System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon ");
        casaDragon.setFechaDeLanzamiento(2023);
        casaDragon.setTemporadas(2);
        casaDragon.setEpisodios(25);
        casaDragon.setMinutosPorEpisodios(40);
        casaDragon.fichaTecnica();
        System.out.println(casaDragon.getMinutosPorEpisodios());
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

    }
}
