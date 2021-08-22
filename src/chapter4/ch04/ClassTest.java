package chapter4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("chapter4.ch04.Person");

        Person person = (Person) c1.newInstance();

        person.setName("Lee");
        System.out.println("person = " + person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println("p = " + p);

        Class[] param = {String.class};
        Constructor constructor = c2.getConstructor(param);

        Object[] initargs = {"Kim"};
        Person kim = (Person) constructor.newInstance(initargs);
        System.out.println("kim = " + kim);

        Person kim2 = new Person("kim");
    }
}
