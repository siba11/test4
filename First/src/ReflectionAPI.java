import java.lang.reflect.Method;

public class ReflectionAPI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x= "sampletest";
Method method= ReflectionAPI.class.getmethod(x,String.class);
method.invoke(method,"hello");


	}
public static void sampletest(String x) {
		
}
}
	