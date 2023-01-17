public class FizzBuzzCalculator {
   public String fizzBuzzTranslate(int number) {
       if(number <= 0) return "Can nhap so nguyen duong lon hon 0";
       else if(number % 3 == 0 && number % 5 != 0) return "Fizz";
       else if(number % 5 == 0 && number % 3 != 0) return "Buzz";
       else if(number % 5 == 0 && number % 3 == 0) return "FizzBuzz";
       else return String.valueOf(number);

   }
    public String readFizzBuzzTranslate(int number) {
       int firstCharOfNumber = number / 10;
       int secondCharOfNumber = number % 10;
       if(number <= 0) return "Can nhap so nguyen duong tu 1 den 99";
       else if(number >= 100) return "Can nhap so nguyen duong tu 1 den 99";
       else if(firstCharOfNumber == 0) return readNumber(secondCharOfNumber);
       else return readNumber(firstCharOfNumber) + " " + readNumber(secondCharOfNumber);
    }
    public String readNumber(int number) {
       switch (number) {
           case 1:
               return "mot";
           case 2:
               return "hai";
           case 3:
               return "Fizz";
           case 4:
               return "bon";
           case 5:
               return "Buzz";
           case 6:
               return "sau";
           case 7:
               return "bay";
           case 8:
               return "tam";
           case 9:
               return "chin";
           default:
               return "muoi";
       }
    }

}