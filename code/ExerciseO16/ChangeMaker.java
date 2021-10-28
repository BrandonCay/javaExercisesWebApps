//Using the following definition of the
abstract class ChangeMaker {

    private int val1;

    private int val2;

    public ChangeMaker()

    {

        val1 = 0;

        val2 = 0;

    }

    public ChangeMaker(int n1, int n2)

    {

        val1 = n1;

        val2 = n2;

    }

    public int getVal1()

    {

        return val1;

    }

    public int getVal2()

    {

        return val2;

    }

    public void setValues(int num1, int num2)

    {

        val1 = num1;

        val2 = num2;

    }

    public abstract void makeChanges(); // abstract method

    @Override
    public String toString()

    {

        String s = "\nval1=" + val1 + "\nval2 =" + val2;

        return (s);

    }

}
