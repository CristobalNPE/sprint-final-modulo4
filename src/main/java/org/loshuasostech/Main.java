package org.loshuasostech;

import org.loshuasostech.modelos.Capacitacion;
import org.loshuasostech.modelos.Cliente;
import org.loshuasostech.modelos.Usuario;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Usuario usuario = new Usuario();
    Scanner scanner = new Scanner(System.in);

    Cliente c = new Cliente();
    Capacitacion capa = new Capacitacion();


    while (true) {
      System.out.print("Ingrese hora capa HH:MM : ");

      String hora = scanner.nextLine();
      try {
        capa.setHora(hora);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
      }


    }
    System.out.println(capa.getHora());

//    try {
//      usuario.setNombre(nombre);
//    } catch (IllegalArgumentException e) {
//      System.out.println("Error: " + e.getMessage());
//    }

  }
}