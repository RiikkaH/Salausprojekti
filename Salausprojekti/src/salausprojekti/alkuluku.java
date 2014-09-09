
package salausprojekti;

import java.util.Random;

/**
 * Luokkaa käytetään luomaan kaksi lähekkäistä alkulukua.
 * @author RiikkaH
 */
public class alkuluku {
    
    private int luku1;
    private int luku2;
    
    public alkuluku(){
        luku1=0;
        luku2=0;
    }
    
    /**
     * Metodi luo satunnaisluvun avulla kaksi lähekkäistä alkulukua.
     */
    public void luo(){
        int r=randomluku();
        int l1=r-1;
        while(!onkoalkuluku(l1)){
            l1--;
        }
        luku1=l1;
        while(!onkoalkuluku(r)){
            r++;
        }
        luku2=r;
    }
    /**
     * Metodi palauttaa alkuluvun.
     * @return alkuluku
     */
    public int luku1(){
        return luku1;
    }
    /**
     * Metodi palauttaa alkuluvun.
     * @return alkuluku
     */
    public int luku2(){
        return luku2;
    }
    
    private int randomluku(){
        Random rnd=new Random();
        return rnd.nextInt((10000-2)+1)+2;
    }
    
    private boolean onkoalkuluku(int luku){
        if(luku <= 3){
            return luku > 1;
        }
        if(luku % 2 == 0 || luku % 3 == 0){
            return false;
	}
	for(int i = 5; i < Math.sqrt(luku) + 1;i +=6){
            if(luku % i == 0 || luku % (i+2) == 0){
		return false;
            }
        }
	return true;
    }
}