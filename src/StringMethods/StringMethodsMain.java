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
    public static void main(String[] args) {
        //Remove();
        alfabet();
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

    public static void alfabet() {
        String x = "Hottentottententententoonstelling";
        System.out.println(x);
        char[] char_x = x.toCharArray();
        char ch = 't';
        int count = 0;
        for(int i=0; i<char_x.length; i++) {
            if (ch == char_x[i]) {
                count++;
            }
        }
        System.out.println("Aantal keer " + ch + ": " + count);
    }


    public static void Sub() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een string: ");
        String x = keyboard.next();
        char [] char_a = x.toCharArray();
        String subStr  = x.substring(4, 10);
        System.out.println(subStr);
        System.out.print("Geef een string ter vervanging: ");
        String sub = keyboard.next();
        String result = x.replace(subStr, sub);
        System.out.print(result);
        keyboard.close();
    }


        public static String AltSub () {
            String repl = "Jeremy Bearemy is cool";
            System.out.println(repl);
            String result = repl.replace("cool", "not so cool");
            System.out.println(result);
            return result;
        }
    }
