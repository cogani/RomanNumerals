public class I implements RomanNumber{

	private RomanNumber nextNumber;

	public I() {

	}

	public I(RomanNumber nextNumber) {
		this.nextNumber = nextNumber;
	}

	public int toNumeral() {
		if (nextNumber != null)
			if(nextNumber.value()== 5 )
			return nextNumber.toNumeral() - value();
			else return nextNumber.toNumeral() + value();
		
		return value();
	}

	public int value() {
		return 1;
	}

}
