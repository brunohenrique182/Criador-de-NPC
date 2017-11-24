package model.NonPlayerCharacter.Itens;

import java.util.ArrayList;

public class Inventory {
    private int copperPiece;
    private int silverPiece;
    private int electrumPiece;
    private int goldPiece;
    private int platinumPiece;
    private ArrayList<Item> itens;

    public int getCopperPiece() {
        return copperPiece;
    }

    public void setCopperPiece(int copperPiece) {
        this.copperPiece = copperPiece;
    }

    public int getSilverPiece() {
        return silverPiece;
    }

    public void setSilverPiece(int silverPiece) {
        this.silverPiece = silverPiece;
    }

    public int getElectrumPiece() {
        return electrumPiece;
    }

    public void setElectrumPiece(int electrumPiece) {
        this.electrumPiece = electrumPiece;
    }

    public int getGoldPiece() {
        return goldPiece;
    }

    public void setGoldPiece(int goldPiece) {
        this.goldPiece = goldPiece;
    }

    public int getPlatinumPiece() {
        return platinumPiece;
    }

    public void setPlatinumPiece(int platinumPiece) {
        this.platinumPiece = platinumPiece;
    }

    public ArrayList<Item> getOutros() {
        return itens;
    }

    public void addItens(Item item){
        itens.add(item);
    }
    
    
}
