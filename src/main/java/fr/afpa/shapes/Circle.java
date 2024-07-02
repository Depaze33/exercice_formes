package fr.afpa.shapes;

//implémenter la classe Circle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs
public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    

@Override
    public String toString() {
        return "Circle [radius=" + radius + ", calculateArea()=" + calculateArea() + ", calculatePerimeter()="
                + calculatePerimeter() + "]";
    }


@Override
public  double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
}
    @Override
    public double calculatePerimeter(){
        return Math.PI * 2 * radius;
    }
    

    
}
