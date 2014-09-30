
package salausprojekti;

import java.util.Random;

/**
 * Luokkaa käytetään luomaan suuria alkulukuja.
 * @author RiikkaH
 */
public class Alkuluku {
    
    public Alkuluku(){

    }
    
    /**
     * Metodi luo satunnaisluvun avulla suuren alkuluvun.
     * @return suuri alkuluku
     */
    public int luo(){
        return luoValilta(9000,9000000);
    }
    
    public int luoValilta(int min, int max){
        int r=randomluku(min,max);
        while(!onkoalkuluku(r)){
            r--;
            if(r<min){
                r=randomluku(min,max);
            }
        }
        return r;
    }
    
    public int randomluku(int min, int max){
        Random rnd=new Random();
        return rnd.nextInt((max-min)+1)+min;
    }
    
    public boolean onkoalkuluku(int luku){
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