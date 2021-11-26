# Lösung für Aufgabe 1 vom 26.11.2021
In der Aufgabe gilt es, ein Programm zu erstellen, welches mit eine Eingabe, in diesem Fall einen Geschäftsfall verarbeitet und dazu eine Ausgabe erstellt.
Das besondere hier ist, dass das Programm immer nach der Verarbeitung eines Geschäftsfalls wieder auf eine Eingabe wartet.

Pseudo-Code
```js
    function main() {
        while(true) {
            var geschäftsfall = warte_auf_eingabe()
            calc_provision(geschäftsfall)
        }
    }

    function calc_provision(geschäftsfall) {
        var provision
        if(geschäftsfall.gewinn < 10000) {
            provision = 3
        }else {
            provision = 6
        }
        
        var auszahlung = geschäftsfall.gewinn / 100 * provision
        log(`${auszahlung} Euro Provision!`)
    }
```

Im obrigen Pseudo-Code ruft die `main` Methode immer wieder den Algorithmus auf, der die Provision für den Geschäftsfall berechnen soll. Dabei wartet das Programm auf eine Eingabe, in diesem Fall auf einen Geschäftsfall. Dieser wird auf die Bedingung geprüft, ob die Höhe des Geschäftsfalls mehr oder weniger als 10.000 Euro beträgt. Je nach Ergebnis kann die Provision dann 3% oder 6% betragen. Diese Provision wird dann in der Variable `auszahlung` berechnet und in der Konsole als Text angezeigt. 