package org.loshuasostech.ui;

import org.loshuasostech.helpers.SetOperation;
import org.loshuasostech.logic.Contenedor;
import org.loshuasostech.modelos.*;

import java.util.Scanner;

public class TextUI {
  private Scanner scanner;
  private Contenedor contenedor;

  public TextUI(Scanner scanner, Contenedor contenedor) {
    this.scanner = scanner;
    this.contenedor = contenedor;
  }

  /**
   * Inicia el programa y despliega el menu principal
   */
  public void start() {
    while (true) {
      System.out.println("*********************************");
      System.out.println("*      Ingrese una opcion:      *");
      System.out.println("*********************************");
      System.out.println("| 1) Almacenar cliente          |");
      System.out.println("| 2) Almacenar profesional      |");
      System.out.println("| 3) Almacenar administrativo   |");
      System.out.println("| 4) Almacenar capacitacion     |");
      System.out.println("| 5) Eliminar usuario           |");
      System.out.println("| 6) Listar usuarios            |");
      System.out.println("| 7) Listar usuarios por tipo   |");
      System.out.println("| 8) Listar capacitaciones      |");
      System.out.println("| 0) Salir                      |");
      System.out.println("*********************************");
      System.out.print(" > ");
      String input = scanner.nextLine();

      if (input.equals("0")) {
        System.out.println("Adios!");
        break;
      } else if (input.matches("[1-8]")) {
        procesarInput(input);
      }
    }
  }

  private void procesarInput(String input) {
    if (input.equals("1")) {
      almacenarCliente();
    }
    if (input.equals("2")) {
      almacenarProfesional();
    }
    if (input.equals("3")) {
      almacenarAdministrativo();
    }
    if (input.equals("4")) {
      almacenarCapacitacion();
    }
    if (input.equals("5")) {
      eliminarUsuario();
    }
    if (input.equals("6")) {
      listarUsuarios();
    }
    if (input.equals("7")) {
      listarPorTipo();
    }
    if (input.equals("8")) {
      listarCapacitaciones();
    }
  }

  private void listarCapacitaciones() {
    for (Capacitacion c : this.contenedor.obtenerCapacitaciones()) {
      System.out.println("===========================");
      System.out.println("ID Capacitacion : " + c.getId());
      System.out.println("===========================");
      System.out.println("+++ Clientes: +++ ");
      for (Usuario u : this.contenedor.obtenerUsuarios()) {
        if (u.getRun() == Integer.parseInt(c.getRutCliente())) {
          System.out.println(u);
          System.out.println("--------------------");
        }
      }
    }
  }

  private void listarPorTipo() {
    System.out.println("Que tipo de Usuario desea listar:");
    System.out.println(" 1) Cliente");
    System.out.println(" 2) Profesional");
    System.out.println(" 3) Administrativo");

    String input = scanner.nextLine();

    if (input.equals("1")) {
      this.contenedor.listarUsuariosPorTipo("cliente");
    } else if (input.equals("2")) {
      this.contenedor.listarUsuariosPorTipo("profesional");
    } else if (input.equals("3")) {
      this.contenedor.listarUsuariosPorTipo("administrativo");
    } else {
      System.out.println("Opcion no valida");
    }
  }

  private void eliminarUsuario() {
    while (true) {
      String rutAEliminar = validarNoVacio("Indique el RUT");
      try {
        boolean borrado =
                this.contenedor.eliminarUsuario(Integer.parseInt(rutAEliminar));
        if (borrado) {
          System.out.println("\nUsuario eliminado exitosamente!\n");
        }
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      }
    }
  }

  private void listarUsuarios() {
    for (Usuario usuario : this.contenedor.obtenerUsuarios()) {
      System.out.println("---------------------------");
      System.out.println("Nombre          : " + usuario.getNombre());
      System.out.println("RUT             : " + usuario.getRun());
      System.out.println("Fecha nacimiento: " + usuario.getFechaNacimiento());
    }
    System.out.println("---------------------------");
    System.out.println();
  }

  private void almacenarCliente() {
    Cliente cliente = new Cliente();
    System.out.println("Ingrese la informacion del nuevo cliente: ");

    validar(cliente::setNombre, "Nombre");
    validar(cliente::setApellidos, "Apellido");
    validar(cliente::setFechaNacimiento, "Fecha Nacimiento (DD/MM/AAAA)");
    validar(cliente::setRun, "RUN");
    validar(cliente::setTelefono, "Telefono");
    validar(cliente::setAfp, "AFP");
    validar(cliente::setSistemaSalud, "Sistema de salud [1|2]");
    validar(cliente::setDireccion, "Direccion");
    validar(cliente::setComuna, "Comuna");
    validar(cliente::setEdad, "Edad");

    this.contenedor.almacenarCliente(cliente);
    System.out.println("\nCliente almacenado con exito!\n");

  }

  private void almacenarProfesional() {
    Profesional pro = new Profesional();
    System.out.println("Ingrese la informacion del nuevo Profesional: ");

    validar(pro::setNombre, "Nombre");
    validar(pro::setFechaNacimiento, "Fecha Nacimiento (DD/MM/AAAA)");
    validar(pro::setRun, "RUN");
    validar(pro::setTitulo, "Titulo");
    validar(pro::setFechaIngreso, "Fecha Ingreso (DD/MM/AAAA)");

    this.contenedor.almacenarProfesional(pro);
    System.out.println("\nProfesional almacenado con exito!\n");
  }

  private void almacenarAdministrativo() {
    Administrativo admin = new Administrativo();
    System.out.println("Ingrese la informacion del nuevo Administrativo: ");

    validar(admin::setNombre, "Nombre");
    validar(admin::setFechaNacimiento, "Fecha Nacimiento (DD/MM/AAAA)");
    validar(admin::setRun, "RUN");
    validar(admin::setArea, "Area");
    validar(admin::setExpPrevia, "Experiencia previa");

    this.contenedor.almacenarAdministrativo(admin);
    System.out.println("\nAdministrativo almacenado con exito!\n");
  }

  private void almacenarCapacitacion() {
    Capacitacion capa = new Capacitacion();
    System.out.println("Ingrese la informacion para una nueva capacitacion: ");

    validar(capa::setId, "Identificador");
    validar(capa::setRutCliente, "RUT Cliente");
    validar(capa::setDia, "Dia");
    validar(capa::setHora, "Hora (HH:MM)");
    validar(capa::setLugar, "Lugar");
    validar(capa::setDuracion, "Duracion (min)");
    validar(capa::setCantidadAsistentes, "Cantidad Asistentes");

    this.contenedor.almacenarCapacitacion(capa);
    System.out.println("\nCapacitacion almacenada con exito!\n");
  }

  private void validar(SetOperation operation, String prompt) {
    while (true) {
      String data = validarNoVacio(prompt);
      try {
        operation.apply(data);
        break;
      } catch (NumberFormatException e) {
        System.out.println(" < Debe ingresar un numero > ");
      } catch (IllegalArgumentException e) {
        System.out.println(" < " + e.getMessage() + " > ");
      }
    }
  }

  private String validarNoVacio(String aValidar) {
    String dato;
    while (true) {
      System.out.print(aValidar + ": ");
      dato = scanner.nextLine();
      if (!dato.isEmpty()) {
        return dato;
      }
      System.out.println(" < Este campo es obligatorio > ");
    }
  }
}
