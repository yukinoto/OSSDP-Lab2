import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class L2023112079_20_Test {
    public void testFrame(int[][] e,List<Integer> ans){
        Solution sol=new Solution();
        List<Integer> ot=sol.findMinHeightTrees(e.length+1, e);
        assert(ot.size()==ans.size());
        assert(ot.equals(ans));
        return;
    }
    @Test
    public void test1(){
        int[][] a={
            {1,0},{1,2},{1,3}
        };
        List<Integer> ans=new ArrayList<Integer>(Arrays.asList(1));
        testFrame(a,ans);
    }
}
