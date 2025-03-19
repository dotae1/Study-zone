package org.com.framework.dependencyinjection.common;

public interface Account {

    /* 잔액 조희 */
    String getBalance();

    /* 입금 */
    String deposit(int money);

    /* 출금 */
    String withDraw(int money);
}
