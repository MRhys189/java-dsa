import java.util.Arrays;
class AssignCookies {
    /**
     * Assume you are an awesome parent and want to give your children
     * some cookies. But, you should give each child at most one cookie.
     * 
     * Each child i has a greed factor g[i], which is the minimum size of a 
     * cookie that the the child will be content with; and each cookie j has a size s[j]. 
     * If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
     * Your goal is to maximize the number of your content children and output the maximum number.
     */

     /*
        Approach: Sort both the arrays and assign <= cookies per kid
        Time Complexity: 0(nlogn)
        Space Complexity: 0(1)
    */
    public static void main(String[] args) {
        int[] i = {1, 2, 3};
        int[] j = {1, 1};
        System.out.println(findContentChildren(i, j)); //1
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gSize = g.length, sSize = s.length;
        int gIndex = 0, sIndex = 0;
        int result = 0;

        while(gIndex < gSize && sIndex < sSize) {
            if(s[sIndex] >= g[gIndex]) {
                result += 1;
                gIndex++;
            }
            sIndex++;
        }

        return result;
        
    }
}