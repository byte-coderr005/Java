//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  //-----------------------------ARRAY FUNCTIONS------------------------------//
        //Copying Arrays
        int[] nums = {1,3,36,7,9};
        int[] nums2 = new int[nums.length];
         System.arraycopy(nums, 0,nums2, 0, nums.length);
         //Using Loops in Arrays 1
         for(int nums3 : nums2)
         {
             System.out.print(nums3 + " ");
         }
         //2
        for(int i = 0; i < nums2.length; i++)
        {
            System.out.println(nums2[i]);
        }
    }
}
