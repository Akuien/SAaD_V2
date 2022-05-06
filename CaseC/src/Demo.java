

public class Demo {


    //code adapted from https://refactoring.guru/design-patterns/strategy

    //The Client creates a specific strategy object and passes it to the context.
    // The context exposes a setter which lets clients replace the strategy associated with the context at runtime.

    private static Context context = new Context();
    private static SortingStrategy strategy;


    public static void main(String[] args) {
        strategy = new BruteForceStrategy();
        context.setStrategy(strategy);
        context.executeStrategy("Paste example paragraph here!");
    }



}






