final class LateRide {
	public static void main(String[] args) {
		System.out.println(new LateRide().lateRide(1243));
	}
	int lateRide(int n) {
	    return ((n / 60)+""+(n % 60)).chars()
	    .map(e -> Integer.parseInt((char)e+"")).sum();
	}
}