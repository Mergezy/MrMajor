public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4, 2, 1, 2, 2};
        int majorityElement = findMajorityElement(arr);
        
        if (isMajorityElement(arr, majorityElement)) {
            System.out.println("Мажоритарный элемент: " + majorityElement);
        } else {
            System.out.println("Мажоритарный элемент не найден.");
        }
    }

    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static boolean isMajorityElement(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count > nums.length / 2;
    }
}
