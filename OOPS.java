class Pen {                            // class name starts with capital
    String color;
    String type;

    public void write(){
        System.out.println("Writting Something");
    }

    public void printcolor(){              //function name starts with small words
        System.out.println(this.color);
    }

  


    }


    class Student{
        String name;
        int age ;

        public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }

        // Student(){
        //     System.out.println("constructor is called");         // non parameterised constructor
        // }

        Student(String name,int age){                              // parameterized constructor
            this.name=name;
            this.age=age;
        }

        }


public class OOPS {
    public static void main (String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color="blue";
        // pen1.type="gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color="red";
        // pen2.type="ball";
        // pen1.printcolor();
        // pen2.printcolor();

         Student s1 = new Student("shivu",19);
         

         s1.printInfo();
    



    }
}