public class VideoStoreLauncher {
	
	public static void main(String[] args) {
		// Test a Video.
		VideoStore vid1 = new VideoStore();
		vid1.setTitle("The Godfather");
		vid1.addRating(3);
		vid1.addRating(2);
		vid1.addRating(5);
		
		System.out.println(vid1.getTitle() + ": " + vid1.getRating());

		vid1.checkOut();
		getStatus(vid1);
		vid1.returnToStore();
		getStatus(vid1);

		} //end of main() method

	public static void getStatus(VideoStore v) {
		if(v.isCheckedOut()) {
			System.out.println("\'" + v.getTitle() + "\' is checked out.");
		} else {
			System.out.println("\'" + v.getTitle() + "\' is on shelves.");
		} // end if else
	} // end of getStatus()
	
} //end of classVideoStoreLauncher