import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Function Name : CountDigits
//    Description   : Accepts an integer and returns the total number of digits present in the given number.
//                    Handles negative numbers by converting them to their positive equivalent.
//    Input         : iNo (Integer)
//    Output        : Returns the count of digits in the given number.
//                    Example: Input  = 12345
//                             Output = 5
//    Author        : Siddharth Santosh Malakar
//    Date          : 24/10/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Digit
{
    public int Countdigits(int iNo)
    {
        int iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {             
            iNo = iNo / 10;                      
            iCount++;
        }
        return iCount;
    } 
}

class program127
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int iRet = 0;
        Digit digit = new Digit();

        System.out.println("Enter number : ");
        int iValue = scanner.nextInt();

        iRet = digit.Countdigits(iValue);

        System.out.println("Number of digits : " +iRet);
        
    }
}
