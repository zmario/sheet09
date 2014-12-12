Continuous Integration
=======

Continuous Integration ist eine Methode zur Qualitätssicherung von Software.
Es hilft dabei, Fehler, die oft nur in der Produktionsumgebung auftreten, früh zu erkennen und damit günstig beheben zu können. Dabei kommt meist ein CI-Server zum Einsatz, der zwischen ein VCS und einem Klon der Produktionsumgebung geschalten wird.

Dieser CI-Server übernimmt dabei folgende Aufgaben:
  - Änderungen im Code, die Entwickler durchgeführt und ins Repository commited haben, werden automatisch erkannt und ein     Buildprozess wird durchgeführt.
  - Unit- und Integrationstest werden ausgeführt.
  - Build Artefakte werden archiviert.
  - Die Entwickler werden über den (nicht) erfolgreichen Buildprozess informiert.
  - Es wird ein automatisches Deployment auf die Testumgebung durchgeführt.

