package dambat.controller;

import java.io.IOException;

import dambat.Config;
import dambat.model.Robot;
import dambat.model.Terrain;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class JolasaController {
    Robot[] tropa = new Robot[3];

    @FXML
    private GridPane borrokaEremua;

    /** Metodo hau automatikoki exekutatzen da eszena kargatzerakoan. */
    @FXML
    protected void initialize() {
        ajedrezTaulakoLosak();
        robotakSortu();
        robotakKokatu();
        borrokaEremua.setOnMouseClicked(event -> {
            System.out.println("Gridean klikatu duzu");
         //   zozerAldatu();
        
        });
    }
   
    public void ajedrezTaulakoLosak() {
        for (int i = 0; i < Config.BOARD_SIZE; i++) {
            for (int j = 0; j < Config.BOARD_SIZE; j++) {
                if (!(i == 0 && j == 0))
                    borrokaEremua.add(new Terrain((i+j)%2==0?"Black":"White"), i, j);
            }
        }
    }
    public void robotakSortu() {
        tropa[0] = new Robot("r1", 0, 0);
        tropa[1] = new Robot("r2", 1, 1);
        tropa[2] = new Robot("r3", 2, 2);

    }

    public void robotakKokatu() {
                
        for (Robot r : tropa) {
            borrokaEremua.add(r, r.getPosizioa()[0], r.getPosizioa()[1]);
           
        }
    }

    public void zozerAldatu() {
      //  borrokaEremua.getChildren().remove(0);
      borrokaEremua.getScene().getWindow().setWidth(borrokaEremua.getScene().getWidth() + 0.001);
//robotakKokatu();      
    }
}
