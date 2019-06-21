//Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU


//Threads can be created by using two mechanisms :
//1. Extending the Thread class
//2. Implementing the Runnable Interface


// 1.Runnable Interface
/*
class A implements Runnable{
    public void run(){  //override Runable's run, now refer var of Runnable can create obj of A
        for(int i=0;i<10;i++){
            System.out.println("A : " + i);
        }
    }
}

class B implements Runnable{
    public void run(){  //override
        for(int i=0;i<10;i++){
            System.out.println("B : " + i);
        }
    }
}

public class Sag
{
    public static void main(String [] args)
    {
        Runnable a = new A();
        Thread th1 = new Thread(a);

        Runnable b = new B();
        Thread th2 = new Thread(b);
        th1.start();
        th2.start();
    }
}
*/

//2.Thread class

class A extends Thread{
    public void run(){  //override Runable's run, now refer var of Runnable can create obj of A
        for(int i=0;i<10;i++){
            System.out.println("A : " + i);
        }
    }
}

class B extends Thread{
    public void run(){  //override
        for(int i=0;i<10;i++){
            System.out.println("B : " + i);
        }
    }
}

public class Sag
{
    public static void main(String [] args)
    {
        A a = new A();  //a can access all methods of Thread Class bcoz we have extended it
        B b = new B();
        a.start();
        b.start();
    }
}

/*
States of thread :-
1.New   -not run even once
2.Runnable  -running currently
3.Unrunnable    -reasons are below
Blocked
Waiting
Timed Waiting
I/O operation
4.Dead

*/

//diff bet runnable and thread implementation
//runnable allows multiple inheritance Thread class doesnot
//unlike Thread, Runnable cannot access methods like yield