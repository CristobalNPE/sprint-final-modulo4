package org.loshuasostech.ui;

import org.loshuasostech.logic.Contenedor;
import org.loshuasostech.modelos.Administrativo;
import org.loshuasostech.modelos.Capacitacion;
import org.loshuasostech.modelos.Cliente;
import org.loshuasostech.modelos.Profesional;

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
      System.out.println("Ingrese una opcion");
      System.out.println("1) Almacenar cliente");
      System.out.println("2) Almacenar profesional");
      System.out.println("3) Almacenar administrativo");
      System.out.println("4) Almacenar capacitacion");
      System.out.println("5) Eliminar usuario");
      System.out.println("6) Listar usuarios");
      System.out.println("7) Listar usuarios por tipo");
      System.out.println("8) Listar capacitaciones");
      System.out.println("0) Salir");

      String input = scanner.nextLine();

      if (input.equals("0")) {
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
    this.contenedor.listarCapacitaciones();
  }

  private void listarPorTipo() {
    System.out.println("Que tipo de Usuario desea listar:");
    System.out.println("1) Cliente");
    System.out.println("2) Profesional");
    System.out.println("3) Administrativo");

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
      String rutAEliminar = validarDato("Indique el RUT");
      try {
        this.contenedor.eliminarUsuario(Integer.parseInt(rutAEliminar));
        System.out.println("Usuario eliminado exitosamente!\n");
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      }
    }
  }

  private void listarUsuarios() {
    this.contenedor.listarUsuarios();
  }

  private void almacenarCliente() {
    Cliente cliente = new Cliente();
    System.out.println("Ingrese la informacion del nuevo cliente: ");

    while (true) {
      String nombre = validarDato("Nombre");
      try {
        cliente.setNombre(nombre);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String fechaNacimiento = validarDato("Fecha Nacimiento (DD/MM/AAAA)");
      try {
        cliente.setFechaNacimiento(fechaNacimiento);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String run = validarDato("RUN");
      try {
        cliente.setRun(Integer.parseInt(run));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String apellido = validarDato("Apellido");
      try {
        cliente.setApellidos(apellido);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String telefeno = validarDato("Telefono");
      try {
        cliente.setTelefono(telefeno);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String afp = validarDato("AFP");
      try {
        cliente.setAfp(afp);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String ss = validarDato("Sistema de Salud");
      try {
        cliente.setSistemaSalud(Integer.parseInt(ss));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String direccion = validarDato("Direccion");
      try {
        cliente.setDireccion(direccion);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String comuna = validarDato("Comuna");
      try {
        cliente.setComuna(comuna);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String edad = validarDato("Edad");
      try {
        cliente.setEdad(Integer.parseInt(edad));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    this.contenedor.almacenarCliente(cliente);
  }

  private void almacenarProfesional() {
    Profesional profesional = new Profesional();
    System.out.println("Ingrese la informacion del nuevo Profesional: ");

    while (true) {
      String nombre = validarDato("Nombre");
      try {
        profesional.setNombre(nombre);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String fechaNacimiento = validarDato("Fecha Nacimiento (DD/MM/AAAA)");
      try {
        profesional.setFechaNacimiento(fechaNacimiento);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String run = validarDato("RUN");
      try {
        profesional.setRun(Integer.parseInt(run));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String titulo = validarDato("Titulo");
      try {
        profesional.setTitulo(titulo);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String fechaIngreso = validarDato("Fecha Ingreso (DD/MM/AAAA)");
      try {
        profesional.setFechaIngreso(fechaIngreso);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    this.contenedor.almacenarProfesional(profesional);
  }

  private void almacenarAdministrativo() {
    Administrativo administrativo = new Administrativo();
    System.out.println("Ingrese la informacion del nuevo Administrativo: ");

    while (true) {
      String nombre = validarDato("Nombre");
      try {
        administrativo.setNombre(nombre);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String fechaNacimiento = validarDato("Fecha Nacimiento (DD/MM/AAAA)");
      try {
        administrativo.setFechaNacimiento(fechaNacimiento);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String run = validarDato("RUN");
      try {
        administrativo.setRun(Integer.parseInt(run));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String area = validarDato("Area");
      try {
        administrativo.setArea(area);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String expPrevia = validarDato("Experiencia Previa");
      try {
        administrativo.setExpPrevia(expPrevia);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    this.contenedor.almacenarAdministrativo(administrativo);
  }

  private void almacenarCapacitacion() {
    Capacitacion capacitacion = new Capacitacion();
    System.out.println("Ingrese la informacion para una nueva capacitacion: ");

    while (true) {
      String id = validarDato("Identificador");
      try {
        capacitacion.setId(Integer.parseInt(id));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String rutCliente = validarDato("Rut Cliente");
      try {
        capacitacion.setRutCliente(rutCliente);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String dia = validarDato("Dia");
      try {
        capacitacion.setDia(dia);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String hora = validarDato("Hora");
      try {
        capacitacion.setHora(hora);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String lugar = validarDato("Lugar");
      try {
        capacitacion.setLugar(lugar);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (true) {
      String duracion = validarDato("Duracion");
      try {
        capacitacion.setDuracion(duracion);
        break;
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (true) {
      String cantidadAsistentes = validarDato("Cantidad de Asistentes");
      try {
        capacitacion.setCantidadAsistentes(Integer.parseInt(cantidadAsistentes));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Debe Ingresar un numero");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    this.contenedor.almacenarCapacitacion(capacitacion);
  }

  private String validarDato(String aValidar) {
    String dato;
    while (true) {
      System.out.print(aValidar + ": ");
      dato = scanner.nextLine();
      if (!dato.isEmpty()) {
        return dato;
      }
      System.out.println("Este campo es obligatorio");
    }
  }


}
