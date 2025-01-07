public class CallClass {

    public static void main(String[]args){

        ReceiveClass om = new ReceiveClass();

        om.name = "Amit";
        om.empno=14;
        om.age=38;
        om.sal=2900;
        
        System.out.println("EMPLOY NUMBER : " +om.empno);
        System.out.println("NAME : " + om.name);
        System.out.println("AGE : " + om.age);
        System.out.println("SALARY : " +om.sal);

        System.out.println();// new line
        
        abc(); 
    }

    public static void abc(){

        ReceiveClass sm = new ReceiveClass();

        sm.empno=07;
        sm.name = "Smit";
        sm.age=22;
        sm.sal=1900;
       
        System.out.println("EMPLOY NUMBER : " +sm.empno);
        System.out.println("NAME : " + sm.name);
        System.out.println("AGE : " + sm.age);
        System.out.println("SALARY : " +sm.sal);
       
    
    }

    
}
