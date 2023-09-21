import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1 uzduotis. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

        int number1 = 5;
        int number2 = 3;
        sumAndPrint(number1, number2);
        sumAndPrint(40, 35);
        // 2 uzduotis. Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.

        double reiksme = PISq();
        System.out.println("Reiksme yra " + reiksme);

        // 3 uzduotis.
        int skaicius1 = 2;
        int skaicius2 = 4;
        int result = sandauga(number1, number2);
        System.out.println(result);
        System.out.println(sandauga(skaicius1, skaicius2));

        // 4 uzduotis.
        int[] skaiciuMasyvas = {1, 2, 3, 4};
        atspausdintiMasyva(skaiciuMasyvas);

        // 5 uzduotis.
        int min = 1;
        int max = 10;
        int randomIntSkaicius = randomInt(min, max);
        System.out.println("Atsitiktinis skaicius " + randomIntSkaicius);

        // 6 -8 uzduotis.

        min = 5;
        max = 10;
        int len = 7;
        int[] rndIntArr = genRndIntArr(5, 10, 7);
        int sum = countSum(rndIntArr);
        System.out.println("ArraySum: " + sum);
        int[] array = genRndIntArr2(5, 10, 7);
        double ave = countAve(rndIntArr);
        System.out.println("Average of array: " + ave);

        // 9 uzduotis.
        int lines = 3;
        int columns = 5;
        printrectangle(lines, columns);

        // 10, 11, 1 uzduotis.
        String text = "Today is a very beautiful day";
        countLettersAndSpaces(text);
        String coded = codetext(text);

        System.out.println("Primary text is " + text);
        System.out.println("Coded text is " + coded);
        printText(text);


    }


    //1 uzduotis. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

    public static void sumAndPrint(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println(sum);
    }

    // 2 uzduotis. Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.
    public static double PISq() {
        return 9.8596;
    }

    // 3 UZDUOTIS. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.

    public static int sandauga(int skaicius1, int skaicius2) {
        int rezultatas = skaicius1 * skaicius2;
        return rezultatas;

    }

    // 4 UZDUOTIS. Sukurkite Funkciją kuri priima int[] tipo kintamąjį, prasuka ciklą ir atspausdina kiekvieną skaičių.

    public static void atspausdintiMasyva(int[] masyvas) {
        for (int skaicius : masyvas) {
            System.out.println(skaicius);
        }
    }

    // 5 UZDUOTIS. Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.
    public static int randomInt(int min, int max) {
        Random generatorius = new Random();
        int randomIntSkaicius = generatorius.nextInt(max - min) + min;
        return randomIntSkaicius;


    }
    // 6 UZDUOTIS. Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.

    public static int[] genRndIntArr(int min, int max, int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return arr;

    }

    // 7 UZDUOTIS. Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
    public static int[] genRndIntArr1(int min, int max, int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return arr;
    }

    public static int countSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    // 8 UZDUOTIS.Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
    public static int[] genRndIntArr2(int min, int max, int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return arr;
    }

    public static double countAve(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        return (double) sum / array.length;
    }

    // 9 UZDUOTIS.Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui, antras vidiniam.
    public static void printrectangle(int lines, int columns) {
        for (int i = 0; i < lines; i++) {
            for (int i1 = 0; i1 < columns; i1++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //10 UZDUOTIS. Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų. Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį).
    public static void countLettersAndSpaces(String text) {
        int lettersCount = 0;
        int spacesCount = 0;
        for (char symbol : text.toCharArray()) {
            if (Character.isLetter(symbol)) {
                lettersCount++;
            } else if (Character.isWhitespace(symbol)) {
                spacesCount++;
            }
        }
        System.out.println("The count of letters: " + lettersCount);
        System.out.println("The count of spaces: " + spacesCount);
    }

    // 11 UZDUOTIS. Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.
    public static String codetext(String text) {
        StringBuilder codedtext = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            codedtext.append(text.charAt(i));
        }
        return codedtext.toString();
    }

    // 1 UZDUOTIS(SUNKESNI). Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant “---” pradžioje ir gale. PVZ (---labas---)
    public static String printText(String text) {
        String updatedtext = "..." + text + "...";
        System.out.println(updatedtext);
        return updatedtext;
    }



}