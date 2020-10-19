
public class John extends Person{
	
	private float alcoolInBlood = 0;
	
	public void drinkAlcool(String drink) {
		if(getAge() < 18) {
			System.out.println("You'are under age, kid");
		}else {
			switch(drink) {
				case "whisky":
					if(alcoolInBlood < 1.2) {
					alcoolInBlood += 0.4;
					System.out.println("Alcool in blood: " + alcoolInBlood);}
					else {
						System.out.println("you are to drunk!!");
					}
					break;
				case "Gin":
					if(alcoolInBlood < 1.5) {
						alcoolInBlood += 0.32;
						System.out.println("Alcool in blood: " + alcoolInBlood);}
						else {
							System.out.println("you are to drunk!!");
						}
						break;
				default:
					System.out.println("Not available :(");
			}
		}
	}

}
