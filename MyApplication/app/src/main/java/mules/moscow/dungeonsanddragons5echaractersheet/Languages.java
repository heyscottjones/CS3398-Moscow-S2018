package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class Languages {

    private ArrayList<String> knownLanguages;
    private ArrayList<String> languages;
    private int extras;
    private int used;

    /**
     * The constructor for language.
     * @param languageData contains all available languages
     * @param startingLangs contains all available starting languages
     * @param extras the number of extra languages the player is allowed to learn
     */
    public Languages(ArrayList<String> languageData, ArrayList<String> startingLangs, int extras){
        languages = new ArrayList<String>(languageData);
        knownLanguages = new ArrayList<String>(startingLangs);

        this.extras = extras;
    }

    /**
     * returns a list of languages known by the player
     * @return the languages known by the player
     */
    public ArrayList<String> getLanguageList() {
        return knownLanguages;
    }

    /**
     * Adds a new language known by the player
     * @param newLang the language that the player has learned
     */
    public void addLanguage(String newLang){
        if (used < extras && !knownLanguages.contains(newLang)) {
            knownLanguages.add(newLang);
        }
    }
}