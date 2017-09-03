package options;

public class Options implements Option{
	protected double price=0d;
	protected String name="";
	public double getPrice(){
		return this.price;
	}
	public String toString(){
		String str;
		str = this.name+" ("+this.price+"€)";
		return str;
	}
}
