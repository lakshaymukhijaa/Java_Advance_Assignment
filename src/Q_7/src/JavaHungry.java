
public class JavaHungry {
    public static void main(String args[])
    {
        try
        {
            int arr[]= {1, 2, 3, 4, 5};            for (int i = 0; i <= 5; i++)
            {
                System.out.print ("Array elements are : " + arr[i] + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println ("Exception : " + e);
        }

            This line will give an exception
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println ("ArrayIndexOutOfBoundsException : "+ ex);
        }
    }
}


           Explaination

output: Exception 'java.lang.ArrayIndexOutOfBoundsException' has already been caught

Explaination : It shows Exception because we already declare the Super class of Exception
        in the first catch block(Exception e) i.e a parent class of ArrayIndexOutOfBoundsException.
        We can handle this exception : if we declare ArrayIndexOutOfBoundsException in first catch block.
        We have to define the Exception class at the last catch