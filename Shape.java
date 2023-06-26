
class Rectangle{
    double lenght;
    double width;

    void setDimension(double l , double b){
        this.lenght = l;
        this.width = b;
    }
    public static void display(){
        System.out.println("ths is ");
    }
    double claculateArea(){
        return this.lenght * this.width;
    }

    double perimeter(){
        return 2 *(this.lenght + this.width);
    }


}

public class Shape {
    public static void main(String [] args){
        Rectangle R = new Rectangle();
        Rectangle.display();
        R.setDimension(2,3);
        double area = R.claculateArea();
        System.out.println(area);
        double peri = R.perimeter();
        System.out.println(peri);
    }
}
