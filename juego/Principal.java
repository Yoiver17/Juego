import java.net.SocketTimeoutException;
import java.util.Random;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
    personaje personaje1=null;
    personaje personaje2=null;
    Scanner leer=new Scanner(System.in);
    int respt,opc;
    do {
      System.out.println("shingeki no kyojin, bienvenido al juego jugador 1"); 
        System.out.println("1. Ver detalles de personajes");
        System.out.println("2. Seleccionar personaje al azar");
        System.out.println("3. Seleccionar personaje");
        respt=leer.nextInt();
        switch(respt){
            case 1:
            ataque.detalles();
            System.out.println();
            leer.nextLine();

            bestia.detalles();
            System.out.println();
            leer.nextLine();

            woman.detalles();
            System.out.println();
            leer.nextLine();

            acorazado.detalles();
            System.out.println();
            leer.nextLine();

            limpiar();
            
            break;

            case 2:
            int numero = (int)(Math.random()*4+1);
            if(numero==1){
                personaje1=new ataque();
            }else if(numero==2){
                 personaje1=new bestia();
            }else if(numero==3){
                 personaje1=new acorazado();
            }else if(numero==4){
                 personaje1=new woman();
            }
            if(numero==1){
                System.out.println("Tú personaje es el Titan de ataque");
            }else if(numero==2){
                System.out.println("Tú personaje es el Titan bestia");
            }else if(numero==3){
                System.out.println("Tú personaje es el Titan acorazado");
            }else if(numero==4){
                System.out.println("Tú personaje es la Titan woman");
            }
            System.out.println("Elejiste a Titan woman");
           
            System.out.println("Presione cualquier tecla para continuar");
            leer.nextLine();
   
     

            
            break;
            case 3:
            System.out.println("Seleccione un personaje");
            System.out.println("1. Titan de ataque");
            System.out.println("2. Titan bestia");
            System.out.println("3. Titan acorazado");
            System.out.println("4. Titan woman");
            numero=leer.nextInt();
            if(numero==1){
                 personaje1=new ataque();
            }else if(numero==2){
                 personaje1=new bestia();
            }else if(numero==3){
                 personaje1=new acorazado();
            }else if(numero==4){
                 personaje1=new woman();
            }if(numero==1){
                System.out.println("Elejiste a Titan de ataque");
            }else if(numero==2){
                System.out.println("Elejiste a Titan bestia");
            }else if(numero==3){
                System.out.println("Elejiste a Titan acorazado");
            }else if(numero==4){
                System.out.println("Elejiste a Titan woman");

          
            }
            break;
            default:
            System.out.println("Opción incorrecta");
            }  

           
           } while (respt!=3 && respt!=2);
           
           System.out.println("");
           do {
            System.out.println("shingeki no kyojin, bienvenido al juego jugador 2"); 
              System.out.println("1. Ver detalles de personajes");
              System.out.println("2. Seleccionar personaje al azar");
              System.out.println("3. Seleccionar personaje");
              respt=leer.nextInt();
              switch(respt){
                  case 1:
                  ataque.detalles();
            System.out.println();
            leer.nextLine();

            bestia.detalles();
            System.out.println();
            System.out.println("Pulse enter para continuar");
            System.out.println();
            leer.nextLine();
              
            woman.detalles();
            System.out.println();
            leer.nextLine();

            acorazado.detalles();
            System.out.println();
            leer.nextLine();


                  break;
      
                  case 2:
                  int numero = (int)(Math.random()*4+1);
                  if(numero==1){
                       personaje2=new ataque();
                       System.out.println("Tú personaje es el Titan de ataque");
                  }else if(numero==2){
                       personaje2=new bestia();
                       System.out.println("Tú personaje es el Titan bestia");
                  }else if(numero==3){
                       personaje2=new acorazado();
                       System.out.println("Tú personaje es el Titan acorazado");
                  }else if(numero==4){
                       personaje2=new woman();
                       System.out.println("Tú personaje es la Titan woman");
                  }
                 
                  break;
                  case 3:
                  System.out.println("Seleccione un personaje");
                  System.out.println("1. Titan de ataque");
                  System.out.println("2. Titan bestia");
                  System.out.println("3. Titan acorazado");
                  System.out.println("4. Titan woman");
                  numero=leer.nextInt();
                  if(numero==1){
                       personaje2=new ataque();
                      System.out.println("Elejiste a Titan de ataque");
                  }else if(numero==2){
                       personaje2=new bestia();
                      System.out.println("Elejiste a Titan bestia");
                  }else if(numero==3){
                       personaje2=new acorazado();
                      System.out.println("Elejiste a Titan acorazado");
                  }else if(numero==4){
                       personaje2=new woman();
                      System.out.println("Elejiste a Titan woman");
                  }
                      break;
                    default:
                  System.out.println("Opción incorrecta");
                }  
               

                 }while (respt!=3 && respt!=2);
                 System.out.println("");
                 System.out.println();
                 leer.nextLine();
                 limpiar();
                 
                 System.out.println("¡ES HORA DE LA BATALLA!");
                 do{
                    if(personaje2.salud>0){
                 atacar(personaje1, personaje2);
                 System.out.println("");
                 System.out.println("Jugador 1 ataca...");
                 System.out.println("Fuerza del ataque: "+personaje1.fuerza);
                 System.out.println("Velocidad del ataque: "+personaje1.velocidad);
                 System.out.println("Salud del personaje 2: "+personaje2.salud);
                    }
                    
                    if(personaje1.salud>0){
                    atacar(personaje2, personaje1);
                    System.out.println("");
                    System.out.println("Jugador 2 ataca...");
                    System.out.println("Fuerza del ataque: "+personaje2.fuerza);
                    System.out.println("Velocidad del ataque: "+personaje2.velocidad);
                    System.out.println("Salud del personaje 1: "+personaje1.salud);
                    leer.nextLine();
                    }
                 }while(personaje1.salud>0 && personaje2.salud>0);
                 if(personaje2.salud<=0){
                    System.out.println("Jugador 1 gana");
                 }else{
                    System.out.println("Jugador 2 gana");
                 }
                 
        }

       static void limpiar(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
        
       }


        static void atacar(personaje uno, personaje dos){
           dos.salud=dos.salud-uno.fuerza;
           uno.salud=uno.salud-dos.fuerza;
           
        }

}