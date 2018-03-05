// 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class Solution {
    public boolean Find(int target, int [][] array) {
        boolean find =false;
        if (array.length == 0 || array[0].length == 0) return find;
        int rows = 0,columns = array.length - 1;
        while (rows <= array.length - 1 && columns >=0) {
            int currValue = array[rows][columns];
            if (target == currValue) {
                find = true; break;
            } else if (target > currValue) {
                rows ++;
            } else {
                columns --;
            }
        }
        return find;
    }
}