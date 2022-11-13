package com.pablovass.exepciones_1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LaminaConImagen extends JPanel {
    //ESTO ES UNA EXCEPCION COMPROBADA
    private  Image imagen;
    //public  LaminaConImagen() throws IOException {
    public  LaminaConImagen(){
        try{
            imagen = ImageIO.read(new File("src/execpciones/bola.gif"));
        }catch (IOException e){
            System.out.println("La imagen no se encuentra ");
        }

    }
}
