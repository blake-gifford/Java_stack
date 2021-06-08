class Node{
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class SLL{
    constructor(){
        this.head = null;
    }

    // return true or false if this.head is null
    isEmpty(){
        if (this.head) {
            return true;
        } else {
            return false;
        }
    }

    // add given node to the head, if it exists. return void
    // list is empty?
    // list already has nodes?
    addToFront(node) {
        node.next = this.head;
        this.head = node;
    }

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) {
        var newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }
}

var mySLL = new SLL();
mySLL.head = new Node(11);

mySLL.addToFront(new Node(22));
mySLL.addDataToFront(22);

