import java.util.Arrays;
import java.io.Console;
import java.util.*;
public class Hangman {

	public static void main(String[] args) {
		Console console = System.console();
		String alphaB [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","�","�","�"};
		String woerterbuch [] = {"h","ab", "Abend", "aber", "acht", "Affe", "alle", "allein", "als", "also", "alt", "am", "an", "andere", "anfangen", "Angst", "antworten", "Apfel", "Arbeit", "arbeiten", "Arzt", "auch", "auf", "Auge", "aus", 
				"Auto", "baden", "bald", "Ball", "bauen", "Bauer", "Baum", "bei", "beide", "beim", "Bein", "Beispiel", "bei�en", "bekommen", "Berg", "besser", "Bett", "Bild", "bin", "bis", "blau", "bleiben", "Blume", "Boden", "b�se", "brauchen", "braun", "Brief", "bringen", "Brot", "Bruder", "Buch", "da", "dabei", "daf�r", "damit", "danach", "dann", "daran", "darauf", "darin", "das", "dauern", "davon", "dazu", "dein", "dem", "den", "denken", "denn", "der", "deshalb", "dich", "dick", "die", "Ding", "dir", "doch", "Dorf", "dort", "drau�en", "drehen", "drei", "dumm", "dunkel", "durch", "d�rfen", 
				"eigentlich", "einfach", "einige", "einigen", "einmal", "Eis", "Eltern", "Ende", "endlich", "er", "Erde", "erkl�ren", "erschrecken", "erst", "erz�hlen", "es", "essen", "etwas", 
				"fahren", "Fahrrad", "f�hrt", "fallen", "Familie", "fangen", "fast", "fehlen", "Fenster", "Ferien", "fertig", "fest", "Feuer", "fiel", "finden", "Finger", "Fisch", "Flasche", "fliegen", "Frage", "fragen", "Frau", "frei", "fressen", "Freude", "freuen", "Freund", "fr�hlich", "fr�h", "fr�her", "f�hren", "f�nf", "f�r", "Fu�", "Fu�ball", 
				"gab", "ganz", "gar", "Garten", "geben", "Geburtstag", "gef�hrlich", "gegen", "gehen", "geh�ren", "gelb", "Geld", "genau", "gerade", "gern", "Geschenk", "Geschichte", "Gesicht", "gestern", "gesund", "gewinnen", "gibt", "ging", "Glas", "glauben", "gleich", "Gl�ck", "gl�cklich", "Gott", "gro�", "gr�n", "gut", "Haar", "haben", "halb", "halten", "Hand", "h�ngen", "hart", "Hase", "hat", "Haus", "hei�", "hei�en", "helfen", "her", "heraus", "Herr", "Herz", "heute", "hier", "Hilfe", "Himmel", "hin", "hinein", "hinter", "hoch", "holen", "h�ren", "Hund", "Hunger ", 
				"ich", "ihm", "ihn", "ihr", "im", "immer", "in", "ins", "ist", 
				"ja", "Jahr", "jeder", "jetzt", "jung", "Junge", 
				"kalt", "kam", "kann", "Katze", "kaufen", "kein", "kennen", "Kind", "Klasse", "klein", "klettern", "kochen", "kommen", "k�nnen", "Kopf", "krank", "K�che", "kurz", 
				"lachen", "Land", "lang", "langsam", "las", "lassen", "laufen", "laut", "Leben", "legen", "Lehrer", "Lehrerin", "leicht", "leise", "lernen", "lesen", "letzte", "Leute", "Licht", "lieb", "liegen", "lie�", "Loch", "los", "Luft", "lustig", 
				"machen", "M�dchen", "mal", "man", "Mann", "Maus", "Meer", "mehr", "mein", "Mensch", "merken", "mich", "Milch", "Minute", "mir", "mit", "m�gen", "m�glich", "Monat", "m�de", "Musik", "m�ssen", "Mutter", 
				"nach", "n�chste", "Nacht", "nah", "Name", "n�mlich", "Nase", "nass", "nat�rlich", "neben", "nehmen", "nein", "nennen", "neu", "neun", "nicht", "nichts", "nie", "nimmt", "noch", "nun", "nur", 
				"ob", "oben", "oder", "offen", "�ffnen", "oft", "ohne", "Oma", "Onkel", "Opa", 
				"packen", "Pferd", "Platz", "pl�tzlich", "Polizei", 
				"Rad", "rechnen", "reich", "reiten", "rennen", "richtig", "rot", "rufen", "ruhig", "rund", 
				"Sache", "sagen", "schaffen", "schauen", "scheinen", "schenken", "schicken", "Schiff", "schlafen", "schlagen", "schlecht", "schlimm", "Schluss", "Schnee", "schnell", "schon", "sch�n", "schreiben", "schreien", "Schuh", "Schule", "Sch�ler", "schwarz", "schwer", "Schwester", "schwimmen", "sechs", "See", "sehen", "sehr", "sein", "seit", "Seite", "selbst", "setzen", "sich", "sicher", "sie", "sieben", "sieht", "sind", "singen", "sitzen", "so", "sofort", "Sohn", "sollen", "Sommer", "Sonne", "Sonntag", "sonst", "Spa�", "sp�t", "sp�ter", "Spiel", "spielen", "sprechen", "springen", "Stadt", "stark", "stehen", "steigen", "Stein", "Stelle", "stellen", "Stra�e", "St�ck", "Stunde", "suchen", 
				"Tag", "Tante", "Teller", "tief", "Tier", "Tisch", "tot", "tragen", "traurig", "treffen", "trinken", "tun", "T�r", "turnen", 
				"�ber", "�berall", "Uhr", "um", "und", "uns", "unser", "unten", "unter", 
				"Vater", "vergessen", "verkaufen", "verlieren", "verstecken", "verstehen", "versuchen", "viel", "vielleicht", "vier", "Vogel", "voll", "vom", "von", "vor", "vorbei", "Wagen", "wahr", "Wald", "war", "warm", "warten", "warum", "was", "waschen", "Wasser", "weg", "Weg", "Weihnachten", "weil", "weinen", "wei�", "weit", "weiter", "Welt", "wenig", "wenn", "wer", "werden", "werfen", "Wetter", "wichtig", "wie", "wieder", "Wiese", "will", "Winter", "wir", "wird", "wirklich", "wissen", "wo", "Woche", "wohl", "wohnen", "Wohnung", "wollen", "Wort", "w�nschen", 
				"Zahl", "zehn", "zeigen", "Zeit", "Zeitung", "ziehen", "Zimmer", "zu", "Zug", "zum", "zur", "zur�ck", "zusammen", "zwei", "zwischen"};
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
					System.out.println("Eingabe nicht g�ltig!");
				
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

	   }


