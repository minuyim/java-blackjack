package domain.gamer;

public class Name {
	private final String name;

	public Name(String name) {
		validate(name);
		this.name = name;
	}

	private void validate(String name) {
		if (name.matches(".*\\s.*")) {
			throw new IllegalArgumentException("이름에 공백이 들어가면 안됩니다.");
		}
	}
}
