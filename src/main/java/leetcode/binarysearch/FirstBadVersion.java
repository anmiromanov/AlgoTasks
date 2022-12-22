package leetcode.binarysearch;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int minVersion = 1;
        int maxVersion = n;
        while (minVersion < maxVersion) {
            int mid = minVersion + (maxVersion - minVersion) / 2;
            if (isBadVersion(mid)) {
                maxVersion = mid;
            } else {
                minVersion = mid + 1;
            }
        }
        return minVersion;
    }

    public boolean isBadVersion(int n){
        return true;
    }
}
