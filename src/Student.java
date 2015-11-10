public class Student {

    public static int getNumStudents() {
        return numStudents;
    }
    private String firstName;
    private String lastName;
    private String gNumber;
    private String password;
    private String phoneNumber;
    private String email;
    private String username;
    private String shippingAddress;
    
    private int numCourses = 0;
    private Course[] courses = new Course [10];
    private static int numStudents = 0;
    
    
    public Student() {
        this("");
    }
    
    public Student(String username) {
        this.username = username;
        numStudents++;
    }

    public Boolean setFirstName(String firstName) {
        if (firstName.length() == 0) {
            return false;
        }
        else {
            this.firstName = firstName;  
            return true;
        }
    }

    public Boolean setLastName(String lastName) {
        if (lastName.length() == 0) {
            return false;
        }
        else {
            this.lastName = lastName;  
            return true;
        }
    }
    private static boolean input(String inputCheck) {
        return inputCheck.trim().length() == 0;
        }
    
    private boolean isValidgNumber(String gNumber) {
      if (gNumber.length() != 8) {
         return false;
      }
      else {
         for (int x = 0; x < gNumber.length(); x++) {
            
               if (!Character.isDigit(gNumber.charAt(x))) {
                  return false;
               }
            
         }
      }
      return true;
   }
    
    private boolean isValidPhoneNumber(String phoneNumber) {
      if (phoneNumber.length() != 10) {
         return false;
      }
      else {
         for (int x = 0; x < phoneNumber.length(); x++) {
            
               if (!Character.isDigit(phoneNumber.charAt(x))) {
                  return false;
               }
            
         }
      }
      return true;
   }


    public Boolean setgNumber(String gNumber) {
        if (!input(gNumber) && isValidgNumber(gNumber)) {
            this.gNumber = gNumber;
            return true;
        }
        else {
            return false;
        } 
    }

    public Boolean setPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        else {
           this.password = password;
           return true;
        }
        
    }

    public Boolean setPhoneNumber(String phoneNumber) {
        if (!input(phoneNumber) && isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
            return true;
        }
        else {
            return false;
        } 

    }

    public Boolean setEmail(String email) {
        if(email.contains("@")&&(email.contains("."))&&(email.indexOf('@') < email.indexOf('.'))) {
        this.email = email;
        return true;
        }
        else {
            return false;
        }
        
    }

    public Boolean setShippingAddress(String shippingAddress) {
        if(shippingAddress.length() == 0) {
            return false;
        }
        else {
        this.shippingAddress = shippingAddress;
        return true;
        }
    }
    
    public boolean setUsername(String username){
    	if (username.length() == 0){
    		return false;
    	}
    	else{
    		this.username = username;
    		return true;
    	}
    }

    public void addCourse(Course acourse) {
        this.courses[numCourses++] = acourse; 
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getgNumber() {
        return gNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }
    
    public String getUsername(){
    	return username;
    }
    public String getCourses() {
        String output = "";
        for(int i =0; i < numCourses; i++) {
            output += courses[i].getCourseName() + "\n";
        }
        return output;
    }
    
    public String toString() {
        return "Student Name: " + getFirstName() + ", " + getLastName() + "\n"
                + "Student GNumber: " + getgNumber() + "\n"
                + "Student's list of Courses: " + getCourses();
    }
    
}