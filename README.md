# Gestión de Contenido Audiovisual (POO - Unidad 2)

Proyecto académico desarrollado para la materia de "Programación Orientada a Objetos".

# Descripción del Proyecto y Propósito
El propósito principal de este programa es mejorar la gestión de contenidos multimedia.
El software resuelve la necesidad de administrar de forma estructurada diferentes tipos de entretenimiento digital
(películas, series, documentales, videos musicales y podcasts), y para esto aplicando los pilares de la Programación Orientada
a Objetos (POO) como herencia, polimorfismo, agregación y composición.

# Clases y Funcionalidades Nuevas Añadidas
Para cumplir con lo requerido, se implementaron las siguientes clases y características:

1. Tres subclases y sus respectivas relaciones.
   - Actor: Relacionada con la clase `Película` mediante agregación.
   - Temporada: Relacionada con la clase `SerieDeTV` mediante composición.
   - Investigador: Fue relacionada con la clase "Documental" mediante asociación.

2. Nuevas Subclases Heredadas:
   - VideoMusical: Hereda de la superclase abstracta `ContenidoAudiovisual`, incorporando atributos propios y una relación con actores mediante Agregación.
   - Podcast: Hereda de `ContenidoAudiovisual", integrando atributos específicos y una relación de asociación con investigadores.

3. Funcionalidades del Sistema:
   - Menú interactivo por consola: Permite navegar fluidamente entre las diferentes opciones multimedia.
   - Validación de errores (`try-catch`): Evita que el programa colapse ante ingresos incorrectos del usuario (letras, símbolos o rangos inválidos), solicitando en bucle el reingreso correcto de datos.
   - Polimorfismo (`@Override`):Se ejecutan los métodos `mostrarDetalles()` adaptándose este a los requerimientos de cada subclase.

# Instrucciones de Instalación y Uso

Sigue estos pasos para clonar y ejecutar el proyecto en tu computadora:

# Prerrequisitos
* Tener instalado un entorno de desarrollo compatible con Java (por ejemplo, *Eclipse IDE*.
* Tener instalado *Git* en tu sistema operativo.

# Pasos para clonar y ejecutar:
  1. Descarga los archivos que contienen el código del programa.
  2. Abre tu entorno de desarrollo (Eclipse) y selecciona la opción de importar un proyecto existente de Java.
  3. Selecciona la carpeta que se acaba de descargar en tu computadora y verifica que el paquete fuente se encuentre en orden.
  4. Abre la clase principal de ejecución y corre el programa para interactuar con el menú en la consola.
