class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    // console log (print) the data of every node in the current list
    // traversal
    read() { }

    // find: return true / false if current list contains a data equal to value
    contains(value) { }

    // Remove from front: remove and return the first node in the SLL
    removeFromFront() { }

    // return true or false if this.head is null
    isEmpty() {
        return this.head == null;
    }

    // add given node to the head, if it exists. return void
    addToFront(node) {
        node.next = this.head; // set the new node's next to the head
        this.head = node; // move the head to the new node
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { // 10
        var newNode = new Node(data); // create a new node with the data
        newNode.next = this.head; // set the new node's next to the head
        this.head = node; // move the head to the new node
    }
}




// var list = {
//     value: 11,
//     next: {
//         value: 22,
//         next : {
//             value : 100,
//             next: {
//                 value: 1337,
//                 next: {
//                     value: 9001,
//                     next: null
//                 }
//             }
//         }
//     }
// }

var runner = this.head;
while(runner.next) {
    runner = runner.next
}
console.log(runner.value);

var list = new SLL()
// list.head = null;

list.addToFront(new Node(9001));
// list.head -> (11) -> null

list.addToFront(new Node(1337));
// list.head -> (11) -> (22) -> null

list.addToFront(new Node(109));
list.addToFront(new Node(22));
list.addToFront(new Node(11));

// console.log(list);
// console.log(list.head.next.next.next?.next?.next?.next?.next);