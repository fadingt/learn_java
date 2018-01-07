package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import learn_java.Person;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException, Exception  {
//		Person p=new Person();
//		Class<Person> clazz=Person.class;
		Class<Person> clazz = (Class<Person>) Class.forName("learn_java.Person");
		Object p0 = clazz.newInstance();
		System.out.println(p0.toString());
		
		Constructor<Person> con=clazz.getConstructor(String.class,int.class);
		Person p1=con.newInstance("aa",45);
		System.out.println(p1.toString());
		
		Field age = clazz.getDeclaredField("age");
//		把name属性设置为public
		age.setAccessible(true);
		Object value = age.get(p1);
		System.out.println(value);

	}

}

