import com.cinemacalm.catalogo.modelos.Pelicula;

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
    }
}
