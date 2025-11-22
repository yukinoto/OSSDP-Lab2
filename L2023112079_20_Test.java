import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*
思路：按照树的结构给出各种测试样例
覆盖分叉较多/较少的情况
也覆盖多解/单解的情况
 */

public class L2023112079_20_Test {
    public void testFrame(int[][] e,List<Integer> ans){
        Solution sol=new Solution();
        List<Integer> ot=sol.findMinHeightTrees(e.length+1, e);
        assert(ot.size()==ans.size());
        assert(ot.equals(ans));
        return;
    }
    /*最简单的样例 */
    @Test
    public void test1(){
        int[][] a={
            {1,0},{1,2},{1,3}
        };
        List<Integer> ans=new ArrayList<Integer>(Arrays.asList(1));
        testFrame(a,ans);
    }
    /*链的场景 */
    @Test
    public void test2(){
        int[][] a={
            {0,1},{1,2},{2,3},{3,4},{4,5}
        };
        List<Integer> ans=new ArrayList<Integer>(Arrays.asList(2,3));
        testFrame(a,ans);
    }
    /*菊花 */
    @Test
    public void test3(){
        int[][] a={
            {0,1},{0,2},{0,3},{0,4}
        };
        List<Integer> ans=new ArrayList<Integer>(Arrays.asList(0));
        testFrame(a,ans);
    }
}
