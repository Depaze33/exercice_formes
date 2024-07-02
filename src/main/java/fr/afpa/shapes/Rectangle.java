package fr.afpa.shapes;

// implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs

public class Rectangle implements Shape {
    public double length;
    public double width;
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

  
@Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", calculateArea()=" + calculateArea()
                + ", calculatePerimeter()=" + calculatePerimeter() + "]";
    }


@Override
public  double calculateArea(){
        return 2*length + 2*width;
}
    @Override
    public double calculatePerimeter(){
        return length *width;
    }
    

    
}