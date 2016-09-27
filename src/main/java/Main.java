
import java.util.Date;
  
  import io.github.lucasvenez.ormclass.dao.OrderDAO;
 import io.github.lucasvenez.ormclass.model.Category;
import io.github.lucasvenez.ormclass.model.City;
import io.github.lucasvenez.ormclass.model.Country;
import io.github.lucasvenez.ormclass.model.Order;
 import io.github.lucasvenez.ormclass.model.OrderItem;
  import io.github.lucasvenez.ormclass.model.Person;
 import io.github.lucasvenez.ormclass.model.Product;
import io.github.lucasvenez.ormclass.model.State;
  
  public class Main {
  
  	public static void main(String[] args) {
  		
  		
  		
 		Person person = new Person("José Viciado");
 		person.setCity(new City("Caraguatatuba", new State("São Paulo", new Country("Brazil"))));
 		Category games =  new Category("Games");
 		Product prod1 = new Product("Playstation 4",2000.00, games);
 		Product prod2 = new Product("Xbox One", 1700.00, games);
 		Product prod3 = new Product("Nintendo Wii U", 00.00, games);
 		Order order = new Order(new Date(), new Date(), person);
 		order.addOrderItem(new OrderItem(order, prod1, 1));
 		order.addOrderItem(new OrderItem(order, prod2, 1));
 		order.addOrderItem(new OrderItem(order, prod3, 1));
  		OrderDAO dao = new OrderDAO(); 		
  		dao.persist(order);
  	}
  }
  