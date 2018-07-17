/**
 * @author feiyue
 * @className Animal
 * @description
 * @date 2018/7/17
 **/
public class Animal {

    private String name;

    // 父类只有私有构造器, 导致无法子类化
    // private Animal(){}

    // 静态工厂方法创建实例的优势-3
    public static Animal newAnimal(String name){
        return new Dog(name);
    }
}
