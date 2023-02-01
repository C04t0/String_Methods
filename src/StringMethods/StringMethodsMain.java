package StringMethods;

//Schrijf een methode dat een String en een letter aanvaard.
// verwijder bij je String al die letters van de string.
// Return de string op het einde.
//              Remove()
//
// Schrijf een methode dat een string aanvaard en dat elke letter van het alfabet uitprint en
// ook hoeveel die voorkomt in het woord.
//              alfabet() -> unf.
//
// Schrijf een methode om een substring te vervangen in een bepaalde zin.
// deze methode neemt dan een zin in als parameter,
// de substring dat moet vervangen worden in de zin en het woord om de substring mee te vervangen.
//              Sub() + AltSub()


import java.util.Scanner;

public class StringMethodsMain {

    public static String x = "Hottentottententententoonstelling";
    public static void main(String[] args) {
        //Remove();
        alfabet(x);
        //Sub();
        //AltSub();

    }

    public static String Remove() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een string: ");
        String x = keyboard.next();
        System.out.print("Geef een letter van de string: ");
        String a = keyboard.next();
        String result = x.replace(a, "");
        System.out.println(result);
        keyboard.close();
        return result;
    }

    public static void alfabet(String x) {
        char ch;
        int found = 0;
        int[] count = new int[256];
        char[] char_x = x.toCharArray();
        for (int i = 0; i < char_x.length; i++) {
            count[x.charAt(i)]++;
        }
        for (int i = 0; i < char_x.length; i++) {
            if (x.charAt(i) == char_x[i]) {
                found++;
            }
            if (found >= 1){
                System.out.println("Aantal keer letter " + x.charAt(i) + ": " + count[x.charAt(i)]);
            }
        }


    }



    public static void Sub() {
        String x = "Python is very cool";
        System.out.println(x);
        String newX = x.replace("Python", "Java");
        System.out.println(newX);

    }


        public static String AltSub () {
            String repl = "Jeremy Bearemy is cool";
            System.out.println(repl);
            String result = repl.replace("cool", "not so cool");
            System.out.println(result);
            return result;
        }
    }
