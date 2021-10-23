class Main {
  public static void main(String args[]) throws java.io.IOException {
    browserlexer b = new browserlexer(new java.io.InputStreamReader(System.in));
    while (b.yylex() != -1) {}
  } 
}