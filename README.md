classDiagram

class ProgrammStart{
    +main(String[] args)


}

class Parkhaus{
    +stellpaetze: Auto()
    +ausgabestellpaetze(Auto[])
    +fahrzeugWinfahren(Auto auto, int einfahrtzeit)
    +fahrzeugAusfahren(Auto auto, int ausfahrtzeit)

}
class Auto{
    +farbe: String
    +marke: String
    +kennzeichen: String
}

class Pkw{


}

class Lkw{
+anzahlAchsen: Int;

}

ProgrammStart "1" --> "1" Parkhaus
ProgrammStart "1--> "1..100" Auto: Stellüätze

Pkw --|> Auto
Lkw --|> Auto