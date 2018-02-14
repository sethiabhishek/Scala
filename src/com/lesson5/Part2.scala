package com.lesson5

object Part2  extends App{
  
 val savingsAccount = new SavingsAccount with ConsoleLogger with ShortLogger with TimeStampLogger {
  override val maxLength = 20
} 
 
 savingsAccount.withdraw(1000) 
 
 val acct3 = new SavingsAccount
 with ShortLogger with TimeStampLogger with ConsoleLogger
 
 acct3.withdraw(1000)
  
}