
interface TiposBarajas extends Baraja {
enum tipoBarajas {Espaņola, Inglesa};
enum valor{};
enum palo{};

 boolean asignaryValorPalo (int valor,int palo) throws Throwable; 
 boolean aņadirvalor(int valor ) throws Throwable;  
 tipoBarajas propiedadesBaraja() throws Throwable;
boolean aņadirvalor(int palo, int valor) throws Throwable;

}
