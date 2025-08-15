# Proyecto de Gestión de Entidades

## Descripción del proyecto
Este proyecto es una aplicación Java desarrollada en IntelliJ IDEA que gestiona entidades como `Curso`, `Docente` y `Usuario`.  
El sistema está diseñado para conectarse a una base de datos MySQL llamada `develop_db`.  
No obstante, la conexión no pudo realizarse debido a problemas técnicos con el servidor de base de datos de XAMPP (phpMyAdmin no permitió el acceso).  
A pesar de ello, se realizaron las correcciones de código necesarias para garantizar la funcionalidad de las clases y la organización del proyecto.

---

## Listado de errores corregidos

1. **Archivo:** `Docente.java`  
   **Error:** Métodos getter y setter duplicados, así como nombres de variables inconsistentes.  
   **Solución:** Eliminación de métodos repetidos y estandarización de nombres.

2. **Archivo:** `Usuario.java`  
   **Error:** Atributos mal declarados y anotaciones innecesarias.  
   **Solución:** Corrección de tipos de datos y eliminación de anotaciones incorrectas.

3. **Archivo:** `Curso.java`  
   **Error:** Faltaban métodos getter y setter para algunos atributos y el constructor no inicializaba correctamente.  
   **Solución:** Implementación de getters y setters y corrección del constructor para la asignación de variables.

---

## Guía para conexión a la base de datos (no realizada en este proyecto)

1. Instalar y ejecutar XAMPP.
2. Activar el servicio **MySQL** desde el panel de control.
3. Ingresar a `phpMyAdmin` desde el botón **Admin**.
4. Crear la base de datos:
   ```sql
   CREATE DATABASE develop_db;
   ```
5. Configurar `application.properties` en `src/main/resources`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/develop_db
   spring.datasource.username=root
   spring.datasource.password=
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```
6. Ejecutar el proyecto en IntelliJ.

---

## Recomendaciones
- Verificar que el puerto 3306 esté libre antes de iniciar MySQL.
- Mantener actualizadas las dependencias del `pom.xml`.
- Validar credenciales antes de correr la aplicación.
- Usar MySQL Workbench como alternativa a phpMyAdmin.

---

## Versionamiento con Git y GitHub
- Se realizaron commits significativos por cada bloque de corrección.
- El proyecto final fue subido a un repositorio personal en GitHub.
- Enlace del repositorio: *(Agregar enlace aquí)*
