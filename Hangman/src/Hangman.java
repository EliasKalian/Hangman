package com.company;

import java.util.Arrays;
import java.io.Console;
import java.util.*;
public class Person {

    public static void main(String[] args) {
        Console console = System.console();
        String alphaB [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","ä","ü","ö"};
        String woerterbuch [] = {"h","ab", "Abend", "aber", "acht", "Affe", "alle", "allein", "als", "also", "alt", "am", "an", "andere", "anfangen", "Angst", "antworten", "Apfel", "Arbeit", "arbeiten", "Arzt", "auch", "auf", "Auge", "aus",
                "Auto", "baden", "bald", "Ball", "bauen", "Bauer", "Baum", "bei", "beide", "beim", "Bein", "Beispiel", "beißen", "bekommen", "Berg", "besser", "Bett", "Bild", "bin", "bis", "blau", "bleiben", "Blume", "Boden", "böse", "brauchen", "braun", "Brief", "bringen", "Brot", "Bruder", "Buch", "da", "dabei", "dafür", "damit", "danach", "dann", "daran", "darauf", "darin", "das", "dauern", "davon", "dazu", "dein", "dem", "den", "denken", "denn", "der", "deshalb", "dich", "dick", "die", "Ding", "dir", "doch", "Dorf", "dort", "draußen", "drehen", "drei", "dumm", "dunkel", "durch", "dürfen",
                "eigentlich", "einfach", "einige", "einigen", "einmal", "Eis", "Eltern", "Ende", "endlich", "er", "Erde", "erklären", "erschrecken", "erst", "erzählen", "es", "essen", "etwas",
                "fahren", "Fahrrad", "fährt", "fallen", "Familie", "fangen", "fast", "fehlen", "Fenster", "Ferien", "fertig", "fest", "Feuer", "fiel", "finden", "Finger", "Fisch", "Flasche", "fliegen", "Frage", "fragen", "Frau", "frei", "fressen", "Freude", "freuen", "Freund", "fröhlich", "früh", "früher", "führen", "fünf", "für", "Fuß", "Fußball",
                "gab", "ganz", "gar", "Garten", "geben", "Geburtstag", "gefährlich", "gegen", "gehen", "gehören", "gelb", "Geld", "genau", "gerade", "gern", "Geschenk", "Geschichte", "Gesicht", "gestern", "gesund", "gewinnen", "gibt", "ging", "Glas", "glauben", "gleich", "Glück", "glücklich", "Gott", "groß", "grün", "gut", "Haar", "haben", "halb", "halten", "Hand", "hängen", "hart", "Hase", "hat", "Haus", "heiß", "heißen", "helfen", "her", "heraus", "Herr", "Herz", "heute", "hier", "Hilfe", "Himmel", "hin", "hinein", "hinter", "hoch", "holen", "hören", "Hund", "Hunger ",
                "ich", "ihm", "ihn", "ihr", "im", "immer", "in", "ins", "ist",
                "ja", "Jahr", "jeder", "jetzt", "jung", "Junge",
                "kalt", "kam", "kann", "Katze", "kaufen", "kein", "kennen", "Kind", "Klasse", "klein", "klettern", "kochen", "kommen", "können", "Kopf", "krank", "Küche", "kurz",
                "lachen", "Land", "lang", "langsam", "las", "lassen", "laufen", "laut", "Leben", "legen", "Lehrer", "Lehrerin", "leicht", "leise", "lernen", "lesen", "letzte", "Leute", "Licht", "lieb", "liegen", "ließ", "Loch", "los", "Luft", "lustig",
                "machen", "Mädchen", "mal", "man", "Mann", "Maus", "Meer", "mehr", "mein", "Mensch", "merken", "mich", "Milch", "Minute", "mir", "mit", "mögen", "möglich", "Monat", "müde", "Musik", "müssen", "Mutter",
                "nach", "nächste", "Nacht", "nah", "Name", "nämlich", "Nase", "nass", "natürlich", "neben", "nehmen", "nein", "nennen", "neu", "neun", "nicht", "nichts", "nie", "nimmt", "noch", "nun", "nur",
                "ob", "oben", "oder", "offen", "öffnen", "oft", "ohne", "Oma", "Onkel", "Opa",
                "packen", "Pferd", "Platz", "plötzlich", "Polizei",
                "Rad", "rechnen", "reich", "reiten", "rennen", "richtig", "rot", "rufen", "ruhig", "rund",
                "Sache", "sagen", "schaffen", "schauen", "scheinen", "schenken", "schicken", "Schiff", "schlafen", "schlagen", "schlecht", "schlimm", "Schluss", "Schnee", "schnell", "schon", "schön", "schreiben", "schreien", "Schuh", "Schule", "Schüler", "schwarz", "schwer", "Schwester", "schwimmen", "sechs", "See", "sehen", "sehr", "sein", "seit", "Seite", "selbst", "setzen", "sich", "sicher", "sie", "sieben", "sieht", "sind", "singen", "sitzen", "so", "sofort", "Sohn", "sollen", "Sommer", "Sonne", "Sonntag", "sonst", "Spaß", "spät", "später", "Spiel", "spielen", "sprechen", "springen", "Stadt", "stark", "stehen", "steigen", "Stein", "Stelle", "stellen", "Straße", "Stück", "Stunde", "suchen",
                "Tag", "Tante", "Teller", "tief", "Tier", "Tisch", "tot", "tragen", "traurig", "treffen", "trinken", "tun", "Tür", "turnen",
                "über", "überall", "Uhr", "um", "und", "uns", "unser", "unten", "unter",
                "Vater", "vergessen", "verkaufen", "verlieren", "verstecken", "verstehen", "versuchen", "viel", "vielleicht", "vier", "Vogel", "voll", "vom", "von", "vor", "vorbei", "Wagen", "wahr", "Wald", "war", "warm", "warten", "warum", "was", "waschen", "Wasser", "weg", "Weg", "Weihnachten", "weil", "weinen", "weiß", "weit", "weiter", "Welt", "wenig", "wenn", "wer", "werden", "werfen", "Wetter", "wichtig", "wie", "wieder", "Wiese", "will", "Winter", "wir", "wird", "wirklich", "wissen", "wo", "Woche", "wohl", "wohnen", "Wohnung", "wollen", "Wort", "wünschen",
                "Zahl", "zehn", "zeigen", "Zeit", "Zeitung", "ziehen", "Zimmer", "zu", "Zug", "zum", "zur", "zurück", "zusammen", "zwei", "zwischen"};
        int j = (int) (Math.random()*woerterbuch.length);
        String word  = woerterbuch[j];
        System.out.println("Wort: "+word);

        String [] anzeige = new String[word.length()];
        for(int z = 0;z<word.length();z++) {
            anzeige[z] = "_ ";
        }
        int fehler = 0;
        int right = 0;
        boolean stop = false;
        for(int y = 0; y<word.length();y++) {
            System.out.print(anzeige[y]);
        }
        while(!stop) {
            String eingabe;
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Eingabe:");
            eingabe = sc.nextLine();
            boolean valid = false;
            boolean match = false;
            for(int i = 0;i<26;i++) {
                if(eingabe.equalsIgnoreCase(alphaB [i])) {
                    valid = true;
                }
            }
            if(valid ==true) {
                for (int x = 0; x<word.length();x++) {
                    //System.out.println((word.substring(x,x+1)).toLowerCase());
                    if((word.substring(x,x+1)).equalsIgnoreCase(eingabe)) {
                        anzeige[x] = word.substring(x,x+1);
                        match=true;
                    }
                    System.out.print(anzeige[x]);
                }
                if(match==true) {
                    System.out.println();
                    System.out.println("Buchstabe ist korrekt!");
                    right++;
                }
                else {
                    System.out.println();
                    System.out.println("Buchstabe ist inkorrekt!");
                    fehler++;
                }
            }
            else {
                System.out.println("Eingabe nicht gültig!");

            }
            if(right==word.length()) {
                stop = true;
                System.out.println("Sie haben gewonnen!");
            }
            if(fehler == 7) {
                stop = true;
                System.out.println("Sie haben verloren!");
                System.out.println("Das Wort war: "+word);
            }
        }


    }


    public void vincenzocautiero() {
        System.out.print("Spengergasse");
    }
}
