package Code;

import java.util.ArrayList;
import java.util.Scanner;

public class playlist{
  private String nombre;
  private float duracion;
  private String link;
  private String tipoMusica;
  Scanner leer = new Scanner(System.in);

  public static ArrayList<playlist> playlists;
  ArrayList <Canciones> canciones = new ArrayList<Canciones>();
  
  public void Crearplaylist(String nombre, String link, String tipoMusica)
  {
    this.nombre = nombre;
    this.link = link;
    this.tipoMusica = tipoMusica;
  }
  //Set
  public void setTipoM(String TipoMusica)
  {
    this.tipoMusica = TipoMusica;
  }
  public void setLink(String link)
  {
    this.link = link;
  }
  public void setDuracion(float duracion)
  {
    this.duracion = duracion;
  }
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  public String getNombre()
  {
    return this.nombre;
  }

  public float getDuracion()
  {
    return this.duracion;
  }

  public String getLink()
  {
    return this.link;
  }

  public String GetTipoMusica()
  {
    return this.tipoMusica;
  }

  public void agregarMusica()
  {
    int valid = 1;
    int i = 1;
    int opcion = 0;
    String nombre = leer.next();
    if(nombre == null)
    {
      System.out.println("El nombre no es valido.");
      i = 0;
    }
    while(i != 0)
    {
      Canciones cancion = new Canciones();
      for(int  j = 0; j < playlists.size(); j++)
      {
        if(playlists.get(j).getNombre() == nombre)
        {
          playlists.get(j).canciones.add(cancion);
          valid = 0;
        }
      }
      if(valid != 0)
      {
        System.out.println("No se pudo agregar la cancion ~w~ .");
      }
            
      if(valid == 0)
      {
        System.out.println("Se agrego la cancion correctamente! .");
        valid = 1;
      }

      System.out.println("Desea agregar otra cancion ?");
      System.out.println("opcion 1 : si");
      System.out.println("opcion 2 : no");

      opcion = leer.nextInt();
      if(opcion == 2)
        i = 0;
      if(opcion != 1 && opcion != 2)
      {
        System.out.println("la opcion ingresada no es valida, se dejaran de agregar canciones a la playlist.");
      i = 0;
      }

    }
  }

  public void verPlaylist()
  {
    int antonioFlag = 0;
    String nombre = leer.next();
    if(nombre == null)
    {
      System.out.println("El nombre no es valido.");
    }
    for(int i = 0 ; i < playlists.size() ; i++)
    {
      if(playlists.get(i).getNombre() == nombre)
      {
        antonioFlag = 1;
        for(int j = 0 ; j < playlists.get(i).canciones.size() ; j++)
        {
            int posc = j+1;
            System.out.println(posc + "-" + playlists.get(i).canciones.get(j).getNombre());
            System.out.println("  " + playlists.get(i).canciones.get(j).getBPM());
            System.out.println("  " + playlists.get(i).canciones.get(j).getDuracion());
            System.out.println("  " + playlists.get(i).canciones.get(j).getGenero());
            System.out.println("  " + playlists.get(i).canciones.get(j).getLink());
        }
      }
    }
    if(antonioFlag == 0)
    {
      System.out.println("No se encontro la lista de reproduccion ~w~.");
    }
  }

  public void crearPlaylist(){
    System.out.println("Ingresa el nombre de la playlist.");
    String nombre = leer.next();
    System.out.println("Ingresa el link de la playlist.");
    String link = leer.next();
    System.out.println("Ingresa el tipo de musica de la playlist.");
    String tipoMusica = leer.next();
    playlist play = new playlist();
    play.Crearplaylist(nombre, link, tipoMusica);
    playlists.add(play);
  }

  public void eliminarCancion(){
    
    boolean ver = true;
    String nombre;
    String nombreC;
    int opcion;
    int flag;
    int flagP;
    
    while(ver){
      System.out.println("Ingresa el nombre de la playlist a modificar.");
      nombre = leer.next();
      flag = 1;
      flagP = 1;
      for(int i = 0; i < playlists.size(); i++)
      {
        if(playlists.get(i).getNombre() == nombre)
        {
          flagP = 0;
          System.out.println("Ingresa el nombre de la cancion a eliminar.");
          nombreC = leer.next();
          for(int j = 0; j < canciones.size(); j++)
          {
              if(canciones.get(j).getNombre() == nombreC)
              {
                System.out.println("La cancion se a eliminado de forma exitosa.");
                flag = 0;
                canciones.remove(j);
              }
          }
        }
      }
      if(flagP == 1)
         System.out.println("La playlist no se encuetra disponble, porfavor escoja una playlist valida.");
      
      if(flag == 1 && flagP != 1)
        System.out.println("La cancion no se encontro en la playlist solicitada y no pudo ser eliminada.");
      
      System.out.println("Desea eliminar otra cancion?");
      System.out.println("Opcion 1: si");
      System.out.println("Opcion 2 o cualquier otro numero: no");
      opcion = leer.nextInt();
      
      if(opcion != 1)
        ver = false;
    }
  }
}
