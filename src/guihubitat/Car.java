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
public class Car extends Velocity implements IBehaviour {
    public Car(){
        pic = null;
    }

    @Override
    public String Beep() {
      return "Im a Car";
    }

    @Override
    public boolean setPic(BufferedImage pic) {
        if(pic != null){
            this.pic = pic;
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * хранит ссылку на картинку 
     */
    private BufferedImage pic;

    @Override
    public BufferedImage getPic() {
        return this.pic;
    }
}
