public class Context {

    //The Context maintains a reference to one of the concrete strategies and communicates with this object only via the strategy interface.

    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }




    public void executeStrategy(String text){
        strategy.execute(text);
    }

}
