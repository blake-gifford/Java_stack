// Queue
// FIFO (First in, first out)

// - enqueue
// - dequeue
// - peek
// - isEmpty

class Queue {
    constructor() {
        this.front = null; // sometimes called head "front of the line"
        this.back = null; // sometimes called rear or tail "back of the line"
    }

    // add to the back
    enqueue(node) {
        if(this.isEmpty()){
            this.front = node;
            this.back = node;
        }
        this.back.next = node;
    }

    // remove from the front
    dequeue() {
        var toBeRemoved = this.front;
        this.front = this.front.next;
        toBeRemoved.next = null;
    }

    // check the front of the queue
    peek() {
        return this.front ? this.front.data : null;
    }

    // return if empty
    isEmpty() {
        return this.front === null;
    }
}

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}


// print every value in the queue
// you may only use one queue or stack for additional storage
// return the queue back to it's original order when you are done
// you are not allowed to linearly traverse the queue
// only use public methods enqueue, dequeue, peek, isempty
function readQueue(queue) {}

let n1 = new Node(1);
let n1 = new Node(2);
let n1 = new Node(3);
let n1 = new Node(4);
let q = new Queue();
q.enqueue(n1);
q.enqueue(n2);
q.enqueue(n3);
q.enqueue(n4);
console.log(1);
