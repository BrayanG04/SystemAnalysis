# Workshop 1: Detección de Motivos en Datos Genéticos

## Descripción

Este taller se centra en la detección de motivos en un conjunto artificial de secuencias genéticas. Un motivo es un patrón de cadenas que aparece con mayor frecuencia en un conjunto de secuencias. 

### Pasos del Taller

1. **Crear una Base de Datos Artificial:**
   - Genera una base de datos artificial con `n` secuencias (1000 <= n <= 2000000), de tamaño `m` (5 <= m <= 100).
   - Cada secuencia debe estar compuesta por las bases nucleotídicas A, C, G, T.
   - La probabilidad de selección de cada base debe ser un parámetro ajustable.
   - Guarda la base de datos en un archivo `.txt`.
   - Considera usar una estrategia de divide y conquista o de cómputo distribuido para manejar el tamaño de los datos.

2. **Definir un Algoritmo para Encontrar Motivos:**
   - Implementa un algoritmo para buscar el motivo de tamaño `s` (4 <= s <= 10) en la base de datos.
   - Examina todas las combinaciones posibles de bases nucleotídicas de tamaño `s`.
   - Si hay varios motivos con la misma frecuencia, selecciona el que tenga la mayor cantidad de bases repetidas consecutivamente.

3. **Optimización y Análisis:**
   - Considera un enfoque optimizado para manejar el tamaño y la complejidad de los datos.
   - Aplica la entropía de Shannon para filtrar secuencias con demasiadas repeticiones de bases, eliminando secuencias que no contribuyan a la diversidad.

## Instrucciones de Uso

1. **Preparar el Entorno:**
   - Asegúrate de tener los requisitos necesarios instalados (por ejemplo, Java, Maven, si corresponde).
   - Clona este repositorio y navega a la carpeta del taller:
     ```bash
     git clone https://github.com/tu_usuario/SystemAnalysis.git
     cd SystemAnalysis/workshop1
     ```

2. **Generar la Base de Datos Artificial:**
   - Ajusta los datos como el Database Size, the Probability of Bases, the Motif Size, the number of sequences and the threshold 
   - Inicia el programa ejecutando `Main.java` para crear la base de datos artificial.
     

3. **Revisar las secuencias:**
   - Consulta el archivo `database.txt` para encontrar las secuencias en la base de datos generada.

   
4. **Mira los resultados:**
   - Mira el output para saber cuantos motif se generaron, el motif y el tiempo que tardó en hacerlo.

## Reporte

El informe en formato PDF que describe el proceso, los resultados y el análisis del taller está disponible en la carpeta `workshop1/`. Asegúrate de revisar el informe para una comprensión completa del taller.

## Contribuciones

Si tienes sugerencias o mejoras para este taller, sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama para tus cambios.
3. Realiza los cambios y haz un commit.
4. Envía un pull request.

## Contacto

Para cualquier consulta o comentario relacionado con este taller, contacta a:

[gomezrodriguezbrayanc@gmail.com](mailto:gomezrodriguezbrayanc@gmail.com)

