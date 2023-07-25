package com.java.features;

import java.util.*;

public class Account {
    private List<Integer> charges = new ArrayList<>();
    private Set<Integer> chargesSet = new TreeSet(Comparator.reverseOrder());
    private Integer balance;

    public void addCharge(Integer value) {
        charges.add(value);
    }

    public void setBalance(Integer value) {
        balance = value;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getMaxCharge() throws Exception {
        Collections.sort(charges, Comparator.reverseOrder());
        for (int i = 0; i < charges.size(); i++) {
            if (balance > charges.get(i)) {
                return charges.get(i);
            }
        }
        throw new RuntimeException("Insufficient balance");
    }

    public Integer getMaxChargeFromSet() throws Exception {
        Iterator<Integer> iterator = chargesSet.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (balance > value) {
                return value;
            }
        }
        throw new RuntimeException("Insufficient balance");
    }

    public void payOffCharges() {
        try {
            Integer maxCharge = getMaxCharge();
            balance = Math.abs(balance - maxCharge);
            charges.remove(maxCharge);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Account account = new Account();
        account.addCharge(50);
        account.addCharge(8);
        account.addCharge(100);
        account.addCharge(20);
        account.setBalance(110);
        account.payOffCharges();
        System.out.println(account.getBalance());
        System.out.println(account.getMaxCharge());
    }

}
