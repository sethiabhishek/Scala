package com.lesson5

class SavingsAccount extends Logged {
  private var balance: Double = 0
 
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}