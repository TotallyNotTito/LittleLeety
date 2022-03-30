public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    if (m == 0)
        return false;
    int n = matrix[0].length;
    //bin search
    int left = 0, right = m * n - 1;
    int pivotIndex, pivotElement;
    while (left <= right) {
        pivotIndex = (left + right) / 2;
        pivotElement = matrix[pivotIndex / n][pivotIndex % n];
        if (target == pivotElement)
            return true;
        else {
            if (target < pivotElement) 
                right = pivotIndex - 1;
            else 
                left = pivotIndex + 1;
        }
    }
    return false;
}
