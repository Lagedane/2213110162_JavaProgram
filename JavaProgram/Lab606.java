import javax.swing.JOptionPane;

public class Lab606 {
	public static void main(String[] args) {
		int nums[] = {25, 78, 41, 22, 36, 85, 37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array"));
		while(index < 0 || index > (nums.length-1)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again"));
		} // end of WHILE
		JOptionPane.showMessageDialog(null, 
				/*"Current data, nums[" + index + "] is " + currentData(nums, index) + "\n" +
				 *((prevData(nums, index) == nums[index-1]) 
				 * ? "Previous data, nums[" + (index-1) + "] is " + prevData(nums, index)
				 * : "No previous data") + "\n" +
				 * ((nextData(nums, index) == nums[index+1])
				 * ? "Next data, nums[" + (index+1) + "] is " + nextData(nums, index)
				 * : "No next data"));*/
				
				"Current data, nums[" + index + "] is " + currentData(nums, index) + "\n" +
				 (index != 0
				 ? "Previous data, nums[" + (index-1) + "] is " + prevData(nums, index)
				 : "No previous data") + "\n" +
				 (index != (nums.length-1)
				 ? "Next data, nums[" + (index+1) + "] is " + nextData(nums, index)
				 : "No next data"));
				
	} // end of MAIN
	
	public static boolean checkIndex(int[] nums, int index) {
		return ((index < 0) || ((index > nums.length-1)) ? true : false);
	} // end of checkIndex
	
	public static int currentData (int[] nums, int index) {
		return nums [index];
	} // end of currentData
	
	public static int prevData (int[] nums, int index) {
		return nums [index-1];
	} // end of prevData
	
	public static int nextData (int[] nums, int index) {
		return nums [index+1];
	} // end of nextData
}
