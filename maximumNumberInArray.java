public class maximumNumberInArray {
    public static void main(String[] args){
        Object[] jArray={2, 4, 10, new Object[]{12,4, new Object[]{100,99},4},new Object[]{3,2,99},0};

        int maxNumber=findMaxNumber(jArray);

        System.out.println("Maximum Number:"+maxNumber);
    }

    private static int findMaxNumber(Object[] array){
        int maxNumber=Integer.MIN_VALUE;

        for(Object element:array){
            if(element instanceof Integer){
                int number = (int) element;
                maxNumber=Math.max(maxNumber,number);
                
            }
            else if(element instanceof Object[]){
                int maxInSubArray=findMaxNumber((Object[])element);
                maxNumber=Math.max(maxNumber,maxInSubArray);
            }
        }
        return maxNumber;
    }
}
