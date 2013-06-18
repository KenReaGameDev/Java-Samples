package pizzapack;

public class ChicagoPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item) {
		if (item.equalsIgnoreCase("cheese")) {
			return new ChicagoStyleCheesePizza();
		} 		if (item.equalsIgnoreCase("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} 		if (item.equalsIgnoreCase("clam")) {
			return new ChicagoStyleClamPizza();
		} 		if (item.equalsIgnoreCase("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}
}
