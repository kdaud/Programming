package Patients;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException,
			InvocationTargetException {
		Class c = Class.forName("Patients.Children");
		Children cc = (Children)c.newInstance();
Method m = c.getDeclaredMethod("showPrivate",null);
m.setAccessible(true);
m.invoke(cc,null);

}
}
