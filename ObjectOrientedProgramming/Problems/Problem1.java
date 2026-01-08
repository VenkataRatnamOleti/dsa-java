package ObjectOrientedProgramming.Problems;

public class Problem1 {

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(3, -4);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);
    
    }

}

class Complex{
    int r,i;
    
    Complex(int r, int i){
        this.r = r;
        this.i = i;
        this.current();
    }

    void current(){
        System.out.println("Current = " + r + "+" + i + "i");
    }

    void sum(Complex c){
        System.out.println("Sum = " + (this.r+c.r) + "+" + (this.i+c.i) + "i");
    }

    void difference(Complex c){
        System.out.println("Difference = " + (this.r-c.r) + "+" + (this.i-c.i) + "i");
    }

    void product(Complex c){
        System.out.println("Product = " + ((this.r*c.r)-(this.i*c.i)) + "+" + ((this.r*c.i)+(this.i*c.r)) + "i");
    }
}
