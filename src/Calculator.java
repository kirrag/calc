import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Calculator {
	static Supplier<Calculator> instance = Calculator::new;

	BinaryOperator<Integer> plus = (x, y) -> x + y;
	BinaryOperator<Integer> minus = (x, y) -> x - y;
	BinaryOperator<Integer> multipy = (x, y) -> x * y;
	BinaryOperator<Integer> devide = (x, y) -> {
		try {
			return x / y;
		} catch (ArithmeticException  e) {
			throw new RuntimeException(e);
		}
	};
	
	UnaryOperator<Integer> pow = x -> x * x;
	UnaryOperator<Integer> abs = x -> x > 0 ? x: x * -1;

	Predicate<Integer> isPositive = x -> x > 0;

	Consumer<Integer> println = System.out::println;
}

