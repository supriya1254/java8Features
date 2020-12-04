package com.learn;

//this keyword with lamda will point to the class where its method belongs.
//like execute method is calling from ThisReferenceTest class.so this keyword will point to this class.

public class ThisReferenceTest {
    public void doProcess(int i, Process p)
    {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("the value of i is : " + i);
            System.out.println(this);


        });
    }
    public static void main(String[] args) {

        ThisReferenceTest thisReferenceTest = new ThisReferenceTest();
        thisReferenceTest.doProcess(10,i ->{
                System.out.println("the value of i is : " + i );
                //System.out.println(this);

        });
        thisReferenceTest.execute();

    }
}

interface Process
{
    void process(int i);
}
