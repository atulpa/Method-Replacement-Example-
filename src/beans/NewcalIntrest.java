package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewcalIntrest implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method m, Object[] param) throws Throwable {
		System.out.println("NewcalIntrest class new alIntrest implemantation");
		return o;
	}

}
