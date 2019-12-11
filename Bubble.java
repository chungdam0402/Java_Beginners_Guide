class Bubble {
  public static void main(String args[]) {
    int nums[] = {1,3,212,512,4314,2,53465,85679,76765};
    int a,b,t;
    int size = nums.length;

    for(a=1;a<size;a++) {
      for(b=size-1; b>=a; b--) {
        if(nums[b-1] > nums[b] ) {
          t = nums[b-1];
          nums [b-1] = nums[b];
          nums[b] = t;
        }
      }
    }
    for(int i= 0; i<size; i++) {
      System.out.print(" "+nums[i]);
    }
    System.out.println();
  }
}
