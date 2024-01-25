import java.util.Scanner;

public class LCS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        System.out.println("The longest common subsequence is " + longestcommonsubseq(text1, text2));
    }

    public static int longestcommonsubseq(String text1, String text2){
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[i].length; j++){
                dp[i][j] = 0;
            }
        }

        for (int i = text1.length() - 1; i >= 0; i--){
            for (int j = text2.length() - 1; j >= 0; j--){
                if (text1.charAt(i) == text2.charAt(j)){
                    dp[i][j] = ++dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        return dp[0][0];
        
    }
}