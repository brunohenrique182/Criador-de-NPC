package model.NonPlayerCharacter.Classes;

public class Class {

    private String className;

    public Class(String nome) {
        setClassName(nome);
    }

    public String getClassName() {
        return className;
    }
    
    public void setClassName(String name){
        this.className = name;
    }

}
