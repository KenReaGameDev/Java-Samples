package pizzapack;

public class PizzaTestDrive {


	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("First Customer Ordered: " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Second customer Ordered: " + pizza.getName() + "\n");
		
		pizza = californiaStore.orderPizza("cheese");
		System.out.println("Third customer Ordered: " + pizza.getName() + "\n");
	}

}
