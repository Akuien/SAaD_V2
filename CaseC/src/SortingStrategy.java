public interface SortingStrategy {


    //The Client creates a specific strategy object and passes it to the context.
    // The context exposes a setter which lets clients replace the strategy associated with the context at runtime.

    public int getCount();
    public void execute(String text);


}
