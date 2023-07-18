package ch7;

public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for(int i=0;i<5;i++){
//            manageHeight.printHeight(i);
            manageHeight.printAverage(i);
        }
    }
    int[][] gradeHeights;
    public void setData() {
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeights[1] = new int[] {160, 165, 167, 186};
        gradeHeights[2] = new int[] {158, 177, 187, 176};
        gradeHeights[3] = new int[] {173, 182, 181};
        gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:"+(classNo+1));
        for(int studentHeight : gradeHeights[classNo]){
            System.out.println(studentHeight);
        }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No.:"+(classNo+1));
        double sum = 0;
        int cnt = gradeHeights[classNo].length;
        double result;
        for(int studentHeight:gradeHeights[classNo]){
            sum += studentHeight;
        }
        result = sum/cnt;
        System.out.println("Height average:"+result);
    }
}

