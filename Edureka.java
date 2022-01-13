public class Edureka {
    String studentName;
    int studentAge;
    Edureka(String name, int age){
        studentName= name;
        studentAge= age;
    }
    void display(){
        System.out.println(studentName+" "+studentAge);
    }
    public static void main(String[]args){
        Edureka myObj =new Edureka("Manan",19);
        myObj.display();
    }
}
