# Lösung für Spielfeld 2
Spielfeld 2 stellt ein 5x5 Feld mit einer unbekannten Anzahl an Hindernissen und einem Start und Ziel dar.

Pseudo Code:
```js
    if(rechts == frei) {
        Drehe Rechts
        Gehe 1
    }else if(vorne == frei) {
        Gehe 1
    }else if(links == frei) {
        Drehe Links
        Gehe 1
    }else {
        Drehe Rechts
        Drehe Rechts
        Gehe 1
    }
```

Der oben stehende Pseudo-Code sollte für **jedes** (Nicht auf alle Möglichkeiten getestet) Spielfeld funktionieren.
Der Ablauf des Programms ist wie folgt:
Der Roboter fragt in einer Schleife, bis er das Ziel erreicht die folgenden Bedingungen ab.
**Ist das Feld rechts von mir frei?** Wenn ja, gehe nach rechts.
Wenn nein, prüfe **Ist das Feld vor mir frei?** Wenn ja, gehe nach vorne.
Wenn beides nicht zutrifft, wird **Ist das Feld links von mir frei?** geprüft. Falls diese Bedingung zutrifft, gehe nach links.
Falls alle Bedingungen bis jetzt nicht zugetroffen haben, kann man davon ausgehen, dass sich der Roboter in einer Sackgasse befindet, da rechts, links und vorne nicht frei sind.
Das heißt, der Roboter sollte nach hinten gehen und seinen Weg von dort aus fortsetzen.