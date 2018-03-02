package designpatterns.builder;

public class BuilderUser {
    private static ConstructorPolluted cpWithA1A2;
    private static ConstructorPolluted cpWithA3A4;

    public static void main(String args[]) {
        cpWithA1A2 = new ConstructorPolluted.Builder().withA1("a1").withA2("a2").build();
        cpWithA3A4 = new ConstructorPolluted.Builder().withA3("a3").withA4("a4").build();
    }
}
