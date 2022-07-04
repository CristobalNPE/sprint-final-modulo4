# Sprint Final Modulo 4 [JAVA]

#### Desarrollado por Los Huasos TECH:

[Natalia Ponce](https://github.com/Natalia1428),
[Diego Saavedra](https://github.com/dleonDesarrollo),
[Cristobal Pulgar](https://github.com/CristobalNPE).

## Contexto

Se necesita proveer una solucion teconologica a una compañia
de asesorias en prevencion de riesgos, que cuente con la
capacidad de manejar y almacenar la inscripcion de diversos
tipos de usuario y capacitaciones.

## Solucion

Para este fin se implemento una aplicacion de interfaz de texto
capaz de cumplir con los requisitos antes mencionados de la
siguiente manera:

- Se definen diversas clases 'modelo' representando a cada
  entidad que conforma el programa: Usuario, Cliente, Profesional,
  Administrativo, Capacitacion, Visitas en terreno y Revision.
- Tambien se definio una interfaz 'Asesoria' con el fin de
  agrupar los distintos tipos de usuario para su posterior analisis.
- Se definieron multiples validaciones en los metodos mutadores
  con el objetivo de asignar los valores a cada entidad al momento
  de su creacion segun el formato requerido por el solicitante.
- Se creo una clase 'helper' simplificar la validacion de los
  campos que requerian un formato especifico, como fechas y horas.
- En la clase Contenedor, esta constituida la logica del programa
  que permite ingresar, eliminar y consultar datos respecto de Usuarios
  y Capacitaciones.
- Para proporcionar al usuario final una manera agil de manejar la
  aplicacion, se creo una clase que almacena una interfaz de texto que
  muestra a dicho usuario los diferentes menus y opciones que el programa
  puede presentar.
- Finalmente, se creo una Interfaz Funcional que permitio llamar a
  los metodos mutadores desde el menu evitando repeticion de codigo.

## Herramientas

- Java 15

