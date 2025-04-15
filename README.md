# E2T_Java
CAPÍTULO 1: BREVE HISTORIA Y FILOSOFÍA DE JAVA
1.1 BREVE HISTORIA DE JAVA
A principios de los años 90, Sun Microsystems buscaba nuevas formas de enfrentar
un mercado tecnológico emergente, en el que la diversificación de dispositivos
electrónicos empezaba a ganar terreno. James Gosling, junto a un pequeño grupo
de ingenieros, inicio un proyecto conocido como Green Project en 1991. Su objetivo
inicial no era la programación de computadoras personales, sino crear un lenguaje
que pudiera controlar dispositivos embebidos, como decodificadores de televisión
y otros aparatos electrónicos.
El lenguaje que nació de este esfuerzo se denominó Oak, en honor a un roble (oak
tree) que crecía fuera de las oficinas de Gosling. En esta etapa, el equipo buscaba
un lenguaje simple, con un modelo de ejecución seguro y sin dependencias
específicas de hardware. Aunque Oak cumplía con estas premisas, su propósito
original no tuvo el impacto esperado en el mercado de los embebidos.
La situación cambio con la explosión de la World Wide Web en 1993. Los
navegadores de esa época, como Mosaic, permitían mostrar texto e imágenes, pero
carecían de la capacidad para ejecutar aplicaciones dinámicas directamente en la
web. El equipo de Sun Microsystems vio una oportunidad única: adaptar Oak para
que los programas pudieran ejecutarse directamente desde un navegador, en
cualquier plataforma.
En 1995, Oak se renombró como Java debido a problemas de derecho de autor. Sun
Microsystems lanzó oficialmente Java junto con el navegador HotJava, que podía
ejecutar pequeños programas, llamados applets, directamente en las páginas web.
Estos applets prometían una experiencia más rica para los usuarios de internet,
ofreciendo funcionalidades interactivas sin necesidad de descargar software
adicional.
La premisa original de Java –“Write Once, Run Anywhere” (escribir una vez, ejecutar
en cualquier lugar)- se basaba en el uso de un nuevo modelo de ejecución. En lugar
de compilar código fuente a un lenguaje específico de máquina, Java se compilaba
a un formato intermedio llamado bytecode. Este bytecode se ejecutaba dentro de
la Máquina Virtual de Java (JVM), un programa diseñado para correr en cualquier
sistema operativo. Esto aseguraba que un programa Java escrito en una
computadora con Windows pudiera ejecutarse en un sistema Unix sin
modificaciones.
Con este enfoque, Java no solo logró el objetivo de la portabilidad, sino que también
redujo las complejidades que enfrentaban los desarrolladores al trabajar con
diferentes entornos. Esto fue revolucionario en su momento y marcó un punto de
inflexión en el desarrollo de software.
1.2 LA FILOSOFÍA DE JAVA
Java no solo surgió como una herramienta técnica, sino que fue diseñado alrededor
de una serie de principios fundamentales que los distinguen de otros lenguajes de
la época. Algunos de estos principios clave son:
- Simplicidad y familiaridad:
Java se inspiró en lenguajes ya establecidos, principalmente C y C++, pero eliminó
muchas de las complejidades que complicaban el desarrollo y el mantenimiento
del código. Por ejemplo, no incluye herencia múltiple directa, que en C++ puede
llevar a problemas de ambigüedad. También eliminó el manejo explícito de
punteros, una fuente común de errores graves en C. El resultado fue un lenguaje
más fácil de aprender para quienes ya estaban familiarizados con la programación
estructurada y orientada a objetos.
- Portabilidad
La promesa de “Write Once, Run Anywhere” transformó la forma en que los
desarrolladores pensaban sobre la creación de software. Antes de Java, era común
que los programas se escribiesen para un sistema operativo específico, y portarlos
a otra plataforma requería esfuerzos significativos. Con la JVM como intermediario,
los programas Java pueden ejecutarse en cualquier sistema para el que exista una
JVM compatible. Esto también permitió que las empresas desarrollaran software
sin preocuparse por las diferencias entre hardware o sistemas operativos,
ahorrando tiempo y recursos.
- Seguridad
Desde sus orígenes, Java fue diseñado con un modelo de seguridad robusto. Al
ejecutarse dentro de la JVM, los programas están aislados del sistema operativo
adyacente. Esto evita que el código malicioso cause daños al sistema o robe
información sensible. Además, los applets de Java, que se descargaban y
ejecutaban desde navegadores, estaban restringidas por un modelo de seguridad
que limitaba las operaciones que podían realizar, ofreciendo una experiencia más
segura a los usuarios.
- Concurrencia y multitarea
A medida que los sistemas y aplicaciones comenzaron a manejar múltiples tareas
simultáneamente, se hizo evidente la necesidad de un soporte sólido para la
concurrencia. Java incluyó desde el principio un modelo de hilos integrados en el
lenguaje. Esto facilitó a los desarrolladores escribir programas que pudieran realizar
varias operaciones al mismo tiempo (como leer datos de una base de datos y
actualizar una interface gráfica) sin recurrir a librerías externas o técnicas
complejas.
- Robustez y manejo de errores
La gestión de errores fue otro aspecto destacado en Java. Al evitar punteros y
trabajar con referencias de objetos, Java redujo significativamente los errores de
segmentación comunes en C y C++. Además, su sistema de manejo de excepciones
ofrece un mecanismo estructurado para detectar y responder a condiciones
inesperadas, mejorando la estabilidad y fiabilidad del software.
- Desempeño razonable:
Aunque inicialmente criticado por ser más lento que los lenguajes nativos como C,
Java mejoró drásticamente su desempeño gracias a la implementación de la
compilación Just-In-Time (JIT) en las JVM modernas. Esto permitió que el código
Java fuera compilado dinámicamente en instrucciones de máquina durante la
ejecución, logrando velocidades cercanas a las de programas nativos sin perder la
portabilidad.
1.3 IMPACTO Y EVOLUCIÓN DE JAVA
Desde su lanzamiento oficial, Java se expandió rápidamente. Su modelo de
portabilidad y su robustez lo convirtieron en la elección predilecta para
aplicaciones empresariales y sistemas de gran escala. Pronto, Java no solo se
utilizaba en navegadores, sino también en servidores ¡, dispositivos móviles,
sistemas embebidos y supercomputadoras.
Sun Microsystems, y más tarde Oracle Corporation, continuaron desarrollando y
mejorando el lenguaje. Se introdujeron nuevas características, como genéricos,
expresiones lambda y APIs funcionales, para mantenerse competitivo frente a
lenguajes emergentes. Además, la comunidad de desarrolladores de Java
contribuyó con un vasto ecosistema de bibliotecas, frameworks y herramientas que
hicieron de Java un entorno poderoso para cualquier tipo de proyecto.
En la actualidad, Java sigue siendo uno de los lenguajes más utilizados y valorados.
Su diseño pragmático y su filosofía de simplicidad, portabilidad y seguridad lo han
mantenido relevante en un panorama tecnológico que ha cambiado
significativamente desde su creación.

CAPÍTULO 2: CONFIGURACIÓN DEL ENTORNO DE
DESARROLLO (JDK, IDE Y LÍNEA DE COMANDOS)
Para comenzar a trabajar con JAVA, es esencial preparar un entorno de desarrollo
que permita escribir, compilar y ejecutar programas de manera eficiente y sin
contratiempos. En este capítulo se detallará como instalar y configurar el JDK,
como elegir un IDE adecuado y como utilizar la línea de comandos para ejecutar
aplicaciones Java. Además, se abordarán los conceptos relacionados con la
configuración de variables de entorno y se proporcionarán recomendaciones para
un desarrollo fluido.
2.1 ¿QUÉ ES EL JDK Y PORQUE ES NECESARIO?
El Java Development Kit (JDK) es un conjunto de herramientas y librerías necesarias
para desarrollar aplicaciones en Java. Incluye el compilador javac, que convierte
el código fuente em bytecode (un formato intermedio que puede ejecutarse en
cualquier Máquina Virtual de Java o JVM), así como otras herramientas útiles como
el depurador jdb y el empaquetador de archivos jar.
2.2 DESCARGA E INSTALACIÓN DEL JDK
2.2.1 IDENTIFICACIÓN DE LA VERSIÓN ADECUADA
Antes de instalar el JDK, es importante determinar qué versión es la más adecuada
para el proyecto. Oracle, OpenJDK y otras distribuciones (como Amazon Corretto o
AdoptOpenJDK) ofrecen diferentes versiones. Para fines educativos y de
aprendizaje, la última versión LTS (Long -Term Support) suele ser la mejor opción, ya
que asegura estabilidad y soporte por varios años.
2.2.2 PROCESO DE DESCARGA E INSTALACIÓN
1. Descarga del JDK:
 Visita el sitio oficial de Oracle
(https://www.oracle.com/java/technologies/javase-downloads.html) o de
OpenJDK (https://openjdk.java.net).
 Descargar el instalador correspondiente a tu sistema operativo (Windows,
macOS o Linux).
 Para Windows o macOS, los instaladores suelen ser archivos ejecutables
(.exe o .pkg). En Linux, se puede descargar un paquete precompilado o
instalarlo directamente desde el gestor de paquetes de la distribución.
2. Instalación del JDK en Windows:
 Abre el instalador descargado y sigue las instrucciones del asistente.
 Selecciona una ubicación de instalación (por defecto, C:\Program
Files\Java\jdk-xx) y completa el proceso
3. Instalacion del JDK en macOS:
 Abre el archivo .pkg descargado y sigue las instrucciones del instalador.
 El JDK se instalará en /Library/Java/JavaVirtualMachines/.
4. Instalación del JDK en Linux:
 Si has descargado un archivo .tar.gz, descomprime en un directorio de tu
elección.
 Agrega la ruta del JDK a las variables de entorno del sistema (más detalles a
continuación).
 Si utilizas un gestor de paquetes, como apt o yum, simplemente ejecuta:
sudo apt update
sudo apt install openjdk-11-jdk
2.3 CONFIGURACIÓN DE VARIABLES DE ENTORNO
Para que las herramientas del JDK estén accesibles desde cualquier directorio, es
necesario configurar las variables de entorno adecuadas.
2.3.1 EN WINDOWS
 Abre el Panel de Control y busca “Variables de entorno”.
 En las variables del sistema, localiza Path y edítalo.
 Añade la ruta del directorio bin del JDK, por ejemplo: C:Program
Files\Java\jdk-xx\bin.
 Asegúrate de guardar los cambios y reiniciar cualquier terminal abierta para
que los cambios tengan efecto.
2.3.2 EN macOS Y LINUX
 Abre un terminal y edita el archivo de configuración del Shell
correspondiente (~/.bashrc, ~/.bash_profile o ~/.zshrc dependiendo
del Shell).
 Añade las siguientes líneas al final del archivo:
export JAVA_HOME=/ruta/a/jdk
export PATH=$JAVA_HOME/bin:$PATH
 Guardar los cambios y recargar el archivo con el comando:
source /.bashrc
 Verifica la configuración ejecutando java -version y javac -version. Ambos
comandos deberían devolver la versión instalada.
2.4 ELECCIÓN E INSTALACIÓN DE UN IDE
Aunque es posible escribir y compilar código Java con cualquier editor de texto, un
Entorno de Desarrollo Integrado (IDE) facilita enormemente el trabajo al
proporcionar herramientas avanzadas como resaltado de sintaxis, auto
completado, depuración, y control de versiones integrado.
2.4.1 OPCIONES POPULARES DE IDE
 Eclipse: Un IDE maduro y muy utilizado en el desarrollo profesional. Es
gratuito y soporta una amplia gama de plugins para personalización.
 IntelliJ IDEA: Ofrece una versión gratuita (Community Edition) y una de pago
(Ultimate Edition). Es conocido por su fluida experiencia de usuario,
herramientas inteligentes y soporte integral para el desarrollo de Java.
 NetBeans: Un IDE fácil de usar que viene preconfigurado para trabajar con
Java. También soporta otros lenguajes y tecnologías.
2.4.2 INSTALACIÓN DE UN IDE
 Descarga el instalador del IDE desde su sitio oficial (por ejemplo, para
IntelliJ: https://www.jetbrains.com/idea/).
 Instálalo siguiendo las instrucciones proporcionadas por el instalador.
 Durante la instalación, puedes configurar el IDE para que detecte
automáticamente la ubicación del JDK. Si no lo hace, tendrás que
especificar la ruta del JDK manualmente en las configuraciones del
proyecto.
2.5 USO DE LÍNEA DE COMANDOS
Aunque los IDEs ofrecen muchas facilidades, comprender como usar la línea de
comandos es una habilidad fundamental que ayuda a los estudiantes a entender
cómo funciona el ciclo de vida de un programa en Java.
2.5.1 COMPILACIÓN Y EJECUCIÓN DESDE LA LÍNEA DE COMANDOS.
1. Escribir el código:
 Crea un archivo de texto con extensión .java, por ejemplo:
HelloWorld.java.
 Asegúrate de que el nombre coincida con el nombre de la clase pública que
contiene el método main.
2. Compilar el código:
 Abre una terminal en el directorio donde se encuentra el archivo.
 Ejecuta:
javac HelloWorld.java
 Esto generará un archivo HelloWorld.class en el mismo directorio.
3. Ejecutar el programa:
 Una vez compilado, ejecuta:
java HelloWorld
 Deberías ver la salida en la terminal, por ejemplo:
Hello, World!
2.5.2 SOLUCIÓN DE PROBLEMAS COMUNES
Error “java: command not found” o “javac: command nor found”:
Verifica que el JDK esté correctamente instalado y que las variables de entorno
estén configuradas correctamente.
Error de clase no encontrada:
Asegúrate de que el archivo .class se encuentra en el mismo directorio desde el que
intentas ejecutar el programa. También revisa que el nombre del archivo y la clase
coincidan.
2.6 CONSEJOS FINALES PARA UN ENTORNO DE DESARROLLO
ÓPTIMIO
Mantén tu JDK actualizado para aprovechar las últimas mejoras en el lenguaje y la
seguridad. Experimenta con diferentes IDEs para encontrar el que mejor se ajusta a
tu estilo de trabajo. Aprende a usar herramientas básicas de la línea de comandos,
estas habilidades son valiosas incluso si trabajas principalmente con un IDE.
Organiza tus proyectos de manera lógica, usando una estructura de carpetas clara
(por ejemplo, separar el código fuente, los recursos y los archivos de configuración).
Establece un flujo de trabajo consistente: edita el código, compila, ejecuta y
depurar de forma sistemática para identificar y resolver problemas de manera
eficiente.
Al dominar esta configuración inicial, estarás mejor preparado para centrarse en el
aprendizaje de la programación Java y en el desarrollo de aplicaciones más
complejas.

CAPÍTULO 3: ESTRUCTURA BÁSICA DE UN
PROGRAMA DE JAVA
Antes de adentrarnos en detalles más avanzados del lenguaje, es crucial entender
cómo está compuesto un programa en Java. Su estructura básica incluye
elementos esenciales que todo código debe tener para compilarse y ejecutarse
correctamente. A continuación, se detallan cada uno de estos componentes, junto
con un ejemplo simple para ilustrat¡rlos.
3.1 ELEMENTOS FUNDAMENTALES DE UN PROGRAMA JAVA
Un programa típico consiste en:
1. Paquete (package):
Los paquetes son grupos organizados de clases relacionadas. Aunque no es
obligatorio incluirlos en programas muy simples, son recomendados para
mantener el código organizado. Un paquete se declara al principio del archivo con
la palabra clave package. Por ejemplo:
package com.cursojava.proyecto;
Si no se especifica un paquete, la clase se encuentra en el paquete “por defecto”.
Esto está bien para proyectos pequeños, pero en proyectos más grandes siempre
es preferible usar paquetes.
2. Importaciones (import):
Las declaraciones import permiten utilizar clases y paquetes externos. Esto facilita
el uso de funcionalidades ya existentes en la API estándar de Java o en librerías
externas. Por ejemplo:
import java.util.Scanner;
Aquí se importa la clase Scanner que se utiliza para leer la entrada de usuario. Si no
se especifica un import, tendríamos que escribir siempre el nombre completo de
la clase (por ejemplo: java.util.Scanner en lugar de Scanner).
3. Definición de la clase principal:
Toda aplicación Java comienza con al menos una clase. La clase es la unidad básica
de organización en Java. Su nombre debe coincidir con el nombre del archivo (por
ejemplo, HolaMundo.java debe contener una clase pública llamada HolaMundo)
public class HolaMundo {
// Código de la clase
}
4. El método principal (main):
El punto de entrada de cualquier aplicación Java es el método main. Este método
tiene una firma específica:
public static void main(string[] args){
// Código que se ejecutará al iniciar el programa
}
 public : Indica que el método es accesible desde cualquier parte del
programa.
 static : Significa que no se necesita crear una instancia de la clase para
llamar a este método.
 void : Indica que el método no retorna ningún valor.
 String[] args: es un parámetro que permite recibir argumentos desde la
línea de comandos. Aunque no siempre se utiliza, es obligatorio en la
definición del método main.
5. Instrucciones dentro del método main:
El cuerpo del método main contiene las instrucciones que el programa ejecutará.
Estas instrucciones pueden ser simples mensajes en consola, cálculos, lógica de
control o llamadas a otros métodos.
3.2 EJEMPLO COMPLETO DE UN PROGRAMA BÁSICO
Aquí hay un ejemplo de un programa Java básico:
// 1. Opcional: Definimos un paquete (en proyectos grandes)
package com.miempresa.proyecto;
// 2. Opcional: Importamos clases necesarias
import java.util.Scanner;
// 3. Declaramos la clase principal
public class HolaMundo{
// 4. Método principal, el punto de entrada del
programa
public static void main(String[] args){
// 5. Instrucciones: imprimimos un mensaje en la
consola
System.out.println(“Hola, Mundo!”);
// Leemos la entrada del usuario
Scanner scanner = new Scanner(System.in)
System.out.print(“Introduce tu nombre: “);
String nombre = scanner.nextLine();
// Saludamos al usuario
System.out.println(“Hola, “ + nombre + “,
¡bienvenido a Java!”);
}
}
3.3 DETALLES CLAVE SOBRE LA ESTRUCTURA BÁSICA
1. Orden de los elementos:
 El paquete, si existe, siempre va en la primera línea.
 Las declaraciones import van después del paquete y antes de las clases.
 La clase principal se declarará después de las importaciones.
 El método main debe estar dentro de la clase principal.
2. Nombres de clase y archivo:
El nombre del archivo .java debe coincidir exactamente con el nombre de la clase
pública. Por ejemplo, si la clase se llama HolaMundo, el archivo debe llamarse
HolaMundo.java.
3. CONVENCIONES DE NOMENCLATURA:
 Los nombres de las clases comienzan con una letra mayúscula y utilizan el
formato CamelCase.
 Los nombre de los métodos y variables comienzan con minúsculas y
también siguen CamelCase.
 Es recomendable elegir nombres descriptivos para facilitar la lectura del
código.
4. COMENTARIOS:
 Los comentarios de una sola línea comienzan con //.
 Los comentarios de varias líneas
 Se encierran entre /* y */.
 Es una buena práctica incluir comentarios que expliquen la intención del
código, especialmente es programas complejos.
3.4 CÓMO COMPILAR Y EJECUTAR UN PROGRAMA JAVA BÁSICO
Una vez que tenemos el archivo fuente (HolaMundo.java), el proceso para
compilar y ejecutar el programa consiste en:
1. COMPILACIÓN:
Desde la línea de comandos, situados en el directorio donde está el archivo,
ejecutamos:
javac HolaMundo.java
Esto genera un archivo HolaMundo.class que contiene el bytecode listo para
ejecutarse.
2. EJECUCIÓN:
Para correr el programa, escribimos:
java HolaMundo
Si todo está correcto, veremos la salida en la consola:
¡Hola, mundo!
Introduce tu nombre: [Aquí el usuario escribe su nombre]
Hola, [nombre], ¡bienvenido a Java!
3.5 CONCLUSIÓN
La estructura básica de un programa Java es simple, pero sus elementos son
esenciales para construir cualquier aplicación. Entender cómo se organiza el
código, cómo funciona el método main, y cómo compilar y ejecutar un programa
desde cero proporciona la base sólida que permitirá avanzar hacia conceptos más
complejos.

CAPÍTULO 4: TIPOS DE DATOS Y VARIABLES
4.1 ¿QUÉ ES UNA VARIABLE?
En programación, una variable es un espacio en memoria con un nombre único que
permite almacenar datos. En Java, las variables deben tener un tipo, que determina
que pueden almacenar y las operaciones que pueden realizarse sobre ellos. Una
variable consta de tres partes principales:
1. Tipo de dato: Define el tipo de información que contendrá la variable, como
números enteros, decimales, texto, caracteres o valores lógicos.
2. Nombre: Es la etiqueta que utilizaremos para referirnos a esa posición de la
memoria.
3. Valor: Es el dato específico que almacenamos en la variable. Este valor
puede cambiar a lo largo de la ejecución del programa.
Por ejemplo:
int numero = 10;
En este caso:
 El tipo de dato es int (entero).
 En nombre de la variable es numero.
 El valor inicial almacenado es 10.
Una vez declarada, podemos usar la variable en cálculos, condiciones y otras
operaciones.
4.2 TIPOS DE DATOS EN JAVA
Java ofrece varios tipos de datos que se dividen en dos categorías principales:
primitivos y referenciados. Cada categoría cumple un propósito particular y se
elige según las necesidades del programa.
4.2.3 TIPOS DE DATOS PRIMITIVOS
Los tipos de datos primitivos son los bloques básicos de datos en JAVA. No son
objetos y se almacenan directamente en memoria. Existen ocho tipos primitivos:
1. Números enteros:
 byte: Utilizado para datos pequeños. Ocupa 8 bits y tiene un rango de
-128 a 127.
 short : Adecuado para números mayores que byte. Ocupa 16 bits y su
rango va de -32,768 a 32,767.
 int: El tipo de dato entero más utilizado. Ocupa 32 bits y tiene un
rango de -2,147,483,648 a 2,147,486,647.
 long: para números enteros muy grandes. Ocupa 64 bits y tiene un
rango de -9,223,372,036,854,775,808 a 9,233,372,036,854,775,807.
2. Números de punto flotante (decimales):
 float: Usado para valores decimales con precisión simple. Ocupa 32
bits y puede almacenar números en el rango ±1.4E-45 a ±3.4E38.
 double: Para valores decimales de doble precisión. Ocupa 64 bits y
permiten almacenar números en el rango ±4.9E-324 a ±1.7E308.
3. Carácter (texto de un solo símbolo):
 char: Almacena un único carácter Unicode. Ocupa 16 bits. Su rango
incluye valores desde el carácter ‘\u0000’ (0) hasta ‘\uffff’
(65,535). Esto permite representar cualquier carácter de los
estándares Unicode, incluyendo letras, números, símbolos y
caracteres especiales.
4. Booleanos:
 boolean: Sólo puede contener dos valores: true y false. Se utilizan
conmumente en expresiones condicionales, bucles y estructuras de
control.
4.2.3 TIPOS DE DATOS POR REFERENCIA
A diferencia de los datos primitivos, los tipos de datos por referencia no contiene
directamente el valor, si no una referencia a un objeto en memoria. Estos incluyen:
 Cadenas de texto:
En Java, las cadenas no son tipos primitivos. Se representan medianate la
clase String.
String mensaje = “Hola, mundo”
Aquí, mensaje es una referencia a un objeto String en memoria que
contiene el texto “Hola, mundo”.
 Arreglos:
Los arreglos son colecciones de elementos del mismo tipo, almacenados
secuencialmente en memoria.
int [] números = {1, 2, 3, 4, 5};
en este caso, numeros es una referencia a un arreglo que contiene cinco
enteros.
 Clases y objetos personalizados.
Los desarrolladores pueden crear sus propios tipos mediante clases. Las
instancias de estas clases se manejan como referencias.
4.3 DECLARACIÓN Y ASIGNACIÓN DE VARIABLES
Declarar una variable significa reservar un espacio en memoria y asignarle un
nombre. Esto se hace indicando primero el tipo de dato y luego el nombre de la
variable. Opcionalmente, se pueden asignar un valor inicial.
Declaración y asignación en una línea:
int edad = 30;
Declaración y asignación en pasos separados:
int edad;
edad = 30;
4.3.1 REGLAS DE NOMENCLATURAS PARA VARIABLES
 El nombre debe comenzar con una letra, un guion bajo (_) o un signo de dólar
($).
 No puede coincidir con una palabra reservada del lenguaje (como class,
public, int, ect.).
 Es buena práctica usar nombres descriptivos y escribirlos en notación
camelCase, como contadorDeIntentos.
4.3.2 EJEMPLO CON DIFERENTES TIPOS DE DATOS
int numeroEntero = 100; // Tipo entero
double precio = 199.99; // Tipo decimal
boolean esActivo = true; // Tipo booleano
char inicial = 'A'; // Tipo carácter
String mensaje = "Hola"; // Tipo por referencia (String)
4.4 INICIALIZACIÓN Y VALORES POR DEFECTO
En Java, las variables locales (definidas dentro de métodos) deben inicializarse
antes de usarlas. Sin embargo, las variables de instancia (definida dentro de una
clase pero fuera de los métodos) reciben un valor predeterminado:
 int, byte, short, long → 0
 float, double → 0
 boolean → false
 chat → ‘\u0000’
 Referencias (como String) → null
Aun así, es recomendable inicializar todas las variables explícitamente para
mantener el código claro y evitar errores inesperados.
4.5 CONVERSION ENTRE TIPOS DE DATOS
En ocasiones se necesita convertir un tipo de dato en otro. Esto puede hacerse de
forma implícita o explícita:
1. Conversión implícita (ampliación):
Si pasamos de un tipo más pequeño a uno más grande Java lo hace
automáticamente.
int numero = 100;
long numeroLargo = numero // El valor de ‘numero’ se amplía
a long
2. Conversión explícita (reducción):
Al pasar de un tipo más grande a uno más pequeño debemos indicar
manualmente la conversión. Esto puede llevar a perdida de información.
double valorDecimal = 9.99;
int valorEntero = (int) valorDecimal; // Pierde la parte
decimal
4.6 BUENAS PRÁCTICAS AL USAR VARIABLES
 Usa nombres descriptivos:
Un nombre claro facilita la compresión del código. En lugar de x o y, prefiere
nombres como edad o totalVentas.
 Inicializa siempre las variables locales:
Aunque Java asigna valores predeterminados a variables de instancia, las
variables locales no tienen un valor inicial automático y deben ser
inicializadas antes de su uso.
 Elige el tipo más apropiado:
Si sabes que un valor siempre estará entre -128 y 127 usa byte. Si necesitas
manejar valores decimales muy grandes utiliza double.
 Reduce el alcance de las variables:
Declara las variables en el bloque más pequeño donde sean necesarias para
evitar confusión y mejorar la legibilidad.

CAPÍTULO 5: OPERADORES Y EXPRESIONES
Los operadores y las expresiones son el núcleo de cualquier programa en Java. Con
ellos podemos realizar cálculos matemáticos, evaluar condiciones lógicas y
estructurar la lógica del código. Comprender a fondo cómo funciona y cómo se
combinan es esencial para escribir código claro, eficiente y libre de errores.
5.1 ¿QUÉ ES UN OPERADOR?
Un operador es un símbolo que realiza una operación sobre uno o varios valores.
Estos valores, denominados operandos, pueden ser números, caracteres, variables
o incluso resultados de otras expresiones.
Por ejemplo, en la expresión 10 + 5, el operador + indica que debemos sumar los
dos operandos (10 y 5). Una vez realizada la operación obtenemos un resultado: 15.
5.2 ¿QUÉ ES UNA EXPRESION?
Una expresión es cualquier combinación de operadores y operandos que produce
un valor. Este valor puede ser numérico, booleano, o incluso una cadena de texto.
Las expresiones se evalúan de acuerdo a un conjunto de reglas , como la
precedencia de operadores y el tipo de datos involucrado.
Por ejemplo:
int resultado = 10 + (5 * 2);
Aquí, la expresión 10 + (5 * 2) se evalúa primero multiplicando 5 * 2
(obteniendo 10), y luego sumando 10 + 10 para producir 20. El resultado final se
almacena en la variable resultado.
5.3 CLASIFICACIÓN DE OPERADORES EN JAVA
En Java, los operadores se agrupan en varias categorías según la operación que
realizan. A continuación, veremos cada grupo con ejemplos detallados:
5.3.1 OPERADORES ARITMÉTICOS
Los operadores aritméticos permiten realizar operaciones matemáticas básicas.
Son:
 + (suma)
 - (resta)
 * (multiplicación)
 / (división)
 % (módulo o resto de la división)
Ejemplo:
int a = 15, b = 4;
int suma = a + b; // 19
int resta = a - b; // 11
int producto = a * b; // 60
int cociente = a / b; // 3 (división entera)
int resto = a % b; // 3
5.3.2 OPERADORES DE ASIGNACIÓN
Los operados de asignación se utilizan para almacenar valores en variables. El más
básico es =, pero también existen operadores compuestos que realizan una
operación y asignan el resultado en un solo paso:
 +=, -=, *=, /=, %=
Ejemplo:
int x = 10;
x += 5; // Equivale a x = x + 5; resultado: x = 15
x *= 2; // Equivale a x = x * 2; resultado: x = 30
5.3.3 OPERADORES DE COMPARACION (RELACIONALES)
Estos operadores comparan dos valores y devuelven un resultado booleano (true
o false):
 == : Igual a
 != : Distinto de
 > : Mayor que
 < : Menor que
 >= : Mayor o igual que
 <= : Menor o igual que
Ejemplo:
int a = 7, b = 5;
boolean esIgual = (a == b); // false
boolean esMayor = (a > b); // true
boolean esMenor = (a < b); // false
5.3.4 OPERADORES LÓGICOS
Los operadores lógicos trabajan con valores booleanos y se utilizan para construir
expresiones condicionales más complejas:
 && : AND lógico
 || : OR lógico
 ! : NOT lógico
Ejemplo:
boolean cond1 = (5 > 3); // true
boolean cond2 = (10 < 20); // true
boolean resultado = cond1 && cond2; // true (ambas
condiciones son verdaderas)
boolean resultado2 = cond1 || (5 < 2); // true (una de las
condiciones es verdadera)
boolean negacion = !cond1; // false (negación de true)
5.3.5 OPERADORES UNARIOS
Estos operadores actúan sobre un único operando:
 + : Indica un número positivo (normalmente implícito)
 - : Invierte el signo de un número
 ++ : Incrementa en uno el valor de una variable
 -- : Decrementa en uno el valor de una variable
 ! : Niega un valor booleano
Ejemplo:
int c = 5;
c++; // c pasa a valer 6
c--; // c vuelve a valer 5
boolean esVerdadero = true;
boolean esFalso = !esVerdadero; // false
5.3.6 OPERADORES BIT A BIT
Estos operadores trabajan a nivel de bits y son más comunes en programación de
bajo nivel o tareas específicas:
 & : AND bit a bit
 | : OR bit a bit
 ^ : XOR bit a bit
 ~ : Complemento bit a bit
 << : Desplazamiento a la izquierda
 >> : Desplazamiento a la derecha con signo
 >>> : Desplazamiento a la derecha sin signo
Ejemplo:
int num1 = 5; // En binario: 0101
int num2 = 3; // En binario: 0011
int resultado = num1 & num2; // 0101 & 0011 = 0001 (1 en
decimal)
5.3.7 PRECEDENCIA DE OPERADORES
Cuando una expresión incluye múltiples operadores, Java evalúa algunos antes que
otros. Esto se llama precedencia. Por ejemplo, los operadores aritméticos * y /
tienen mayor precedencia que + y -. Si no especificamos un orden claro (como usar
paréntesis), Java seguirá esta jerarquía.
Ejemplo:
int resultado = 10 + 5 * 2; // Evalúa primero 5 * 2, luego
suma 10, dando 20.
int resultado2 = (10 + 5) * 2; // Evalúa primero (10 + 5),
luego multiplica por 2, dando 30.
Consejo: Usa paréntesis para aclarar el orden de las operaciones y hacer el código
más legible.
5.4 BUENAS PRÁCTICAS CON OPERADORES Y EXPRESIONES
Usa nombre de variables descriptivos, ya que, una expresión como x + y es menos
clara que precioProducto + impuesto.
Si una expresión es demasiado larga divídela en pasos intermedios con variables
adicionales.
Cuidado con los operadores de comparación en condiciones. Asegúrate de que
estás comparando valores compatibles. Por ejemplo, no compares String
directamente con == se deseas verificar el contenido, usa .equals().

CAPÍTULO 6: CONTROL DE FLUJO: IF, ELSE, SWITCH
El control de flujo es una parte fundamental de cualquier lenguaje de programación.
En Java, las instrucciones de control de flujo permiten que el programa tome
decisiones y siga diferentes caminos de ejecución en función de las condiciones
evaluadas. Las estructuras if, else, y switch son herramientas esenciales para
manejar decisiones. Este capítulo profundiza en su funcionamiento,
proporcionando ejemplos claros y buenas prácticas para facilitar el aprendizaje y la
comprensión.
6.1 ¿QUÉ ES EL CONTROL DE FLUJO?
El control de flujo se refiere a cómo un programa decide qué instrucciones ejecutar
y en que orden. En lugar de ejecutar todas las líneas de código de forma secuencial,
podemos usar estructuras condicionales para evaluar ciertas condiciones y dirigir
la ejecución según resultados. Esto es clave para crear programas dinámicos y
adaptativos que reaccionen a diferentes situaciones o datos de entrada.
Por ejemplo, imagina que un programa debe mostrar un mensaje diferente
dependiendo de si un usuario es mayor de edad o no. En este caso, necesitamos
evaluar la condición “¿es mayor de 18 años?” y, dependiendo de la respuesta
mostrar un mensaje u otro. Esto es posible gracias a las estructuras de control de
flujo.
6.2 LA SENTENCIA IF
La sentencia if (en español, “si”) permite ejecutar un bloque de código únicamente
si se cumple una condición específica. La condición debe ser una expresión
booleana, es decir, una que se evalúe como true (verdadera) o false (falsa). Si la
condición resulta verdadera, se ejecuta el bloque de código dentro del if. Si no, el
programa continúa con el resto del código sin ejecutar ese bloque.
Estructura básica:
if (condición) {
// Bloque de código que se ejecuta si la condición es
verdadera
}
Ejemplo practico:
int edad = 20;
if (edad >= 18) {
System.out.println(“Eres mayor de edad.”);
}
En el ejemplo, la condición edad >= 18 evalúa si el valor de edad es mayor o igual
a 18. Si esta condición es verdadera se imprime el mensaje “Eres mayor de edad.”.
Si la condición es false el programa simplemente sigue su curso sin ejecutar el
bloque if.
6.3 SENTENCIA IF-ELSE
A veces, no basta con ejecutar un bloque si una condición es verdadera. Es posible
que queramos una condición alternativa si la condición es falsa. Aquí es donde
entra en juego la cláusula else (en español, “si no”).
Estructura básica:
if (condición) {
// Bloque que se ejecuta si la condición es verdadera
} else {
// Bloque que se ejecuta si la condición es falsa
}
Ejemplo práctico:
int hora = 10;
if (hora < 12) {
System.out.println("Buenos días.");
} else {
System.out.println("Buenas tardes.");
}
Explicación:
 Si hora < 12 es verdadero, el programa muestra “Buenos días.”
 Si la condición no se cumple, el programa pasa al bloque else y muestra
“Buenas tardes.”
Nota importante:
El bloque else es opcional. Si no hay un bloque else, el programa simplemente no
hace nada si la condición if es falsa.
6.4 SENTENCIAS IF-ELSE ANIDADES ELSE IF
A medida que las decisiones se vuelven mas complejas, puede ser necesario
comprobar varias condiciones. En estos casos, podemos anidar múltiples bloques
if-else o utilizar la forma más clara else if.
Uso de else-if:
if (condición1) {
// Bloque que se ejecuta si condición1 es verdadera
} else if (condición2) {
// Bloque que se ejecuta si condición2 es verdadera
} else {
// Bloque que se ejecuta si ninguna condición es
verdadera
}
Ejemplo práctico:
int nota = 85;
if (nota >= 90) {
System.out.println("Sobresaliente");
} else if (nota >= 80) {
System.out.println("Notable");
} else if (nota >= 70) {
System.out.println("Aprobado");
} else {
System.out.println("Suspenso");
}
Explicación:
 El programa evalúa las condiciones de arriba abajo.
 En el momento en que encuentra una condición verdadera, ejecuta ese
bloque y no evalúa las demás.
 Si ninguna condición es verdadera, ejecuta el bloque else.
6.5 LA SENTENCIA SWITCH
La sentencia switch es otra estructura de control de flujo, especialmente útil
cuando necesitamos comprobar el valor de una variable con múltiples posibles
valores específicos. En lugar de escribir una serie de if-else para cada uso, switch
organiza las opciones en “casos” individuales, lo que mejora la claridad y legibilidad
del código.
Estructura básica:
switch (variable) {
case valor1:
// Código que se ejecuta si variable == valor1
break;
case valor2:
// Código que se ejecuta si variable == valor2
break;
// Más casos...
default:
// Código que se ejecuta si ningún caso coincide
break;
}
Ejemplo práctico:
int dia = 3;
switch (dia) {
case 1:
System.out.println("Lunes");
break;
case 2:
System.out.println("Martes");
break;
case 3:
System.out.println("Miércoles");
break;
case 4:
System.out.println("Jueves");
break;
case 5:
System.out.println("Viernes");
break;
case 6:
System.out.println("Sábado");
break;
case 7:
System.out.println("Domingo");
break;
default:
System.out.println("Día no válido");
break;
}
Explicación:
 El switch evalúa la variable dia.
 Si coincide con case 1, ejecuta el bloque correspondiente y luego sale del
switch con break.
 Si no se encuentra ninguna coincidencia, se ejecuta el bloque default.
 Nota: Siempre es recomendable incluir break en cada caso para evitar que
el flujo continue al siguiente caso de manera no intencionada.
6.6 DIFERENCIAS ENTRE IF-ELSE Y SWITCH
Aunque tanto if-else como switch permiten manejar múltiples opciones, hay
diferencias clave:
 if-else:
 Más flexible.
 Permite condiciones más complejas (por ejemplo, rango de valores o
combinaciones lógicas).
 Adecuado para situaciones en las que las condiciones no son valores
exactos o están relacionadas.
 switch:
 Más claro y fácil de leer cuando se trata de múltiples valores
específicos.
 Útil cuando se conoce de antemano el conjunto de valores posibles
(por ejemplo, días de la semana).
 Menos adecuado para comparaciones complejas o condiciones con
operadores lógicos.
6.7 BUENAS PRÁCTICAS EN EL CONTROL DE FLUJO
1. Usa comentarios en condiciones complejas: Si la condición no s evidente,
un breve comentario puede ayudar a entender la lógica.
2. Elige la estructura adecuada: Si se trata de comparar rangos, if-else
puede ser más intuitivo. Si son valores fijos y predecibles, switch puede ser
más legible.
3. Evita anidaciones profundas: Demasiados niveles de if-else dificultan
la lectura. Considera simplificar la lógica o usar un enfoque diferente si el
código se vuelve demasiado complejo.
4. Siempre incluye un caso default en un switch: Es una buena práctica
manejar cualquier valor inesperado, incluso si nunca debería ocurrir.
El control de flujo con if, else y switch es esencial para tomar decisiones dentro
de un programa. Comprender sus diferencias, ventajas y mejores prácticas permite
a los desarrolladores escribir código más claro, eficiente y mantenible. Estas
herramientas forman la base para construir programas dinámicos que respondan
de manera efectiva a diferentes condiciones y entradas.

CAPÍTULO 7: BUCLES FOR, WHILE, DO WHILE
Un bucle es una estructura de control que permite repetir un bloque de
instrucciones mientras se cumpla una condición. En programación, los bucles son
fundamentales porque hacen posible realizar tareas repetitivas de manera eficiente
y ordenada, sin necesidad de escribir múltiples veces el mismo código. Java ofrece
tres tipos de bucles: for, while y do-while, cada uno con características y
aplicaciones específicas. En este capítulo exploraremos cada uno en profundidad,
con ejemplos detallados, buenas prácticas y consejos para utilizar bucles de
manera efectiva.
7.1 ¿QUÉ ES UN BUCLE?
Un bucle (también llamado “loop”) es un mecanismo que repite una sección de
código mientras se cumpla una condición predefinida. Cada repetición de este
bloque de código se denomina iteración. Una vez que la condición deja de
cumplirse, el bucle finaliza y el programa continúa con las instrucciones siguientes.
Los bucles son especialmente útiles para:
 Procesar listas o arrays de datos.
 Repetir una operación hasta que se cumpla un criterio.
 Recorrer estructuras complejas (como colecciones o matrices
multidimensionales).
 Realizar cálculos iterativos (por ejemplo, el cálculo de una potencia o una
serie numérica).
7.2 BUCLE FOR
El bucle for se utiliza cuando sabemos de antemano cuantas veces queremos
repetir una tarea. Por ejemplo, si queremos mostrar los números del 1 al 100, o
recorrer todos los elementos de un array, el bucle for es la elección más natural.
Estructura básica:
for (inicialización; condición; actualización) {
// Código que se ejecuta en cada iteración
}
Partes de un bucle for:
1. Inicialización:
Se ejecuta solo una vez, al comienzo del bucle. Generalmente sirve para
inicializar una variable de control.
int i = 0;
2. Condición:
Se evalúa antes de cada iteración. Si la condición es verdadera, se ejecuta
el cuerpo del bucle; si es falsa, el bucle termina.
i < 10;
3. Actualización:
Se ejecuta al final de cada iteración. Normalmente se utiliza como modificar
la variable de control.
i++
Ejemplo básico:
for (int i = 1; i <= 5; i++) {
System.out.println("Iteración número: " + i);
}
Como funciona este ejemplo:
 En la primera iteración, i es 1 y la condición i <= 5 es verdadera.
 Se ejecuta el bloque dentro del bucle, mostrando “Iteración número: 1”.
 Al final de la iteración, i se incrementa a 2, y la condición se evalúa de nuevo.
 El proceso se repite hasta que i sea mayor que 5, momento en el que el
bucle finaliza.
VARIACIONES Y USOS COMUNES
 Bucle decreciente:
Si necesitas contar haca atrás, puedes iniciar desde un valor alto y
decrementar en cada iteración:
for (int i = 10; i > 0; i--) {
System.out.println("Cuenta atrás: " + i);
}
 Incrementos o pasos personalizados:
No siempre es necesario incrementar de uno en uno. Puedes incrementar de
dos en dos, o multiplicar la variable de control:
for (int i = 0; i < 20; i += 2) {
System.out.println("Número par: " + i);
}
Recorriendo arrays y listas: El bucle for es una herramienta habitual para
procesar todos los elementos de un array:
int[] numeros = {10, 20, 30, 40, 50};
for (int i = 0; i < numeros.length; i++) {
System.out.println("Elemento: " + numeros[i]);
}
7.3 BUCLE WHILE
El bucle while es más flexible que el for en cuanto a condiciones y número de
iteraciones. Se utiliza cuando no sabemos de antemano cuántas veces se debe
repetir el bloque de código. La condición se evalúa antes de cada iteración, por lo
que si la condición inicial no se cumple, el cuerpo del bucle nunca se ejecuta.
Estructura básica:
while (condición) {
// Código que se ejecuta mientras la condición sea verdadera
}
Ejemplo básico:
int contador = 1;
while (contador <= 5) {
System.out.println("Contador: " + contador);
contador++;
}
Cómo funciona este ejemplo:
 Se evalúa la condición contador <= 5 . Si es verdadera, se ejecuta el
cuerpo del bucle.
 Se muestra el valor del contador, luego se incrementa en 1:
 El proceso se repite hasta que la condición sea falsa.
Uso común del while:
 Leer datos del usuario hasta que introduzca una palabra clave como “salir”.
 Ejecutar una tarea repetitiva hasta que se cumpla una condición externa (por
ejemplo, esperar a que se reciba un dato de conexión).
Precaución con los bucles while: Asegúrate de que la condición pueda cambiar
en algún momento; de lo contrario, el bucle no terminará nunca. Por ejemplo, si
olvidamos incrementar el contador en el ejemplo anterior, el bucle continuará
indefinidamente.
7.4 BUCLE DO-WHILE
El bucle do-while es similar al while, con la diferencia clave de que el cuerpo del
bucle se ejecuta al menos una vez. La condición se evalúa después de ejecutar el
bloque de código. Esto lo hace útil cuando queremos que el bloque se ejecute al
menos una vez antes de comprobar si debe repetirse.
Estructura básica:
do {
// Código que se ejecuta
} while (condición);
Ejemplo básico:
int numero = 1;
do {
System.out.println("Número: " + numero);
numero++;
} while (numero <= 5);
Cómo funciona este ejemplo:
1. El bloque de código se ejecuta con numero = 1.
2. Después. Se evalúa la condición numero <= 5 .
3. Esto continúa hasta que numero es mayor que 5.
Uso común del do-while:
 Presentar un menú al usuario al menos una vez, independientemente de si
la condición se cumple o no.
 Pedir al usuarios que introduzca un valor y luego comprobar si ese valor es
válido. Si no lo es, repetir el proceso.
7.5 COMPARACIÓN ENTRE FOR, WHILE Y DO-WHILE
Cada tipo de bucle tiene un propósito distinto:
 for:
Ideal cuando sabemos de antemano cuántas iteraciones queremos realizar.
Conveniente para recorrer arrays o estructuras con un tamaño fijo o
conocido.
 while:
Útil cuando la condición depende de factores externos o es impredecible. La
condición se evalúa antes de cada iteración, lo que significa que el cuerpo
del bucle podría no ejecutarse nunca si la condición inicial es falsa.
 do-while:
Adecuado cuando queremos que el bloque de código se ejecute al menos
una vez antes de comprobar la condición. Útil en situaciones como mostrar
un menú, pedir un dato inicial o realizar al menos una vez antes de validar
las condiciones.
7.6 BUENAS PRÁCTICAS AL USAR BUCLES
1. Evita bucles infinitos no deseados:
Asegúrate que la condición de salida se pueda cumplir. Un bucle que nunca
termina puede bloquear el programa o consumir recursos innecesarios.
2. Usa nombres descriptivos para las variables:
En lugar de nombres genéricos como i, j o k, considera nombras mas
significativos cuando sea posible (por ejemplo, indiceProducto,
contadorAlumnos)
3. Mantén el cuerpo del bucle simple:
Si el código dentro del bucle es complejo, considera dividirlo en funciones
pequeñas. Esto facilita la lectura y el mantenimiento.
4. Comen las condiciones poco obvias:
Si la condición del bucle depende de varias variables o cálculos, añade un
comentario explicativo para futuros lectores del código (o para ti mismo más
adelante).
5. Elige el bucle correcto:
No todos los bucles son iguales. Usa for cuando tengas un rango fijo de
iteraciones, while cuando las repeticiones dependan de condiciones
externas y do-while cuando quieras ejecutar el bloque al menos una vez.

CAPITULO 8: METODOS: DEFINICIÓN,
PARÁMETROS Y RETORNO
Los métodos son una de las herramientas más poderosas y esenciales de Java.
Permiten organizar el código en bloques más pequeños, lógicos y reutilizables, lo
que simplifica tanto el desarrollo como el mantenimiento del programa. En este
capítulo, profundizaremos en qué son los métodos, como se definen, como pueden
aceptar parámetros y como devuelven resultados.
8.1¿QUÉ ES UN MÉTODO Y PARA QUE SIRVE?
Un método es una parte independiente de condigo que realiza una tarea concreta.
En otras palabras, es como una función que pertenece a una clase y que podemos
invocar en cualquier momento para llevar a cabo un conjunto de instrucciones.
¿Por qué son importantes los métodos?
 Reutilización del código: Si necesitas realizar la misma operación varias
veces (por ejemplo, calcular el promedio de una lista de números), no tienes
que copiar y pegar el mismo código. Simplemente defines un método y lo
llamas cuando lo necesites.
 Organización: Al dividir el código en métodos pequeños y bien definidos,
cada parte del programa tiene un propósito claro. Esto hace que el código
sea más fácil de leer, entender y modificar.
 Mantenimiento: Si hay un error en una tarea, solo necesitas corregir el
método correspondiente, y todos los lugares que lo utilizan
automáticamente tendrán la corrección.
 Colaboración: En equipos de desarrollo, los métodos bien definidos
permiten que diferentes programadores trabajen en distintas partes del
código sin interferir entre sí.
Ejemplo conceptual:
Piensa en un método como una receta en un libro de cocina. Si quieres preparar un
plato (una tarea), simplemente sigues los pasos de la receta (el código dentro del
método). Si otra persona necesita cocinar lo mismo, puede usar exactamente la
misma receta sin necesidad de volver a escribirla.
8.2 DEFINICIÓN BÁSICA DE UN MÉTODO
Para definir un método en Java, usamos una estructura muy clara. Cada parte tiene
un propósito específico:
[modificadores] tipoDeRetorno nombreDelMetodo([parámetros])
{
// Cuerpo del método
// Instrucciones que se ejecutan cuando se llama al
método
// return valor; (si corresponde)
}
Desglose de las partes principales:
1. Modificadores (opcional):
 public: Indica que el método puede ser llamado desde cualquier
otra clase.
 private: El método solo puede ser usado dentro de la clase donde
se define.
 protected: El método puede ser llamado por clases en el mismo
paquete o por subclases.
 static: Indica que el método pertenece a la clase en sí y no a
instancias individuales.
2. Tipo de retorno:
Es el tipo de dato que el método devuelve después de ejecutarse. Si el
método no devuelve nada usamos la palabra clave void .
3. Nombre del método:
Es el identificador único que nos permite llamar al método. Por convención,
el nombre comienza por minúscula y sigue la notación camelCase, como
calcularPromedio o mostrarMensaje.
4. Parámetros (opcional):
Son valores que podemos pasar al método para que realice su tarea con
ellos. Si no necesita información adicional, los paréntesis estarán vacíos.
5. Cuerpo del método:
Es el bloque de código entre las llaves {} que contiene las instrucciones que
se ejecutan cuando llamamos al método.
6. Return (Opcional):
Si el método devuelve un valor, se usa la palabra clave return seguida del
valor que queremos devolver. Este valor debe coincidir con el tipo declarado
en el tipo de retorno.
8.3 EJEMPLO: MÉTODO BÁSICO SIN PARÁMETROS NI RETORNO
Imagina que queremos mostrar un mensaje fijo en la consola. Un método que hace
esto podría definirse así:
public void imprimirSaludo() {
System.out.println("¡Hola, bienvenido a Java!");
}
Explicación:
 public: Cualquiera puede llamar a este método.
 void: El método no devuelve ningún valor.
 imprimirSaludo: El nombre describe claramente lo que hace el método.
 Cuerpo: Dentro del bloque {} simplemente imprimimos un mensaje.
Como se usa:
Para llamar a este método desde otra parte del programa, escribamos:
miObjeto.imprimirSaludo();
Esto ejecutará el código dentro del método, mostrando el mensaje en la consola.
8.4 MÉTODOS CON PARÁMETROS
Muchas veces necesitamos que un método reciba datos con los que trabajar. Los
parámetros permiten pasar valores al método en el momento de su invocación.
Ejemplo sencillo con un parámetro:
public void saludarUsuario(String nombre) {
System.out.println("Hola, " + nombre + "!");
}
Como funciona:
 String nombre: El método requiere que le pasemos un texto (nombre).
 Dentro del cuerpo usamos el parámetro nombre para personalizar el saludo.
Uso:
miObjeto.saludarUsuario("María");
Esto imprimirá:
Hola, María!
Métodos con varios parámetros:
public void mostrarDatos(String nombre, int edad) {
System.out.println("Nombre: " + nombre + ", Edad: "
+ edad);
}
Llamada al método:
miObjeto.mostrarDatos("Juan", 25);
Esto imprimirá:
Nombre: Juan, Edad: 25
8.5. MÉTODOS CON RETORNO
Un método también puede devolver un valor. Esto es útil cuando necesitamos
procesar datos y obtener un resultado. En ese caso, debemos declarar el tipo de
retorno y usar return para enviar el resultado al lugar desde donde se llamo al
método.
Ejemplo: método que devuelve un entero
public int sumar(int a, int b) {
int suma = a + b;
return suma;
}
Como se usa:
int resultado = miObjeto.sumar(5, 7);
System.out.println("La suma es: " + resultado);
Lo que ocurre:
1. Llamamos a sumar(5, 7).
2. El método calcula 5 + 7 y devuelve 12.
3. Guardamos este resultado en la variable resultado y lo mostramos.
Nota: El tipo del método (int) debe coincidir con el valor que se devuelve en la
instrucción return.
Método que devuelve una cadena (String):
public String crearMensaje(String nombre) {
return "Hola, " + nombre + ", ¿cómo estás?";
}
Uso:
String mensaje = miObjeto.crearMensaje("Luis");
System.out.println(mensaje);
Esto imprimirá:
Hola, Luis, ¿cómo estás?
8.6 BUENAS PRÁCTICAS AL TRABAJAR CON MÉTODOS
1. Nombres descriptivos:
Unas nombres claros y significativos. Un método llamado
calcularPromedio es mucho más intuitivo que uno llama cp.
2. Una tarea por método:
Cada método debería realizar solo una tare específica. si un método hace
muchas cosas considera dividirlo en métodos más pequeños.
3. Evita métodos demasiado largos:
Si el cuerpo del método tiene demasiadas líneas probablemente debería
dividirse. Métodos cortos y concisos son más fáciles de leer y mantener.
4. Usa parámetros solo cuando sea necesario:
No sobrecargues los métodos con demasiados parámetros. Si tienes
muchos datos que pasar, considera agruparlos en una clase o estructura de
datos.
5. Documenta los métodos:
Antes del método escribe un breve comentario que explique qué hace, qué
parámetros necesita y que valor devuelve.

CAPÍTULO 9: MANEJO DE EXCEPCIONES BÁSICAS
(TRY, CATCH, FINALLY)
El manejo de excepciones en Java es una de las herramientas más importantes y
versátiles que los programadores tienen a su disposición. Permite prevenir que el
programa falle inesperadamente ante situaciones imprevistas, como errores en
cálculos matemáticos, problemas al leer archivos o datos de entrada incorrectos.
En este capítulo, vamos a explorar con profundidad los conceptos básicos de las
excepciones en Java. Veremos qué son, cómo funcionan y cómo utilizar las
palabras clave try, catch y finally para capturarlas y tratarlas de forma
adecuada. Nos centraremos en las mejores practicas y en ofrecer ejemplos
prácticos que ayuden a comprender no solo el “cómo”, sino también el “por qué”
del manejo de excepciones.
9.1 ¿QUÉ ES UNA EXCEPCIÓN?
En términos simples, una excepción es un “evento” que ocurre cuando la ejecución
del programa y que interrumpe el flujo normal de las instrucciones. Es como si el
programa dijera:
“¡Alto! No sé cómo proceder porque algo inesperado acaba de ocurrir.”
En Java, cuando sucede algo que no puede manejar de forma directa, se lanza un
objeto de tipo Exception. Este objeto contiene información sobre lo que ocurrió,
incluyendo el tipo de problema y donde se produjo. Por ejemplo, si intentas acceder
a una posición de un array que no existe, Java generará una excepción del tipo
ArrayIndexOutOfBoundsException. Si divides un número por cero obtendrás
una ArithmeticException.
Diferencia entre errores y excepciones.
 Un error generalmente representa problemas graves a nivel del sistema,
como quedarse sin memoria. Son situaciones que el programa no puede
controlar directamente, y por lo tanto no suelen manejarse con bloques
try-catch.
 Una excepción representa un problema que sí podemos prever y manejar.
Por ejemplo, si intentas abrir un archivo y este no existe, puedes capturar esa
excepción y tomar las medidas necesarias (como mostrar un mensaje al
usuario o intentar abrir otro archivo).
Tipos de excepciones en Java:
 Excepciones comprobadas (checked exceptions):
Estas deben ser gestionadas obligatoriamente en tiempo de compilación. Si
no las manejas con un bloque try-catch o no las declaras en firma del
método con throws, el programa no compilará. Ejemplo: IOException.
 Excepciones no comprobadas (unchecked exceptions):
Estas no requieren un manejo obligatorio. Incluyen subtipos de
RuntimeException, como ArithmeticException y
NullPointerException. Aunque no es obligatorio capturarlas, sigue
siendo buena práctica preverlas y tratarlas adecuadamente.
Ejemplo de una excepción común:
int resultado = 10 / 0; // Esto genera una
ArithmeticException.
En este caso, Java lanza una excepción porque no se puede dividir un numero entre
cero. Si no gestionamos este error el programa terminará abruptamente.
9.2 LA ESTRUCTURA BÁSICA DEL MANEJO DE EXCEPCIONES:
TRY Y CATCH
El manejo de excepciones se basa en anticipar posibles errores y preparar un “plan
de contingencia” en caso de que ocurran. Esto se logra con dos bloques
principales:
1. El bloque try:
En este bloque colocamos el código que podría lanzar una excepción. No
estamos diciendo que el código “fallará”, pero sabemos que pordía hacerlo
y queremos estar preparados.
2. El bloque catch:
Si el código dentro del try genera una excepción, el flujo del programa se
transfiere directamente al bloque catch correspondiente. Aquí podemos
tomar medidas, como mostrar un mensaje de error, registrar lo ocurrido o
intentar otra solución.
Estructura básica:
try {
// Código que puede causar una excepción
} catch (TipoDeExcepcion nombre) {
// Código que maneja esa excepción
}
 try{…}:
Encierra el código “potencialmente problemático”. Si ocurre una excepción
dentro de este bloque, el flujo normla del programa se detiene y se busca un
bloque catch que pueda manejar esa excepción.
 catch (TipoDeExcepcion nombre){…}:
Este bloque se activa si el tipo de excepción lanzado coincide con el
especificado. Dentro de catch, puedes realizar cualquier acción necesaria
para manejar el error, como informar al usuario o tomar una medada
alternativa.
Ejemplo básico:
try {
int resultado = 10 / 0; // Esto genera una
ArithmeticException.
} catch (ArithmeticException e) {
System.out.println("Error: no se puede dividir por
cero.");
}
Qué ocurre aquí:
1. El bloque try intenta ejecutar int resultado = 10 / 0;
2. Se produce una ArithmeticException.
3. El flujo del programa se pasa inmediatamente al bloque catch.
4. Dentro de catch, mostramos un mensaje de error.
5. El programa continua su ejecución después del catch.
9.3 MANEJO DE MÚLTIPLES EXCEPCIONES
A veces, un solo bloque de código puede generar diferentes tipos de excepciones.
En lugar de usar un único catch, puedes tener varios bloques catch, uno para cada
tipo de excepción que desees manejar de manera específica.
Ejemplo con múltiples bloques catch:
try {
int[] numeros = {1, 2, 3};
System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException.
int resultado = 10 / 0; // ArithmeticException.
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Error: índice fuera de rango.");
} catch (ArithmeticException e) {
System.out.println("Error: división por cero.");
}
Qué ocurre:
 Si se lanza una ArrayIndexOutOfBoundsException, solo se ejecuta su
bloque catch.
 Si se lanza una ArithmeticException, solo se ejecuta su bloque catch.
 El bloque catch correspondiente se elige según el tipo de excepción.
9.4 BLOQUE FINALLY: CÓDIGO QUE SIEMPRE SE EJECUTA
El bloque finally es opcional, pero extremadamente útil. Su propósito es
garantizar que cierto código se ejecute pase lo que pase. Esto es especialmente
importante cuando trabajamos con recursos externos (como archivos o conexiones
de red) que pueden cerrarse o liberarse sin importar si ocurrió una excepción o no.
Estructura completa:
try {
// Código que puede lanzar una excepción
} catch (TipoDeExcepcion nombre) {
// Código para manejar la excepción
} finally {
// Código que siempre se ejecuta
}
Ejemplo práctico:
try {
int resultado = 10 / 0; // Esto genera una excepción.
} catch (ArithmeticException e) {
System.out.println("Se produjo un error de
aritmética.");
} finally {
System.out.println("Bloque finally ejecutado.");
}
Qué ocurre aquí:
1. Se ejecutará el código try.
2. Si ocurre una excepción, se pasa al bloque catch.
3. Después del catch, el bloque finally siempre se ejecuta.
4. Si no ocurre ninguna excepción, el flujo sigue normalmente pero el bloque
finally también se ejecuta.
9.5 EJEMPLO PRÁCTICO
Supongamos que queremos dividir dos números introducidos por el usuario.
Queremos manejar dos posibles problemas: que el usuario introduzca un valor no
válido y que intente dividir por cero. También necesitamos asegurarnos de que la
operación finalice correctamente cerrando un recurso (en este caso un objeto
Scanner).
Código:
import java.util.Scanner;
public class ManejoDeExcepciones {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.println("Introduce el primer
número: ");
int num1 =
Integer.parseInt(scanner.nextLine());
System.out.println("Introduce el segundo
número: ");
int num2 =
Integer.parseInt(scanner.nextLine());
int resultado = num1 / num2;
System.out.println("Resultado: " + resultado);
} catch (NumberFormatException e) {
System.out.println("Por favor, introduce un
número válido.");
} catch (ArithmeticException e) {
System.out.println("No se puede dividir por
cero.");
} finally {
scanner.close();
System.out.println("Recurso cerrado.");
}
}
}
Qué ocurre aquí:
1. Se intenta leer dos números del usuario y realizar la división.
2. Si el usuario introduce un valor no numérico, se lanza
NumberFormatException y se maneja adecuadamente.
3. Si el usuario intenta dividir por cero, se lanza ArithmeticException y
también se maneja.
4. Pase lo que pase, el bloque finally se ejecuta para cerrar el recurso
Scanner.
9.6 BUENAS PRÁCTICAS Y CONSEJOS
1. Sé específico con las excepciones:
Maneja únicamente aquellas que puedas resolver. No uses catch
(Exception e) para capturar todo sin discriminar. Esto puede esconder
errores graves y dificultar la depuración.
2. No abuses de las excepciones:
Las excepciones deben tratar situaciones excepcionales. Si esperas que un
problema ocurra con frecuencia, considera usar validaciones previas en
lugar de confiar exclusivamente en los bloques catch.
3. Mantén los bloques try-catch pequeños y claros:
No pongas demasiado código en solo bloque try. Divide las tareas para que
sean más fácil identificar que parte del código puede generar una excepción
específica.
4. Asegúrate de liberar recursos en finally:
Si abres un archivo o una conexión, cierra siempre ese recurso en un bloque
finally para garantizar que no haya fuga de recursos.
5. Proporciona mensajes de error informativos:
Los mensajes deben ser claros y útiles, tanto para los desarrolladores como
para los usuarios. Esto facilita la depuración y mejora la experiencia de
usuario.

CAPÍTULO 10: CLASES Y OBJETOS
Uno de los conceptos más importantes en Java y en la Programación Orientada a
Objetos (POO) es la relación entre clase y objetos. La POO nos permite modelar el
mundo real dentro de un programa, estructurando el código de manera clara,
reutilizable y eficiente.
En este capítulo aprenderemos a:
1. Definir clases con atributos y métodos.
2. Crear objetos a partir de una clase.
3. Comprender la relación entre clases y objetos.
4. Usar constructores para inicializar objetos.
Vamos a desarrollar estos temas con ejemplo detallados y buenas prácticas para
garantizar que se comprendan estos conceptos fundamentales en Java.
10.1 ¿QUÉ ES UNA CLASE?
Una clase es una plantilla o modelo que define las características y
comportamiento de un conjunto de objetos. Es decir, una clase especifica qué
datos tendrá un objeto (atributos) y qué acciones podrá realizar (métodos).
Podemos pensar en una clase como una receta de cocina:
 La receta contiene instrucciones detalladas sobre como hacer un plato.
 Pero la receta por si sola no es un plato real.
 Para obtener un plato real, debemos seguir la receta y preparar el plato (crear
un objeto).
Ejemplo de una clase en Java
public class Coche {
// Atributos (propiedades del coche)
String marca;
String modelo;
int velocidad;
// Método para mostrar información del coche
public void mostrarInfo() {
System.out.println("Marca: " + marca);
System.out.println("Modelo: " + modelo);
System.out.println("Velocidad: " + velocidad +
" km/h");
}
}
Explicación del código
 Definimos la clase coche con tres atributos: marca, modelo y
velocidad.
 Creamos el método mostrarInfo(), que imprime los datos del coche en
pantalla.
Sin embargo, esta clase por sí sola no hace nada. Solo hemos definido un modelo.
Para poder usarla en un programa, necesitamos crear objetos a partir de ella.
10.2 ¿QUÉ ES UN OBJETO?
Un objeto es una instancia de una clase. Es decir, mientras que una clase es una
definición abstrata, un objeto es una entidad concreta y real con sus propios
valores.
Ejemplo del mundo real
 La clase coche es el modelo de un coche.
 Un objeto sería “un coche específico”, como Toyota Corolla rojo o un Honda
Civic negro.
Como crear un objeto
Coche miCoche = new Coche();
Ejemplo completo: Creación y uso de un objeto
public class Main {
public static void main(String[] args) {
// Crear un objeto de la clase Coche
Coche miCoche = new Coche();
// Asignar valores a los atributos del objeto
miCoche.marca = "Toyota";
miCoche.modelo = "Corolla";
miCoche.velocidad = 120;
// Llamar al método mostrarInfo() del objeto
miCoche.mostrarInfo();
}
}
Salida en consola
Marca: Toyota
Modelo: Corolla
Velocidad: 120 km/h
Explicación del código:
1. Creamos un objeto miCoche de la clase Coche.
2. Asignamos valores a sus atributos (marca, modelo, velocidad).
3. Ejecutamos el método mostrarInfo(), que muestra la información del
coche.
Cada objeto es independiente y tiene sus propios valores. Podemos crear varios
objetos con diferentes datos:
Coche otroCoche = new Coche();
otroCoche.marca = "Honda";
otroCoche.modelo = "Civic";
otroCoche.velocidad = 100;
otroCoche.mostrarInfo();
Salida de la consola
Marca: Honda
Modelo: Civic
Velocidad: 100 km/h
10.3 RELACIÓN ENTRE CLASES Y OBJETOS
Para reforzar la relación entre clases y objetos, podemos compararlos con planos
de una casa:
 Una clase es el plano: define cómo se construirá la casa, cuántas
habitaciones tendrá, etc.
 Un objeto es una casa real construida de ese plano.
En términos de programación:
1. Una clase define los atributos y métodos que tendrá un objeto.
2. Los objetos son instancias reales de esa clase, con valores concretos.
Ejemplo con una clase Persona:
public class Persona {
String nombre;
int edad;
public void presentarse() {
System.out.println("Hola, mi nombre es " +
nombre + " y tengo " + edad + " años.");
}
}
Podemos crear múltiples objetos de Persona, cada uno con sus propios valores:
Persona persona1 = new Persona();
persona1.nombre = "Juan";
persona1.edad = 25;
persona1.presentarse();
Persona persona2 = new Persona();
persona2.nombre = "María";
persona2.edad = 30;
persona2.presentarse();
Salida en consola
Hola, mi nombre es Juan y tengo 25 años.
Hola, mi nombre es María y tengo 30 años.
Cada objeto tiene valores distintos, pero ambos pertenecen a la clase Persona.
10.4 CNSTRUCTORES: CREANDO OBJETOS CON VALORES
INICIALES
Hasta ahora, hemos asignado valores después de crear los objetos. Sin embargo,
hay una forma más eficiente de inicializar los atributos: los constructores.
Un constructor es un método especial que se ejecuta automáticamente cuando
se crea un objeto. su función es inicializar los valores de los atributos.
Ejemplo de un constructor en Java
public class Coche {
String marca;
String modelo;
int velocidad;
// Constructor de la clase Coche
public Coche(String marca, String modelo, int
velocidad) {
this.marca = marca;
this.modelo = modelo;
this.velocidad = velocidad;
}
public void mostrarInfo() {
System.out.println("Marca: " + marca);
System.out.println("Modelo: " + modelo);
System.out.println("Velocidad: " + velocidad + "
km/h");
}
}
Salida en consola
Marca: Toyota
Modelo: Corolla
Velocidad: 120 km/h
Marca: Honda
Modelo: Civic
Velocidad: 100 km/h
Explicación del constructor
 El constructor tiene el mismo nombre que la clase (Coche).
 Se ejecuta automáticamente cuando creamos un objeto con new.
 Usamos this para diferenciar loa atributos de la clase de los parámetros
del constructor.
10.5 RESUMEN Y PUNTOS CLAVE
1. Las clases son modelos que definen atributos y métodos.
2. Los objetos son instancias concretas de una clase, con valores específicos.
3. Se crean objetos usando new.
4. Cada objeto tiene su propio estado (valores de los atyributos).
5. Los constructores permiten inicializar objetos automáticamente.

CAPÍTULO 11: MODIFICADORES DE ACCESO Y
ENCAPSULACIÓN
En este capítulo, profundizaremos en dos conceptos fundamentales de la
Programación Orientada a Objetos (POO):
1. Modificadores de acceso: Permiten controlar la visibilidad y el acceso a los
atributos y métodos de una clase.
2. Encapsulación: Es el principio de ocultar detalles internos de un objeto y
exponer solo lo necesario.
Comprender estos conceptos es esencial para escribir código seguro, organizado y
fácil de mantener.
11.1 ¿QUÉ SON LOS MODIFICADORES DE ACCESO?
Los modificadores de acceso en Java determinan que partes del programa pueden
acceder a los atributos y métodos de una clase. Existen cuatro niveles de acceso:
Modificador
Accesible
desde la
misma clase
Accesible
desde otra
clase del
mismo
paquete
Accesible
desde
subclase en
otros
paquetes
Accesible
desde
cualquier
clase
private Sí No No No
default(sin
especifiar) Sí Sí No No
protected Sí Sí Sí No
public Sí Sí Sí Sí
Estos modificadores ayudan a proteger los datos y organizar el código, evitando
accesos no autorizados a los atributos y métodos de una clase.
11.2 USO DETALLADO DE CADA MODIFICADOR DE ACCESO
Veamos en profundidad como funcionan los modificadores de acceso en Java.
11.2.1. private: ACCESIBLE SOLO DENTRO DE LA MISMA CLASE
El modificador private oculta un atributo o método de otras clases. Solo se puede
acceder a él dentro de la misma clase.
Uso recomendado: Para atributos y métodos que no deben ser modificados
directamente desde fuera de la clase.
Error común: Intentar acceder a un atributo private desde otra clase.
Ejemplo:
public class Persona {
private String nombre; // Solo accesible dentro de
esta clase
private int edad;
public void mostrarInfo() {
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
}
}
Si intentamos acceder a nombre y edad desde otra clase, obtendremos un error:
public class Main {
public static void main(String[] args) {
Persona persona = new Persona();
persona.nombre = "Juan"; // ERROR: nombre es
private
}
}
Error: nombre no es accesible porque es private.
Solución: Usar métodos getters y setters (veremos esto en la sección de
encapsulación).
11.2.2. DEFAULT (sin especificar): ACCESIBLE DENTRO DEL MISMO
PAQUETE
Cuando no se especifica un modificador de acceso, Java asigna el modificador
“default”. Esto significa que el atributo o método solo es accesible dentro del
mismo paquete.
class Producto {
String nombre; // Accesible solo dentro del paquete
}
Si otra clase intenta acceder a nombre desde otro paquete obtendremos un error.
11.2.3. protected: ACCESIBLE EN EL MISMO PAQUETE Y SUBCLASES
El modificador protected permite que los atributos sean accesibles:
 Desde clases en el mismo paquete.
 Desde subclases en otros paquetes (herencia).
public class Animal {
protected String tipo;
protected void hacerSonido() {
System.out.println("El animal hace un sonido.");
}
}
Si una clase Perro hereda de Animal, puede acceder a tipo y hacerSonido():
public class Perro extends Animal {
public void ladrar() {
System.out.println("El perro es un " + tipo);
hacerSonido();
}
}
11.2.4. public: ACCESIBLE DESDE CUALQUIER CLASE
El modificador public permite que un atributo o método sea accesible desde
cualquier parte del programa.
public class Coche {
public String marca;
public void mostrarMarca() {
System.out.println("Marca: " + marca);
}
}
Ahora podemos acceder a marca desde cualquier clase sin restricciones.
public class Main {
public static void main(String[] args) {
Coche coche = new Coche();
coche.marca = "Toyota"; // Correcto
coche.mostrarMarca(); // Correcto
}
}
11.3. ¿QUÉ ES LA ENCAPSULACIÓN?
La encapsulación es el proceso de ocultar los detalles internos de un objeto y
permitir el acceso solo a través de métodos públicos.
Beneficios de la encapsulación:
 Protege los datos: Evita que otros objetos modifiquen los atributos
directamente.
 Facilita el mantenimiento: Si hay que cambiar la implementación interna,
no afecta a otras partes del código.
 Permite validaciones: Podemos asegurarnos de que los datos sean
correctos antes de asignarlos.
11.4. APLICANDO LA ENCAPSULACIÓN CON GETTERS Y
SETTERS.
Para acceder a atributos private, usamos métodos públicos llamados
“getters” y “setters”.
 Getter: Obtiene el valor de un atributo.
 Setter: Modifica el valor de un atributo con validaciones.
Ejemplo: Clase Persona encapsulada.
public class Persona {
private String nombre;
private int edad;
// Constructor
public Persona(String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;
}
// Getter para obtener el nombre
public String getNombre() {
return nombre;
}
// Setter para modificar el nombre
public void setNombre(String nombre) {
this.nombre = nombre;
}
// Getter para obtener la edad
public int getEdad() {
return edad;
}
// Setter con validación: No permite edades negativas
public void setEdad(int edad) {
if (edad >= 0) {
this.edad = edad;
} else {
System.out.println("Error: La edad no puede
ser negativa.");
}
}
public void mostrarInfo() {
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
}
}
Uso de la clase encapsulada
public class Main {
public static void main(String[] args) {
Persona persona = new Persona("Juan", 25);
// Obtener valores con getters
System.out.println("Nombre:" +
persona.getNombre());
System.out.println("Edad: " +
persona.getEdad());
// Modificar valores con setters
persona.setNombre("Carlos");
persona.setEdad(30);
// Intentar asignar un valor inválido
persona.setEdad(-5); // Mostrará un error
}
}
Salida en consola
Nombre: Juan
Edad: 25
Nombre: Carlos
Edad: 30
Error: La edad no puede ser negativa.
11.5. BUENAS PRÁCTICAS DE ENCAPSULACIÓN
 Haz los atributos private y accede a ellos solo con getters y setters.
 Usa setters para validar datos antes de asignarlos.
 Mantén el código modular y organizado.
 Si un dato no debe cambiar, evita el setter o usa final.

CAPÍTULO 12: HERENCIA Y POLIFORMISMO
En este capítulo, exploraremos en profundidad dos conceptos clave de la
Programación Orientada a Objetos (POO) en Java:
1. Herencia: Permite que una clase adquiera los atributos y métodos de otra,
fomentando la reutilización de código.
2. Poliformismo: Permite que un mismo método pueda tener diferentes
comportamientos según el objeto que lo invoque, mejorando la flexibilidad
y escalabilidad del código.
Estos conceptos son esenciales para escribir programas más organizados,
eficientes y reutilizables. Aprenderemos a aplicar herencia y poliformismo con
ejemplos detallados y buenas prácticas.
12.1 ¿QUÉ ES LA HERENCIA?
La herencia es un mecanismo mediante el cual una clase puede adquirir los
atributos y métodos de otra clase. La clase que hereda se llama subclase o clase
hija, y la clase de la que se hereda se llama superclase o clase padre.
Ejemplo del mundo real de herencia:
• Todos los vehículos tienen características comunes como maca, modelo y
velocidad.
• Un coche y una moto son vehículos, por lo que pueden compartir estos
atributos, pero también pueden tener características específicas.
• En lugar de repetir código en cada clase, podemos definir una superclase
Vehiculo con los atributos comunes y luego hacer que Coche y Moto
hereden de ella.
Esto nos permite reutilizar código y organizar mejor nuestras clases.
12.2. SINTAXIS DE LA HERENCIA EN JAVA
Para definir una relación de herencia en Java, utilizamos la palabra clave extends.
// Clase padre (superclase)
public class Vehiculo {
String marca;
int velocidad;
public void acelerar() {
System.out.println("El vehículo está acelerando.");
}
}
// Clase hija (subclase)
public class Coche extends Vehiculo {
int numeroDePuertas;
public void mostrarInfo() {
System.out.println("Marca: " + marca);
System.out.println("Velocidad: " + velocidad);
System.out.println("Número de puertas: " +
numeroDePuertas);
}
}
Explicación del código:
1. La clase Vehiculo es la superclase y contiene los atributos marca y
velocidad, además del método acerlerar().
2. La clase Coche es la subclase y hereda automáticamente los atributos y
métodos de Vehiculo.
3. Coche agrega su propio atributo (numeroDePuertas) y un método
mostrarInfo().
Ahora, cuando creamos un objeto Coche, automáticamente tiene acceso a los
atributos y métodos de Vehiculo.
12.3. CREANDO Y UTILIZANDO UNA SUBCLASE
Para utilizar la herencia en un programa, simplemente creamos un objeto de la
subclase y usamos sus atributos y métodos.
public class Main {
public static void main(String[] args) {
Coche miCoche = new Coche();
miCoche.marca = "Toyota";
miCoche.velocidad = 120;
miCoche.numeroDePuertas = 4;
miCoche.mostrarInfo();
miCoche.acelerar(); // Método heredado de Vehiculo
}
}
Salida esperada en consola:
Marca: Toyota
Velocidad: 120
Número de puertas: 4
El vehículo está acelerando.
Ventaja: No necesitamos volver a escribir el método acelerar() en Coche, porque lo
heredamos de Vehiculo.
12.4. SUPERCLASE Y SUBCLASE EN DETALLE
En la herencia. Se utilizan dos términos clave:
1. Superclase (clase padre). Es la clase de la que heredan otras clases.
2. Subclase (clase hija). Es la clase que hereda atributos y métodos de la
superclase.
public class Animal { // Superclase
String nombre;
public void hacerSonido() {
System.out.println("El animal hace un sonido.");
}
}
public class Perro extends Animal { // Subclase
public void ladrar() {
System.out.println(nombre + " está ladrando.");
}
}
Si creamos un objeto Perro, heredará nombre y hacerSonido() de Animal:
public class Main {
public static void main(String[] args) {
Perro miPerro = new Perro();
miPerro.nombre = "Firulais";
miPerro.hacerSonido(); // Método heredado
miPerro.ladrar(); // Método propio de la subclase
}
}
Salida esperada en consola:
El animal hace un sonido.
Firulais está ladrando.
12.5. LA PALABRA CLAVE SUPER
En una subclase, a veces necesitamos hacer referencia a los atributos o métodos
de la superclase. Para ello, usamos la palabra clave super.
public class Animal {
String nombre;
public Animal(String nombre) {
this.nombre = nombre;
}
public void hacerSonido() {
System.out.println(nombre + " hace un sonido.");
}
}
public class Perro extends Animal {
public Perro(String nombre) {
super(nombre); // Llama al constructor de la superclase
}
public void ladrar() {
System.out.println(nombre + " está ladrando.");
}
}
super(nombre); llama al constructor de la superclase Animal, inicializando el
atributo nombre.
12.6 ¿QUÉ ES EL POLIFORMISMO?
El poliformismo permite que un mismo método tenga diferentes comportamiento
según el objeto que lo invoque.
Existen dos tipos de poliformismo en Java:
1. Poliformismo en tiempo de ejecución (sobreescritura de métodos).
2. Poliformismo en tiempo de compilación (sobrecarga de métodos).
12.7. SOBREESCRITURA DE MÉTODOS (@Override)
La sobreescritura permite redefinir un método heredado en la subclase para darle
un comportamiento específico.
public class Animal {
public void hacerSonido() {
System.out.println("El animal hace un sonido.");
}
}
public class Perro extends Animal {
@Override
public void hacerSonido() {
System.out.println("El perro ladra.");
}
}
public class Main {
public static void main(String[] args) {
Animal miAnimal = new Perro();
miAnimal.hacerSonido(); // Llamará al método sobreescrito
en Perro
}
}
Salida esperada en consola:
El perro ladra.
12.8. SOBRECARGA DE MÉTODOS
La sobrecarga permite definir varios métodos con el mismo nombre pero con
diferentes parámetros.
public class Calculadora {
public int sumar(int a, int b) {
return a + b;
}
public int sumar(int a, int b, int c) {
return a + b + c;
}
}
public class Main {
public static void main(String[] args) {
Calculadora calc = new Calculadora();
System.out.println(calc.sumar(2, 3)); // 5
System.out.println(calc.sumar(2, 3, 4)); // 9
}
}

CAPÍTULO 13: INTERFACES Y CLASES ABSTRACTAS
La POO, como ya hemos visto, se basa en conceptos como clases, objetos,
herencia y poliformismo. Hasta ahora hemos aprendido a crear jerarquías de clases
y a reutilizar código con herencia, pero existe una necesidad aún más profunda:
establecer estructuras que obliguen a nuestras clases a comportarse de
determinada manera.
Ahí es donde entran las clases abstractas y las interfaces: dos herramientas
fundamentales para diseñar sistemas flexibles, coherentes y mantenibles. Este
capítulo te ayudará a entender qué son, como se usan y cuándo conviene utilizar
una y otra.
13.1. ¿QUÉ ES UNA CLASE ABASTRACTA?
Una clase abstracta es una clase que sirve como modelo base para otras clases.
No representa una entidad concreta, sino una idea general que otras que otras
clases más específicas deben completar.
Analogía:
Imagina que tienes un plano de un vehículo. Sabes que todos los vehículos tienen
un motor y pueden moverse, pero no puedes conducir un plano. Necesitamos un
coche, una moto, un autobús… algo concreto.
Ese plano general sería la clase abstracta.
Características de las clases abstractas:
• Se declaran con la palabra clave abstract.
• No se pueden instanciar directamente.
• Pueden contener:
o Métodos abstractos (sin cuerpos).
o Métodos normales (con cuerpo).
o Atributos (como cualquier clase).
o Constructores (aunque no puedan instanciarse directamente).
Ejemplo básico:
public abstract class Animal {
protected String nombre;
public Animal(String nombre) {
this.nombre = nombre;
}
// Método abstracto (obliga a implementarlo en la subclase)
public abstract void hacerSonido();
// Método no abstracto (puede heredarse tal cual)
public void dormir() {
System.out.println(nombre + " está durmiendo.");
}
}
Ahora, si queremos usar esta clase, necesitamos crear una subclase que herede de
Animal y defina el método hacerSonido():
public class Perro extends Animal {
public Perro(String nombre) {
super(nombre);
}
@Override
public void hacerSonido() {
System.out.println(nombre + " dice: ¡Guau!");
}
}
Uso:
public class Main {
public static void main(String[] args) {
Animal miPerro = new Perro("Bobby");
miPerro.hacerSonido(); // "Bobby dice: ¡Guau!"
miPerro.dormir(); // "Bobby está durmiendo."
}
}
13.2. ¿QUÉ ES UNA INTERFAZ?
Una interfaz es como un contrato. No contiene atributos (salvo constantes), ni
implementaciones completas (salvo que se usen métodos default), sino que define
qué métodos deben tener las clases que la implementen.
Analogía:
Una interfaz es como un reglamento de juego. No dice cómo se gana o pierde, solo
qué reglas deben seguir todos los jugadores. Cada jugador (clase) puede
implementar las reglas a su manera.
Características de las interfaces:
• Se declaran con la palabra clave interface.
• No se pueden instanciar directamente.
• Todos los métodos son, por defecto:
o Públicos (public)
o Abstractos (sin cuerpo), a menos que se usen default.
• Las clases que las implementen están obligadas a definir sus métodos.
Ejemplo básico de interfaz:
public interface Volador {
void volar(); // método abstracto, sin cuerpo
}
Una clase que implemente esa interfaz debe definir el método:
public class Pajaro implements Volador {
@Override
public void volar() {
System.out.println("El pájaro vuela alto en el cielo.");
}
}
Uso:
public class Main {
public static void main(String[] args) {
Volador ave = new Pajaro();
ave.volar(); // "El pájaro vuela alto en el cielo."
}
}
13.3. DIFERENCIAS CLAVE ENTRE CLASES ABSTRACTAS E
INTERFACES
CARACTERÍSTICA CLASE ABSTRACTA INTERFAZ
¿Se puede instanciar? ❌ No ❌ No
¿Contiene atributos? ✅ Sí
⚠ Solo constantes
(public static final)
¿Métodos con
implementación?
✅ Sí (normales y
abstractos)
✅ Desde Java 8 (default,
static)
¿Herencia múltiple?
❌ No (solo una clase
padre)
✅ Sí (puede
implementar varias
interfaces)
¿Relación entre clases? Jerarquía (relación "es
un...")
Contrato de
comportamiento
¿Constructor? ✅ Puede tener ❌ No
13.4. IMPLEMENTACIÓN MÚLTIPLE DE INTERFACES
Una gran ventaja de las interfaces es que una clase puede implementar varias
interfaces a la vez, mientras que solo puede heredar una sola clase abstracta.
Ejemplo:
public interface Volador {
void volar();
}
public interface Nadador {
void nadar();
}
public class Pato implements Volador, Nadador {
@Override
public void volar() {
System.out.println("El pato vuela bajo.");
}
@Override
public void nadar() {
System.out.println("El pato nada en el lago.");
}
}
public class Main {
public static void main(String[] args) {
Pato pato = new Pato();
pato.volar(); // "El pato vuela bajo."
pato.nadar(); // "El pato nada en el lago."
}
}
13.5. MÉTODOS DEFAULT Y STATIC EN INTERFACES (JAVA 8+)
Desde Java 8, las interfaces puede contener:
• Métodos default: tienen una implementación por defecto.
• Métodos static: pertenecen a la interfaz y se pueden usar sin instanciar.
Ejemplo:
public interface Saludo {
default void saludar() {
System.out.println("¡Hola desde la interfaz!");
}
static void mensaje() {
System.out.println("Este es un método estático de la
interfaz.");
}
}
public class Persona implements Saludo {
// No es necesario sobrescribir saludar(), pero se puede
}
public class Main {
public static void main(String[] args) {
Persona p = new Persona();
p.saludar(); // "¡Hola desde la interfaz!"
Saludo.mensaje(); // "Este es un método estático de la
interfaz."
}
}
13.6. CUANDO USAR CLASES ABSTRACTAS Y CUANDO USAR
INTERFACES
Situación Usa clase abstracta Usa interfaz
Quieres compartir
código común
✅ ❌
Quieres forzar la
implementación de
ciertos métodos
✅ ✅
Necesitas heredar de
varias “fuentes” de
comportamiento
❌ ✅
La relación entre clases
es de tipo “es un(a)
!"(ej. Empleado hereda
de Persona) ❌
Diferentes clases no
relacionadas
comparten
comportamientos
❌ !"(ej. Imprimible,
Serializable)
13.7. EJEMPLO COMPLETO COMBINANDO AMBOS CONCEPTOS
public abstract class Animal {
String nombre;
public Animal(String nombre) {
this.nombre = nombre;
}
public abstract void emitirSonido();
}
public interface Nadador {
void nadar();
}
public class Delfin extends Animal implements Nadador {
public Delfin(String nombre) {
super(nombre);
}
@Override
public void emitirSonido() {
System.out.println(nombre + " emite un sonido agudo.");
}
@Override
public void nadar() {
System.out.println(nombre + " nada velozmente.");
}
}
public class Main {
public static void main(String[] args) {
Delfin delfin = new Delfin("Flipper");
delfin.emitirSonido();
delfin.nadar();
}
}
Salida esperada:
Flipper emite un sonido agudo.
Flipper nada velozmente.
13.8. CONCLUSIÓN
Las interfaces y clases abstractas son herramientas esenciales para modelar la
lógica de un sistema de Java:
• Las clases abstractas definen una base común con parte de la
implementación.
• Las interfaces definen comportamientos sin imponer una jerarquía rígida.
• Son complementarios, no excluyentes.
A medida que desarrolles programas más grandes, aprenderás a usarlas para:
• Separar lógica.
• Reutilizar código.
• Diseñar arquitecturas limpias y mantenibles.

CAPÍTULO 14: INTRODUCCIÓN A LAS
COLECCIONES – ARRAYLIST, HASHMAP Y HASHSET
Hasta ahora hemos trabajado con estructuras básicas como variables y arrays. Pero
a medida que los programas se hacen más grandes y complejos, necesitamos
herramientas que nos permitan almacenar, gestionar y acceder a conjuntos de
datos de forma más flexible y potente.
Aquí es donde entran en juego las colecciones. Las colecciones nos permiten
trabajar con grupos de elementos (listas, conjuntos, mapas…) de forma dinámica
y eficiente.
Java proporciona una potente biblioteca de colecciones dentro del paquete
java.util, y en este capítulo aprenderemos a utilizar las tres más fundamentales:
• ArrayList: para listas dinámicas y ordenadas.
• HashSet: para conjuntos sin duplicados.
• HashMap: para almacenar pares clave-valor, como un diccionario.
14.1. ¿QUÉ ES UNA COLECCIÓN?
Una colección es una estructura de datos que nos permite agrupar múltiples
elementos en un solo objeto.
Las colecciones:
• Son dinámicas (no tienen tamaño fijo como los arrays).
• Permiten añadir, eliminar, buscar, modificar y recorrer elementos con
gran facilidad.
• Nos ayudan a escribir código más limpio, flexible y reutilizable.
Para usar colecciones en Java debemos importar:
import java.util.*;
14.2. ARRAYLIST: LISTAS DINÁMICAS Y ORDENADAS
Un ArrayList es una colección que almacena elementos en orden de inserción,
como un array tradicional, pero con muchas ventajas adicionales:
• Su tamaño crece automáticamente.
• Permite añadir y eliminar elementos fácilmente.
• Se puede acceder a los elementos por índice, igual que en un array.
• Acepta elementos duplicados.
Ejemplo básico:
import java.util.ArrayList;
public class EjemploArrayList {
public static void main(String[] args) {
ArrayList<String> nombres = new ArrayList<>();
// Añadir elementos
nombres.add("Lucía");
nombres.add("Carlos");
nombres.add("María");
nombres.add("Lucía"); // Duplicado permitido
// Mostrar elementos
for (String nombre : nombres) {
System.out.println(nombre);
}
// Acceder por índice
System.out.println("Elemento en posición 1: " +
nombres.get(1));
// Eliminar un elemento
nombres.remove("Carlos");
// Buscar un elemento
if (nombres.contains("Lucía")) {
System.out.println("Lucía está en la lista.");
}
// Tamaño de la lista
System.out.println("Tamaño de la lista: " + nombres.size());
}
}
Métodos útiles:
Método Descripción
add(elemento) Añade un elemento al final de la lista
get(índice) Devuelve el elemento en esa posición
set(índice, nuevo) Reemplaza el valor en esa posición
remove(objeto/índice) Elimina un elemento
size() Devuelve el número de elementos
contains(elemento) Indica si el elemento está en la lista
clear() Elimina todos los elementos
14.3. HASHSET: CONJUNTO SIN ELEMENTOS DUPLICADOS
Un HashSet es una colección que no permite elementos duplicados y no
garantiza ningún orden. Se utiliza cuando queremos asegurarnos de que cada
elemento es único, por ejemplo:
• DNI de personas
• Correos electrónicos
• Números de matrículas
Ejemplo:
import java.util.HashSet;
public class EjemploHashSet {
public static void main(String[] args) {
HashSet<String> colores = new HashSet<>();
colores.add("Rojo");
colores.add("Azul");
colores.add("Verde");
colores.add("Rojo"); // No se añade: ya existe
for (String color : colores) {
System.out.println(color);
}
// Buscar
if (colores.contains("Azul")) {
System.out.println("El color Azul está presente.");
}
// Eliminar
colores.remove("Verde");
// Tamaño
System.out.println("Número de colores: " + colores.size());
}
}
Métodos útiles
Método Descripción
add(elemento) Añade un nuevo elemento (si no está)
remove(elemento) Elimina el elemento
contains(e) Comprueba si el elemento está presente
isEmpty() Devuelve true si el conjunto está vacío
clear() Elimina todos los elementos
14.4. HASHMAP: PARES CLAVE-VALOR (DICCIONARIO)
Un HashMap es una colección que almacena datos en forma de pares clave →
valor:
• Teléfonos de personas (nombre → número)
• Notas de alumnos (DNI → nota)
• Contraseñas (usuario → clave)
Ejemplo:
import java.util.HashMap;
public class EjemploHashMap {
public static void main(String[] args) {
HashMap<String, Integer> edades = new HashMap<>();
edades.put("Lucía", 28);
edades.put("Carlos", 35);
edades.put("María", 22);
// Acceder por clave
System.out.println("Edad de Carlos: " + edades.get("Carlos"));
// Recorrer
for (String nombre : edades.keySet()) {
System.out.println(nombre + " tiene " +
edades.get(nombre) + " años.");
}
// Verificar si existe
if (edades.containsKey("Lucía")) {
System.out.println("Lucía está registrada.");
}
// Eliminar
edades.remove("María");
}
}
Métodos útiles:
Método Descripción
put(clave, valor) Inserta o actualiza una entrada
get(clave) Devuelve el valor asociado a la clave
containsKey(clave) Comprueba si existe la clave
remove(clave) Elimina la entrada asociada a la clave
keyset() Devuelve el conjunto de claves
values() Devuelve los valores almacenados
entrySet() Devuelve el conjunto de entradas (clave-valor)
14.5. ¿Cuándo USAR CADA TIPO DE COLECCIÓN?
Colección Ideal para…
ArrayList Listas ordenadas, con elementos duplicados y acceso por
posición
HashSet Conjuntos únicos, sin orden y sin duplicados.
HashMap Asociaciones clave → valor, tipo diccionario con claves únicas.
14.6. COMPARACIÓN VISUAL
Característica ArrayList HashSet HashMap
Orden de
elementos ✅ Mantiene orden
❌ No garantiza
orden
❌ No garantiza
orden
Permite
duplicados
✅ Sí ❌ No
✅ Valores sí, claves
no
Acceso por
índice
✅ Sí ❌ No ❌ No
Acceso por
clave
❌ No ❌ No ✅ Sí
Estructura
recomendada Lista Conjunto Diccionario o tabla
de datos
14.7. BUENAS PRÁCTICAS AL USAR COLECCIONES
• Usa genéricos: siempre indica el tipo (ArrayList<String>, HashMap<String,
Integer>) para evitar errores.
• Evita recorrer los índices si no es necesario: utiliza el bucle for-each.
• Siempre comprueba si un elemento o clave existe antes de acceder
(contains, containsKey).
• Elige la colección adecuada según lo que necesites:
o ¿Necesitas orden? Usas ArrayList.
o ¿Necesitas evitar duplicados? Usa HashSet.
o ¿Necesitas asociar valores a claves? Usa HashMap.

CAPÍTULO 15: CLASES ANIDADAS Y CLASES
ANÓNIMAS
Hasta ahora, hemos aprendido a definir clases por separado, en archivos o bloques
independientes. Pero Java también nos permite definir clases dentro de otras
clases o incluso dentro de métodos, lo que nos ofrece una forma poderosa de
organizar código y agrupar funcionalidades relacionadas.
En este capítulo abordaremos con profundidad los dos conceptos principales:
1. Clase anidadas (Nested Classes)
2. Clases anónimas (Anonymous Classes)
Ambas son útiles cuando una clase depende fuertemente del contexto en el que se
usa. Veamos en que consisten y como se utilizan correctamente.
15.1. ¿QUÉ ES UNA CLASE ANIDADA?
Una clase anidada es una clase declarada dentro de otra clase. Esta clase
“interna” se asocia a su clase “externa”, y puede acceder a sus atributos y métodos
(incluso privados) dependiendo del tipo de anidación.
Las clases anidadas son útiles para encapsular código relacionado, mejorar la
legibilidad y facilitar la reutilización dentro del contexto donde se necesitan.
Tipos de clases anidadas en Java
Tipo ¿Dónde se declara? ¿Tiene
nombre?
¿Es
estática?
¿Accede a
miembros
externos
Clase
interna
(inner)
Dentro de una clase ✅ Sí ❌ No ✅ Sí
Clase
anidada
estática
Dentro de una clase ✅ Sí ✅ Sí
❌ Solo a
miembros
estáticos
Clase local Dentro de un método ✅ Sí ❌ No ✅ Sí
Clase
anónima
Dentro de un
método/expresión
❌ No ❌ No ✅ Sí
En este capítulo nos centraremos en clases internas y clases anónimas, que son
las más utilizadas por programadores principiantes y en desarrollo de aplicaciones.
15.2. CLASES INTERNAS (INNER CLASSES)
Una clase interna es una clase no estática que se declara dentro de otra clase. Su
principal ventaja es que puede acceder directamente a todos los atributos y
métodos (incluso privados) de la clase externa.
Esto es útil cuando queremos que una clase sirva como componente auxiliar de
otra, por ejemplo, una clase Motor dentro de una clase Coche.
Ejemplo: clase interna
public class Coche {
private String marca;
public Coche(String marca) {
this.marca = marca;
}
// Clase interna
public class Motor {
private int caballos;
public Motor(int caballos) {
this.caballos = caballos;
}
public void mostrarDetalles() {
System.out.println("Marca del coche: " + marca);
System.out.println("Potencia del motor: " + caballos +
" CV");
}
}
}
Como instanciar una clase interna
public class Main {
public static void main(String[] args) {
Coche coche = new Coche("Toyota");
Coche.Motor motor = coche.new Motor(120);
motor.mostrarDetalles();
}
}
Salida esperada:
Marca del coche: Toyota
Potencia del motor: 120 CV
Como se puede observar, la clase Motor puede acceder directamente al atributo
marca de la clase Coche, sin necesidad de métodos get.
¿Cuándo usar clases internas?
• Cuando una clase solo tiene sentido dentro de otra.
• Cuando necesitas acceder fácilmente a los miembros de la clase externa.
• Para organizar mejor el código y evitar tener demasiadas clases separadas
en el proyecto.
15.3. CLASES ANÓNIMAS (ANONYMOUS CLASSES)
Una clase anónima es una clase sin nombre que se declara e instancia al mismo
tiempo. Se utiliza para crear objetos con un comportamiento específico y único,
sin necesidad de crear una clase completa.
Es muy común usarlas para:
• Implementar interfaces rápidamente.
• Sobrescribir métodos de clases sin crear subclases por separado.
• Eventos y callbacks en interfaces gráficas (GUI), programación de hilos, etc.
Es una solución práctica para tareas puntuales donde no se justifica crear una clase
completa con nombre.
Ejemplo 1: Implementar una interfaz.
Supongamos que tenemos esta interfaz:
public interface Mensaje {
void mostrar();
}
Podemos crear una clase anónima así:
public class Main {
public static void main(String[] args) {
Mensaje saludo = new Mensaje() {
@Override
public void mostrar() {
System.out.println("¡Hola desde una clase anónima!");
}
};
saludo.mostrar();
}
}
Salida:
¡Hola desde una clase anónima!
Ejemplo 2: Sobrescribir método de clase
public class Animal {
public void hacerSonido() {
System.out.println("El animal hace un sonido genérico.");
}
}
public class Main {
public static void main(String[] args) {
Animal gato = new Animal() {
@Override
public void hacerSonido() {
System.out.println("El gato dice: Miau");
}
};
gato.hacerSonido();
}
}
¿Cuándo usar clases anónimas?
• Para implementar una interfaz cuando solo se va a usar una vez.
• Para modificar ligeramente el comportamiento de una clase en un caso
concreto.
• Cuando necesitas un código más compacto y localizado.
15.4. DIFERENCIAS CLAVE
Característica Clase interna Clase anónima
¿Tiene nombre? ✅ Sí ❌ No
¿Se puede reutilizar? ✅ Sí ❌ No
¿Accede a la clase
externa?
✅ Sí ✅ Sí
¿Puede tener varios
métodos?
✅ Sí ⚠ Limitado a lo que se
sobrescriba
¿Para qué se usa? Organización del código Tareas rápidas,
comportamiento puntual
15.5. RECOMENDACIONES Y BUENAS PRÁCTICAS
ü Usa clases internas cuando la relación entre clases sea fuerte y quieras
encapsularlas juntas.
ü Usa clases anónimas para reducir el código innecesario cuando solo
necesitas una implementación rápida.
ü No abuses de las clases anónimas si son muy largas: mejor crear una clase
con nombre.
ü Usa comentarios si el código anónimo hace algo complejo.

CAPÍTULO 16: FLUJO DE ENTRADA Y SALIDA EN
JAVA (INPUTSTREAM Y OUTPUTSTREAM)
En el mundo real, los programas necesitan interactuar con el entorno: leer datos de
archivos, recibir información desde el teclado, enviar mensajes por red o guardar
resultados en disco. Esta interacción se conoce como entrada/salida o
simplemente E/S (I/O en inglés, de Input/Output).
En este capítulo veremos como gestionar esa entrada y salida en Java utilizando dos
clases fundamentales:
 InputStream: para leer datos byte a byte.
 OutputStream: para escribir datos byte a byte.
Estos conceptos sientan las bases para tareas comunes como trabajar con
archivos, redes, dispositivos o flujos de datos dinámicos.
16.1. ¿QUÉ ES UN FLUJO EN JAVA?
Un flujo (stream) es una secuencia ordenada de datos que proviene de una fuente
(entrada) o que se envía hacia un destino (salida). Es un canal por el que “fluyen”
los datos.
Ejemplos cotidianos:
 Cuando lees un archivo → flujo de entrada.
 Cuando escribes un archivo → flujo de salida.
 Cuando lees los datos desde el teclado → flujo de entrada.
 Cuando imprimes en pantalla → flujo de salida.
Analogía: Imagina una tubería de agua. El agua representa los datos. Si la tubería va
hacia ti, es una entrada; si sale de ti hacia otro sitio, es una salida.
16.2. CLASIFICACIÓN DE FLUJOS EN JAVA
Java proporciona una jerarquía rica de clases para manejar E/S. las más básicas
trabajan a nivel de bytes, y se dividen en dos grandes ramas:
Tipo de flijo Clase Base Función principal
Entrada InputStream Leer datos desde una fuente externa.
Salida OutputStream Escribir datos hacia un destino externo
Nota:
Estas clases funcionan con bytes (byte), no con caracteres (char). Esto es ideal
para trabajar con archivos binarios (imágenes, vídeos, audios …), aunque también
se puede utilizar con texto.
Más adelante veremos los flujos de caracteres usando Reader y Writer, que son
más apropiados para texto.
16.3. CLASE InputStream: LECTURA DE DATOS
InputStream es una clase abstracta que define métodos básicos para leer datos
desde una fuente (archivo, red, teclado, etc.) en forma de bytes.
Métodos clave:
Método Descripción
int read() Lee un byte y devuelve su valor (0-255). Devuelve -1 al
llegar al final.
int read(byte[] b) Lee varios bytes y los almacena en el array b.
void close() Cierra el flujo para liberar recursos del sistema.
Ejemplo: Leer archivo con FileInputStream
import java.io.FileInputStream;
import java.io.IOException;
public class LeerArchivo {
public static void main(String[] args) {
try {
FileInputStream entrada = new
FileInputStream("datos.txt");
int dato;
while ((dato = entrada.read()) != -1) {
System.out.print((char) dato); //
Convertimos byte a carácter
}
entrada.close();
} catch (IOException e) {
System.out.println("Error al leer: " +
e.getMessage());
}
}
}
Este programa:
 Abre el archivo datos.txt.
 Lee su contenido byte a byte.
 Muestra el contenido por consola.
 Cierra el archivo al finalizar.
16.4. CLASE OutputStream: ESCRITURA DE DATOS
OutpuStream es la clase para todos los flujos que permiten escribir bytes en un
destino (archivo, pantalla, red, etc).
Métodos clave:
Método Descripción
void write(int b) Escribe un solo byte.
void write(byte[] b) Escribe todos los bytes del array
void flush() Fuerza la escritura de los datos pendientes.
void close() Cierra el flujo y libera los recursos.
Ejemplo: Escribir en archivo con FileOutputStream
import java.io.FileOutputStream;
import java.io.IOException;
public class EscribirArchivo {
public static void main(String[] args) {
try {
FileOutputStream salida = new
FileOutputStream("salida.txt");
String texto = "Este es un ejemplo de
escritura.";
byte[] datos = texto.getBytes();
salida.write(datos);
salida.close();
} catch (IOException e) {
System.out.println("Error al escribir: "
+ e.getMessage());
}
}
}
16.5. USAR BufferedInputStream Y
BufferedOutputStream
Leer y escribir byte a byte puede ser ineficiente para archivos grandes. Por eso, Java
ofrece flujos con bu􀆯er que almacenan los datos temporalmente en memoria antes
de procesarlo, lo que mejora el rendimiento.
import java.io.*;
public class CopiarArchivo {
public static void main(String[] args) {
try (
BufferedInputStream entrada = new
BufferedInputStream(new
FileInputStream("origen.txt"));
BufferedOutputStream salida = new
BufferedOutputStream(new
FileOutputStream("copia.txt"))
) {
int byteLeido;
while ((byteLeido = entrada.read()) != -
1) {
salida.write(byteLeido);
}
System.out.println("Archivo copiado
correctamente.");
} catch (IOException e) {
System.out.println("Error al copiar: " +
e.getMessage());
}
}
}
Ventajas del bu􀆯er:
 Se reduce el número de accesos al disco.
 Se mejora el tiempo de ejecución.
 Es muy útil para archivos grandes o flujos de red.
16.6. BLOQUES try-with-resources (JAVA 7+)
Cuando trabajamos con archivos siempre debemos cerrar los recursos para evitar
figas de memoria. Java 7 introdujo la estructura try-with-resources, que cierra
automáticamente los flujos al terminar.
try (FileInputStream fis = new
FileInputStream("archivo.txt")) {
// leer datos
} catch (IOException e) {
// manejar error
}
// fis se cierra automáticamente aquí
16.7. COMPARATIVA ENTRE FLUJOS DE E/S
Característica InputStream OutputStream
¿Qué hace? Lee datos byte a byte Escribe datos byte a byte
Clase base Si (abstracta) Si (abstracta)
Métodos importantes read(),
read(byte[])
write(),
write(byte[])
Necesita cerrar Si Si
Subclases comunes FileInputStream,
BufferedInputStream
FileOutputStream,
BufferedOutputStream

CAPÍTULO 17: LECTURA Y ESCRITURA DE
ARCHIVOS CON FILEREADER Y FILEWRITER
En la programación real, no siempre podemos depender únicamente de datos
proporcionados durante la ejecución mediante el teclado o generados en memoria.
A menudo necesitamos trabajar con archivos de texto: leer información
previamente guardada o almacenar resultados para usarlos después. Java nois
facilita esta tarea con herramientas específicas diseñadas para manejar archivos
de forma sencilla y eficiente.
En este capítulo veremos dos clases esenciales para trabajar con archivos de texto:
 FileReader: para leer texto desde un archivo.
 FileWriter: para escribir texto en un archivo.
Estas clases se centran en trabajar con caracteres (char), lo cual las hace más
adecuadas que InputStream y OutputStream cuando se trata de archivos
.txt.
17.1. ¿QUÉ SON FileReader Y FileWriter?
Ambas clases forman parte del paquete java.io y están diseñadas para operar
carácter a carácter. Son especialmente útiles cuando necesitas manipular archivos
de texto con contenido legible para humanos (como configuraciones, resultados,
informes, etc).
Clase ¿Para que sirve?
FileReader Leer archivos de texto carácter a carácter
FileWriter Escribir texto carácter a carácter en archivos
Estas dos clase convierten automáticamente los bytes del archivo en caracteres
utilizando la codificación predeterminada del sistema operativo (normalmente
UTF-8 o ISO-8859-1)
17.2. LECTURA DE ARCHIVOS CON FileReader
Importación
import java.io.FileReader;
import java.io.IOException;
Ejemplo paso a paso
Supón que tienes un archivo entrada.txt con el siguiente contenido:
Hola, mundo.
Bienvenidos a Java.
El siguiente programa lo leerá carácter a carácter y lo mostrará por pantalla:
import java.io.FileReader;
import java.io.IOException;
public class LectorArchivo {
public static void main(String[] args) {
try {
FileReader lector = new FileReader("entrada.txt");
int caracter;
while ((caracter = lector.read()) != -1) {
System.out.print((char) caracter);
}
lector.close();
} catch (IOException e) {
System.out.println("Error al leer el archivo: " + e.getMessage());
}
}
}
¿Qué está pasando aquí?
 Se crea un FileReader que abre el archivo entrada.txt.
 El método read() lee un carácter cada vez (devuelve su código Unicode).
 Cuando read() devuelve -1 significa que hemos llegado al final del archivo.
 Se convierte el valor leído en un char para mostrarlo.
 Se cierra el archivo con close() para liberar recursos.
Alternativa: leer por bloques de caracteres
Es más eficiente leer múltiples caracteres a la vez usando un array.
char[] buffer = new char[100];
int leidos = lector.read(buffer);
Esto se puede usar en un bucle para procesar el archivo por bloques.
17.3. ESCRITURA DE ARCHIVOS CON FileWriter
Importación
import java.io.FileWriter;
import java.io.IOException;
Ejemplo: Escribir un archivo de texto
import java.io.FileWriter;
import java.io.IOException;
public class EscritorArchivo {
public static void main(String[] args) {
try {
FileWriter escritor = new
FileWriter("salida.txt");
escritor.write("Este es un archivo de
texto generado con Java.\n");
escritor.write("Aprender a manejar
archivos es muy útil.\n");
escritor.close();
} catch (IOException e) {
System.out.println("Error al escribir: "
+ e.getMessage());
}
}
}
Análisi:
 Se crea o sobreescribe el archivo salida.txt.
 El método write(String) escribe una línea completa.
 Puedes añadir saltos de línea con \n.
 Es muy importante cerrar el flujo con close().
Escritura en modo “append”
Si deseas añadir contenido a un archivo existente sin sobreescribirlo:
FileWriter escritor = new FileWriter("salida.txt",
true); // true activa el modo append
Este detalle es muy útil cuando quieres guardar logs o resultados acumulativos.
17.4. COMBINAR LECTURA Y ESCRITURA
Ejemplo práctico: Copiar un archivo de texto
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopiarTexto {
public static void main(String[] args) {
try (FileReader lector = new
FileReader("origen.txt");
FileWriter escritor = new
FileWriter("copia.txt")) {
int caracter;
while ((caracter = lector.read()) != -1) {
escritor.write(caracter);
}
System.out.println("Archivo copiado
correctamente.");
} catch (IOException e) {
System.out.println("Error al copiar el
archivo: " + e.getMessage());
}
}
}
Este código:
 Lee el archivo origen.txt carácter a carácter.
 Escribe cada carácter en copia.txt.
 Utilizar el try-with-resources para garantizar que ambos archivos se
cierran automáticamente.
17.5. BUENAS PRACTICAS
 Usa try-with-resources siempre que sea posible.
 Cierra siempre los flujos con close() o automáticamente con try-withresources.
 Añade flush() si necesitas asegurar que los datos se escriben antes de cerrar.
 Controla siempre las posibles excepciones (IOException).
 No uses FileReader/FileWriter para archivos binarios (usa
InputStream/OutPutStream).
 No mezcles flujos de texto y binarios sin entender como se codifican los
caracteres.
17.6. COMPARATIVA CON OTROS FLUJOS
Característica FileReader /
FileWriter
Bu􀆯eredReader /
Bu􀆯eredWriter
InputStream /
OutputStream
Nivel de datos Caracteres (char) Caracteres,
optimizados
Bytes (byte)
Lestura/escritura
por línea
No Si (método
readline)
No
Bu􀆯ering
automático
No Si No ( Usa Bu􀆯ered
también)
Ideal para… Archivos
pequeños de texto
Archivos grandes
de texto
Datos binarios
(imágenes, etc)

CAPÍTULO 18: USO DE BUFFEREDREADER Y
BUFFEREDWRITER PARA MANEJAR GRANDES
CANTIDADES DE DATOS.
En los capítulos anteriores exploramos como utilizar FileReader y FileWriter
para manipular archivos de texto en Java. Estas clases son ideales para operaciones
básicas, pero representan limitaciones importantes cuando se trata de manejar
grandes volúmenes de datos o realizar operaciones intensivas de entrada y salida.
Trabajar carácter a carácter puede generar un alto consumo de recursos y una
importante pérdida de rendimiento en programas que procesan archivos extensos
o realizan múltiples operaciones repetitivas sobre el sistema de archivos.
Para abordar estos desafíos, Java incorpora las clases BufferedReader y
BufferedWriter, que emplea un bu􀆯er de memoria intermedio para optimizar
las operaciones de lectura y escritura. Estos bu􀆯ers permiten acumular los datos
temporalmente y procesarlos en bloques, lo que reduce significativamente la
cantidad de accesos al disco y mejora el rendimiento general del programa.
Además de la eficiencia, estas clases proporcionan métodos prácticos como
readLine() y newline(), que simplifican enormemente la gestión de líneas de
texto, permitiendo desarrollar aplicaciones más limpias, robustas y fáciles de
mantener.
18.1. ¿QUÉ ES UN BUFFER?
Un bu􀆯er es una región de memoria que actúa como intermediario entre fuente de
datos (como un archivo) y el programa que los procesa. En el contexto de la
entrada/salida en Java, los bu􀆯ers almacenan temporalmente datos leídos o
preparados para escribir, de modo que puedan procesarse en bloques más grandes
y menos frecuentes.
Esto se traduce en mayor velocidad y eficiencia, especialmente cuando se trata
de archivos grandes o cuando se requiere una interacción continua con el sistema
de archivos.
Cuando utilizamos BufferedReader, los datos se leen desde el disco en bloques
que se almacenan en el bu􀆯er, desde donde el programalos consume a demanda,
evitando múltiples accesos al disco. Al usar BufferWriter, los datos generados
por el programa se acumulan en el bu􀆯er y se escriben todos juntos en el disco
cuando el bu􀆯er se llena o se invoca el método flush() o close().
Esta técnica no solo mejora el rendimiento, sino que también ayuda a reducir el
desgaste de dispositivos de almacenamiento en operaciones intensivas.
18.2. BufferedReader – LECTURA EFICIENTE DE TEXTO
BufferedReader es una clase que mejora la lectura de texto al permitir acceder
a bloques completos de datos, en lugar de carácter por carácter. Una de sus
ventajas principales es el método readLine(), que permite leer una línea
completa de texto de una sola vez, sin necesidad de gestionar manualmente los
saltos de línea.
Esta clase se utiliza comúnmente en tareas com:
 Leer archivos de texto grandes.
 Procesar archivos línea por línea.
 Leer entradas desde la consola de forma eficiente.
Importación y sintaxis básica.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
Métodos principales.
Método Descripción
readLine() Lee una línea completa, sin incluir el salto de línea.
read(char[]) Lee caracteres en bloque y los almacena en un array.
close() Cierra el flujo de lectura y libera recursos del sistema
Ejemplo completo: Leer líneas de un archivo.
import java.io.*;
public class LecturaBuffered {
public static void main(String[] args) {
try (BufferedReader lector = new
BufferedReader(new
FileReader("entrada.txt"))) {
String linea;
while ((linea = lector.readLine()) !=
null) {
System.out.println(linea);
}
} catch (IOException e) {
System.out.println("Error al leer el
archivo: " + e.getMessage());
}
}
}
Observaciones
 El método readLine() devuelve null() cuandose alcanza el final del
archivo.
 Es muy útil cuando se trabaja con archivos estructurados por líneas.
 Al no incluir el carácter de salto de línea (\n), permite personalizar cómo se
presenta o procesa el texto leído.
18.3. BufferedWriter – ESCRITURA EFICIENTE DE TEXTO
BufferedWriter complementa a FileWriter ofreciendo una escritura más
rápida y eficiente, ideal para manejar archivos extensos o programas que generen
grandes cantidades de volúmenes de texto.
El bu􀆯er permite que el texto se acumule en memoria y solo se escriba en disco
cuando se alcanza una cierta cantidad, o cuando explícitamente se solicita con
flush() o se cierra el archivo con close().
Además, su método newLine() permite insertar saltos de línea que se ajustan
automáticamente al sistema operativo en uso, lo que mejora la portabilidad de los
archivos generados.
Importación y sintaxis básica.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
Métodos principales.
Método Descripción
write(String) Escribe una cadena en el bu􀆯er.
newLine Inserta un salto de línea según el sistema operativo.
flush() Fuerza la escritura inmediata del contenido del bu􀆯er en disco.
close() Cierra el flujo, escribiendo todo lo pendiente y liberando
recursos.
Ejemplo completo: Escribir varias líneas en un archivo.
import java.io.*;
public class EscrituraBuffered {
public static void main(String[] args) {
try (BufferedWriter escritor = new
BufferedWriter(new FileWriter("salida.txt")))
{
escritor.write("Primera línea");
escritor.newLine();
escritor.write("Segunda línea");
escritor.newLine();
escritor.write("Tercera línea");
} catch (IOException e) {
System.out.println("Error al escribir: "
+ e.getMessage());
}
}
}
Este patrón es ideal para crear informes, registros de actividad (logs), resultados de
cálculos o listas de datos.
18.4. EJEMPLO PRÁCTICO: COPIAR UN ARCHIVO DE TEXTO
Copiar archivos línea a línea es una de las tareas más comunes y una excelente
forma de combinar BufferedReader y BufferedWriter.
import java.io.*;
public class CopiarArchivoTexto {
public static void main(String[] args) {
try (
BufferedReader lector = new
BufferedReader(new
FileReader("origen.txt"));
BufferedWriter escritor = new
BufferedWriter(new
FileWriter("destino.txt"))
) {
String linea;
while ((linea = lector.readLine()) !=
null) {
escritor.write(linea);
escritor.newLine();
}
System.out.println("Archivo copiado
correctamente.");
} catch (IOException e) {
System.out.println("Error: " +
e.getMessage());
}
}
}
Este ejemplo demuestra como leer y escribir con eficiencia, manteniendo la
estructura original del archivo línea por línea.
18.5. BUENAS PRÁCTICAS
 Utiliza try-with-resources para asegurar el cierre automático de
archivos.
 Usa newLine() para mantener la portabilidad del código entre distintos
sistemas.
 Aplica flush() cuando quieras asegurarte de que los datos se escriben de
inmediato.
 Evita sobrescribir archivos sin confirmación o respaldo previo.
 Valida siempre la existencia de archivos antes de abrirlos para lectura.
 Usa excepciones específicas para detectar y gestionar errores según el caso
(por ejemplo, FileNotFoundException).

CAPÍTULO 19: MANEJO DE FICHEROS BINARIOS EN
JAVA
Hasta ahora hemos trabajado con archivos de texto, los cuales son útiles y sencillos
cuando se trata de datos legibles por humanos, como nombres, números en forma
de texto, mensajes o cualquier información que queremos leer directamente. Sin
embargo, no todos los datos deben o pueden almacenarse de esta manera. En
muchos casos, especialmente cuando se busca eficiencia, rendimiento o
simplemente manipular información estructurada o numérica de manera precisa,
se recurre a los ficheros binarios.
Un archivo binario es una secuencia de bytes que no está pensado para ser
interpretado directamente por personas, sino por aplicaciones que conocen la
estructura interna de los datos que contienen. En lugar de representar caracteres
visibles, contiene los datos tal y como los maneja internamente la memoria del
ordenador. Por ejemplo, un numero entero ocupa 4 bytes, un numero decimal 8
bytes, y un carácter puede ocupar 1 o 2 bytes dependiendo de la codificación.
Java nos proporciona herramientas muy completas para trabajar con archivos
binarios. Las clases DataInputStream y DataOutputStream permiten leer y
escribir tipos primitivos directamente en formato binario. Gracias a ellas, podemos
guardar información de forma más compacta, rápida y segura que con texto,
siempre que sepamos cómo recuperarla posteriormente.
19.1.¿QUÉ ES UN ARCHIVO BINARIO?
Un archivo binario almacena información como una secuencia de bits o bytes, sin
usar representaciones de texto como UTF-8, ASCII o cualquier codificación legible.
Esto significa que no se puede abrir con un editor de texto tradicional sin ver
símbolo y caracteres extraños.
En contraposición a los archivos de texto, donde todo se guarda como secuencias
de caracteres, los archivos binarios guardan los datos en su forma original en
memoria. Por tanto, ocupan menos espacio y permiten almacenar datos con mayor
precisión.
Ejemplos típicos de archivos binarios incluyen:
 Imágenes (JPG, PNG, BMP)
 Archivos de audio (MP3, WAV, OGG)
 Videos (MP4, AVI)
 Documentos como PDF, DOCX o XLSX
 Bases de datos, ejecutables, juegos, configuraciones de sotware
Además, tú como programador puedes crear tus propios archivos binarios para
almacenar información personalizada, como registros de usuarios, listas de datos
numéricos, configuraciones internas, etc.
Trabajar con binarios requiere un conocimiento claro del orden de los datos y su
tipo. No hay etiquetas que indiquen esto “esto es un número” o “esto es una
cadena”. El programa que lee el archivo debe saber exactamente cómo se
escribieron los datos.
19.2. CLASES PRINCIPALES PARA MANEJO DE BINARIOS
DataOutputStream
Esta clase permite escribir datos primitivos en formato binario. Normalmente se
utiliza junto FileOutputStream, que abre el archivo físico donde se almacenarán
los datos. Gracias a DataOutputStream, se pueden guardar enteros, flotantes,
booleanos, caracteres y cadenas codificadas de forma eficiente.
Método Descripción
writeInt(int v) Escribe un entero de 4 bytes
writeDouble(double v) Escribe un numero decimal de 8 bytes
writeBoolean(boolean v) Escribir un valor lógico (true/false)
writeChar(char v) Escribe un carácter Unicode (2 bytes)
writeUTF(String s) Escribe una cadena codificada en UTF-8
DataImputSream
Complementa a la clase anterior permitiendo leer los datos binarios previamente
guardados. También se usa junto con FileInputStream.
Método Descripción
readInt() Lee un entero (4 bytes)
readDouble() Lee un número decimar (8bytes)
readBoolean() Lee un valor lógico
readChar() Lee un carácter Unicode
readUTF() Lee una cadena UTF codificada
Estas clases son útiles cuando se desea trabajar con datos internos del sistema,
guardar configuraciones, manipular ficheros protegidos o estructurados y optimizar
el rendimiento del almacenamiento.
19.3. EJEMPLO: ESCRITURA DE DATOS BINARIOS
import java.io.*;
public class EscrituraBinaria {
public static void main(String[] args) {
try (DataOutputStream salida = new
DataOutputStream(new
FileOutputStream("datos.bin"))) {
salida.writeInt(42);
salida.writeDouble(3.1416);
salida.writeBoolean(true);
salida.writeChar('J');
salida.writeUTF("Hola Java Binario");
} catch (IOException e) {
System.out.println("Error al escribir: "
+ e.getMessage());
}
}
}
Este código crea el archivo datos.bin y guarda en él diferentes tipos de datos
primitivos. Lo importante es que los datos no se almacenan como texto, sino como
representaciones binarias, es decir, directamente como números binarios de 4, 8 o
mas bytes según el tipo.
19.4. EJEMPLO: LECTURA DE DATOS BINARIOS
import java.io.*;
public class LecturaBinaria {
public static void main(String[] args) {
try (DataInputStream entrada = new DataInputStream(new
FileInputStream("datos.bin"))) {
int numero = entrada.readInt();
double decimal = entrada.readDouble();
boolean logico = entrada.readBoolean();
char letra = entrada.readChar();
String texto = entrada.readUTF();
System.out.println("Entero: " + numero);
System.out.println("Double: " + decimal);
System.out.println("Booleano: " + logico);
System.out.println("Carácter: " + letra);
System.out.println("Cadena: " + texto);
} catch (IOException e) {
System.out.println("Error al leer: " + e.getMessage());
}
}
}
Este ejemplo recupera los datos almacenados previamente. Es fundamental leer
los datos en el mismo orden que fueron escritos, ya que, si se altea el orden, el
resultado será incorrecto o se producirán errores de lectura.
19.5. VENTAJAS DEL USO DE ARCHIVOS BINARIOS
 Mayor eficiencia: los datos ocupan menos espacio y se leen/escriben más
rápido que los archivos de texto.
 Formato compacto: al no tener etiquetas ni estructuras adicionales, el
almacenamiento es más compacto.
 Mayor precisión: no hay pérdidas de información por conversiones a texto
(especialmente con números decimales).
 Privacidad: al no ser legibles directamente, los datos binarios ofrecen una
capa básica de ocultamiento frente al usua.
 Facilidad de reconstrucción: al guardar tipos primitivos directamente, es
fácil reconstruir estructuras de datos en memoria.
19.6. BUENAS PRÁCTICAS
 Utiliza siempre bloques try-with-resources para cerrar automáticamente los
flujos y evitar pérdidas de datos.
 Mantén la coherencia entre el orden de escritura y el de lectura.
 Evita escribir archivos binarios con editores de texto: pueden dañarse o
malinterpretarse.
 Añade cabeceras o marcas si necesitas estructurar o versionar tus archivos
binarios.
 Documenta el formato de tu archivo para facilitar su mantenimiento o futura
lectura.
 Controla las excepciones adecuadamente para prevenir errores por archivos
corruptos o mal cerrados.

CAPÍTULO 20: SERIALIZACIÓN DE OBJETOS EN JAVA
Hasta ahora hemos aprendido a trabajar con archivos de texto y archivos binarios,
y hemos visto como escribir y leer datos primitivos en formato binario. Pero, ¿qué
ocurre si queremos guardar objetos completos, con todos sus atributos, de forma
que podamos recuperarlos más adelante tal como estaban?
Para resolver esta necesidad, Java nos proporciona una poderosa herramienta: la
serialización de objetos. La serialización permite convertir un objeto en una
secuencia de bytes, para que pueda ser almacenado en un archivo, transmitido por
una red o guardado en memoria. Posteriormente, podemos recuperar ese objeto
utilizando el proceso inverso, conocido como deserialización.
Esta técnica es esencial cuando se quiere guardar el estado completo de un objeto,
incluidas sus variables internas, para su uso posterior. Por ejemplo, si estamos
desarrollando una aplicación como una agenda o un gestor de biblioteca, sería muy
útil poder guardar directamente cada objeto Contacto o Libro con todos sus
campos en un fichero y luego recuperarlos exactamente como estaban.
20.1. CONCEPTOS BÁSICOS
 SERIALIZACIÓN: proceso de transformar un objeto Java en una secuencia
de bytes que puede ser almacenada o transmitida.
 DESERIALIZACIÓN: proceso inverso, que permite reconstruir un objeto a
partir de una secuencia de bytes.
 Para que un objeto pueda ser serializado, su clase debe implementar la
interfaz Serializable, que se encuentra en el paquete java.io.
import java.io.Serializable;
public class Persona implements Serializable {
private String nombre;
private int edad;
// Constructor, getters, setters, etc.
}
La interfaz Serializable no contiene métodos, simplemente actúa como una
“marca” (marker interface) que indica al sistema de entrada/salida que la clase está
preparada para ser convertida en bytes. Si intentamos serializar un objeto cuya
clase no implementa esta interfaz, obtendremos una excepción en tiempo de
ejecución (NotSerializableException).
La serialización en Java es automática, siempre que se cumplan ciertos requisitos
básicos: todos los atributos también deben ser serializables o declarados como
transient si queremos que se omitan.
20.2. CLASES UTILIZADAS PARA LA SERIALIZACIÓN
Java nos proporciona dos clases principales para llevar a cabo el proceso de
serialización y deserialización.
ObjectOutputStream
Esta clase se utiliza para escribir objetos en un flujo de salida (por ejemplo, un
archivo). Internamente convierte el objeto en una secuencia de bytes.
Método Descripción
writeObject(obj) Serializa y escribe un objeto en el flujo
ObjectInputStream
Esta clase permite leer objetos desde un flujo de entrada, es decir reconstruye un
objeto previamente serializado.
Método Descripción
readObject(obj) Lee un objeto serializado y lo reconstruye
Nota: el método readObject() devuelve un Object, por lo tanto, es necesario
realizar un casting al tipo original para poder utilizarlo como tal.
20.3. EJEMPLO: SERIALIZAR UN OBJETO
Veamos como guardar un objeto en un archivo:
import java.io.*;
public class SerializarPersona {
public static void main(String[] args) {
Persona p = new Persona("Lucía", 25);
try (ObjectOutputStream oos = new ObjectOutputStream(new
FileOutputStream("persona.ser"))) {
oos.writeObject(p);
System.out.println("Objeto serializado
correctamente.");
} catch (IOException e) {
System.out.println("Error al serializar: " + e.getMessage());
}
}
}
Este programa crea un archivo binario llamado persona.ser y almacena en él una
instancia de la clase Persona. Todo el contenido del objeto se convierte en una
secuencia de bytes y se guarda en el archivo.
20.4. EJEMPLO: DESERIALIZAR UN OBJETO
Ahora veremos como recuperar un objeto desde el archivo:
import java.io.*;
public class DeserializarPersona {
public static void main(String[] args) {
try (ObjectInputStream ois = new
ObjectInputStream(new
FileInputStream("persona.ser"))) {
Persona p = (Persona) ois.readObject();
System.out.println("Nombre: " +
p.getNombre());
System.out.println("Edad: " +
p.getEdad());
} catch (IOException | ClassNotFoundException
e) {
System.out.println("Error al
deserializar: " + e.getMessage());
}
}
}
Este programa lee el archivo persona.ser, reconstruye el objeto Persona en
memoria y muestra su contenido. Como se puede ver mantiene toda la información
del objeto tal y como se guardó.
20.5. CONSIDERACIONES IMPORTANTES.
A la hora de utilizar serialización, es importante tener en cuenta los siguientes
puntos:
 Todos los atributos del objeto deber ser serializables. Si alguno no lo es (por
ejemplo, un flujo de red, una conexión de base de datos, etc.), se debe
marcar como transient para que no se serialice.
private transient Socket conexion;
 Se recomienda (aunque no es obligatorio) definir un campo
serialVersionUID. Este identificador sirve para verificar que el objeto
serializado y la clase que lo intenta leer son compatibles.
private static final long serialVersionUID = 1L;
Si se cambia la clase (añadiendo o quitando atributos, por ejemplo) sin mantener el
mismo serialVersionUID, la deserialización puede fallar.
 No se puede serializar una clase que contenga referencias cíclicas si alguna
de las clases implicadas no implementa Serializable.
 Se pueden serializar estructuras completas, como listas de objetos, árboles
de objetos, y más, siempre que todos los elementos sean serializables.
20.6. VENTAJAS DE LA SERIALIZACIÓN
 Permite guardar y restaura el estado completo de objetos con todos sus
atributos.
 Facilita el almacenamiento de objetos complejos y estructuras anidadas.
 Muy útil en aplicaciones que requieren persistencia temporal sin usar bases
de datos.
 Es fundamental en tecnologías como RMI (invocación remota de métodos),
sistemas distribuidos, sockets, servidores web, etc.
 También puede utilizarse en juegos, editores para guardar el estado del
programa (por ejemplo, una partida guardada).

CAPÍTULO 21: INTRODUCCIÓN AL USO DE NIO
(NEW INPUT/OUTPUT) EN JAVA
A lo largo de los capítulos anteriores hemos utilizado las clases tradicionales de
entrada y salida (E/S) de Java, como FileReader, BufferedReader,
FileOutputStream u ObjectOutputStream. Estas clases forman parte del
paquete clásico de entrada/salida de Java, conocido como Java IO. Este sistema,
aunque potente y funcional, presenta algunas limitaciones en términos de
eficiencia, flexibilidad y escalabilidad, especialmente cuando trabajamos con
grandes volúmenes de datos o requerimos operaciones más modernas.
Para dar respuesta a estas necesidades, Java introdujo a partir de la versión 1.4 un
nuevo conjunto de herramientas denominado NIO (New Input/Output). Esta nueva
API no solo mejora el rendimiento, sino que también introduce conceptos clave
como canales, bu􀆯ers, operaciones asíncronas y un sistema más completo de
gestión de archivos. Con la llegada de Java 7, esta API se amplió aún más bajo el
nombre de NIO.2, incorporando nuevas utilidades, como Path, Files,
WatchService y otras clases que permiten una interacción más directa, sencilla
y potente con el sistema de archivos.
En este capítulo daremos una primera aproximación al uso del NIO, centrándonos
en los mas accesible para personas que se están iniciando: la manipulación de
archivos mediante el Path y Files. Este conocimiento es esencial para construir
aplicaciones modernas en Java que trabajen con archivos de forma eficiente.
21.1. DIFERENCIAS ENTRE IO Y NIO
Es importante entender por qué NIO representa un paso adelante respecto al
modelo clásico IO:
Característica Java IO (Clásico) Java NIO (Moderno)
Enfoque Flujo de datos (streams) Bu􀆯er (bloques de
memoria)
Bloqueo Sí (bloqueante) Puede ser no bloqueante
Lectura/Escritura Secuencial Aleatoria o directa
Capacidad multicanal No Sí (Selectores, Canales)
API para archivos Limitada Muy completa (Files,
Path, WatchService)
Adecuado para Operaciones simples Operaciones modernas,
alto rendimientos
NIO está pensado para escenarios donde se requiere eficiencia, manipulación de
múltiples archivos, acceso asincrónico, o simplemente una API más expresiva.
21.2. CLASES FUNDAMENTALES DE NIO
En esta introducción, nos centraremos en las clase del paquete java.nio.file,
especialmente:
 Path: representa rutas (relativas o absolutas) en el sistema de archivos.
 Paths: clase unitaria que permite crear instancias de Path.
 Files: proporciona métodos estáticos para operaciones comunes con
archivos y directorios (lectura, escritura, copia, borrado, etc.).
Estas clases ofrecen una alternativa moderna y mucho más expresiva que las
clases del paquete java.io.
21.3. LEER Y ESCRIBIR ARCHIVOS NIO
NIO nos permite realizar operaciones básicas de forma compacta y eficiente. A
continuación, veremos algunos ejemplos clave:
Leer el contenido completo de un archivo como texto:
import java.nio.file.*;
import java.io.IOException;
public class LeerArchivoNIO {
public static void main(String[] args) {
Path ruta = Paths.get("ejemplo.txt");
try {
String contenido =
Files.readString(ruta);
System.out.println(contenido);
} catch (IOException e) {
System.out.println("Error al leer el
archivo: " + e.getMessage());
}
}
}
Este método es útil cuando queremos cargar archivos de texto completos (como
configuraciones, informes, etc.) en memoria de forma rápida.
Escribir una cadena de texto en un archivo:
import java.nio.file.*;
import java.io.IOException;
public class EscribirArchivoNIO {
public static void main(String[] args) {
Path ruta = Paths.get("salida.txt");
String contenido = "Este es el contenido del
archivo.";
try {
Files.writeString(ruta, contenido);
System.out.println("Archivo escrito
correctamente.");
} catch (IOException e) {
System.out.println("Error al escribir en
el archivo: " + e.getMessage());
}
}
}
También podemos añadir opciones como StandardOpenOption.APPEND para
agregar contenido sin sobrescribir.
21.4. OTRAS OPERACIONES CON Files
El uso de la clase Files permite realizar muchas tareas adicionales de forma muy
sencilla:
Comprobar la existencia de archivo o directorio:
boolean existe = Files.exists(Paths.get("archivo.txt"));
Copiar archivos:
Files.copy(
Paths.get("origen.txt"),
Paths.get("destino.txt"),
StandardCopyOption.REPLACE_EXISTING
);
Borrar archivos:
Files.deleteIfExists(Paths.get("archivo_a_borrar.txt"))
;
Crear directorios (incluso si hay subdirectorios):
Files.createDirectories(Paths.get("nueva/carpeta/subcar
peta"));
Leer todas las líneas de un archivo:
List<String> lineas =
Files.readAllLines(Paths.get("datos.txt"));
for (String linea : lineas) {
System.out.println(linea);
}
Estas operaciones permiten automatizar muchas tareas comunes en proyectos
reales: instalación de carpetas, mantenimiento de configuraciones, generación de
reportes, etc.
21.5. VENTAJAS DE NIO
 Más moderno: su sintaxis es más clara y expresiva.
 Versatilidad: permite operaciones con rutas, directorios y ficheros de forma
unificada.
 Escalabilidad: adecuado para sistemas complejos o con alta demanda de
E/S.
 Compatibilidad: funciona con rutas absolutas y relativas, y soporta
múltiples sistemas operativos.
 Productividad; menos líneas de código para tareas comunes.
 Preparado para el futuro: base para NIO asincrónico, canales y
WatchService (monitorio de cambios en el sistema de archivos).

