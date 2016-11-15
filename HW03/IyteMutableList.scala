class IyteMutableList {
  private class Node(var x:Int, var next: Node)
  private var first: Node = null
  private var last: Node = null
  private var temp: Node = null

  def add(x: Int): Unit = {
     if(first == null){
          first= new Node(x,null)
          last=first
          temp = first
      }
      else{
          last.next=new Node(x,null)
          last=last.next
      }
    }
  override def toString: String= {
    var result:String = ""
    while(temp.next !=null){
        result += temp.x + ","
        temp=temp.next
    }
      result += last.x
      result
  }
}
object  IyteMutableList{
  def apply(): IyteMutableList = new IyteMutableList()
}
