public class testClass {
    public static void main(String[] args) {
        int[][] iArr = new int[][]{{1}, {2}, {3}};
        for (int i = 0; i < iArr.length; i++) {
            iArr[i][0] *= 10;
            System.out.println(iArr[i][0]);
        }

        for (int[] i : iArr) {
            i[0] *= 10;
            System.out.println(i[0]);
        }

    }
}
