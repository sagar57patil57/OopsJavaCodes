//can have CONSTRUCTOR
//cannot be instantiated
//can be made ref var.In this case only fun that are inside the abstract class will be accessible

/*abstract class Person{ //cannot make obj of Person
    abstract void show();
}

abstract class A extends Person{ //now show is inherited in A as well thus we need to make A as abstract class as well and we cannot make obj of A
    int x;
}

public class Sag
{
    public static void main(String [] args)
    {
        //A obj1 = new A(); this is ILLEGAL
    }
}
*/


//how to avoid child class to become abstract

abstract class Person{ //cannot make obj of Person
    abstract void show();
}

class Student extends Person{ //now show is inherited in A as well thus we need to make A as abstract class as well and we cannot make obj of A
    public void show(){ //WE OVERRIDE IT so that Person is not abstract
        System.out.println("I am not abstract anymore");
    } 
}

class Teacher extends Person{ //now show is inherited in A as well thus we need to make A as abstract class as well and we cannot make obj of A
    public void show(){ //WE OVERRIDE IT so that Person is not abstract
        System.out.println("I am also not abstract anymore");
    } 
}

public class Sag
{
    public static void main(String [] args)
    {
        Student stud1 = new Student();
        Teacher tr1 = new Teacher();
        stud1.show();
        tr1.show();
    }
}