class Point3d {

  private double x;
  private double y;
  private double z;

  //Конструктор по умолчанию
  public Point3d(){
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }
  //Конструктор с параметрами
  public Point3d(double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  //[Begin] возможность получениея и изменения всех трех значений по отдельности
  public double getX() {
    return x;
  }

  public  void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public  void setY(double y) {
    this.y = y;
  }

  public double getZ() {
    return z;
  }

  public  void setZ(double z) {
    this.z = z;
  }
  //[end] возможность получениея и изменения всех трех значений по отдельности

  public double distanceTo(Point3d other) {
    return Math.sqrt((x - other.getX())*(x - other.getX())
                   + (y - other.getY())*(y - other.getY())
                   + (z - other.getZ())*(z - other.getZ()));

  }
  public boolean equals(Point3d other) {
    if (this.x == other.x & this.y == other.y & this.z == other.z)
      return true;
    else
      return false;
  }

}
