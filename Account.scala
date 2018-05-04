package consulting.ikenna.exercises.account
import java.time.*
import java.util.Date


//transaction case class
case class Transact(date:Date, amount:Double, newBalance:Integer) {
  val transactAmount: Int = amount
  val newBal: int = newBalance
  val transactDate = println(new Date)

  val newBalance:Int = {
    amount match {
      case (deposit) newBalance += amount
      case (withdrawal) newBalance -= amount
    }
  }
}


//account class
class Account (val acctNum: Int == 0, val openDate:Date, val name:String, val balance:Double) extends Transact {
  //account features
  override val newBalance
  val aN: Int = acctNum
  val oD: Date = openDate
  openDate = new Date
  val bal: Double = balance

  //account instance creation
  def createAccount (): Account = {
  val acc = {
  new Account (accountNumber += 1, Account.openDate, Account.name, Account.balance)
}
  println (s"Your account status is as follows:  $" account number: " ${acctNum} $" account name: " ${}" $"balancce :" $ {
  balance})

}

  def deposit (amount: Int): Double = {
  if amount < 0
  this
  else newBalance + amount
  val depoDate = new Date

}

  def withdrawal (amount: Int): Double = {
  if (amount > balance) {
  this
  println ("Insufficient Balance")
}
  else if (
  this
  println ("You did not enter a valid amount")
  )
  else {
  val newBal = balance - amount
}
  val withDate = newDate
}

  def printStatement (): String = {
  transactBase.forEach {
  acc => println("Date,Amount,Balance")
         println (s"Your statement is: ${new Date} ${acc.amount} ${acc.}")
}

}

  def main (args: Array[String] ): Unit = {

  //transaction instance creation
  //and addition to transaction base list
  val account = new Account()
  val newTransact = Transact (date: Date, amount: Double, newBalance: Integer)
  var transactBase = new ListBuffer[(String, Double, Int)] ()

  newTransact.forEach {
  instance => transactBase.append (instance)
}
}

}
