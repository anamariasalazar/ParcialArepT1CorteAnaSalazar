# TALLER-DE-VERIFICACIÓN-DE-CONOCIMIENTOS-TÉCNICOS

La aplicación debe consultar el estado del clima en lugares específicos de la tierra.  La aplicación recibirá en un campo la descripción de una ciudad, por ejemplo “London” para Londres   y deberá mostrar la información del clima para esa ciudad.

### Requisitos previos

* Tener maven instalado
* Tener git instalado
* Versión de Java 7 o Java 8
* Tener Heroku

### Instalación

1. Para hacer uso de este proyecto debe clonarlo de este repositorio a su computadora desde cmd usando el siguiente comando:
   
   ```
   git clone https://github.com/anamariasalazar/ParcialArepT1CorteAnaSalazar.git
   ```

2. Antes de ejecutarlo debe compilar el proyecto, para esto haga uso del siguiente comando:

    ```
    mvn package
    ```
3.  * Si se encuentra desde linux en el archivo procfile y reemplace el contenido por el siguiente texto:
    
    ```
    web: java $JAVA_OPTS -cp 'target/classes:target/dependency/* edu.escuelaing.arep.App
    
    ```
    * Si se encuentra desde windows en el archivo procfile y reemplace el contenido por el siguiente texto:
    
    ```
    web: java -cp target/classes;target/dependency/* edu.escuelaing.arep.App
    ```


## Ejecutando las pruebas

Corra la aplicación localmente emulando Heroku:

   * Ejecute el siguiente comando:
     ```
     mvn clean install
     ```
   
   * Luego ejecute el siguiente comando para correr la aplicación en una version local del dispositivo en el que se encuentre:
     ```
     heroku local web
     ```
   * Se ve el despliege en el siguiente link:
   
      http://localhost:
   
## Directo con el link de heroku
> [![Deploy](https://www.herokucdn.com/deploy/button.svg)]()

 


  
## Construido con

* [Java] : Tecnología que se usa para el desarrollo de aplicaciones que convierten a la Web en un elemento más interesante y útil.
* [IntelliJ] : Es un entorno de desarrollo integrado (IDE) para el desarrollo de programas informáticos.
* [Git] : Herramienta que realiza una función del control de versiones de código de forma distribuida
* [Maven] : Maven es una herramienta de software para la gestión y construcción de proyectos Java creada por Jason van Zyl, de Sonatype, en 2002. 
* [Heroku] : Heroku es una plataforma en la nube que permite a las empresas construir, entregar, supervisar aplicaciones y alojarlas en la nube


## Autor

* [Ana Maria Salazar Bohorquez](https://github.com/anamariasalazar)

## Licencia

**©️** Ana Maria Salazar Bohorquez etudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito

Licencia bajo la [GNU General Public License](/LICENSE.txt)

