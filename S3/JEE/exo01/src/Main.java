public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++){
            String iNumString = String.valueOf(i);
//            System.out.println(iNumString);
            int sum = 0;
            for (int j = 0; j < iNumString.length(); j++) {
                int eachNum = iNumString.charAt(j) - '0';
                sum+=Math.pow(eachNum,3);

                if (i == sum) {
                    System.out.println(i + " is Armstrong number.");
                }

            }
        }
    }
}
