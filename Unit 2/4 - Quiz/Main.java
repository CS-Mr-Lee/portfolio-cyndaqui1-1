public class Main {
	public static void main(String[] args) {
		Human mrLee = new Human("Mr. Lee", 75, 100);
		Vegetable celery = new Vegetable("celery", 50, 10);
		Cookie chocoChip = new Cookie("chocolate chip cookie", 100, 488, false);
		Cookie macadamiaNut = new Cookie("macadamia nut cookie", 48, 230, true);
		Cookie raisinCookie = new Cookie("raisin cookie", 100, 401, false);
		mrLee.eat(macadamiaNut, 75);
		mrLee.eat(celery, 216358361580165);
		mrLee.eat(chocoChip, 80);
	}
}