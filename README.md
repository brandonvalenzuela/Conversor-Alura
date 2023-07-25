# Conversor-Alura
#Oracle ONE
# CONVERSOR DE MONEDAS

brandonvalenzuela@gmail.com  2023/25/07

## Índice

* [Descripcion de challenge](#descripcion-del-challenge)

    * [Main](#clase-main)

    * [Conversores](#conversor)

        * [Moneda](#conversor-de-monedas-1)

        * [Temperatura](#conversor-de-temperatura)

        * [Distancia](#conversor-de-distancia)

    * [Pantallas](#Pantallas)

    * [Clone](#Clone)

   


## Descripcion del challenge

Challenge BackEnd Java - Conversor. En esta oportunidad, a los Devs se nos solicitó crear un conversor de divisas utilizando el lenguaje Java. Las características solicitadas por nuestro cliente son las siguientes:

El convertidor de moneda debe:

      - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano

Recordando que también debe ser posible convertir inversamente, es decir:

        - Convertir de Dólar a la moneda de tu país
        - Convertir de Euros a la moneda de tu país
        - Convertir de Libras Esterlinas a la moneda de tu país
        - Convertir de Yen Japonés a la moneda de tu país
        - Convertir de Won sul-coreano a la moneda de tu país

<strong> Extras: </strong>

    - Conversor de Temperatura
    - Conversor de Distancia



## Clase Main

Funcion desde la cual se inicia el programa, contiene la opcion de seleccionar el tipo de conversor (Monedas, Temperatura, Distancia(Proceso) y Datos(Espera).

        posiblesValores -> Arreglo de objetos, Conversores a seleccionar
        opcionSeleccionada -> Enum, Opcion que el usuario selecciono

El usuario selecciona una opcion de posiblesValores, y se guarda en opcionSeleccionada, dependiendo la opcion se manda a llamar la funcion correspondiende de la clase Conversor, al finalizar se pregunta al usuario si desea continuar, la respuesta se guarda en la variable siono, y dependiendo la seleccion se vuelve a ejecutar el programa o se finaliza con un cuadro de dialogo que muestra un mensaje de finalizacion.

## Conversor

Hay 4 tipos de conversores: Moneda, Temperatura, Distancia y Datos.

### Conversor de monedas
Esta la funcion ConvertirMoneda() la cual contiene:
        cantidad -> Double, caantidad ingresada por el usuario
        opcionSeleccionada -> Enum, seleccion del usuario de tipo a tipo de moneda

El programa pide al usuario que ingrese la cantidad a convertir, luego el programa pide al usuario que seleccione el tipo de conversion de que moneda a que moneda sera, finalmente el programa dependiendo de la seleccion aplica el cambio y lo muestra en pantalla.

### Conversor de temperatura
Esta la funcion ConvertirTemperatura() la cual contiene:
        cantidad -> Double, caantidad ingresada por el usuario
        opcionSeleccionada -> Enum, seleccion del usuario de tipo a tipo de moneda

El programa pide al usuario que ingrese la cantidad a convertir, luego el programa pide al usuario que seleccione el tipo de conversion de que grados a que grados sera, finalmente el programa dependiendo de la seleccion aplica la conversion y lo muestra en pantalla.

### Conversor de distancia (preoceso)
Esta la funcion ConvertirDistancia() la cual contiene:
        cantidad -> Double, caantidad ingresada por el usuario
        opcionSeleccionada -> Enum, seleccion del usuario de tipo a tipo de moneda

### Conversor de datos (En espera)

El programa pide al usuario que ingrese la cantidad a convertir, luego el programa pide al usuario que seleccione el tipo de conversion de que unidad a que unidad de distancia sera, finalmente el programa dependiendo de la seleccion aplica la conversion y lo muestra en pantalla.

## Pantallas
   Para mostrar las pantallas de la interfaz para el uso de la aplicacion. Hace uso de la libreria JOptionPane de javax.

## Clone https://github.com/brandonvalenzuela/Conversor-Alura








        
