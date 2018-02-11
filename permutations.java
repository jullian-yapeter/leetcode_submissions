import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        List<Integer> firstl = new ArrayList<Integer>();
        solution.add(firstl);
        int len = 0;
        for (int n: nums){
            solution = addnew(solution,n,len);
            len++;
        }
        return solution;
    }

    public List<List<Integer>> addnew(List<List<Integer>> prevsolution, int newnum, int len){
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        for (List<Integer> l : prevsolution){
            for (int i = 0; i <= len; i++){
                List<Integer> subsol = new ArrayList<Integer>(l);
                subsol.add(i,newnum);
                solution.add(subsol);
            }
        }
        return solution;
    }
}
