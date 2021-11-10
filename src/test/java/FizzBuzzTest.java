import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest  {
//    @Test
//    public void testFizzBuzz(){
//        int startNumber = 1;
//        int endNumber =10 ;
//
//        int [] expectedResult = {1,2,3,4,5,6,7,8,9,10};
//
//
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        int [] actualResult = fizzBuzz.fizzbuzz(startNumber,endNumber);
//
//
//        Assert.assertArrayEquals(expectedResult,actualResult);

    @Test
    public void testFizzBuzz(){
        int startNumber = 1;
        int endNumber =15 ;

        String[] expectedResult = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Buzz"};


        FizzBuzz fizzBuzzobj = new FizzBuzz();
         String [] actualResult = fizzBuzzobj.fizzBuzz(startNumber,endNumber);


        Assert.assertArrayEquals(expectedResult,actualResult);




    }
}
