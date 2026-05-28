
package clases;

import java.util.ArrayList;

public class Agenda {
  static ArrayList<Contacto> contactos = new ArrayList<>();  
  
  public static void add(Contacto c){
      contactos.add(c);
  }
  
  public static int count(){
      return contactos.size();
  }
  
  public static ArrayList<Contacto> getContactos(){
      return contactos;
  }
}
