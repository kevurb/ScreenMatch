import com.nuamx.screenmatch.calculos.CalculadoraDeTiempo;
import com.nuamx.screenmatch.modelos.Pelicula;
import com.nuamx.screenmatch.modelos.Serie;


public class Main {
     public static void main (String[] args){

         Pelicula miPelicula = new Pelicula();
         miPelicula.setNombre("Matrix");
         miPelicula.setFechaDeLazamiento(20251202);
         miPelicula.setDuracionEnMinutos(120);
         miPelicula.setIncluidoEnElPlan(false);

         miPelicula.mostrarFichaTecnica();
         miPelicula.evalua(10);
         miPelicula.evalua(20);
         //System.out.println(miPelicula.getConteoRates());
         //System.out.println(miPelicula.average());

         Serie casaDragon =  new Serie();
         casaDragon.setNombre("La casa del Dragon");
         casaDragon.setFechaDeLazamiento(2022);
         casaDragon.setTemporadas(1);
         casaDragon.setMinutoPorEpisodio(50);
         casaDragon.setEpisodiosPorTemporada(10);
         casaDragon.mostrarFichaTecnica();
         //System.out.println(casaDragon.getDuracionEnMinutos());

         CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
         calculadora.incluye(miPelicula);
         calculadora.incluye(casaDragon);

         Pelicula otraPelicula = new Pelicula();
         otraPelicula.setNombre("Matrix");
         otraPelicula.setFechaDeLazamiento(1998);
         otraPelicula.setDuracionEnMinutos(98);
         calculadora.incluye(otraPelicula);
         System.out.println("Tiempo necesario para ver tus titulos favoritos: "+calculadora.getTiempoTotal());
     }
}
