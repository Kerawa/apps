/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KerawaAds.Editor;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.util.Base64;
import javax.imageio.ImageIO;
/**
 *
 * @author sakwe
 */
public class Image_Decoder_Encoder {
    /**
     * Decode string to image
     * @param imageString The string to decode
     * @return decoded image
     */
    
    public static BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            imageByte =Base64.getDecoder().decode(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    /**
     * Encode image to string
     * @param image The image to encode
     * @param filetype any image type...
     * @return encoded string
     */
    public static String encodeToString(BufferedImage image, String filetype) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, filetype, bos);
            byte[] imageBytes = bos.toByteArray();


            imageString = encodeToBase64(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }
    
    /**
     *encode imagebytes to string
     * @param imageByte b64string converted to bytes
     * @return
     */
    public static String encodeToBase64(byte[] imageByte)
    {
        return Base64.getEncoder().encodeToString(imageByte);
    }
}
