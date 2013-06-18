package pizzapack;

public class NYPizzaStore extends PizzaStore{

	
	protected Pizza createPizza(String item) {
		if (item.equalsIgnoreCase("cheese")) {
			return new NYStyleCheesePizza();
		} 		if (item.equalsIgnoreCase("veggie")) {
			return new NYStyleVeggiePizza();
		} 		if (item.equalsIgnoreCase("clam")) {
			return new NYStyleClamPizza();
		} 		if (item.equalsIgnoreCase("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
	
}
