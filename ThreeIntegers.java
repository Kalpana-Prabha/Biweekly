import java.util.Arrays;
public class ThreeIntegers{
    public static int threeInt(int[] nums,int target){
        Arrays.sort(nums);
        int closeSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - currSum) < (Math.abs(target - closeSum))) {
                    closeSum = currSum;
                }
                if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
            return closeSum;
        }
       public static void main(String[] args){
            int[] nums1={-1,2,1,4};
            int target1=1;
            int result1=threeInt(nums1,target1);
            System.out.println(result1);
            int[] nums2={0,0,0};
            int target2=1;
            int result2=threeInt(nums2,target2);
            System.out.println(result2);
        }
    }
