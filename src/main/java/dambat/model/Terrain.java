package dambat.model;

import dambat.Config;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Terrain extends Rectangle {
    
    private static String[] koloreak = { "Red", "Black", "White", "Grey", "Red", "Black", "White", "Grey", "Red",
            "White" };

    public Terrain() {
        super(Config.CELL_SIZE, Config.CELL_SIZE, Paint.valueOf(koloreak[(int) (Math.random() * 10)]));
        setOnMouseClicked(event -> {
            System.out.println("[" + ((Terrain) event.getSource()).getX() + "," + ((Terrain) event.getSource()).getY()
                    + "]" + " puntuan egin duzu klik.");
            ilundu();
        });

    }
    
    public Terrain(String kolorea) {
        super(Config.CELL_SIZE, Config.CELL_SIZE, Paint.valueOf(kolorea));
    }

    
    public void ilundu() {
        System.out.println("Ilundu");
        this.setFill(((Color)(this.getFill())).darker());
    }
    
}
