Continuous Integration
=======

Continuous Integration ist eine Methode zur Qualitätssicherung von Software.
Es hilft dabei, Fehler, die oft nur in der Produktionsumgebung auftreten, früh zu erkennen und damit günstig beheben zu können. Dabei kommt meist ein CI-Server zum Einsatz, der zwischen ein VCS und einem Klon der Produktionsumgebung geschalten wird.

Dieser CI-Server übernimmt dabei folgende Aufgaben:
  - Änderungen im Code, die Entwickler durchgeführt und ins Repository commited haben, werden automatisch erkannt und ein Buildprozess wird durchgeführt.
  - Unit- und Integrationstest werden automatisch ausgeführt.
  - Build Artefakte werden archiviert.
  - Die Entwickler werden über den (nicht) erfolgreichen Buildprozess informiert.
  - Es wird ein automatisches Deployment auf die Testumgebung durchgeführt.

Vorteile dieser Methode:
  - Änderungen im Code werden früh überprüft, was mögliche Fehler gleich aufzeigt und diese günstig behoben werden können.
  - Ausführungen von Unit- und Integrationstests werden automatisiert.
  - Builds werden geprüft, bevor sie automatisch deployed werden.
  - Alle Entwickler haben zu jeder Zeit Zugriff zu aktuellen Änderungen.

Nachteile von Continuous Integration:
  - Entwickler müssen korrekten Code oft commiten (mindestens einmal täglich).
  - Fehlerhafter Code darf von den Entwicklern nicht in das Repository commited werden.
  - Fehlgeschlagene Builds müssen schnellstmöglich überprüft werden, um die Fehlerquelle zu beseitigen.
  - Entwickler müssen nach dem Commit die Meldung über den erfolgreichen Build abwarten.

Continuous Integration bietet sehr viele Vorteile und kaum Nachteile, wenn die Entwickler entsprechend geschult sind. Beim korrekten Umgang wird die Qualitätssicherung enorm gesteigert und neue Software sowie neue Features können schneller und korrekt an den Kunden ausgeliefert werden.
