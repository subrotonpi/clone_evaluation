public int [] rotate (int [] nums, int X1) {

    if (X1 > nums.length) X1 = X1 % nums.length;

    int [] result = new int [nums.length];

    System.arraycopy (nums, X1 + 1, result, 0, X1);

    System.arraycopy (nums, 0, result, X1 + 1, nums.length - 1);

    nums = result;

    return result;

}
