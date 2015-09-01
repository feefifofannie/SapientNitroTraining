package polyexamples;

public class Finance{
	public void processSalary(Employee e){
		e.netSalary();
		if (e instanceof Confirmed){
			Confirmed conf = (Confirmed) e;  //downcast
			conf.transport();
		}
	}
}