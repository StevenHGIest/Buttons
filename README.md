# Buttons
Buttons in android staudio

file -> New project -> Empty activity

Name: Buttons Package name: edu.iest.buttons langage: kotlin Minimum SDK: API 25 ANDROID

Los constraints te permiten que los elementos sean responsivos

Hay 2 opciones:

clear constraints -> te quita todas las constraints infer constraints -> Trata de inferir todos los constraints que quieres pner

Para hacer en negirtas y italicas es textStyle

Pra hacer estilos por defecto textApperenece

Para cambiar le color der la letra: color

Pra cambia rle color de la background backgroundTinty

Para hacer lo de todo mayusculas: textAllCaps

Creas otra activity con ir a la java > new android > empty activity

Si tines un color en hexadesimal puede sgreagarlol a los recursos en res/values/colors.xml. Tambien puedes hacerlo

Target size too small, significa que hay que agregar un minimo de altura ya que nom puede ser visible en varios dispositivos

Si los colore hacenb contraste te hace un warning para que lo ajustes

en el manifests te da las visdtas

<intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
 </intent-filter>

la vita que la tenga sera la que se vera al inicio

si tiene el exported = "false" te maracara un error, eets debe estar en true

finish() -> cierra la actividad que estas realizando

IR AL logcat y poner package:mine DATOS
CADA VES QUE SE HACE UN INTENT SE PNE ENCIMA LA VISTA SILE PONES UN FINISH CERRA LA VISTA DE ENCIMA NO LA APLICACION

si esta en exported puede ser accedida por erl sistema o otra sistam externo, por lo regular se pone a la pantalla que no va a ser principal edpoorted = false

Para cambiar el background color del boton backgrounTint

Agregamos las imagenes en res/drawable (Para que este en todos los dispositivos, no popner en el drawable-v24)

los nombres de las imagenes e poene en minuscula y sin guines bajos
