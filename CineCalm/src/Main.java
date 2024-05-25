public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a CineCalm");
        System.out.println("Película: Volver al Futuro");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
              
                "Volver al Futuro" es una película de 1985 donde Marty McFly viaja al pasado y 
                debe asegurar que sus padres se enamoren para poder regresar al presente.
               """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);




    }
}