# ICC_Practica1
primera practica de ICC

**Alumno:** Daniel Albor Méndez

**Profesor:** Salvador López Mendoza

**Ayudante de Laboratorio:** Rosa Victoria Villa Padilla

**Materia:** Introducción a ciencias de la computación

**objetivo:** El objetivo de esta practica es familiarizarce con la creación y uso de ob-
jetos de la clase String utilizando algunos métodos de dicha clase en la elaboración de un
programa.

**Descripción del programa psicologo y elaboración:** 

1. Crea el archivo el Psicologo.java, en el directorio de trabajo para esta práctica.
2. Realiza el metodo main para que este haga lo siguiente:

(a) Dar bienvenida y solicitar el nombre del paciente.

(b) Recabar el nombre del paciente.

(c) Saludar al paciente y preguntar cu ́al es su problema.

(d) Leer, en una línea, la descripci ́on del problema del paciente.

(e) Contestar MMMM... ya veo, luego en otra línea Y digame... y otra línea más

preguntar Por qué dice e incluir la respuesta anterior entre comillas.

(f) Leer, la respuesta del paciente.

(g) Finalmente decir Muy interesante!!, Hablaremos de ello con más detalle en la
siguiente sesión.

3. Compilar y ejecutar el programa. Este debe presentar un diálogo como el siguiente.  
Bienvenido, cual es su nombre?

Alberto

Buenas tardes Alberto.

Digame, cuál es su problema en la vida?

Odio tener clase los viernes

MMMM... ya veo

Y digame ...

Por qué dice "odio tener clases los viernes"?

Porque no puedo concentrarme y el fin de semana me parece muy corto.

**Descripción del programa RFC y elaboración;**
La práctica consiste en utilizar cadenas de caracteres y algunos de los métodos más impor-
tantes de dicha clase en la elaboración de un programa para generar una clave al estilo del

RFC de las personas.
El RFC se obtiene tomando las dos primeras letras del apellido paterno, la inicial del
apellido materno y la inicial del nombre, seguido de los dos  ultimos dígitos del año de
nacimiento, los dos dígitos del mes de nacimiento y dos dígitos del día de nacimiento. Por
ejemplo, si la persona se llama Andrea Lopez Lopez y nació el 14/04/1992, su RFC es
lola920414.

2.2 Desarrollo

1. Crea el archivo RFC.java en el directorio de trabajo para esta práctica.

2. Escribir en el archivo RFC.java un programa para generar el RFC de una persona.

El algoritmo que debe programarse es el siguiente:

(a) Solicitar al usuario su nombre completo, en una línea.

(b) Solicitar al usuario su fecha de nacimiento, en formato dd/mm/aa, es decir, dos

(c) dígitos para el día, dos para el mes y dos más para el año. Cada dato separado
por una diagonal.

2.

(c) Recabar los datos solicitados.

(d) Extraer la inicial del nombre de la persona.

(e) Extraer las dos primeras letras del apellido paterno.

(f) Extraer la inicial del apellido materno.

(g) Formar el RFC con las letras antes obtenidas.

(h) Manipular la fecha de nacimiento, es decir extraer el año, el mes mes y el día y
agregarlo al RFC.

3. Compilar y ejecutar el programa RFC. El programa debe mostrar una salida como
la siguiente:

Dame el nombre completo

Andrea Lopez Lopez

ingresa la fecha de nacimiento en formato dd/mm/aa

14/04/92
El RFC de Andrea Lopez Lopez es: LOLA920414
Muy interesante!! Hablaremos de ello con m ́as detalle en la siguiente sesi ́on.
