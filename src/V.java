public class V implements RomanNumber {
	RomanNumber nextRomanNumber;

	public V() {
	}

	public V(RomanNumber nextRomanNumber) {
		this.nextRomanNumber = nextRomanNumber;
	}

	@Override
	public int toNumeral() {
		if (nextRomanNumber != null)
			return nextRomanNumber.toNumeral() + value();
		return value();
	}

	@Override
	public int value() {
		return 5;
	}

}
