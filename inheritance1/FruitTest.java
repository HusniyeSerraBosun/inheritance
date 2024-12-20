package inheritance1;

public class FruitTest extends Fruit{
	
	@Override
	public void fruitColor() {
		super.fruitColor();
		System.out.println("Also I like strawberry :D");
	}
	public static void main(String[] args) {
		FruitTest fruit=new FruitTest();
		
		fruit.fruitColor();
	}
}
