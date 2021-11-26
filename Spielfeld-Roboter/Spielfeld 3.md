# Lösung für Spielfeld 3
Bei Spielfeld 3 muss der Roboter eine unbekannte Anzahl an **Items** auf einem 5x5 Spielfeld mit einer unbekannten Anzahl an Hindernissen einsammeln.
Da wir keine Information über die Anzahl der Items haben, müssen wir zwangsläufig alle Felder ablaufen und auf Gegenstände prüfen.

Pseudo-Code:
```js
    Drehe Links
    if(vorne == frei) {
        Gehe 1
    }else {
        Drehe Rechts
        if(vorne == frei) {
            Gehe 1
        }else {
            Drehe Rechts
            if(vorne == frei) {
                Gehe 1
            }else {
                Drehe Rechts
                Gehe 1
            }
        }
    }
```