package Code;
import java.util.Scanner;
//import java.util.Date;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import ventanas.Login;

class Main {
  //variables globales

  public static Usuario persona;
  public static Meta metaLlegar;
  //public static ArrayList<playlist> playlists;
  
    public static void main(String[] args) {
    Login login = new Login();
    login.setVisible(true);
    verificarArchivo("datosPersona.txt");

      //Agregar canciones 

      //canciones = new ArrayList<Canciones>();

      /*for(int i = 0; i< 5;i++)
      {
        Canciones canciones1 = new Canciones();
        canciones.add(canciones1);
      }

      //Agregar datos del usuario

      String nombre;
      Scanner leer = new Scanner(System.in);
      //FileWriter fw = new FileWriter(file);
      //PrintWriter pw = new PrintWriter(fw);
    
      int flag = 0;
    
      do{
          System.out.println("Insertar Nombre: ");
          nombre = leer.next(); 
          if(nombre.matches("[a-zA-Z].*"))
            flag = 1;
        else
          System.out.println("El nombre no se ingreso correctamente, se pusieron numeros o caracteres, por favor vuelva a ingresar el nombre.");
      }while(flag == 0);
    
      System.out.println("Insertar edad: ");
      int edad = leer.nextInt();

      System.out.println("Insertar peso: ");
      float peso = leer.nextFloat();
    
      System.out.println("Insertar altura: ");
      float altura = leer.nextFloat();
    
      //System.out.println("Insertar fecha de nacimiento: ");
      //Date fecha = new Date();

      persona = new Usuario(nombre, edad, peso, altura);*/
      //persona.obtenerImc(peso, altura);
      double imc = persona.getImc();
      //pw.println(persona); //Guardar persona en archivo

      //pw.close();

      //Metas de usuario
      
      /*System.out.println("Ingresar IMC al que se quiere llegar: ");
      float imcDeseado = leer.nextFloat();
    

      System.out.println("Ingresar peso al que se quiere llegar: ");
      float pesoDeseado = leer.nextFloat();*/

/*               Crear la rutina del usuario            
    
        1.El usuario debe elegir opciones Switch opciones              
        ejemplo: 1 cuerpo completo, 2 pecho , 3 abdomen etc;
        cada ejerciocio tendra su tipo como para buscarlos
        2.El tiempo
        con el tiempo se hara un tiempo total y se restara con los tiempos de ejercicios hasta llegar a 0 o < 0 
        3.Seleccion de partes de cuerpo del 1 al 3
        los cuales se buscaran en un ciclo hasta igualar y agregar a la nueva lista de rutina creada}
*/
    /*}
    else{
      System.out.println("Iniciando Sesion...");
      iniciarSesion();
    }
    menu(persona);*/
    
  }


  public static void menu(Usuario persona){
    int flag;
    playlist metod = new playlist();
    Scanner leer = new Scanner(System.in);
    Boolean ver = true;
    
    while(ver){
      System.out.println("Seleccione una opcion");
      System.out.println("Opcion 1 : Agregar cancion a Playlist");
      System.out.println("Opcion 2 : Mostrar datos de usuario");
      System.out.println("Opcion 3 : Ver PlayList");
      System.out.println("Opcion 4 : Crear Playlist");
      System.out.println("Opcion 5 : Eliminar cancion de Playlist");
      System.out.println("Opcion 6 u otro numero : Salir del programa");
 
      flag = leer.nextInt();
      
      //Agregar canciones.
      if(flag == 1)
      {
        metod.agregarMusica();
      }
      
      if(flag == 2){
        System.out.println("El nombre del usuario es: " + persona.getNombre());
        if(persona.getEdad() > 0 && persona.getEdad() < 100){
          System.out.println("La edad del usuario es: " + persona.getEdad());
          System.out.println("El peso del usuario es: " + persona.getPeso());
          System.out.println("La altura del usuario es: " + persona.getAltura());
          System.out.println("El Imc del usuario es: " + persona.getImc());
        }
        else{
          System.out.println("La edad del usuario no se encuentra agregada");
          System.out.println("El peso del usuario es: " + persona.getPeso());
          System.out.println("La altura del usuario es: " + persona.getAltura());
          System.out.println("El Imc del usuario es: " + persona.getImc());
        }
        
        
      }
      
      if(flag == 3){
        metod.verPlaylist();
      }
      
      if(flag == 4){
        metod.crearPlaylist();
      }

      if(flag == 5){
        metod.eliminarCancion();
      }
      
      if(flag != 1 && flag != 2 && flag != 3 && flag != 4 && flag != 5){
        ver = false;
      }
    }
  }

  public static boolean verificarArchivo(String ruta){
    File archivo = new File(ruta); //Cargar archivo en ruta ()
    if (!archivo.exists()){ //si archivo no existe
    try{
      archivo.createNewFile(); //crear
      return false;
    }catch (IOException e){
      System.out.print(e);
    }
    }
    return true;
  }

  public static void cargarUsuario() {
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("datos/datosPersona.txt"));

      String linea; // leer primer linea
      while ((linea = archivo.readLine()) != null) { // Avanzar siempre que existan lineas
        String[] campos = linea.split(";"); // separar en campos por ";"
        persona = new Usuario((campos[0]),(campos[1]));//Añadir camos a futuro!
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

    public static void cargarMeta() {
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("datos/metaPersona.txt"));

      String linea; // leer primer linea
      while ((linea = archivo.readLine()) != null) { // Avanzar siempre que existan lineas
        String[] campos = linea.split(";"); // separar en campos por ";"
        metaLlegar = new Meta((Float.parseFloat(campos[0])),(Float.parseFloat(campos[1])));
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}