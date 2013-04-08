public class I implements RomanNumber{

	private RomanNumber nextNumber;

	public I() {

	}

	public I(RomanNumber nextNumber) {
		this.nextNumber = nextNumber;
	}

	public int toNumeral() {
		if (nextNumber != null)
			return nextNumber.toNumeral() + value();
		return value();
	}

	private int value() {
		return 1;
	}

}
