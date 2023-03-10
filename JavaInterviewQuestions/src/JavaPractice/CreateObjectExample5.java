package JavaPractice;

import java.lang.reflect.Constructor;

public class CreateObjectExample5 {
	
	/** Using newInstance() Method of Constructor class, It is known as a reflective 
	 * way to create objects. */
	
	private String str;

	CreateObjectExample5() {
	}

	public void setName(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		try {
			Constructor<CreateObjectExample5> constructor = CreateObjectExample5.class.getDeclaredConstructor();
			CreateObjectExample5 r = constructor.newInstance();
			r.setName("JavaTpoint");
			System.out.println(r.str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}