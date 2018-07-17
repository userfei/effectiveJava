package BuilderDemo;

public class NutritionFactsTest {

    public static void main(String[] args){

        // 静态内部类的实例化, 可以不需要先实例化外部类
        // 可选参数可以灵活增加
        NutritionFacts milk = new NutritionFacts.Builder(1,2)
                .calories(4)
                .fat(3).build();
    }
}
