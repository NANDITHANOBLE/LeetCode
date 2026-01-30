class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length ,n= nums2.length;
        int [] meg= new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) meg[k++] = nums1[i++];
            else meg[k++]=nums2[j++];
        }
        while(i<m)meg[k++]= nums1[i++];
        while(j<n)meg[k++]= nums2[j++];
        int mid=(m+n)/2;
        if((m+n)%2==0){
            return (meg [mid-1]+meg[mid])/2.0;
        }else{
            return meg[mid];
        }
    }
}