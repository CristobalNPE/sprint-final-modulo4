package org.loshuasostech;

import org.loshuasostech.logic.Contenedor;
import org.loshuasostech.ui.TextUI;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Contenedor contenedor = new Contenedor();
    TextUI ui = new TextUI(scanner, contenedor);
    ui.start();
  }
}