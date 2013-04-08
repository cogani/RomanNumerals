public class I implements RomanNumber {

	private RomanNumber nextNumber;

	public I() {
		this(new NextEmptyNumber());
	}

	public I(RomanNumber nextNumber) {
		this.nextNumber = nextNumber;
	}

	public int toNumeral() {
		if (nextNumber.value() == 5)
			return nextNumber.toNumeral() - value();
		else
			return nextNumber.toNumeral() + value();
	}

	public int value() {
		return 1;
	}

}
