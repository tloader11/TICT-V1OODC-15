package week4.les7.opdracht2;

public class Main
{

    /*
    1. Een interface is een klasse. nee
    2. Een interface mag attributen hebben. ja
    3. Een interface mag methoden hebben. ja
    4. Een interface mag slechts één constructor hebben. nee
    5. Een klasse mag onbeperkt veel interfaces implementeren. ja
    6. Een klasse is abstract door te declareren: abstract class. ja
    7. Een klasse, die een interface implementeert, is altijd abstract. ja
    8. Een abstracte klasse mag attributen hebben. ja
    9. Een abstracte klasse mag een constructor hebben. nee
    10. Een klasse mag erven van onbeperkt veel superklassen. ja
    11. Een subklasse erft alle attributen en methoden van zijn superklasse. ja
    12. Een eigen versie in een subklasse van een superklasse-methode heet overloading. ja
    13. Wanneer er zo’n eigen versie is (zie 12.) in de subklasse, dan kan de superklasse-versie van de methode ook worden aangeroepen. ja
    14. Iedere constructor van de superklasse heet default-constructor. nee
    15. Bij super-constructing maakt de volgorde van de statements niet uit. nee
    16. Je hoeft nooit super-constructing toe te passen, want dat gaat vanzelf, en het gaat vanzelf goed. nee
    17. Is toegestaan de code: AutoService as = new AutoService(); ja (afhankelijk van of je een default constructor hebt)
    18. En is toegestaan de code: Dier d = new Dier(); ja (zie 17)
    19. En de code: Dier dd = new Koe(); nee (koe extends dier -> cast)
    int lM = dd.getLitersMelk(); nee
    20. En de code: Koe k = new Dier(); ja
    int lM = k.litersMelk(); ja
    21. En de code: AutoService as = new MockAutoService(); List<Auto> lA = as.getAutos(); ja
     */


}
