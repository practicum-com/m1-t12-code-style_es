# Estilo de código: principios de código limpio

## Bifurcar un repositorio

Para hacer una copia de un repositorio, haz clic en el botón Fork (bifurcar) en la esquina superior derecha de la página del repositorio. Esto producirá un duplicado del proyecto en tu cuenta de GitHub. Si no tienes una cuenta, asegúrate de registrarte.

![botón de bifurcación (fork)](https://raw.githubusercontent.com/PraktikumJava/public-resources/master/fork.png)


## Clonar un repositorio

Abre la pestaña Repositories (repositorios) en tu página de GitHub y selecciona el repositorio que bifurcaste en la etapa anterior. Haz clic en el botón Code (código) en el lado derecho de la página:

![botón de bifurcación (fork)](https://practicum-content.s3.us-west-1.amazonaws.com/new-markets/Java/Sprint_4/esp/Screenshot_4.png)


Verás una ventana donde puedes copiar la dirección del repositorio. Esto será necesario para clonarlo. Ahora abre el símbolo del sistema y muévete a la carpeta donde vas a guardar el repositorio. Introduce el comando git clone y la dirección del repositorio:

```bash
git clone https://github.com/THE_NAME_OF_YOUR_ACCOUNT_HERE/code-style-and-effective-work-in-ide-code-style.git
```

## Importing a project into IDEA

Selecciona el elemento Open (abrir) o Import (importar) en el cuadro de diálogo al iniciar IDEA.

![botón de bifurcación (fork)](https://raw.githubusercontent.com/PraktikumJava/public-resources/master/import.png)

En la ventana para abrir archivos, elige la carpeta con el repositorio clonado y haz clic en el botón Open. Ten en cuenta que debes abrir todo el directorio. Después de esto, el proyecto se agregará a IntelliJ IDEA.
