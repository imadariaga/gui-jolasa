package dambat.model;

import dambat.Config;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Robot extends ImageView{
    String izena;
    int[] posizioa = { Config.BOARD_SIZE / 2 - 1, Config.BOARD_SIZE / 2 - 1 };// new int[2];


    public Robot(String izena, int posX, int posY) {
        this.izena = izena;
        posizioa[0] = posX;
        posizioa[1] = posY;
        setImage(new Image(this.getClass().getResource("/dambat/img/bolaGorria.png").toExternalForm()));
        
        setOnMouseClicked(event -> {
            System.out.println("Robot baten egin duzu klik.");
            mugituEskuinera();
        });
    }


    public String getIzena() {
        return izena;
    }


    public void setIzena(String izena) {
        this.izena = izena;
    }


    public int[] getPosizioa() {
        return posizioa;
    }


    public void setPosizioa(int[] posizioa) {
        this.posizioa = posizioa;
    }

    public void mugituEskuinera() {
        try {
            Thread.sleep(500);
            posizioa[1]++;
            GridPane.setColumnIndex(this, posizioa[1]);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }
}
