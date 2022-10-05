/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfito septiano
 */
public class Iwan extends motor {
    private String color, engine;
    
    public Iwan () {
        color = "Hijau";
        engine = "Kopling";
    }
    
    public Iwan (String col, String eng) {
        this.color = col;
        this.engine = eng;
    }
    
    @Override
    public void sound() {
        System.out.println("Wengggg...");
    }
    
    @Override
    public String toString() {
        return "Iwan{" + "color=" + color + ", engine=" + engine + '}';
    }
    
    
}
