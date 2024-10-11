package d13array.arraylist_methotcreation;

public class ExampleStatic {


    public static void main(String[] args) {
        ExampleStatic myIns = new ExampleStatic();

        myIns.printText("Hello");

        //When the method is non-static; we need to create an instance/object to call method
        //Bcs non-static members belong to objects whereas static members belong to class directly...

    }


    public void printText(String str){

        System.out.println(str);
        //if a method does not create a new data, return type will be "void"
        //which means dont use return keyword in body
        //and dont declare any data type in method declaration as return type
        //argument (data comes through parameter) is taken and just printed....
    }



}
