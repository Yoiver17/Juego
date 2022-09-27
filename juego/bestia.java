public class bestia extends personaje{
   public bestia(){
     npersonaje="Titan bestia";
     salud=1400;
     fuerza=150;
     velocidad=450;
     proteccion=500;
     habilidad="Convertir seres humanos en titanes";
   }
    public static void detalles(){
      System.out.println("Titan de bestia:");
      System.out.println("Salud: 1400");
      System.out.println("Fuerza: 150");
      System.out.println("Velocidad: 450");
      System.out.println("Protección: 500");
      System.out.println("Habilidad: Convertir seres humanos en titanes");
    }
}