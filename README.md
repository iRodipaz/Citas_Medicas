# Citas_Medicas
Programa básico para crear citas médicas
Necesitamos el Kit de desarrollo de Java JDK (Java Development Kit). Lo podemos encontrar y descargar en los dos siguientes enlaces:

Oracle JDK 12 (De código privativo).
Open JDK 12 (De código libre).
Importante actualización de la licencia de Oracle JDK
 
La licencia de Oracle JDK ha cambiado para las versiones a partir del 16 de abril de 2019.
 
El nuevo Acuerdo de licencia de Oracle Technology Network para Oracle Java SE es sustancialmente diferente de las licencias anteriores de Oracle JDK. La nueva licencia permite ciertos usos, como el uso personal y el uso de desarrollo, sin costo alguno, pero es posible que otros usos autorizados bajo licencias anteriores de Oracle JDK ya no estén disponibles. Por favor revise los términos cuidadosamente antes de descargar y usar este producto. Una FAQ está disponible aquí.
 
La licencia comercial y el soporte están disponibles con una suscripción Java SE de bajo costo.
 
Oracle también proporciona la última versión de OpenJDK bajo la licencia GPL de código abierto en jdk.java.net.
Necesitamos el Java JRE (Java Runtime Environment). Lo podemos encontrar y descargar en la Web de Oracle:

Java JRE
Instalación del Java Development KIT 12 (JDK 12)
Vistos los cambios que ha realizado Oracle y que nos lo notifica que entrará en vigor el 16 de abril de 2019, nos centraremos en instalar el Open JDK 12 para que los usuarios no se tengan que preocupar en que pueden publicar o no al desarrollar sus aplicaciones en Java.
Descargar e instalar el Java JRE del enlace indicado en los requisitos mínimos. Una vez instalado ya podremos ejecutar aplicaciones que estén implementadas en Java.
A continuación, nos descargamos el Open JDK indicado también en los requisitos mínimos.
Procedemos a descomprimir el fichero descargado y lo ubicamos por ejemplo en: C:\Program Files\Java
Una vez lo hayamos descomprimido hemos de añadir la ruta del Open JDK a las variables del entorno. Para llegar a las variables del sistema es: Panel de control > Sistema y seguridad > Sistema > Configuración avanzada del sistema > Variables de entorno. Ver las siguientes imágenes ilustrativas para llegar.
Acceso a Variables del Entorno 

Acceso a Variables del Sistema

Una vez estamos en las Variables de entorno, vamos al apartado de "Variables del Sistema" y añadimos una nueva.
Variables del Sistema

 Asignamos el nombre de la variable "JAVA_HOME" y la ruta la que hayamos puesto nuestro JDK 12, en nuestro caso en: C:\Program Files\Java\jdk-12.0.1
JAVA_HOME

Ahora debemos añadir a la variable "PATH" la ruta donde se ejecuta nuestro JDK. Para hacerlo, seleccionamos la variable "PATH" y editamos
PATH

Una vez estemos dentro de la variable, le indicamos que queremos añadir una nueva y añadimos la ruta de ejecución del JDK, en nuestro caso en: C:\Program Files\Java\jdk-12.0.1\bin\
Añadir BIN JDK

Con estos pasos, hemos terminado de instalar el Kit de desarrollo de Java Open JDK.

Instalación de Apache NetBeans 11.0
En este apartado vamos a instalar la nueva versión de NetBeans de la mano de Apache Software Foundation.

Primero de todo, nos descargamos el NetBeans 11.0 de uno de los siguientes enlaces que nos facilita la web de Apache:
http://apache.rediris.es/incubator/netbeans/incubating-netbeans/incubating-11.0/incubating-netbeans-11.0-bin.zip
http://apache.uvigo.es/incubator/netbeans/incubating-netbeans/incubating-11.0/incubating-netbeans-11.0-bin.zip
http://ftp.cixug.es/apache/incubator/netbeans/incubating-netbeans/incubating-11.0/incubating-netbeans-11.0-bin.zip
Una vez descargado, lo descomprimimos en la ubicación deseada, en nuestro caso en: C:\Program Files\
Para que nos funcione debemos editar el fichero de configuración del NetBeans "netbeans.conf" ubicado en nuestro caso en: C:\Program Files\Netbeans\etc.
netbeans.conf

Hay que modificar la línea donde hay la variable "netbeans_jdkhome", primero hay que quitar el "#" para que deje de estar comentada la variable y añadir la ruta del JDK y guardar el fichero.
netbeans_jdkhome netbeans_jdkhome

Una vez realizados los cambios, ya podemos ejecutar el NetBeans, su ejecutable se encuentra dentro de la carpeta "bin", habrá dos, uno de 32 bits y el otro de 64 bits. Su ubicación en nuestro caso es:  C:\Program Files\Netbeans\bin
Ubicación NetBeans

Carga inicial Apache NetBeans

Con esto termina el tutorial de instalación de Apache NetBeans 11 en Windows. Como podéis ver la instalación de NetBeans ha cambiado mucho desde que Apache Software Foundation la ha adquirido. Espero que os haya gustado este tutorial y si tenéis alguna duda, podéis contactar con nosotros a través del apartado de contacto o bien escribiendo un E-mail a pcresumen@pcresumen.com.
