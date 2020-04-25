import java.util.Scanner;

class Lab2 {
  //Проверка ввода (try, throw - показался не уместен.)
  public static double getDouble(){
    Scanner scan = new Scanner(System.in);
    while(!scan.hasNextDouble()){
      System.out.println("Input Error.Enter a fractional number.");
      scan.next();
    }
    return scan.nextDouble();

  }

//Проверка вершин на совпадения
  public static boolean checkVertexMatches(Point3d a, Point3d b, Point3d c){
    if (a.equals(b)||a.equals(c)||b.equals(c)){
      System.out.println("Two points are identical. It's not a triangle.");
      return false;
    }
    return true;
  }

//Вычисление площади
    public static double computerArea(Point3d vertexA, Point3d vertexB, Point3d vertexC){
      double lineA = vertexA.distanceTo(vertexB);
      double lineB = vertexB.distanceTo(vertexC);
      double lineC = vertexC.distanceTo(vertexA);

      double perimeter = (lineA + lineB + lineC)/2;

      return Math.sqrt(perimeter*(perimeter - lineA)*(perimeter - lineB)*(perimeter - lineC));

    }


  public static void main(String[] args) {
    System.out.println("Enter the value of vertex A: ");
    Point3d vertexA = new Point3d(getDouble(),getDouble(),getDouble());
    System.out.println("Enter the value of vertex B: ");
    Point3d vertexB = new Point3d(getDouble(),getDouble(),getDouble());
    System.out.println("Enter the value of vertex C: ");
    Point3d vertexC = new Point3d(getDouble(),getDouble(),getDouble());

    double area = 0;
    if(checkVertexMatches(vertexA,vertexB,vertexC)){
      area = computerArea(vertexA, vertexB, vertexC);
    };
    System.out.println("Area = " + area);

  }
}
