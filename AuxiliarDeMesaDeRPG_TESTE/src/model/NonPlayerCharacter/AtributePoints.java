package model.NonPlayerCharacter;

public class AtributePoints {

    private int dexterity;
    private int charisma;
    private int intelligence;
    private int constitution;
    private int wisdomBonus;
    private int charismaBonus;
    private int strengthBonus;
    private int dexterityBonus;
    private int strength;
    private int wisdom;
    private int constitutionBonus;
    private int intelligenceBonus;

    public AtributePoints() {
        initialize();
    }

    public void setConstitution(int constitution) {
        this.constitution += constitution;
        setConstitutionBonus(getConstitution());
    }

    public void setStrengthBonus(int value) {
        this.strengthBonus = calculateBonus(value);
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterityBonus(int value) {
        this.dexterityBonus = calculateBonus(value);
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setConstitutionBonus(int value) {
        this.constitutionBonus = calculateBonus(value);
    }

    public int getCharismaBonus() {
        return charismaBonus;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligenceBonus(int value) {
        this.intelligenceBonus = calculateBonus(value);
    }

    public void setCharisma(int charisma) {
        this.charisma += charisma;
        setCharismaBonus(getCharisma());
    }

    public void setWisdom(int wisdom) {
        this.wisdom += wisdom;
        setWisdomBonus(getWisdomBonus());
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public void setDexterity(int dexterity) {
        this.dexterity += dexterity;
        setDexterityBonus(getDexterity());
    }

    public int getWisdomBonus() {
        return wisdomBonus;
    }

    public int getStrength() {
        return strength;
    }

    public int getConstitutionBonus() {
        return constitutionBonus;
    }

    public void setWisdomBonus(int value) {
        this.wisdomBonus = calculateBonus(value);
    }

    public void setStrength(int strength) {
        this.strength += strength;
        setStrengthBonus(getStrength());
    }

    public int getConstitution() {
        return constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence += intelligence;
        setIntelligenceBonus(getIntelligence());
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public void setCharismaBonus(int value) {
        this.charismaBonus = calculateBonus(value);
    }

    private void initialize() {
        setStrength(0);
        setDexterity(0);
        setConstitution(0);
        setIntelligence(0);
        setWisdom(0);
        setCharisma(0);
    }

    private int calculateBonus(int atributeValor) {
        if (atributeValor == 2 || atributeValor == 3) {
            return -4;
        } else if (atributeValor == 4 || atributeValor == 5) {
            return -3;
        } else if (atributeValor == 6 || atributeValor == 7) {
            return -2;
        } else if (atributeValor == 8 || atributeValor == 9) {
            return -1;
        } else if (atributeValor == 10 || atributeValor == 11) {
            return 0;
        } else if (atributeValor == 12 || atributeValor == 13) {
            return 1;
        } else if (atributeValor == 14 || atributeValor == 15) {
            return 2;
        } else if (atributeValor == 16 || atributeValor == 17) {
            return 3;
        } else if (atributeValor == 18 || atributeValor == 19) {
            return 4;
        } else if (atributeValor == 20 || atributeValor == 21) {
            return 5;
        } else if (atributeValor == 22 || atributeValor == 23) {
            return 6;
        } else if (atributeValor == 24 || atributeValor == 25) {
            return 7;
        } else if (atributeValor == 26 || atributeValor == 27) {
            return 8;
        } else if (atributeValor == 28 || atributeValor == 29) {
            return 9;
        } else if (atributeValor >= 30) {
            return 10;
        } else {
            return -5;
        }
    }
}
