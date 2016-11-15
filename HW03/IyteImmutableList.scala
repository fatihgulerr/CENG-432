class Node {
  private var data: Int = 0;
  private var next: Node = null;

  def this(data: Int) {
    this();
    this.data = data;
  }

  def this(data: Int, next: Node) {
    this(data);
    this.next = next;
  }

  def getData(): Int = {
    this.data;
  }

  def setData(data: Int): Unit = {
    this.data = data;
  }

  def getNext(): Node = {
    this.next;
  }

  def setNext(next: Node): Unit = {
    this.next = next;
  }

}

class IyteImmutableList {

  private var head: Node = null;

  def add(x: Int): IyteImmutableList = {
    val newList: IyteImmutableList = new IyteImmutableList();
    var newHead = new Node(x);
    newHead.setNext(head);
    newList.setHead(newHead);
    newList;
  }

  override def toString(): String = {
    var result: String = "";
    if (head != null) {
      var tempNode = head;
      while (tempNode.getNext() != null) {
        result = result + tempNode.getData() + ",";
        tempNode = tempNode.getNext();
      }
      result = result + tempNode.getData();
    } else {
      result = "Empty List!";
    }
    result;
  }

  def setHead(head: Node) {
    this.head = head;
  }
}

object IyteImmutableList {
  def apply() = new IyteImmutableList();
}
