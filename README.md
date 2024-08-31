Descripción
Este programa en Java valida claves CURP (Clave Única de Registro de Población) mediante la lectura de un archivo de texto llamado CURPS.txt. Cada línea del archivo debe contener una clave CURP que el programa verifica usando una expresión regular para asegurar que sigue la sintaxis correcta.

Funcionamiento
Archivo de Entrada:
El archivo CURP.txt debe estar en el mismo directorio que el archivo Java compilado.
Cada línea del archivo debe contener una clave CURP.
Expresión Regular:
El programa utiliza una expresión regular para validar la sintaxis de cada CURP. La expresión regular asegura que la CURP cumpla con el formato estándar requerido.
Validación:
El programa lee cada línea del archivo, elimina espacios adicionales y valida la CURP usando la expresión regular.
Si una CURP no es válida, el programa imprime un mensaje indicando la línea del archivo y la CURP que no cumple con el formato esperado.
Salida:
Para cada CURP inválida, se muestra un mensaje en el formato: CURP no válida en línea <número de línea>: <CURP>.
