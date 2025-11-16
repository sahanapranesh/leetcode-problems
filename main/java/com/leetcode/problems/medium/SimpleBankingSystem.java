package com.leetcode.problems.medium;

public class SimpleBankingSystem {
    private long[] balance;

    public SimpleBankingSystem(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if(account1 == account2 && balance[account1-1] >= money){
            return true;
        }
        if (balance.length >= account1 && balance.length >= account2) {
            long balance1 = this.balance[account1 - 1];
            long balance2 = this.balance[account2 - 1];
            if (balance1 >= money) {
                this.balance[account1 - 1] = balance1 - money;
                this.balance[account2 - 1] = balance2 + money;
                return true;
            }
        }
        return false;
    }

    public boolean deposit(int account, long money) {
        if (balance.length >= account) {
            balance[account - 1] = balance[account - 1] + money;
            return true;
        }
        return false;
    }

    public boolean withdraw(int account, long money) {
        if (balance.length >= account) {
            long balance1 = balance[account - 1];
            if (balance1 >= money) {
                balance[account - 1] = balance1 - money;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SimpleBankingSystem obj = new SimpleBankingSystem(new long[]{0});
        System.out.println(obj.deposit(1,2));
        System.out.println(obj.transfer(1,1,1));
        System.out.println(obj.transfer(1,1,3));
    }
/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
}

