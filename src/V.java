public class V implements RomanNumber {
	RomanNumber nextRomanNumber;

	public V() {
		this(new NextEmptyNumber());
	}

	public V(RomanNumber nextRomanNumber) {
		this.nextRomanNumber = nextRomanNumber;
	}

	@Override
	public int toNumeral() {
		if (nextRomanNumber.value() == 5)
			throw new IllegalArgumentException("VV is not valid");
		return nextRomanNumber.toNumeral() + value();
	}

	@Override
	public int value() {
		return 5;
	}

}
