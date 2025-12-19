classDiagram

class ProgrammStart{
    +stellpaetze: Auto[
    +main
}
class Auto{
    +farbe: String
    +marke: String
    +kennzeichen: String
}

ProgrammStart "1--> "1..100" Auto: Stellüätze