import lombok.Getter;

public class Main {
  @Getter
  private static final String test = "test";

  public static void main(String[] args) {
    System.out.printf("Hello World, this is a %s", Main.getTest());
  }
}