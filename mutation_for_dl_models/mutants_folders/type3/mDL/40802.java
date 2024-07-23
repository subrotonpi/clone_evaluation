public int [] rotate (int [] nums, int k) {

    if (k > nums.length) k = k % nums.length;

    int [] result = new int [nums.length];

    System.arraycopy (nums, k + 1, result, 0, k);


    nums = result;

    return result;

}
