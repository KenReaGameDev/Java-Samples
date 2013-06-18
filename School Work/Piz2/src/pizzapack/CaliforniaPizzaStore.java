package pizzapack;

public class CaliforniaPizzaStore extends PizzaStore{
	
	protected Pizza createPizza(String item) {
		if (item.equalsIgnoreCase("cheese")) {
			return new CaliforniaStyleCheesePizza();
		} 		if (item.equalsIgnoreCase("clam")) {
			return new CaliforniaStyleClamPizza();
		} 		if (item.equalsIgnoreCase("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		} else return null;
	}
}
