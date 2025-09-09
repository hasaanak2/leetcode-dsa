import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for(int write_p = m + n - 1; p2 >= 0; --write_p) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[write_p] = nums1[p1];
                --p1;
            } else {
                nums1[write_p] = nums2[p2];
                --p2;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums1));
    }
}