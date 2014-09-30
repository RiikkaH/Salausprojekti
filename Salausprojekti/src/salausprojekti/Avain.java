
package salausprojekti;

/**
 *
 * @author RiikkaH
 */
public class Avain {
    
    private final int p;
    private final int q;
    private final int n;
    private final Alkuluku a;
    
    public Avain(){
        a=new Alkuluku();
        p=a.luo();
        q=a.luo();
        n=p*q;
        
        
    }
    
    public int yksityinenAvain(){
        
        return 0;
    }
    
    public int julkinenAvain(){
        int fiiN=(p-1)*(q-1);
        int r=a.randomluku(3,fiiN);
        while(gcd(r,fiiN)!=1){
            r=a.randomluku(3, fiiN);
        }
        return r;
    }
    
    private int gcd(int a, int b) {
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    
}
