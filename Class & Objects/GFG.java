// public class Dog {
//     // Instance Variables
//     String name;
//     String breed;
//     int age;
//     String color;

//     // Constructor Declaration of Class
//     public Dog(String name, String breed, int age,
//                String color)
//     {
//         this.name = name;
//         this.breed = breed;
//         this.age = age;
//         this.color = color;
//     }

//     // method 1
//     public String getName() { return name; }

//     // method 2
//     public String getBreed() { return breed; }

//     // method 3
//     public int getAge() { return age; }

//     // method 4
//     public String getColor() { return color; }

//     @Override public String toString()
//     {
//         return ("Hi my name is " + this.getName()
//                 + ".\nMy breed,age and color are "
//                 + this.getBreed() + "," + this.getAge()
//                 + "," + this.getColor());
//     }

//     public static void main(String[] args)
//     {
//         Dog tuffy
//             = new Dog("tuffy", "papillon", 5, "white");
//         System.out.println(tuffy.toString());
//     }
// }

// Output
// Hi my name is tuffy.
// My breed,age and color are papillon,5,white
// Initialize by using method/function:





public class GFG {
    // sw=software
    static String sw_name;
    static float sw_price;

    static void set(String n, float p)
    {
        sw_name = n;
        sw_price = p;
    }

    static void get()
    {
        System.out.println("Software name is: " + sw_name);
        System.out.println("Software price is: "
                           + sw_price);
    }

    public static void main(String args[])
    {
        GFG.set("Visual studio", 0.0f);
        GFG.get();
    }
}


// The java.jdt.ls.java.home variable defined in Visual Studio Code settings points to a missing or inaccessible folder (c:\Users\Sharan\AppData\Local\Programs\Microsoft VS Code\jdk-17)