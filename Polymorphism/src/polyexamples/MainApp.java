/**
 * 
 */
package polyexamples;



/**
 * @author dredmo
 * 
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr = new HR();
		Finance f = new Finance();
		Employee emp = hr.recruit("C");     //upcast

		if (emp != null) {
			f.processSalary(emp);
		}
		emp = hr.recruit("I");
		if (emp != null) {
			f.processSalary(emp);
		}
		emp = hr.recruit("T");
		if (emp != null) {
			f.processSalary(emp);
		}
	}

}
