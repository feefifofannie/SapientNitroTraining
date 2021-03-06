package overriding;

import java.sql.SQLException;
import java.io.EOFException;
import java.io.IOException;


class Base {
	public void test() throws SQLException, IOException {
		System.out.println("Base");
	}
}

/*
 * Overriding method can throw: 
 * 		no exception
 * 		one or more of the of the exceptions thrown by the overriden method
 * 		any subclasses of the exceptions thrown in 
 * Overriding method cannot throw: 
 * 		additional exceptions
 * 		superclasses or the exceptions thrown in the overriden method
 */
class Derived extends Base {
	public void test() throws EOFException {
		System.out.println("Derived");  //EOF is subclass of IO
	}
}

public class ExceptionOverride {
	public static void main(String[] args) {
		Base b = new Base();
		try {
			b.test();
		} catch (IOException e){
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
