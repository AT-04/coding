package org.fundacionjala.coding.ovidio;

import java.util.HashMap;
import java.util.Map;

/**
 * Welcome!
 * Your start-up's BA has told marketing that your website has a large audience in Scandinavia
 * and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in
 * their own language. Luckily you already use an API that detects the user's location, so this is an
 * easy win.
 * <p>
 * The Task
 * <p>
 * Think of a way to store the languages as a database (eg an object). The languages are listed below
 * so you can copy and paste!
 * Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a
 * greeting - if you have it in your database. It should default to English if the language is not
 * in the database, or in the event of an invalid input.
 * The Database
 * <p>
 * english: "Welcome",
 * czech: "Vitejte",
 * danish: "Velkomst",
 * dutch: "Welkom",
 * estonian: "Tere tulemast",
 * finnish: "Tervetuloa",
 * flemish: "Welgekomen",
 * french: "Bienvenue",
 * german: "Willkommen",
 * irish: "Failte",
 * italian: "Benvenuto",
 * latvian: "Gaidits",
 * lithuanian: "Laukiamas",
 * polish: "Witamy",
 * spanish: "Bienvenido",
 * swedish: "Valkommen",
 * welsh: "Croeso"
 * <p>
 * Possible invalid inputs include:
 * <p>
 * IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
 * IP_ADDRESS_NOT_FOUND - ip address not in the database
 * IP_ADDRESS_REQUIRED - no ip address was supplied
 */
public class Welcome {

    private static final Map<String, String> LANGUAGES = new HashMap<String, String>() {
        {
            put("english", "Welcome");
            put("czech", "Vitejte");
            put("danish", "Velkomst");
            put("dutch", "Welkom");
            put("estonian", "Tere tulemast");
            put("finnish", "Tervetuloa");
            put("flemish", "Welgekomen");
            put("french", "Bienvenue");
            put("german", "Willkommen");
            put("irish", "Failte");
            put("italian", "Benvenuto");
            put("latvian", "Gaidits");
            put("lithuanian", "Laukiamas");
            put("polish", "Witamy");
            put("spanish", "Bienvenido");
            put("swedish", "Valkommen");
            put("welsh", "Croeso");

        }
    };

    /**
     * Return the greet.
     *
     * @param language receive the language.
     * @return String greet .
     */

    String greet(String language) {
        return LANGUAGES.get(language) == null ? LANGUAGES.get("english") : LANGUAGES.get(language);
    }
}

