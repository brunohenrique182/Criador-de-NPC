package model.NonPlayerCharacter.Races;

import model.NonPlayerCharacter.NonPlayerCharacter;

public class Human extends NonPlayerCharacter {

    private String raceName;
    
    public Human(Class classe, String name, int level, int str, int dex, int con, int inte, int win, int chari) {
        super(classe, name, level);
        initialize();
        
        getAtributes().setStrength(str);
        getAtributes().setDexterity(dex);
        getAtributes().setConstitution(con);
        getAtributes().setIntelligence(inte);
        getAtributes().setWisdom(win);
        getAtributes().setCharisma(chari);
    }
    
    private void initialize() {
        setRaceName("Human");
        getAtributes().setStrength(1);
        getAtributes().setDexterity(1);
        getAtributes().setConstitution(1);
        getAtributes().setIntelligence(1);
        getAtributes().setWisdom(1);
        getAtributes().setCharisma(1);
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }
    
}
