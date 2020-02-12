package Test;

public class DeepCopyTest {

	public static void main(String[] args) {
		
		try {
            PersonalInfo org =
                      	new PersonalInfo("James", 22, "SimpeSound", "encoding");

            PersonalInfo cpy = org.clone();
			
	    org.showPersonalInfo();
            cpy.showPersonalInfo();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }


	}

}
