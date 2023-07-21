
public class Compartment {
	public abstract String showNotice();

}
class FirstClass extends Compartment{
	@Override
	public String showNotice() {
		return "you are in first Class Compartment";
		
	}
}
class GeneralClass extends Compartment{
	@Override
	public String showNotice() {
		return "you are in General";
	}
}
class Ladies extends Compartment{
	@Override
}