package org.loshuasostech;

import org.loshuasostech.modelos.Cliente;
import org.loshuasostech.modelos.Usuario;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Usuario usuario = new Usuario();
    Scanner scanner = new Scanner(System.in);

    Cliente c = new Cliente();



    while (true) {
      System.out.print("Ingrese su fecha de nacimiento en formato dd//mm//yy: ");

      String fecha = scanner.nextLine();
      try {
        usuario.setFechaNacimiento(fecha);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
      }


    }
    System.out.println(usuario.getFechaNacimiento());

//    try {
//      usuario.setNombre(nombre);
//    } catch (IllegalArgumentException e) {
//      System.out.println("Error: " + e.getMessage());
//    }

  }
}