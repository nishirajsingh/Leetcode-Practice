/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l = 0;
        int h = mountainArr.length()-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))l = mid+1;
            else h = mid;
        }
        int peek = l;
        l = 0;
        h = peek;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(mountainArr.get(mid)==target)return mid;
            if(mountainArr.get(mid)<target)l = mid+1;
            else h = mid-1;
        }
        l = peek+1;
        h = mountainArr.length()-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(mountainArr.get(mid)==target)return mid;
            if(mountainArr.get(mid)>target)l = mid+1;
            else h = mid-1;
        }
        return -1;
    }
}