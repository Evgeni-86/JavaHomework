//Вам дано m x n целочисленных счетов сетки, где account[i][j]
//сумма денег i-го клиента в j-м банке.
//
//Верните богатство, которое есть у самого богатого покупателя.
//
//Богатство клиента — это сумма денег, которую он имеет во всех
//их банковские счета. Самый богатый покупатель — покупатель
//что максимальное богатство.
// [ [7,1,3]
//   [2,8,7]
//   [1,9,5] ]
package Leetcode;


public class L2 {
    public static void main(String[] args) {
        int[][] accounts = {{7, 1, 3}, {2, 8, 7}, {1, 9, 5}};
        int rezultMax = 0;
        int indexMaxAccount = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if(sum > rezultMax){
                rezultMax = sum;
                indexMaxAccount = i;
            }
        }

        System.out.println("Индекс максимального аккаунта: " + indexMaxAccount);
        System.out.println("Его сумма: " + rezultMax);
    }
}
