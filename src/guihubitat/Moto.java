/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guihubitat;

import java.awt.image.BufferedImage;

/**
 *
 * @author iUser
 */
public class Moto extends Velocity implements IBehaviour {
    @Override
    public String Beep() {
       return "Im a Moto"; 
    }
    
    @Override
    public boolean setPic(BufferedImage pic) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(pic != null){
            this.pic = pic;
            return true;
        }else{
            return false;
        }
    }
    
    private BufferedImage pic;

    @Override
    public BufferedImage getPic() {
        return this.pic;
    }
}
