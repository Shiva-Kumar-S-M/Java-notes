// class Pen {                            // class name starts with capital
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Writting Something");
//     }

//     public void printcolor(){              //function name starts with small words
//         System.out.println(this.color);
//     }

  


//     }


//     class Student{
//         String name;
//         int age ;

//         public void printInfo(){
//             System.out.println(this.name);
//             System.out.println(this.age);
//         }

//         // Student(){
//         //     System.out.println("constructor is called");         // non parameterised constructor
//         // }

//         Student(Student s2){                              // parameterized constructor
//             this.name=s2.name;                            // copy concatination
//             this.age=s2.age;
//         }
//         Student(){

//         }

//         }


// public class OOPS {
//     public static void main (String args[]) {
//         // Pen pen1 = new Pen();
//         // pen1.color="blue";
//         // pen1.type="gel";
//         // pen1.write();

//         // Pen pen2 = new Pen();
//         // pen2.color="red";
//         // pen2.type="ball";
//         // pen1.printcolor();
//         // pen2.printcolor();

//          Student s1 = new Student();
//          s1.name="Shivu";
//          s1.age=18;

//          Student s2 = new Student(s1);
//          s2.printInfo();
    



//     }
// }


// POLYMORPHISIM --OPERATOR OVERLOADING --- COMPILE TIME 


// class Student {
//     String name;
//     int age;


//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo(int age){
//         System.out.println(age);
//     }
//     public void printInfo(String name ,int age){
//         System.out.println(name+ " "+age);
//     }
// }

// public class OOPS{
//     public static void main(String args[]){
//         Student s1 =new Student();
//         s1.name="Batman";
//         s1.age=25;

//         s1.printInfo(s1.name,s1.age);
//     }
// }

// INHERITENCE  
//  class Shape{    // base class
//     String color;
//  }

//  class Triangle extends Shape{  //child class
    
//  }

//  public class OOPS{
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();
//         t1.color="Black";

        
//     }
//  }

// SINGLE LEVEL INHERITENCE 
class Shape{
    public void area (){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

public class OOPS{
    public static void main(String args[]){
        
    }
}