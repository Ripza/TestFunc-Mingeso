TestFunc-Mingeso

1.- Instalar Gecko (o el WebDriver que deseen y pueda usarse). Para Firefox en Ubuntu:

	https://askubuntu.com/questions/870530/how-to-install-geckodriver-in-ubuntu

2.- Instalar plugin para Chrome o Firefox "Katalon automation recorder"

	https://addons.mozilla.org/en-US/firefox/addon/katalon-automation-record/

3.- Ingresar al plugin y crear un test funcional.

4.- Grabar pasos para el test funcional.

5.- Exportar pasos grabados (escoger la opción que mas les acomode ... en el caso del ejemplo se utiliza "Java Webdriver + JUnit" )

6.- Importar la clase (copiar y pega) en su proyecto en la zona de tests

7.- Resolver dependencias que se requieran

8.- Crear la condición de validación de su test (en el ejemplo está en la linea 35 del Ejemplo.java)

9.- Probar el test 

Pro Tips : 
- Estudiar cómo funcionan los xpath (en caso de ser necesario)
- Buscar un WebDriver que no requiera abrir una ventana de navegador
