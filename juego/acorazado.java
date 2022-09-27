public class acorazado extends personaje {
    public acorazado(){
      npersonaje="Titan acorazado";
     salud=1500;
      fuerza=140;
      velocidad=700;
      proteccion=1000;
      habilidad="piel endurecida";
    }
     public static void detalles(){
        System.out.println("Titan de acorazado:");
        System.out.println("Salud: 1500");
        System.out.println("Fuerza: 180");
        System.out.println("Velocidad: 700");
        System.out.println("Protección: 1000");
        System.out.println("Habilidad: Piel endurecida");
      }
   
}
