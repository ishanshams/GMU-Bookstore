
public class Course {

    public static int getNumCourses() {
        return numCourses;
    }
    private String courseName;
    private String courseText;
    private int textStock;

    private static int numCourses = 0;
    
    public Course(){
        this("");
        
    }
    
    public Course(String name) {
        this.courseName = name;
        numCourses++;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public void setCourseText(String courseText) {
        this.courseText = courseText;
    }

    public void setTextStock(int textStock) {
        this.textStock = textStock;
    }

    public String getCourseName() {
        return courseName;
    }


    public String getCourseText() {
        return courseText;
    }

    public int getTextStock() {
        return textStock;
    }
    
    
}
