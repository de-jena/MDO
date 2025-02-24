# MDO Playground App

# Intallation

[Zip](https://devel.data-in-motion.biz/jenkins/view/Jena/job/de.jena/job/MDO/job/main/lastSuccessfulBuild/artifact/de.jena.mdo.playground.app/generated/distributions/executable/playground.zip) herunterladen und in einen bleibigen Ordner entpacken.

## Installation der IDE und Vorbereitung des Workspace

Im entpackten Ordner befindet sich ein weiterer Ordner `eclipse`. Hier die url anklicken und den Eclipse installer herunterladen und ausführen.

### Konfiguration Eclipse Installer

1. Installer in den Advanced mode versetzen
2. ![installer_step1](eclipse/images/installer_step1.png)
3. ![installer_step2](eclipse/images/installer_step2.png)
4. Den Anweisungen zur Installation des Installers folgen.
5. Auf das kleine `+`klicken![installer_step3](eclipse/images/installer_step3.png) 
6. Brows File System wählen und `<Installationsordner der App>\eclipse\MDP-Playground.setup` auswählen.![installer_step4](eclipse/images/installer_step4.png)
7. MDO PlaygroundIDE auswählen und `next` bzw. `weiter` anklicken.
8. Den Screen Projects bzw. Projekte mit `next` bzw. `weiter` überspringen.
9. Beliebigen `root install folder` auswählen und mit `next` bzw. `weiter` zum nächsten Screen springen.
10. Installation mit finish starten.
11. Die IDE sollte automatisch starten, alterantiv zum gewählten Installationsordner navigieren und die eclipse.exe starten.
12. Beim ersten Start der IDE fragt Eclipse nach einem Workspace. Hier zu <Installationsordner der App>\workspace` navigieren. ![workspace](eclipse/images/workspace.png)
13. Nach dem Start den Welcome Screen mit dem x am Tab oben links schließen. (Falls der nachfolgende Fehler screen zu sehen ist, kann der mit ok bestätigt und ignoriert werden). ![error](eclipse/images/workspace.png)
14. Im cnf Projekt die Datei `targetplattform.target` öffnen. ![workspace2](eclipse/images/error.png)
15. `Set as Active Target Platform` anklicken. Der link in dem Editor ändert sich damit zu `Reload Target Platform`. ![workspace3](eclipse/images/workspace3.png)
16. Anschließend im Projekt `de.jena.models` `resources\example1\models\ProductMappings.xmi` öffnen und überprüfen, das keine Fehlermeldung angezeigt wird. ![workspace4](eclipse/images/workspace4.png)

# Start der App

Im Windows Explorer zum entpackten Ordner navigieren und auf `launch.bat` klicken.

## Test ob die App korrekt gestartet ist

Im Browser http://localhost:8088/mdo/playground/rest/product/Product?mediaType=application/json aufrufen und überprüfen ob json Daten zurück kommen.

# Updates für zukünftige Versionen und verlegen des Workspace

Im Fall das eine neue Version der App verfügbar ist, kann die aktuellste Version immer https://devel.data-in-motion.biz/jenkins/view/Jena/job/de.jena/job/MDO/job/main/lastSuccessfulBuild/artifact/de.jena.mdo.playground.app/generated/distributions/executable/playground.zip hier heruntergeladen werden. 

## Verlegen des workspace Ordners

Aktuell liegt  der Arbeitsbereich (workspace) der App exemplarisch mit in dem ZIP. Auf dauer, ist es wahrscheinlich sinnvoll den Workspace auf einen externen Ordner zu verlegen, der neuinstallationen übersteht. Hierzu mit einem Texteditor die Datei `launcher.properties` öffnen und das property `de.jena.mdo.playground.workspace=` auf einen beliebigen Ordner verlegen. 

