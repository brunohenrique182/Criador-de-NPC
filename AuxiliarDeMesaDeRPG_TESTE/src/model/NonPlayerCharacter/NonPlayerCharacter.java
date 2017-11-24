package model.NonPlayerCharacter;

import model.NonPlayerCharacter.Itens.Inventory;

public abstract class NonPlayerCharacter {

    private String name;
    private String description;
    private int classArmor;
    private int level;
    private int proficiencyBonus;
    private int speed;
    private AtributePoints atributes;
    private Skills skills;
    private SavingThrows savingThrows;
    private Inventory invetory;
    private Class classe;

    public NonPlayerCharacter(Class classe,String name, int level) {
        this.classe = classe;
        this.atributes = new AtributePoints();
        this.skills = new Skills();
        this.savingThrows = new SavingThrows();
        this.invetory = new Inventory();

        setName(name);
        setLevel(level);
        setClassArmor(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setClassArmor(int classArmor) {
        this.classArmor = classArmor;
        this.classArmor += atributes.getDexterityBonus();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public int getClassArmor() {
        return this.classArmor;
    }

    public AtributePoints getAtributes() {
        return atributes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public Skills getSkills() {
        return skills;
    }

    public SavingThrows getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(SavingThrows savingThrows) {
        this.savingThrows = savingThrows;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Inventory getInvetory() {
        return invetory;
    }
    
    public Class getClasse(){
        return classe;
    }
}
