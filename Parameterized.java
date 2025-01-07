public class Parameterized {

    String name ; 
    int age ; 

    public Parameterized(String name , int age ){

        this.name= name; // name = x 
        this.age=age;


    }

    public static void main(String[]args){

        Parameterized  ref = new Parameterized("Soumik" , 19); // pass element

        System.out.println(ref.name); // Soumik
        System.out.println(ref.age);  // 19

    }
    
}
