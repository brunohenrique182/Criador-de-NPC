package model.NonPlayerCharacter.Races;

import model.NonPlayerCharacter.NonPlayerCharacter;

public class Orc extends NonPlayerCharacter {

    private String raceName;
    
    public Orc(Class classe, String name, int level, int str, int dex, int con, int inte, int win, int chari) {
        super(classe,name, level);
        initialize();
        getAtributes().setStrength(str);
        getAtributes().setDexterity(dex);
        getAtributes().setConstitution(con);
        getAtributes().setIntelligence(inte);
        getAtributes().setWisdom(win);
        getAtributes().setCharisma(chari);
    }

    private void initialize() {
        setRaceName("Orc");
        getAtributes().setStrength(2);
        getAtributes().setDexterity(1);
        getAtributes().setConstitution(2);
        getAtributes().setIntelligence(0);
        getAtributes().setWisdom(1);
        getAtributes().setCharisma(0);
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

}
