class Book{

    int a ; 
    String b;

    public Book(int a , String b){

        this.a=a;
        this.b=b;
    }

    public Book(Book obj){

        this.a = obj.a;
        this.b= obj.b;
    }

    public static void main(String[]args){
        Book om = new Book(10,"Messi");
        Book om2 = new Book(om);

        System.out.println(om.a);
        System.out.println(om.b);
    }
}