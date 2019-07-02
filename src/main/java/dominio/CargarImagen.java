package dominio;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * This class demonstrates how to load an Image from an external file
 */
public class CargarImagen  {
    private static final int IMG_WIDTH = 1280;
    private static final int IMG_HEIGHT = 720;

    public static void main(String [] args){

        try{

            BufferedImage originalImage = ImageIO.read(new File("/home/osboxes/Pictures/M3 E46.jpg"));
            int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

            BufferedImage resizeImageJpg = resizeImage(originalImage, type);
            ImageIO.write(resizeImageJpg, "jpg", new File("/home/osboxes/Pictures/M3 E46.jpg.jpg"));

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int type){
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }


}

