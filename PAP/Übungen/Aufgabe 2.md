# Lösung für Aufgabe 2 vom 26.11.2021
!Nicht vollständig

Pseudo-Code
```js
    function main() {
        var alter = warte_auf_eingabe()
        var schätzwert = warte_auf_eingabe()

        var abschlag;
        if(alter > 50) {
            abschlag = 10
        }else if(alter > 25) {
            abschlag = 15
        }else {
            abschlag = 30
        }
    }
```