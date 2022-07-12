import java.util.stream.IntStream;
 
public class Soal1 
{
  public static void main(String[] args) 
  {
    fizzBuzz_(200);
  }
  private static void fizzBuzz_(int num) {
    IntStream.rangeClosed(1, 200)
        .mapToObj(i -> i % 5 == 0 ? (i % 11 == 0 ? "FizzBuzz" : "Fizz") : (i % 11 == 0 ? "Buzz" : i))
        .forEach(System.out::println);
  }
}