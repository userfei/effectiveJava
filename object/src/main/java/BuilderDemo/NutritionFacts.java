package BuilderDemo;

/**
 *    构建器模式： 当对象包含多个构造器参数且参数可选时, 建议使用
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;

    private NutritionFacts(Builder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
    }

    public static class Builder{
        // required parameters
        private final int servingSize;
        private final int servings;

        // optional parameters
        private  int calories = 0;
        private  int fat = 0;

        // 将必须的参数放入 builder 构造器中
        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int var1){
            calories = var1;
            return this;
        }

        public Builder fat(int var2){
            fat = var2;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
}
