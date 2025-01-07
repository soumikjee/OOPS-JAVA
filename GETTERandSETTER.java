public  class GETTERandSETTER {
    public static void main(String[] args) {
        Person om = new Person();

        // Using setter methods to set values
        om.setName("John");
        om.setAge(25);

        // Using getter methods to get values
        System.out.println("Name : " + om.getName());
        System.out.println("Age : " + om.getAge());
    }
}
        
    class Person {
        // Private fields
        private String name;
        private int age;
    
        // Getter for name
        public String getName() {
            return name;
        }
    
        // Setter for name
        public void setName(String name) {
            this.name = name;
        }
    
        // Getter for age
        public int getAge() {
            return age;
        }
    
        // Setter for age
        public void setAge(int age) {
            if (age > 0) { // Simple validation
                this.age = age;
            } else {
                System.out.println("Age must be positive.");
            }
        }
    }
    
   
  
    

