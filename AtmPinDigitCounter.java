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