public 
void main(){
    int n = Integer.parseInt(IO.readln("Enter a number: "));
    int count = 0;
    while(n != 0){
        int digit = n % 10;
        count++;
        n /= 10;
    }
    IO.println("Number of digits: "+ count);
}

/**
 * ATM PIN Digit Counter
    * Description
    * A bank’s ATM software needs to verify how many digits a customer’s PIN contains before processing it.

Class Name
-----------------
PinValidator

Method Details
--------------------
Method Name: countDigits
Parameter: int number
Return Type: void
Variable Used:
digitCount -> stores the number of digits

Requirement :

Use a loop to repeatedly divide the number by 10
Increment digitCount on each division
Stop when the number becomes 0
Print the final digit count
Examples
Example 1:

Input

Enter your ATM PIN: 1353
Output

Number of digits: 4
Example 2:

Input

Enter your ATM PIN: 12456
Output

Number of digits: 5
Explanation

Count digits by dividing number by 10 repeatedly
Constraints
The PIN number is a positive integer.
The number of digits can vary (typically 4–6 for most ATMs).
You must use a variable digitCount to store the number of digits.
Use loops or mathematical operations to calculate the number of digits
 */