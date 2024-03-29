public class Basic extends Decorator {
    Beverage beverage;

    public Basic(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " without milk and cook time > 2 minutes";
    }
}
