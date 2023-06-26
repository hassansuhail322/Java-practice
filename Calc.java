
class calculator{

    int f;
    int s;

    public void setNumbers(int a , int b){
        this.f = a;
         this.s = b;
    }

    public  int add(){
        System.out.print(this.f);
        return this.f + this.s ;
    }

    public  int multiply(){
        
        return this.f * this.s ;
    }


}

public class Calc {
    public static void main(String [] args){
        calculator c = new calculator();
        c.setNumbers(3, 3);
        int ans = c.add();
        System.out.println(ans);
    }
    
}
