# VitaAlarm - Proyecto MISW4302

## Integrantes

Nombre | Usuario Github
-- | --
María Camila Martínez | [@CamilaMartinez-MISO](https://github.com/CamilaMartinez-MISO)
Héctor Oswaldo Franco | [@HectorFranco-MISO](https://github.com/HectorFranco-MISO)

## Ejecución proyecto web

Para ejecutar la versión web del proyecto, siga los siguientes pasos:

### Instalar librerías necesarias

Ir a la ruta /VitaAlarm_Web

```bash
cd VitaAlarm_Web
```

Instalar las librerías de node_modules

```bash
npm install
```

### Ejecutar el proyecto

Correr el proyecto en localhost

```bash
ng serve --host 0.0.0.0
```

### Ejecutar el proyecto en línea

El proyecto se encuentra desplegado en este momento en Firebase Hosting y puede ser accedido a través de la siguiente URL: [VitaAlarm Web](https://misw4302---ux-ui.web.app/)

## Ejecución proyecto Móvil

Para ejecutar la versión móvil del proyecto, siga los siguientes pasos:

### Pre requisitos proyecto móvil

Debe cumplir con los siguientes requisitos para poder abrir y ejecutar el proyecto móvil en Android Studio

- **Versión de Android Studio:** Android Studio Ladybug | 2024.2.1 Patch 3
- **Emulador**: Android 5.0 (Lollipop) - API >= 21

### Abrir proyecto

En Android Studio debe abrir el proyecto en la carpeta **VitaAlarm_Movil** eso importará el proyecto y estará listo para ejecutarlo con el emulador previamente instalado.

### Data para el login

La aplicación tiene el flujo de login y para su correcto funcionamiento en el camino exitoso se definió esta data para el login:

- **Correo electrónico:** miguelmartinez@gmail.com
- **Contraseña:** Alemania2025*

### Instalación del APK en un dispositivo real

La aplicación puede ser instalada en un dispositivo con una versión igual o superiro a Android 5.0 (Lollipop) por medio del APK que está disponible en este release.

## Funcionalidades realizadas

### Versión Web

En la versión web se desarrollaron dos funcionalidades principales, cada una con sus respectivas pantallas:

1. **Registrarse**  
   Este flujo incluye 5 pantallas:
   - Pantalla de bienvenida.
   - Formulario de registro con dos opciones: continuar con correo electrónico o con redes sociales.
   - Formulario de correo electrónico para completar los datos del usuario.
   - Pantalla de vinculación para el caso de registro con redes sociales.
   - Escritorio o pantalla principal después del registro exitoso.

2. **Alarmas Inteligentes**  
   Este flujo incluye 1 pantalla:
   - Pantalla de alarmas inteligentes, accesible desde la pantalla de escritorio principal.

### Versión Móvil

En la versión móvil se desarrollaron dos funcionalidades principales, cada una con sus respectivas pantallas:

1. **Iniciar Sesión**  
   Este flujo incluye 3 pantallas:
   - Pantalla de bienvenida.
   - Formulario de inicio de sesión.
   - Pantalla inicial de la aplicación después del inicio de sesión exitoso.

2. **Mis Perfiles**  
   Este flujo incluye 3 pantallas:
   - Pantalla de inicio de la aplicación.
   - Pantalla de "Mis Perfiles" que muestra el listado de perfiles y permite agregar nuevos.
   - Pantalla de detalle de un perfil.
   - Pantalla de formulario para crear un nuevo perfil.





