package chapter8;

public interface Tire {

	public void roll(int i);

	default void kuemhoTireChange(int i) {

	};

	default void HankookTireChange(int i) {

	};
}
