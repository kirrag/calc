public class Main {
	public static void main(String[] args) {
		Calculator calc = Calculator.instance.get();

		int a = calc.plus.apply(1, 2);
		calc.println.accept(a);
		int b = calc.minus.apply(1, 1);
		calc.println.accept(b);
		try {
			int c = calc.devide.apply(a, b);
			calc.println.accept(c);
		} catch (ArithmeticException e) {
			System.out.println("Ошибка: Деление на ноль:" + e);
		}
	}
}
