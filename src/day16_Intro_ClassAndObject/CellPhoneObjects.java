package day16_Intro_ClassAndObject;

public class CellPhoneObjects {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		CellPhone cellphone = new CellPhone();
		
		cellphone.brand="apple";
		
		System.out.println(cellphone.brand);
		
		cellphone.color="silver";
		cellphone.price=1200;
		System.out.println(cellphone.screenSize);
		
		cellphone.call();
		cellphone.message();
		cellphone.takeAphoto();

	}

}
