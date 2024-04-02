
public class HelloWorld {

	public static void main(String[] args) {
		int sum = SumFunction.sum(10, 20);
		String string = SimpleString.simpleString();
		System.out.println(string);
		SimpleStringVoid.simpleStringFunction("Phyo Khant Kyaw");
		System.out.println("The result is " + sum);
		SumVoidFunction.sumFunction();
		CharDemo.charMethod();
	}
}
