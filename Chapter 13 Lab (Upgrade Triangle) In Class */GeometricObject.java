import java.util.Date;

public abstract class GeometricObject {
  private Color color;
  private boolean filled = false;
  private Date dateCreated = new Date();
      
  public GeometricObject() {};
  
  public GeometricObject(Color color, boolean filled) {
    super();
    this.color = color;
    this.filled = filled;
  }
  public Color getColor() {
    return color;
  }
  public void setColor(Color color) {
    this.color = color;
  }
  public boolean isFilled() {
    return filled;
  }
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  public Date getDateCreated() {
    return dateCreated;
  };
  
  public String toString() {
    return "created on " + getDateCreated() + " color: " + getColor() + " and filled: " + isFilled();
  }
  
  public abstract double calculateArea();
  public abstract double calculatePerimeter();
  
  
  
  
}
