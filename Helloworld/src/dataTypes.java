public class dataTypes {

    public static void main (String [] args){

        int id = 8147;
        String name = "VIGNESH";
        double GPA = 9.65;
        boolean isPassed = true;
        char Gender = 'M';

//        datatypes --> int, char,double,boolean are Primitive data types whereas String & objects are Reference data types
//
//        Primitives Stored In Stack Memory
//        Reference are stored In Heap Memory

        System.out.println ("The Person gender is :" +Gender);

//        if(isPassed){
            System.out.println("The id no. " + id + " with Name " + name + " is passed with an score of " + GPA + "!.");
//        }
//        else {
            System.out.println("The id no. " + id + " with Name " + name + " has failed");
//        }
    }

}
