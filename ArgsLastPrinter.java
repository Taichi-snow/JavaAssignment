public class ArgsLastPrinter {
  public static void main(String[] args) {
    int i = args.length - 1;
    if (args.length != 0) {
      System.out.println(args[i]);
    } else {
      System.out.println("なし");
    }
  }
}
