public class Cow extends Producer {
	protected String eats = "hay";
	protected String says = "moo";
	protected String gives = "milk";
	public Cow(String name) {
		super(name, "hay", "moo", "milk");
	}
}