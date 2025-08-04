*Conversor de Moneda Challenge*

Un conversor de monedas simple desarrollado en Java. Esta aplicación de consola permite a los usuarios realizar conversiones entre diferentes divisas utilizando tasas de cambio actualizadas en tiempo real a través de una API.
Es un proyecto que forma parte del porgrama Alura LATAM con Oracle.


📜 Descripción

Este proyecto es una aplicación de consola que presenta un menú interactivo para convertir valores entre un conjunto predefinido de monedas. La aplicación se conecta a la ExchangeRate-API para obtener las tasas de cambio más recientes. El programa se ejecuta en un bucle hasta que el usuario decide salir, permitiendo realizar múltiples conversiones en una sola sesión.


✨ Características Principales

Tasas de Cambio en Tiempo Real: Se conecta a una API externa para obtener datos de conversión actualizados.

Menú Interactivo: Interfaz de usuario de consola fácil de usar que guía al usuario a través de las opciones de conversión.

Manejo de Errores: Valida las entradas del usuario para asegurar que solo se ingresen números y gestiona posibles fallos en la comunicación con la API.

Conversiones Bidireccionales: Permite convertir desde y hacia una moneda base (Lempira) con divisas internacionales como el Dólar, Euro y Peso Mexicano.


🛠️ Tecnologías Utilizadas

Lenguaje: Java 17

Librerías:

Gson: Para analizar (parsear) las respuestas JSON de la API.


⚙️ Prerrequisitos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

JDK 17 (Java Development Kit 17).

Un IDE de tu elección, como IntelliJ IDEA o Eclipse.

La librería Gson de Google.


🚀 Instalación y Configuración

Clona el repositorio:

git clone https://github.com/tu-usuario/conversor-de-moneda-challenge.git

Abre el proyecto en tu IDE preferido.

Agrega la librería Gson a tu proyecto. La forma más común es a través de un gestor de dependencias como Maven o Gradle. Si no estás usando uno, puedes agregar el JAR manualmente.

Usando Maven (Recomendado):
Añade esta dependencia a tu archivo pom.xml:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>

Usando Gradle:
Añade esta dependencia a tu archivo build.gradle:

implementation 'com.google.code.gson:gson:2.10.1'

API Key: El proyecto utiliza una API key que ya está incluida en la clase ConsultaApi.java. Si en el futuro deja de funcionar, puedes obtener una nueva de forma gratuita en ExchangeRate-API.

▶️ Uso

Navega hasta la clase Principal.java.

Ejecuta el método main().

La consola mostrará el siguiente menú:

**************************************************************************

Hola, esta aplicación hará la conversión de moneda que se le muestra en
en el menú de elección, favor elija un número de las elecciones mostradas
de acorde a la conversion que usted requiera.

Se puede hacer estos tipos de conversiones:

1.) Dólar (USD) => Lempira (HNL)

2.) Lempira (HNL) => Dólar (USD)

3.) Euro (EUR) => Lempira (HNL)

4.) Lempira (HNL) => Euro (EUR)

5.) Peso mexicano (MXN) => Lempira (HNL)
   
6.) Lempira (HNL) => Peso Mexicano (MXN)

7.) SALIR

**************************************************************************

Ingresa el número de la opción que deseas.

Ingresa la cantidad que quieres convertir.

El programa mostrará el resultado y volverá a desplegar el menú para una nueva conversión.

Para finalizar, ingresa la opción 7.

📂 Estructura del Proyecto

El proyecto está organizado en tres clases principales:

Principal.java: El punto de entrada de la aplicación. Su única responsabilidad es crear una instancia del menú y desplegarlo.

MenuDeEleccion.java: Contiene toda la lógica para la interacción con el usuario. Muestra el menú, captura las entradas del usuario, las valida y procesa la opción seleccionada.

ConsultaApi.java: Se encarga de toda la comunicación con la API externa. Construye la URL, realiza la petición HTTP, parsea la respuesta JSON con Gson y devuelve el resultado de la conversión.

📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
